package com.exam5.xiaoqiang.dao;

import com.exam5.xiaoqiang.pojo.City;

import java.util.List;

public interface CityDAO {
    List<City> getCity(Integer pid);
}
