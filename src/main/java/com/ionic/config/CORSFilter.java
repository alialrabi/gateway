package com.ionic.config;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CORSFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		HttpServletResponse res = (HttpServletResponse) response;

//		System.out.println("**************************************");
//		System.out.println(request.getRemoteAddr() + "           "
//				+ request.getLocalAddr() + "              "
//				+ request.getLocalName());
//		System.out.println();
//		System.out.println(request.toString());
//
//		System.out.println("-------------------------------------------");
//		System.out.println();
//
//		System.out.println(res.getHeaderNames());
//		System.out.println();
//		
//		System.out.println(res.getHeaders(null).size() + "               /////////////////////////////");
//		
//		res.getHeaders(null).clear();
//		
//		System.out.println(res.getHeaders(null).size() + "               /////////////////////////////");
//
//
//		if (res.getHeader("Access-Control-Allow-Origin") == null) {
//			System.out.println("++++++++++++++++++++++++++++++++++++++++ 1");
//
//			res.setHeader("Access-Control-Allow-Origin", "*");
//		}
//		if (res.getHeader("Access-Control-Allow-Credentials") == null) {
//			System.out.println("++++++++++++++++++++++++++++++++++++++++ 2");
//
//			res.setHeader("Access-Control-Allow-Credentials", "true");
//		}
//		if (res.getHeader("Access-Control-Allow-Methods") == null) {
//			System.out.println("++++++++++++++++++++++++++++++++++++++++ 3");
//
//			res.setHeader("Access-Control-Allow-Methods",
//					"POST, GET, PUT, OPTIONS, DELETE");
//		}
//		if (res.getHeader("Access-Control-Max-Age") == null) {
//			System.out.println("++++++++++++++++++++++++++++++++++++++++ 4");
//
//			res.setHeader("Access-Control-Max-Age", "3600");
//		}
//		if (res.getHeader("Access-Control-Allow-Headers") == null) {
//			System.out.println("++++++++++++++++++++++++++++++++++++++++ 5");
//
//			res.setHeader(
//					"Access-Control-Allow-Headers",
//					"X-Requested-With, Content-Type, Authorization, Origin, Accept, Access-Control-Request-Method, Access-Control-Request-Headers");
//		}
//		System.out.println("-------------------------------------------");
//		System.out.println();
//
//		System.out.println(res.getHeaderNames());
//		System.out.println();
		filterChain.doFilter(request, response);

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void destroy() {

	}
}
