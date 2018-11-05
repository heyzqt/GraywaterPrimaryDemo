package com.heyzqt.graywaterprimarydemo.viewholdercreator;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.heyzqt.graywaterprimarydemo.R;
import com.heyzqt.graywaterprimarydemo.viewholder.EntertainViewHolder;
import com.tumblr.graywater.GraywaterAdapter;

/**
 * Created by heyzqt on 2018/10/23.
 */

public class EntertainViewHolderCreator implements GraywaterAdapter.ViewHolderCreator {
    @Override
    public RecyclerView.ViewHolder create(ViewGroup parent) {
        return new EntertainViewHolder(GraywaterAdapter.inflate(parent, R.layout.adapter_item));    // //实际上就是调用的LayoutInflater.from(parent.getContext()).inflate();
    }

    @Override
    public int getViewType() {
        return R.layout.adapter_item;
    }
}
