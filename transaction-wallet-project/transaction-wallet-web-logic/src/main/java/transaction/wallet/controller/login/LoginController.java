package transaction.wallet.controller.login;

import transaction.wallet.command.UserCommand;
import transaction.wallet.core.web.common.WebConstant;
import transaction.wallet.core.web.utils.FormUtil;
import transaction.wallet.dto.UserDTO;
import transaction.wallet.service.UserService;
import transaction.wallet.service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login.html")
public class LoginController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/views/login/login.jsp");
        rd.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserCommand command = FormUtil.populate(UserCommand.class, request);
        UserDTO pojo = command.getPojo();
        UserService userService = new UserServiceImpl();
        HttpSession session = request.getSession();
        try{
            if(userService.isUserExist(pojo) !=null) {
                session.setAttribute("username",pojo.getUsername());
                session.setAttribute("password",pojo.getPassword());
                response.sendRedirect("/home.html");
                return;
            }
        } catch(NullPointerException e) {
            request.setAttribute(WebConstant.ALERT, WebConstant.TYPE_ERROR );
            request.setAttribute(WebConstant.MESSAGE_RESPONSE, "Incorrect username or password");
            RequestDispatcher rd = request.getRequestDispatcher("/views/login/login.jsp");
        }
        RequestDispatcher rd= request.getRequestDispatcher("/views/login/login.jsp");
        rd.forward(request,response);
    }
}
