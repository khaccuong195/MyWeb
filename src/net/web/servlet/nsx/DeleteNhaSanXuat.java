package net.web.servlet.nsx;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.web.db.NhaSanXuatDAO;
import net.web.utils.AppConstants;
import net.web.utils.MyUtils;
import net.web.utils.UrlHelper;

/**
 * Servlet implementation class DeleteNhaSanXuat
 */
@WebServlet("/DeleteNhaSanXuat")
public class DeleteNhaSanXuat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteNhaSanXuat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		
		try {
			int nsxId = Integer.parseInt(request.getParameter("id"));
			NhaSanXuatDAO nsxDAO = new NhaSanXuatDAO();
			nsxDAO.delete(conn, nsxId);
			
			response.sendRedirect(UrlHelper.getUrl(request, "ListNhaSanXuat"));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
