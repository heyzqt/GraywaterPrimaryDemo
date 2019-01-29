package com.heyzqt.graywaterprimarydemo.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.heyzqt.graywaterprimarydemo.R;
import com.heyzqt.graywaterprimarydemo.model.SportPrimitive;
import com.tumblr.graywater.GraywaterAdapter;

/**
 * Created by heyzqt on 2018/10/23.
 */

public class SportViewHolder extends PrimitiveViewHolder {

    private RelativeLayout mainLayoutView;
    private ImageView img;
    private TextView title;
    private TextView delete;

    private GraywaterAdapter.ActionListenerDelegate<SportPrimitive, SportViewHolder>
            mActionListenerDelegate = new GraywaterAdapter.ActionListenerDelegate<>();

    public SportViewHolder(View itemView) {
        super(itemView);
        img = itemView.findViewById(R.id.img);
        title = itemView.findViewById(R.id.name);
        mainLayoutView = itemView.findViewById(R.id.item_layout);
        delete = itemView.findViewById(R.id.delete);
    }

    public TextView getDelete() {
        return delete;
    }

    public void setDelete(TextView delete) {
        this.delete = delete;
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

    public GraywaterAdapter.ActionListenerDelegate<SportPrimitive, SportViewHolder> getmActionListenerDelegate() {
        return mActionListenerDelegate;
    }
}
