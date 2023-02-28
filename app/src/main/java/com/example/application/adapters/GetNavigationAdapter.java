package com.example.application.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.application.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import domain.GetNavigationItem;

public class GetNavigationAdapter extends RecyclerView.Adapter<GetNavigationAdapter.InnerHolder> {
    private final List<GetNavigationItem.DataBean> mData = new ArrayList<GetNavigationItem.DataBean>();
    private Context context;
    private static OnItemClickListener mOnItemClickListener;
    @NonNull
    @Override
    public InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView =  LayoutInflater.from(parent.getContext()).inflate(R.layout.navigation_get_text,parent,false);
        return new InnerHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull GetNavigationAdapter.InnerHolder holder, int position) {
      View itemView = holder.itemView;
        TextView ivTitle = itemView.findViewById(R.id.name);
        TextView link = itemView.findViewById(R.id.name);
        ivTitle.setText(mData.get(position).getName());
        holder.setData(mData.get(position),position);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
    public void setmData(GetNavigationItem getNavigationItem){
        mData.clear();
        mData.addAll(getNavigationItem.getData());
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(GetNavigationAdapter.OnItemClickListener listener) {
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
        private int mPosition;

        public InnerHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mOnItemClickListener != null) {
                        mOnItemClickListener.onItemClick(mPosition);
                    }
                }
            });
        }

        public void setData(GetNavigationItem.DataBean dataBean, int position){
            this.mPosition = position;

        }
    }
private final List<GetNavigationItem.DataBean.ArticlesBean> mArticles = new List<GetNavigationItem.DataBean.ArticlesBean>() {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(@Nullable Object o) {
        return false;
    }

    @NonNull
    @Override
    public Iterator<GetNavigationItem.DataBean.ArticlesBean> iterator() {
        return null;
    }

    @NonNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @NonNull
    @Override
    public <T> T[] toArray(@NonNull T[] a) {
        return null;
    }

    @Override
    public boolean add(GetNavigationItem.DataBean.ArticlesBean articlesBean) {
        return false;
    }

    @Override
    public boolean remove(@Nullable Object o) {
        return false;
    }

    @Override
    public boolean containsAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(@NonNull Collection<? extends GetNavigationItem.DataBean.ArticlesBean> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, @NonNull Collection<? extends GetNavigationItem.DataBean.ArticlesBean> c) {
        return false;
    }

    @Override
    public boolean removeAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public GetNavigationItem.DataBean.ArticlesBean get(int index) {
        return null;
    }

    @Override
    public GetNavigationItem.DataBean.ArticlesBean set(int index, GetNavigationItem.DataBean.ArticlesBean element) {
        return null;
    }

    @Override
    public void add(int index, GetNavigationItem.DataBean.ArticlesBean element) {

    }

    @Override
    public GetNavigationItem.DataBean.ArticlesBean remove(int index) {
        return null;
    }

    @Override
    public int indexOf(@Nullable Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(@Nullable Object o) {
        return 0;
    }

    @NonNull
    @Override
    public ListIterator<GetNavigationItem.DataBean.ArticlesBean> listIterator() {
        return null;
    }

    @NonNull
    @Override
    public ListIterator<GetNavigationItem.DataBean.ArticlesBean> listIterator(int index) {
        return null;
    }

    @NonNull
    @Override
    public List<GetNavigationItem.DataBean.ArticlesBean> subList(int fromIndex, int toIndex) {
        return null;
    }
};

}