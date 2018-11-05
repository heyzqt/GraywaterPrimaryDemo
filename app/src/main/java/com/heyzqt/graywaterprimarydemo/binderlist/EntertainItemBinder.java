package com.heyzqt.graywaterprimarydemo.binderlist;

import android.support.annotation.NonNull;

import com.heyzqt.graywaterprimarydemo.binder.EntertainBinder;
import com.heyzqt.graywaterprimarydemo.model.EntertainPrimitive;
import com.heyzqt.graywaterprimarydemo.viewholder.PrimitiveViewHolder;
import com.tumblr.graywater.GraywaterAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by heyzqt on 2018/10/23.
 */

public class EntertainItemBinder implements GraywaterAdapter.ItemBinder<EntertainPrimitive, PrimitiveViewHolder> {

    private EntertainBinder entertainBinder;

    public EntertainItemBinder(EntertainBinder binder) {
        this.entertainBinder = binder;
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
}
