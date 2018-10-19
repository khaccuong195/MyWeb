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

import net.web.db.NhaSanXuatDAO;
import net.web.utils.MyUtils;
import net.web.utils.UrlHelper;

/**
 * Servlet implementation class CreateNhaSanXuat
 */
@WebServlet("/CreateNhaSanXuat")
public class CreateNhaSanXuat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateNhaSanXuat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getServletContext()
                .getRequestDispatcher("/WEB-INF/views/nhasanxuat/create-nsx.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = MyUtils.getStoredConnection(request);
		
		String tennsx = request.getParameter("tennsx");
		NhaSanXuatDAO nsxDAO = new NhaSanXuatDAO();
		try {
			boolean isSuccess = nsxDAO.insertNhaSanXuat(conn, tennsx);
			System.out.println("Trang thai insert: " + isSuccess);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = UrlHelper.getUrl(request, "ListNhaSanXuat");
		System.out.println(url);
		response.sendRedirect(UrlHelper.getUrl(request, "ListNhaSanXuat"));
	}

}
