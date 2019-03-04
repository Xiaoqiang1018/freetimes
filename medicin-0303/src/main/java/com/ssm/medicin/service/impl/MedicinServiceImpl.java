package com.ssm.medicin.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.medicin.dao.MedicinDAO;
import com.ssm.medicin.pojo.Medicin;
import com.ssm.medicin.service.MedicinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicinServiceImpl implements MedicinService {
    @Autowired
    private MedicinDAO medicinDAO;

    @Override
    public PageInfo<Medicin> getMedicinListByChoice(Medicin medicin, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Medicin> medicinList = medicinDAO.getMedicinListByChoice(medicin);
        return new PageInfo<>(medicinList);
    }
}
