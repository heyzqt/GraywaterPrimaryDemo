package com.heyzqt.graywaterprimarydemo.binderlist;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.heyzqt.graywaterprimarydemo.R;
import com.heyzqt.graywaterprimarydemo.bean.EntertainItem;
import com.heyzqt.graywaterprimarydemo.binder.EntertainBinder;
import com.heyzqt.graywaterprimarydemo.binder.TitleBinder;
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

public class EntertainItemBinder implements GraywaterAdapter.ItemBinder<EntertainPrimitive, PrimitiveViewHolder>, GraywaterAdapter.ActionListener<EntertainPrimitive, PrimitiveViewHolder> {

    private TitleBinder titleBinder;
    private EntertainBinder entertainBinder;
    private OnItemClickListener onItemClickListener;

    public EntertainItemBinder(TitleBinder titleBinder, EntertainBinder binder, OnItemClickListener listener) {
        this.titleBinder = titleBinder;
        this.entertainBinder = binder;
        this.onItemClickListener = listener;
    }

    @NonNull
    @Override
    public List<GraywaterAdapter.Binder<? super EntertainPrimitive, ? extends PrimitiveViewHolder>> getBinderList(@NonNull final EntertainPrimitive model, int position) {
        return new ArrayList<GraywaterAdapter.Binder<? super EntertainPrimitive, ? extends PrimitiveViewHolder>>() {{
            add(titleBinder);
            for (EntertainItem entertainItem : model.getEntertainItems()) {
                add(entertainBinder);
            }
        }};
    }

    @Override
    public void act(@NonNull EntertainPrimitive model, @NonNull PrimitiveViewHolder holder, @NonNull View v, @NonNull List<GraywaterAdapter.Binder<? super EntertainPrimitive, ? extends
            PrimitiveViewHolder>> binders, int binderIndex, @Nullable Object obj) {
        switch (v.getId()) {
            case R.id.add:
                onItemClickListener.onClickaddNews(model.getModuleName().getKey());
                break;
            case R.id.item_layout:
                onItemClickListener.onClickEditEntertain(model.getEntertainItems().get(binderIndex - 1));
                break;
            case R.id.delete:
                onItemClickListener.onClickDeleteEntertain(model.getEntertainItems().get(binderIndex - 1));
                break;
        }
    }
}
