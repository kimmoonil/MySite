package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.MemberDAO;
import model.MemberVO;

public class LoginController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("controller");
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		MemberVO vo=MemberDAO.getInstance().login(id, password);
		if(vo==null){
			return "redirect:board/login_fail.jsp";
		}else{
			HttpSession session=request.getSession();
			session.setAttribute("mvo", vo);
			return "redirect:index.jsp";
		}
		
	}

}
