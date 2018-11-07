package com.heyzqt.graywaterprimarydemo.binder;

import android.support.annotation.NonNull;

import com.heyzqt.graywaterprimarydemo.R;
import com.heyzqt.graywaterprimarydemo.model.EntertainPrimitive;
import com.heyzqt.graywaterprimarydemo.viewholder.EntertainViewHolder;
import com.squareup.picasso.Picasso;
import com.tumblr.graywater.GraywaterAdapter;

import java.util.List;


/**
 * Created by heyzqt on 2018/10/23.
 */

public class EntertainBinder implements GraywaterAdapter.Binder<EntertainPrimitive, EntertainViewHolder> {
    @NonNull
    @Override
    public Class<EntertainViewHolder> getViewHolderType() {
        return EntertainViewHolder.class;
    }

    @Override
    public void prepare(@NonNull EntertainPrimitive model, List<GraywaterAdapter.Binder<? super EntertainPrimitive, ? extends EntertainViewHolder>> binders, int binderIndex) {

    }

    @Override
    public void bind(@NonNull EntertainPrimitive model, @NonNull EntertainViewHolder holder, @NonNull List<GraywaterAdapter.Binder<? super EntertainPrimitive, ? extends EntertainViewHolder>>
            binders, int binderIndex, @NonNull GraywaterAdapter.ActionListener<EntertainPrimitive, EntertainViewHolder> actionListener) {
        Picasso.get().load(model.getUrls().get(binderIndex)).placeholder(R.mipmap.ic_launcher).into(holder.getImg());
        holder.getTitle().setText(model.getTitles().get(binderIndex));

        holder.getmActionListenerDelegate().update(actionListener, model, holder, binders, binderIndex, null);
        holder.getMainLayoutView().setOnClickListener(holder.getmActionListenerDelegate());
    }

    @Override
    public void unbind(@NonNull EntertainViewHolder holder) {
        holder.getMainLayoutView().setOnClickListener(null);
    }

}
