package com.heyzqt.graywaterprimarydemo.binder;

import android.support.annotation.NonNull;

import com.heyzqt.graywaterprimarydemo.R;
import com.heyzqt.graywaterprimarydemo.bean.SportItem;
import com.heyzqt.graywaterprimarydemo.model.SportPrimitive;
import com.heyzqt.graywaterprimarydemo.viewholder.SportViewHolder;
import com.squareup.picasso.Picasso;
import com.tumblr.graywater.GraywaterAdapter;

import java.util.List;


/**
 * Created by heyzqt on 2018/10/23.
 */

public class SportBinder implements GraywaterAdapter.Binder<SportPrimitive, SportViewHolder> {
    @NonNull
    @Override
    public Class<SportViewHolder> getViewHolderType() {
        return SportViewHolder.class;
    }

    @Override
    public void prepare(@NonNull SportPrimitive model, List<GraywaterAdapter.Binder<? super SportPrimitive, ? extends SportViewHolder>> binders, int binderIndex) {

    }

    @Override
    public void bind(@NonNull SportPrimitive model, @NonNull SportViewHolder holder, @NonNull List<GraywaterAdapter.Binder<? super SportPrimitive, ? extends SportViewHolder>>
            binders, int binderIndex, @NonNull GraywaterAdapter.ActionListener<SportPrimitive, SportViewHolder> actionListener) {
        SportItem sport = model.getSportItems().get(binderIndex - 1);

        Picasso.get().load(sport.getUrl()).placeholder(R.mipmap.ic_launcher).into(holder.getImg());
        holder.getTitle().setText(sport.getTitle());

        holder.getmActionListenerDelegate().update(actionListener, model, holder, binders, binderIndex, null);
        holder.getMainLayoutView().setOnClickListener(holder.getmActionListenerDelegate());
        holder.getDelete().setOnClickListener(holder.getmActionListenerDelegate());
    }

    @Override
    public void unbind(@NonNull SportViewHolder holder) {
        holder.getMainLayoutView().setOnClickListener(null);
        holder.getDelete().setOnClickListener(null);
    }

}
