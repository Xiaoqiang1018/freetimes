package com.exam5.xiaoqiang.service.impl;

import com.exam5.xiaoqiang.dao.CityDAO;
import com.exam5.xiaoqiang.pojo.City;
import com.exam5.xiaoqiang.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDAO cityDAO;

    @Override
    public List<City> getCity(Integer pid) {
        return cityDAO.getCity(pid);
    }
}
