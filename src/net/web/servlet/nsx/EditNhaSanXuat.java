package net.web.servlet.nsx;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.web.beans.NhaSanXuat;
import net.web.db.NhaSanXuatDAO;
import net.web.utils.MyUtils;
import net.web.utils.UrlHelper;

/**
 * Servlet implementation class EditNhaSanXuat
 */
@WebServlet("/EditNhaSanXuat")
public class EditNhaSanXuat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditNhaSanXuat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		int nsxId = Integer.parseInt(request.getParameter("id"));
		NhaSanXuatDAO nsxDAO = new NhaSanXuatDAO();
		try {
			NhaSanXuat nsx = nsxDAO.findNhaSanXuatById(conn, nsxId);
			request.setAttribute("nsx", nsx);
			
			RequestDispatcher dispatcher = request.getServletContext()
	                .getRequestDispatcher("/WEB-INF/views/nhasanxuat/edit-nsx.jsp");
	        dispatcher.forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		int nsxId = Integer.parseInt(request.getParameter("id"));
		String tennsx = request.getParameter("tennsx");
		NhaSanXuatDAO nsxDAO = new NhaSanXuatDAO();
		try {
			nsxDAO.updateNhaSanXuat(conn, nsxId, tennsx);
			
			response.sendRedirect(UrlHelper.getUrl(request, "ListNhaSanXuat"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
