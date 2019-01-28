package com.heyzqt.graywaterprimarydemo.viewholdercreator;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.heyzqt.graywaterprimarydemo.R;
import com.heyzqt.graywaterprimarydemo.viewholder.SportViewHolder;
import com.tumblr.graywater.GraywaterAdapter;

/**
 * Created by heyzqt on 2018/10/23.
 */

public class SportViewHolderCreator implements GraywaterAdapter.ViewHolderCreator {
    @Override
    public RecyclerView.ViewHolder create(ViewGroup parent) {
        return new SportViewHolder(GraywaterAdapter.inflate(parent, getViewType()));    // //实际上就是调用的LayoutInflater.from(parent.getContext()).inflate();
    }

    @Override
    public int getViewType() {
        return R.layout.adapter_sport_item;
    }
}
