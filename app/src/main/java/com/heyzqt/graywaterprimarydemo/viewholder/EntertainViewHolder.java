package com.heyzqt.graywaterprimarydemo.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.heyzqt.graywaterprimarydemo.R;
import com.heyzqt.graywaterprimarydemo.model.EntertainPrimitive;
import com.tumblr.graywater.GraywaterAdapter;

/**
 * Created by heyzqt on 2018/10/23.
 */

public class EntertainViewHolder extends PrimitiveViewHolder {

    private RelativeLayout mainLayoutView;
    private ImageView img;
    private TextView title;

    private GraywaterAdapter.ActionListenerDelegate<EntertainPrimitive, EntertainViewHolder>
            mActionListenerDelegate = new GraywaterAdapter.ActionListenerDelegate<>();

    public EntertainViewHolder(View itemView) {
        super(itemView);
        img = itemView.findViewById(R.id.img);
        title = itemView.findViewById(R.id.name);
        mainLayoutView = itemView.findViewById(R.id.item_layout);
    }

    public ImageView getImg() {
        return img;
    }

    public TextView getTitle() {
        return title;
    }

    public void setImg(ImageView img) {
        this.img = img;
    }

    public void setTitle(TextView title) {
        this.title = title;
    }

    public RelativeLayout getMainLayoutView() {
        return mainLayoutView;
    }

    public GraywaterAdapter.ActionListenerDelegate<EntertainPrimitive, EntertainViewHolder> getmActionListenerDelegate() {
        return mActionListenerDelegate;
    }
}
