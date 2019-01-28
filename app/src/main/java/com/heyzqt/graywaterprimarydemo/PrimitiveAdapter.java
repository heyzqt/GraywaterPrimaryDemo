package com.heyzqt.graywaterprimarydemo;

import com.heyzqt.graywaterprimarydemo.binder.EntertainBinder;
import com.heyzqt.graywaterprimarydemo.binder.SportBinder;
import com.heyzqt.graywaterprimarydemo.binderlist.EntertainItemBinder;
import com.heyzqt.graywaterprimarydemo.binderlist.SportItemBinder;
import com.heyzqt.graywaterprimarydemo.listener.OnItemClickListener;
import com.heyzqt.graywaterprimarydemo.model.EntertainPrimitive;
import com.heyzqt.graywaterprimarydemo.model.Primitive;
import com.heyzqt.graywaterprimarydemo.model.SportPrimitive;
import com.heyzqt.graywaterprimarydemo.viewholder.EntertainViewHolder;
import com.heyzqt.graywaterprimarydemo.viewholder.PrimitiveViewHolder;
import com.heyzqt.graywaterprimarydemo.viewholder.SportViewHolder;
import com.heyzqt.graywaterprimarydemo.viewholdercreator.EntertainViewHolderCreator;
import com.heyzqt.graywaterprimarydemo.viewholdercreator.SportViewHolderCreator;
import com.tumblr.graywater.GraywaterAdapter;

/**
 * Created by heyzqt on 2018/10/23.
 */

public class PrimitiveAdapter extends GraywaterAdapter<Primitive, PrimitiveViewHolder, Class<? extends Primitive>> {

    public PrimitiveAdapter(OnItemClickListener listener) {
        register(new EntertainViewHolderCreator(), EntertainViewHolder.class);  //将creator和对应的viewholder绑定

        EntertainBinder entertainBinder = new EntertainBinder();
        EntertainItemBinder entertainItemBinder = new EntertainItemBinder(entertainBinder, listener);
        register(EntertainPrimitive.class, entertainItemBinder, entertainItemBinder);  //将itemBinder和指定的数据类型绑定

        register(new SportViewHolderCreator(), SportViewHolder.class);
        SportBinder sportBinder = new SportBinder();
        SportItemBinder sportItemBinder = new SportItemBinder(sportBinder, listener);
        register(SportPrimitive.class, sportItemBinder, sportItemBinder);
    }

    @Override
    protected Class<? extends Primitive> getModelType(Primitive model) {
        return model.getClass();
    }
}
