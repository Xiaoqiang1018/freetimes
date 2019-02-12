package com.exam5.xiaoqiang.service.impl;

import com.exam5.xiaoqiang.dao.CarSchoolDAO;
import com.exam5.xiaoqiang.pojo.CarSchool;
import com.exam5.xiaoqiang.service.CarSchoolService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CarSchoolServiceImpl implements CarSchoolService {
    @Autowired
    private CarSchoolDAO carSchoolDAO;

    @Override
    public PageInfo<CarSchool> getCarSchoolList(Integer comId, String subject, Date date, Date sdate, Integer status, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<CarSchool> carSchoolList = carSchoolDAO.getCarSchoolList(comId, subject, date, sdate, status);
        return new PageInfo<>(carSchoolList);
    }

    @Override
    public CarSchool getCarSchoolListById(Integer id) {
        return carSchoolDAO.getCarSchoolListById(id);
    }

    @Override
    public int updateCarSchoolById(Integer comId, String subject, Integer price, Date date, Integer status, Integer id) {
        return carSchoolDAO.updateCarSchoolById(comId, subject, price, date, status, id);
    }
}
