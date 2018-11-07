package com.heyzqt.graywaterprimarydemo.binderlist;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.heyzqt.graywaterprimarydemo.R;
import com.heyzqt.graywaterprimarydemo.binder.EntertainBinder;
import com.heyzqt.graywaterprimarydemo.listener.OnItemClickListener;
import com.heyzqt.graywaterprimarydemo.model.EntertainPrimitive;
import com.heyzqt.graywaterprimarydemo.viewholder.EntertainViewHolder;
import com.heyzqt.graywaterprimarydemo.viewholder.PrimitiveViewHolder;
import com.tumblr.graywater.GraywaterAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by heyzqt on 2018/10/23.
 */

public class EntertainItemBinder implements GraywaterAdapter.ItemBinder<EntertainPrimitive, PrimitiveViewHolder>, GraywaterAdapter.ActionListener<EntertainPrimitive, EntertainViewHolder> {

    private EntertainBinder entertainBinder;
    private OnItemClickListener onItemClickListener;

    public EntertainItemBinder(EntertainBinder binder, OnItemClickListener listener) {
        this.entertainBinder = binder;
        this.onItemClickListener = listener;
    }

    @NonNull
    @Override
    public List<GraywaterAdapter.Binder<? super EntertainPrimitive, ? extends PrimitiveViewHolder>> getBinderList(@NonNull final EntertainPrimitive model, int position) {
        return new ArrayList<GraywaterAdapter.Binder<? super EntertainPrimitive, ? extends PrimitiveViewHolder>>() {{
            for (String s : model.getTitles()) {
                add(entertainBinder);
            }
        }};
    }

    @Override
    public void act(@NonNull EntertainPrimitive model, @NonNull EntertainViewHolder holder, @NonNull View v, @NonNull List<GraywaterAdapter.Binder<? super EntertainPrimitive, ? extends
            EntertainViewHolder>> binders, int binderIndex, @Nullable Object obj) {
        switch (v.getId()) {
            case R.id.item_layout:
                onItemClickListener.onClickItem(model.getTitles().get(binderIndex));
                break;
        }
    }
}
