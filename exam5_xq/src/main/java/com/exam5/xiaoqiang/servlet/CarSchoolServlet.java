package com.exam5.xiaoqiang.servlet;

import com.exam5.xiaoqiang.pojo.CarSchool;
import com.exam5.xiaoqiang.pojo.Company;
import com.exam5.xiaoqiang.service.CarSchoolService;
import com.exam5.xiaoqiang.service.CompanyService;
import com.exam5.xiaoqiang.service.impl.CarSchoolServiceImpl;
import com.exam5.xiaoqiang.service.impl.CompanyServiceImpl;
import com.exam5.xiaoqiang.utils.RequestUtil;
import com.github.pagehelper.PageInfo;
import org.aspectj.runtime.internal.cflowstack.ThreadStackImpl11;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@WebServlet("/carschool.html")
public class CarSchoolServlet extends HttpServlet {
    private CarSchoolService carSchoolServiceImpl;
    private CompanyService companyServiceImpl;

    @Override
    public void init(ServletConfig config) throws ServletException {
        ApplicationContext Context = (ApplicationContext) config.getServletContext().getAttribute("APPLICATION_CONTEXT_CONSTANCES");
        carSchoolServiceImpl = Context.getBean(CarSchoolService.class);
        companyServiceImpl = Context.getBean(CompanyService.class);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        List<Company> companyList = companyServiceImpl.getCompanyList();
        request.setAttribute("companyList", companyList);
        Integer comId = RequestUtil.getInt(request, "comId");
        String subject = request.getParameter("subject");
        Date date = RequestUtil.getDate(request, "date", "yyyy-MM-dd");
        Date sdate = RequestUtil.getDate(request, "sdate", "yyyy-MM-dd");
        Integer status = RequestUtil.getInt(request, "status");
        System.out.println("status======="+status);
        Integer pageNum = RequestUtil.getInt(request, "pn");
        if (pageNum == null) {
            pageNum = 1;
        }
        PageInfo<CarSchool> carSchoolList = carSchoolServiceImpl.getCarSchoolList(comId, subject, date, sdate, status, pageNum, 2);
        request.setAttribute("carSchoolList", carSchoolList);
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }
}
