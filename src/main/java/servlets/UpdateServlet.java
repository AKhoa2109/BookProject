package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.ListView;

import beans.BookBean;
import beans.ListItem;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * response.getWriter().append("Served at: ").append(request.getContextPath());
		 */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/* doGet(request, response); */
		Double sum = 0.0;
		String id = request.getParameter("productID");
		String moTa = request.getParameter("productDescription");
		String gia = request.getParameter("productPrice");
		String soLuong = request.getParameter("productQuantity");
		
		
		Double giaTien = Double.parseDouble(gia);
		
		Integer sl = Integer.parseInt(soLuong);
		
		 
		BookBean product = new BookBean(id,moTa, giaTien);
		
		ListItem listView = new ListItem(product,sl);
		
		
		
		
		String url = "/giohang.jsp";
		getServletContext().getRequestDispatcher(url).forward(request, response);
		 
	}

}
