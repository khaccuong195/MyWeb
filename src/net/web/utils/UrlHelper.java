package net.web.utils;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class UrlHelper {
	public static String getUrl(HttpServletRequest request, String servletName) {
		ServletContext servletContext = request.getServletContext();
		return String.format("%s/%s", request.getContextPath(), servletName);
	}
}
