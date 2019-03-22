package org.ncu.hotels.controller;

import net.sf.json.JSONObject;
import org.ncu.hotels.service.HotlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by YancyChang on 2019/3/16.
 */
@Controller
@RequestMapping("/hotel")
public class HotelsController {

    @Autowired
    HotlesService hotlesService;

    @ResponseBody
    @RequestMapping("/table")
    public JSONObject showData(HttpServletResponse response,int page,int limit,String hotelname,Integer sort) throws IOException {
        HashMap<String, Object> map = new HashMap<>();
        map.put("start",(page-1)*limit);
        map.put("limit",limit);
        map.put("hotelname",hotelname);
        map.put("sort",sort);
        JSONObject hotels = hotlesService.selectHotelsTable(map);
        return hotels;
    }
}
