package com.heyzqt.graywaterprimarydemo.model;

import com.heyzqt.graywaterprimarydemo.bean.ModuleName;
import com.heyzqt.graywaterprimarydemo.bean.SportItem;

import java.util.List;

/**
 * Created by heyzqt on 2018/10/23.
 */

public class SportPrimitive implements Primitive.Title, Primitive {

    private ModuleName moduleNameMap;
    private List<SportItem> sportItems;

    public SportPrimitive(ModuleName moduleNameMap, List<SportItem> sportItems) {
        this.sportItems = sportItems;
        this.moduleNameMap = moduleNameMap;
    }

    public List<SportItem> getSportItems() {
        return sportItems;
    }

    public void setSportItems(List<SportItem> sportItems) {
        this.sportItems = sportItems;
    }

    @Override
    public ModuleName getModuleName() {
        return moduleNameMap;
    }
}
