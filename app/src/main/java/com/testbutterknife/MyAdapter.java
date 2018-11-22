package com.testbutterknife;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * <p>作者   wurui</p>
 * <p>时间   2018/11/22 0022</p>
 * <p>包名   com.testbutterknife</p>
 * <p>描述   TODO</p>
 */

public class MyAdapter extends BaseAdapter {
    Context context;

    public MyAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view != null) {
            holder = (ViewHolder) view.getTag();
        } else {
            view = LayoutInflater.from(context).inflate(R.layout.testlayout, parent, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }

        holder.name.setText("Donkor");
        holder.job.setText("Android");
        // etc...
        return view;
    }

    static class ViewHolder {
        @BindView(R.id.title)
        TextView name;
        @BindView(R.id.job) TextView job;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
