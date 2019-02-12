package com.exam5.xiaoqiang.service.impl;

import com.exam5.xiaoqiang.dao.CompanyDAO;
import com.exam5.xiaoqiang.pojo.Company;
import com.exam5.xiaoqiang.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyDAO companyDAO;

    @Override
    public List<Company> getCompanyList() {
        return companyDAO.getCompanyList();
    }
}
