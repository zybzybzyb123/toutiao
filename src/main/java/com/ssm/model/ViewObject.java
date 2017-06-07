package com.ssm.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by zero on 17/5/30.
 */
public class ViewObject {
    private Map<String, Object> objs = new HashMap<String, Object>();
    public void set(String key, Object value) {
        objs.put(key, value);
    }

    public Object get(String key) {
        return objs.get(key);
    }
}
