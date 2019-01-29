package com.heyzqt.graywaterprimarydemo.viewholdercreator;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.heyzqt.graywaterprimarydemo.R;
import com.heyzqt.graywaterprimarydemo.viewholder.TitleViewHolder;
import com.tumblr.graywater.GraywaterAdapter;

/**
 * Created by heyzqt on 2018/10/23.
 */

public class TitleViewHolderCreator implements GraywaterAdapter.ViewHolderCreator {
    @Override
    public RecyclerView.ViewHolder create(ViewGroup parent) {
        return new TitleViewHolder(GraywaterAdapter.inflate(parent, getViewType()));    // //实际上就是调用的LayoutInflater.from(parent.getContext()).inflate();
    }

    @Override
    public int getViewType() {
        return R.layout.adapter_title_item;
    }
}
