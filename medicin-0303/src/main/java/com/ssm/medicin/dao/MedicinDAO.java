package com.ssm.medicin.dao;

import com.ssm.medicin.pojo.Medicin;

import java.util.List;

public interface MedicinDAO {

    List<Medicin> getMedicinListByChoice(Medicin medicin);
}
