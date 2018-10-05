package com.jinhui.swipecardrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jh on 2018/10/5.
 * Email: 1004260403@qq.com
 */
public class MyAdapter extends SwipeCardAdapter<MyAdapter.MyViewHolder> {

    private Context mContext;

    public MyAdapter(List mList) {
        super(mList);
    }

    public MyAdapter(Context context, List<String> list) {
        super(list);
        mContext = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.layout_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        myViewHolder.setData((String) mList.get(position));
    }

//    @Override
//    public int getItemCount() {
//        return 0;
//    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView mTextView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.text);
        }

        public void setData(String text) {
            mTextView.setText(text);
        }
    }

}
