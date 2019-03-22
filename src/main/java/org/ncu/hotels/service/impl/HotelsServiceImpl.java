package org.ncu.hotels.service.impl;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.ncu.hotels.dao.HotelsDao;
import org.ncu.hotels.entity.Hotel;
import org.ncu.hotels.service.HotlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by YancyChang on 2019/3/16.
 */
@Service
public class HotelsServiceImpl implements HotlesService {

    @Autowired
    HotelsDao hotelsDao;


    @Override
    public JSONObject selectHotelsTable(HashMap map) {
        Integer count = hotelsDao.selectHotelsCount(map);
        ArrayList<Hotel> hotels = hotelsDao.selectHotels(map);
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = JSONArray.fromObject(hotels);
        jsonObject.put("data",jsonArray);
        jsonObject.put("count",count);
        jsonObject.put("msg","");
        jsonObject.put("code",0);
        return jsonObject;
    }

}
