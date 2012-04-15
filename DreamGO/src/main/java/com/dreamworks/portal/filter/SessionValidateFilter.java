package com.dreamworks.portal.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.filter.OncePerRequestFilter;

public class SessionValidateFilter extends OncePerRequestFilter {

	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		validate(request, response);
		filterChain.doFilter(request, response);

	}

	private void validate(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String url = request.getRequestURL().toString();
		HttpSession session = request.getSession(true);
		if (url.endsWith("DreamGO/")) {
			return;
		}
		if (url.endsWith("/loginlogic")) {
			return;
		}
		if (url.endsWith("/login")) {
			return;
		}
		if (session.getAttribute("user") == null)
			response.sendRedirect("/DreamGO/");
	}

}
