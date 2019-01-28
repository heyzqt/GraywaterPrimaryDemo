package com.heyzqt.graywaterprimarydemo.binderlist;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.heyzqt.graywaterprimarydemo.R;
import com.heyzqt.graywaterprimarydemo.binder.SportBinder;
import com.heyzqt.graywaterprimarydemo.listener.OnItemClickListener;
import com.heyzqt.graywaterprimarydemo.model.SportPrimitive;
import com.heyzqt.graywaterprimarydemo.viewholder.PrimitiveViewHolder;
import com.heyzqt.graywaterprimarydemo.viewholder.SportViewHolder;
import com.tumblr.graywater.GraywaterAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by heyzqt on 2018/10/23.
 */

public class SportItemBinder implements GraywaterAdapter.ItemBinder<SportPrimitive, PrimitiveViewHolder>, GraywaterAdapter.ActionListener<SportPrimitive, SportViewHolder> {

    private SportBinder sportBinder;
    private OnItemClickListener onItemClickListener;

    public SportItemBinder(SportBinder binder, OnItemClickListener listener) {
        this.sportBinder = binder;
        this.onItemClickListener = listener;
    }

    @NonNull
    @Override
    public List<GraywaterAdapter.Binder<? super SportPrimitive, ? extends PrimitiveViewHolder>> getBinderList(@NonNull final SportPrimitive model, int position) {
        return new ArrayList<GraywaterAdapter.Binder<? super SportPrimitive, ? extends PrimitiveViewHolder>>() {{
            for (String s : model.getTitles()) {
                add(sportBinder);
            }
        }};
    }

    @Override
    public void act(@NonNull SportPrimitive model, @NonNull SportViewHolder holder, @NonNull View v, @NonNull List<GraywaterAdapter.Binder<? super SportPrimitive, ? extends
            SportViewHolder>> binders, int binderIndex, @Nullable Object obj) {
        switch (v.getId()) {
            case R.id.item_layout:
                onItemClickListener.onClickItem(model.getTitles().get(binderIndex));
                break;
        }
    }
}
