package com.heyzqt.graywaterprimarydemo.model;

import com.heyzqt.graywaterprimarydemo.bean.EntertainItem;
import com.heyzqt.graywaterprimarydemo.bean.ModuleName;

import java.util.List;

/**
 * Created by heyzqt on 2018/10/23.
 */

public class EntertainPrimitive implements Primitive.Title, Primitive {

    private ModuleName moduleNameMap;
    private List<EntertainItem> entertainItems;

    public EntertainPrimitive(ModuleName moduleNameMap, List<EntertainItem> entertainItems) {
        this.entertainItems = entertainItems;
        this.moduleNameMap = moduleNameMap;
    }

    public List<EntertainItem> getEntertainItems() {
        return entertainItems;
    }

    public void setEntertainItems(List<EntertainItem> entertainItems) {
        this.entertainItems = entertainItems;
    }

    @Override
    public ModuleName getModuleName() {
        return moduleNameMap;
    }
}
