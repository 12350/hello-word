package test2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet2
 */
public class TestServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public TestServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * 接受servlet
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");  
        response.setContentType("text/html;charset=utf-8");  
        System.out.println("test2");  
        System.out.println(request.getParameter("username"));  
        System.out.println(request.getParameter("password"));  
        //获得发送HTTP请求的参数  
        String username=request.getParameter("username");  
        String password=request.getParameter("password"); 
        System.out.println(username+"---"+password);
        //向HTTP发送方返回响应数据  
        if("123".equals(username)&&"456".equals(password)){  
            response.getWriter().write("{\"falg\":\"success\"}");  
        }else{  
            response.getWriter().write("{\"falg\":\"error\"}");  
        }  
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
