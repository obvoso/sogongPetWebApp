package petMan;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PetSearch")
public class PetSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PetSearchServlet() {
        super();
    }

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String name = null;
		String jspAdrr = null;
		String SQL = null;
		String SQL2 = null;
		
		if (request.getParameter("searchedPet") != null) {
			name = request.getParameter("searchedPet");
			jspAdrr = "searchPetList.jsp";		
			SQL = "select * from petMan where name like '%" + name + "%'"; 
		}
		else {
			jspAdrr = "lookupPetList.jsp";
			SQL = "select * from petMan";
		}
		try {
			PetManDAO searchPet = new PetManDAO();
			GetPetList searchPetList = searchPet.search(SQL);
			request.setAttribute("list", searchPetList);
			if (jspAdrr.equals("lookupPetList.jsp")) {
				SQL2 = "select * from petMan order by binary(name)";
				GetPetList searchPetList2 = searchPet.search(SQL2);
				request.setAttribute("list2", searchPetList2);
			}
			RequestDispatcher dispatcher = 
					request.getRequestDispatcher(jspAdrr);
			dispatcher.forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
