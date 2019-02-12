package com.exam5.xiaoqiang.servlet;

import com.exam5.xiaoqiang.pojo.City;
import com.exam5.xiaoqiang.service.CityService;
import com.exam5.xiaoqiang.utils.JsonUtil;
import com.exam5.xiaoqiang.utils.RequestUtil;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/city.html")
public class CityServlet extends HttpServlet {
    private CityService cityServiceImpl;

    @Override
    public void init(ServletConfig config) throws ServletException {
        ApplicationContext context = (ApplicationContext) config.getServletContext().getAttribute("APPLICATION_CONTEXT_CONSTANCES");

        cityServiceImpl = context.getBean(CityService.class);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer province = RequestUtil.getInt(request, "id");
        List<City> city = cityServiceImpl.getCity(province);
        Map<String, Object> map = new HashMap<>();
        map.put("1", city);
        response.setCharacterEncoding("utf-8");
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out = response.getWriter();
        String json = JsonUtil.getJSON(city);
        out.write(json);
        out.flush();
        out.close();

    }
}
