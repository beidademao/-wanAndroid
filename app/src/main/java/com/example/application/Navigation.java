package com.example.application;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.application.adapters.GetNavigationAdapter;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;

import domain.GetNavigationItem;

public class Navigation extends AppCompatActivity {
    private Button mBtBack;
    private static final String TAG = "Navigation";
    private String url = "https://www.wanandroid.com/navi/json";
    private GetNavigationAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        initView();
        initListener();
    }
    private void initListener() {
        ListView lv = new ListView(this);
        mAdapter.setOnItemClickListener(new GetNavigationAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                //这里是处理条目的点击事件，该干嘛就干嘛，跳转的就跳转
                Toast.makeText(Navigation.this, "您点击的是" + position + "个条目", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent()
            }
        });
    }
    private void initView() {
        RecyclerView recyclerView = this.findViewById(R.id.recyclerview3);//?
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new GetNavigationAdapter();
        recyclerView.setAdapter(mAdapter);
        mBtBack = findViewById(R.id.back);
        mBtBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Navigation.this, "返回首页", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Navigation.this, MainActivity.class);
                startActivity(intent);
            }
        });

        new Thread(new Runnable() {//设置一个新线程
            @Override
            public void run() {
                try {
                    URL url = new URL("https://www.wanandroid.com/navi/json");//设置一个新的URL
                    HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();//使用Https的URLconnection的方法
                    connection.setConnectTimeout(9000);//设置响应时间
                    connection.setRequestMethod("GET");//设置请求方法
                    connection.setRequestProperty("Accept-Language", "zh-CN,zh;q=0.9");//设置请求语言
                    connection.setRequestProperty("Accept", "*/*");

                    connection.connect();//建立链接
                    int responseCode = connection.getResponseCode();//拿结果码
                    if (responseCode == 200) {//如果结果码为200
                        Map<String, List<String>> headerFields = connection.getHeaderFields();
                        Set<Map.Entry<String, List<String>>> entries = headerFields.entrySet();
                        for (Map.Entry<String, List<String>> entry : entries) {
                            Log.d(TAG, entry.getKey() + "==" + entry.getValue());//打印信息
                        }
                        InputStream inputStream = connection.getInputStream();//使用inputStream的方法
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));//设置一个新的bufferedReader用于解析数据
                        String json = bufferedReader.readLine();//将bufferedReader的数据设置为一行
                        Log.d(TAG, "json  -- >" + json);//打印line信息
                        Gson gson = new Gson();
                        GetNavigationItem getNavigationItem = gson.fromJson(json, GetNavigationItem.class);
                        updateUI(getNavigationItem);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }).start();
    }

    private void updateUI(GetNavigationItem getNavigationItem) {

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mAdapter.setmData(getNavigationItem);
            }
        });

    }

}