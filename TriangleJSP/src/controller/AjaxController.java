package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjaxController
 */
@WebServlet("/AjaxController")
public class AjaxController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjaxController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//HttpServletRequest req = (HttpServletRequest) request;
		//String path = req.getRequestURI().substring(req.getContextPath().length());
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Double fielda = Double.valueOf(request.getParameter("fielda"));
		Double fieldb = Double.valueOf(request.getParameter("fieldb"));
		Double fieldc = Double.valueOf(request.getParameter("fieldc"));
		String result;
		TriangleStatus triangleStatus = new TriangleStatus();
		if (triangleStatus.isTriangle(fielda, fieldb, fieldc)) {
			result = triangleStatus.isObtuse(fielda, fieldb, fieldc); 
		}	
		else result = "Ne treugolnik";
		request.setAttribute("result", result); // It'll be available as ${result}.
		response.setContentType("text/plain");
		response.setCharacterEncoding("UTF-8");
	    request.getRequestDispatcher("index.jsp").forward(request, response); 
		
		 // response.getWriter().write(String.valueOf(result));
	}

}
