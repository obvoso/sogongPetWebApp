package petMan;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import org.apache.commons.lang3.StringUtils;

@WebServlet("/PetList")
public class PetListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PetListServlet() {
        super();
    }
    
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String name = null;
	 	String birth = null;
	 	String type = null;
	 	String kind = null;
	 	String master = null;
	 	String phone = null;
	 	
	 	if (request.getParameter("name") != null) {
	 		name = (String) request.getParameter("name");
	 	}
	 	if (request.getParameter("birth") != null) {
	 		birth = (String) request.getParameter("birth");
	 	}
	 	if (request.getParameter("type") != null) {
	 		type = (String) request.getParameter("type");
	 	}
	 	if (request.getParameter("kind") != null) {
	 		kind = (String) request.getParameter("kind");
	 	}
	 	if (request.getParameter("master") != null) {
	 		master = (String) request.getParameter("master");
	 	}
	 	if (request.getParameter("phone") != null) {
	 		phone = (String) request.getParameter("phone");
	 	}
	 	if (StringUtils.isEmpty(name) || StringUtils.isEmpty(birth) || StringUtils.isEmpty(type) 
	 			|| StringUtils.isEmpty(kind) || StringUtils.isEmpty(master) || StringUtils.isEmpty(phone)) {
	 		PrintWriter script = response.getWriter();
	 		script.println("<script>");
	 		script.println("alert('모두 입력해주세요.');");
	 		script.println("history.back();");
	 		script.println("</script>");
	 		script.close();
	 		return ;
	 	}
		
		try {
			PetManDTO newPet = new PetManDTO(name, birth, type, kind, master, phone);
			PetManDAO petManDAO = new PetManDAO();
			int ret = petManDAO.join(newPet);
			if (ret == 1) {
				request.setAttribute("newPet", newPet.getName());
				RequestDispatcher dispatcher =
						request.getRequestDispatcher("addPetList.jsp");
				dispatcher.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}