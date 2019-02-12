package com.exam5.xiaoqiang.service;

import com.exam5.xiaoqiang.pojo.CarSchool;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface CarSchoolService {
    PageInfo<CarSchool> getCarSchoolList(Integer comId, String subject, Date date, Date sdate, Integer status,Integer pageNum,Integer pageSize);

    CarSchool getCarSchoolListById(Integer id);

    int updateCarSchoolById(Integer comId, String subject, Integer price, Date date, Integer status, Integer id);
}
