package com.heyzqt.graywaterprimarydemo.binder;

import android.support.annotation.NonNull;

import com.heyzqt.graywaterprimarydemo.R;
import com.heyzqt.graywaterprimarydemo.model.Primitive;
import com.heyzqt.graywaterprimarydemo.model.SportPrimitive;
import com.heyzqt.graywaterprimarydemo.viewholder.SportViewHolder;
import com.heyzqt.graywaterprimarydemo.viewholder.TitleViewHolder;
import com.squareup.picasso.Picasso;
import com.tumblr.graywater.GraywaterAdapter;

import java.util.List;


/**
 * Created by heyzqt on 2018/10/23.
 */

public class TitleBinder<U extends Primitive.Title> implements GraywaterAdapter.Binder<U, TitleViewHolder> {

    @NonNull
    @Override
    public Class<TitleViewHolder> getViewHolderType() {
        return TitleViewHolder.class;
    }

    @Override
    public void prepare(@NonNull U model, List<GraywaterAdapter.Binder<? super U, ? extends TitleViewHolder>> binders, int binderIndex) {

    }

    @Override
    public void bind(@NonNull U model, @NonNull TitleViewHolder holder, @NonNull List<GraywaterAdapter.Binder<? super U, ? extends TitleViewHolder>> binders, int binderIndex, @NonNull
            GraywaterAdapter.ActionListener<U, TitleViewHolder> actionListener) {
        holder.getTitle().setText(model.getModuleName().getValue());
    }

    @Override
    public void unbind(@NonNull TitleViewHolder holder) {

    }
}
