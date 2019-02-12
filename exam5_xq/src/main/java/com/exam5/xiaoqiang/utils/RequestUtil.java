package com.exam5.xiaoqiang.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

public class RequestUtil {
	public static Integer getInt(HttpServletRequest request, String name) {
		String s = request.getParameter(name);
		if (s != null && s.trim().length() > 0) {
			try {
				return Integer.parseInt(s);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return null;
	}

	public static Date getDate(HttpServletRequest request, String name, String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		String s = request.getParameter(name);
		if (s != null && s.trim().length() > 0) {

			try {
				return format.parse(s);
			} catch (Exception e) {
			}

		}
		return null;
	}
}
