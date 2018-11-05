package com.heyzqt.graywaterprimarydemo.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.heyzqt.graywaterprimarydemo.R;

/**
 * Created by heyzqt on 2018/10/23.
 */

public class EntertainViewHolder extends PrimitiveViewHolder {
    private ImageView img;
    private TextView title;

    public EntertainViewHolder(View itemView) {
        super(itemView);
        img = itemView.findViewById(R.id.img);
        title = itemView.findViewById(R.id.name);
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
}
