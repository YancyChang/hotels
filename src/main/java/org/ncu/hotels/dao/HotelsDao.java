package org.ncu.hotels.dao;

import org.ncu.hotels.entity.Hotel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by YancyChang on 2019/3/16.
 */
@Component
public interface HotelsDao {

    ArrayList<Hotel> selectHotels(HashMap map);

    Integer selectHotelsCount(HashMap map);
}
