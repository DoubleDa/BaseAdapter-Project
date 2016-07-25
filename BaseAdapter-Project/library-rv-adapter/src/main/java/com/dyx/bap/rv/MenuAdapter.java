package com.dyx.bap.rv;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * project name：BaseAdapter-Project
 * class describe：单行适配器
 * create person：dayongxin
 * create time：16/7/25 下午3:54
 * alter person：dayongxin
 * alter time：16/7/25 下午3:54
 * alter remark：
 */
public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {
    private Context mContext;
    private List<String> mDataLists;

    public MenuAdapter(Context mContext, List<String> mDataLists) {
        this.mContext = mContext;
        this.mDataLists = mDataLists;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.rv_item_single_line_adapter_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(mDataLists.get(position));
    }

    @Override
    public int getItemCount() {
        return mDataLists.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.tv_item);
        }
    }
}
