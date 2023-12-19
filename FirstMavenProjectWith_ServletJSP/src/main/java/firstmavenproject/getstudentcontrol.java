package firstmavenproject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import StudentDAO.StudDAO;
import Studentobjectmodel.student;

/**
 * Servlet implementation class getstudentcontrol
 */
public class getstudentcontrol extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		int sid=Integer.parseInt(request.getParameter("Sid"));
		
		StudDAO dao=new StudDAO();
		student stud=dao.getstud(sid);
		
//		request.setAttribute("Student",stud);
//		
//		RequestDispatcher rd=request.getRequestDispatcher("ShowStudent.jsp");
//		rd.forward(request, response);
		
		HttpSession ses=request.getSession();
		ses.setAttribute("Student", stud);
		
		response.sendRedirect("ShowStudent.jsp");
		
	}

}
