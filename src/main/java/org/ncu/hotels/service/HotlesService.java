package org.ncu.hotels.service;

import net.sf.json.JSONObject;

import java.util.HashMap;

/**
 * Created by YancyChang on 2019/3/16.
 */
public interface HotlesService {
    JSONObject selectHotelsTable(HashMap map);
}
