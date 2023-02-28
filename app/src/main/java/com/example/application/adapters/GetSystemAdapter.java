package com.example.application.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.application.R;

import java.util.ArrayList;
import java.util.List;

import domain.GetSystemItem;
import domain.GetSystemText;

public class GetSystemAdapter extends RecyclerView.Adapter<GetSystemAdapter.InnerHolder> {


    private final List<GetSystemItem.DataBean> mData = new ArrayList<>();
    private final List<GetSystemItem.DataBean.ChildrenBean> mchildren = new ArrayList<>();
    private Context context;
    private static OnItemClickListener mOnItemClickListener;

    @NonNull
    @Override
    public InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView =  LayoutInflater.from(parent.getContext()).inflate(R.layout.system_get_text,parent,false);
        return new InnerHolder(itemView);
    }


    //private Class[] jumpActivity={System.class, System_article.class};
    @Override

    public void onBindViewHolder(@NonNull InnerHolder holder, int position) {
     View itemView = holder.itemView;
        TextView Firstname = itemView.findViewById(R.id.name);
        TextView Childrenname = itemView.findViewById(R.id.childrenname);
        //TextView Title = itemView.findViewById(R.id.title);
        //Title.setText(tData.get(position).getTitle());
        Firstname.setText(mData.get(position).getName());
        holder.setData(mData.get(position), position);
        //older.Sy_articletitle.setText(tData.get(position).getTitle());
        //holder.setText(tData.get(position).getTitle());
              // int i = holder.getAdapterPosition();
       //holder.itemView.setOnClickListener(new View.OnClickListener(){

           //@Override
           //public void onClick(View v) {
               //Intent intent = new Intent(context,jumpActivity[i]);
               //context.startActivity(intent);

           //}
      // });
        //Childrenname.setText(mchildren.get(position).getName());

        //GetSystemItem.DataBean.ChildrenBean childrenBean = mchildren.get(position);
        //GetSystemItem.DataBean dataBean = mData.get(position);
        //Firstname.setText(dataBean.getName());
        //Childrenname.setText(children.getName());
    }


    @Override
    public int getItemCount() {
        return mData.size();
    }
    public void setmData(GetSystemItem getSystemItem){
        mData.clear();
        mData.addAll(getSystemItem.getData());
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        //设置一个监听，也就是设置一个回调接口
        this.mOnItemClickListener = listener;
    }
     /*
     编写回调的步骤
     1.创建这个接口
     2.定义接口内部的方法
     3.提供设置接口的方法（外部实现）
     4.接口方法的调用
      */
    //1
    public interface OnItemClickListener{
         //2
        void onItemClick(int position) ;
     }
     public void setData(int position){

     }

    public class InnerHolder extends RecyclerView.ViewHolder {
        public String setText;
        private int mPosition;
        private int sPositon;

        public InnerHolder(@NonNull View itemView) {
            super(itemView);
            //Sy_articletitle = itemView.findViewById(R.id.article_title);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mOnItemClickListener != null) {
                        mOnItemClickListener.onItemClick(mPosition);
                    }
                }
            });
        }

        public void setData(GetSystemItem.DataBean dataBean, int position){
            this.mPosition = position;

        }

        public void setData(GetSystemText.DataBean dataBean, int position) {
            this.sPositon = position;
        }

        public void setData(GetSystemText.DataBean.DatasBean datasBean, int position) {
        }
    }



}

