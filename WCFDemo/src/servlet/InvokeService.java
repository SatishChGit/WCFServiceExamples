package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tempuri.IFirstWebServiceProxy;

@WebServlet("/add")
public class InvokeService extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	 Integer input1=Integer.parseInt(request.getParameter("firstnumber"));
	 Integer input2=Integer.parseInt(request.getParameter("secondnumber"));
	 IFirstWebServiceProxy calService=new IFirstWebServiceProxy();
	 Integer result=calService.add(input1,input2);
	 request.setAttribute("res", "The result is: "+result);
	 RequestDispatcher rd=request.getRequestDispatcher("Add.jsp");
	 rd.forward(request, response);
	}

}
