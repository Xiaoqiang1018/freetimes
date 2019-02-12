package com.exam5.xiaoqiang.servlet;

import com.exam5.xiaoqiang.pojo.CarSchool;
import com.exam5.xiaoqiang.pojo.Company;
import com.exam5.xiaoqiang.service.CarSchoolService;
import com.exam5.xiaoqiang.service.CompanyService;
import com.exam5.xiaoqiang.service.impl.CompanyServiceImpl;
import com.exam5.xiaoqiang.utils.RequestUtil;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.Period;
import java.util.Date;
import java.util.List;

@WebServlet("/edit.html")
public class EditServlet extends HttpServlet {
    private CompanyService companyServiceImpl;
    private CarSchoolService carSchoolServiceImpl;

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
        String act = request.getParameter("act");
        if ("modify".equals(act)) {

            modify(request, response);
        } else if ("update".equals(act)) {
            updateData(request, response);
        }

    }

    protected void modify(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        List<Company> companyList = companyServiceImpl.getCompanyList();
        request.setAttribute("companyList", companyList);
        Integer id = RequestUtil.getInt(request, "id");
        System.out.println("id===========" + id);
        if (id != null) {
            CarSchool carSchoolListById = carSchoolServiceImpl.getCarSchoolListById(id);
            System.out.println("carSchoolListById============" + carSchoolListById);
            request.setAttribute("cs", carSchoolListById);
        }
        request.getRequestDispatcher("edit.jsp").forward(request, response);

    }

    protected void updateData(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        Integer id = RequestUtil.getInt(request, "id");
        Integer comId = RequestUtil.getInt(request, "comId");
        String subject = request.getParameter("subject");
        Integer price = RequestUtil.getInt(request, "price");
        Date date = RequestUtil.getDate(request, "date", "yyyy-MM-dd");
        Integer status = RequestUtil.getInt(request, "status");

        int i = 0;
        if (id != null) {
            i = carSchoolServiceImpl.updateCarSchoolById(comId,subject,price,date,status,id);
        }
        if (i > 0) {
            response.sendRedirect("carschool.html");
        } else {
            request.setAttribute("message", "更新失败请重新输入");
            request.getRequestDispatcher("edit.jsp").forward(request, response);
        }

    }
}
