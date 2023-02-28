package com.example.application.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.application.R;

import java.util.ArrayList;
import java.util.List;

import domain.GetText;

public class GetTextAdapter extends RecyclerView.Adapter <GetTextAdapter.InnerHolder>{
    private final List<GetText.DataBean.DatasBean> mData = new ArrayList<>();
    @NonNull
    @Override
    public GetTextAdapter.InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView =  LayoutInflater.from(parent.getContext()).inflate(R.layout.item_get_text,parent,false);
        return new InnerHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull GetTextAdapter.InnerHolder holder, int position) {
        View itemView = holder.itemView;
        TextView titleTv = itemView.findViewById(R.id.title);
        titleTv.setText(mData.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
    public void setData(GetText getText){
        mData.clear();
        notifyDataSetChanged();
    }
    public class InnerHolder extends RecyclerView.ViewHolder {
        public InnerHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
