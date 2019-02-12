package com.exam5.xiaoqiang.dao;

import com.exam5.xiaoqiang.pojo.CarSchool;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface CarSchoolDAO {
    List<CarSchool> getCarSchoolList(@Param("comId")Integer comId, @Param("subject")String subject, @Param("date")Date date, @Param("sdate")Date sdate, @Param("status")Integer status);

    CarSchool getCarSchoolListById(Integer id);

    int updateCarSchoolById(@Param("comId")Integer comId, @Param("subject")String subject, @Param("price")Integer price, @Param("date")Date date, @Param("status")Integer status,@Param("id")Integer id);
}
