package com.ssm.medicin.service;

import com.github.pagehelper.PageInfo;
import com.ssm.medicin.pojo.Medicin;

import java.util.List;

public interface MedicinService {

    PageInfo<Medicin> getMedicinListByChoice(Medicin medicin,int pageNum,int pageSize);

}
