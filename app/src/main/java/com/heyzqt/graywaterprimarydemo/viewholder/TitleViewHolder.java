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

public class TitleViewHolder extends PrimitiveViewHolder {

    private TextView title;

    public TitleViewHolder(View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.title);
    }

    public TextView getTitle() {
        return title;
    }

    public void setTitle(TextView title) {
        this.title = title;
    }
}
