package jvs.spring.pic.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jvs.spring.pic.service.IOPortService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.HttpRequestHandler;

/**
 * Servlet implementation class TempMonitorServlet
 */
public class TempMonitorServlet extends HttpServlet implements HttpRequestHandler {
	private static final long serialVersionUID = 1L;

	/** Logger for this class and subclasses */
	protected final Log logger = LogFactory.getLog(getClass());

	private IOPortService iOPortService = null;

	public void setiOPortService(IOPortService iOPortService) {
		this.iOPortService = iOPortService;
	}

	public TempMonitorServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		try {

			String temp = iOPortService.retrieveTemperatureValue();
			if (temp == null) {
				temp = "loading...";
			}
			out.println(temp + "°C");
			out.close();

		} catch (Exception e) {
			// e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
