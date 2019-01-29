package com.heyzqt.graywaterprimarydemo.model;

import com.heyzqt.graywaterprimarydemo.bean.ModuleName;

/**
 * Created by ericleong on 3/13/16.
 */
public interface Primitive {

    interface Title extends Primitive {
        ModuleName getModuleName();
    }
}
