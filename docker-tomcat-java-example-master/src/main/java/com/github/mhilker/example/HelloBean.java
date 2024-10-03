package com.github.mhilker.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * This servlet responses with "Hello World!" to GET requests.
 */
@Named
@RequestScoped
public class HelloBean extends HttpServlet {


	private String message = "¡Hola desde JSF!";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Write "Hello World!" to the response.
	 *
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();

		writer.println("Hello World!");
		writer.close();
	}

}
