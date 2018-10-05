package com.jinhui.swipecardrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by jh on 2018/10/5.
 * Email: 1004260403@qq.com
 */
public abstract class SwipeCardAdapter<VH extends RecyclerView.ViewHolder> extends  RecyclerView.Adapter<VH>{

    protected List mList;

    public SwipeCardAdapter(List mList) {
        this.mList = mList;
    }

    /**
     * 删除最顶部Item
     */
    public void delTopItem() {
        int position = getItemCount() - 1;
        mList.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}
