package com.heyzqt.graywaterprimarydemo.listener;

import com.heyzqt.graywaterprimarydemo.bean.EntertainItem;
import com.heyzqt.graywaterprimarydemo.bean.SportItem;

/**
 * Created by heyzqt on 2018/11/7.
 */

public interface OnItemClickListener {
    void onClickaddNews(String type);

    void onClickEditEntertain(EntertainItem entertain);

    void onClickDeleteEntertain(EntertainItem entertain);

    void onClickEditSport(SportItem sport);

    void onClickDeleteSport(SportItem sport);
}
