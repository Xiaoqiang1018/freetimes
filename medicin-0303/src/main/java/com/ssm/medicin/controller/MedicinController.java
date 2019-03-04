package com.ssm.medicin.controller;

import com.github.pagehelper.PageInfo;
import com.ssm.medicin.pojo.Medicin;
import com.ssm.medicin.service.MedicinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class MedicinController {
    @Autowired
    private MedicinService medicinService;

    @RequestMapping("getMedList")
    public String getMedicinList(Medicin medicin, Integer pageNum, int pageSize, Map map) {
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }
        PageInfo<Medicin> medicinListByChoice = medicinService.getMedicinListByChoice(medicin, pageNum, 2);
        map.put("medList", medicinListByChoice);
        return "jsp/medicinList";
    }
}
