package com.heyzqt.graywaterprimarydemo.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.heyzqt.graywaterprimarydemo.R;
import com.heyzqt.graywaterprimarydemo.model.EntertainPrimitive;
import com.heyzqt.graywaterprimarydemo.model.Primitive;
import com.heyzqt.graywaterprimarydemo.model.SportPrimitive;
import com.tumblr.graywater.GraywaterAdapter;

/**
 * Created by heyzqt on 2018/10/23.
 */

public class TitleViewHolder<U extends Primitive.Title> extends PrimitiveViewHolder {

    private TextView title;
    private TextView add;

    private GraywaterAdapter.ActionListenerDelegate<U, PrimitiveViewHolder>
            mActionListenerDelegate = new GraywaterAdapter.ActionListenerDelegate<>();

    public TitleViewHolder(View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.title);
        add = itemView.findViewById(R.id.add);
    }

    public TextView getTitle() {
        return title;
    }

    public void setTitle(TextView title) {
        this.title = title;
    }

    public TextView getAdd() {
        return add;
    }

    public void setAdd(TextView add) {
        this.add = add;
    }

    public GraywaterAdapter.ActionListenerDelegate<U, PrimitiveViewHolder> getmActionListenerDelegate() {
        return mActionListenerDelegate;
    }
}
