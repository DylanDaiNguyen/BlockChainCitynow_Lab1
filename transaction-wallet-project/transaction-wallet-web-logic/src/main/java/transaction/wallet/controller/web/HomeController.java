package transaction.wallet.controller.web;

import transaction.wallet.dto.UserCurrencyDTO;
import transaction.wallet.dto.UserDTO;
import transaction.wallet.service.UserCurrencyService;
import transaction.wallet.service.UserService;
import transaction.wallet.service.impl.UserCurrencyServiceImpl;
import transaction.wallet.service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/home.html")
public class HomeController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        UserCurrencyService userCurrencyService = new UserCurrencyServiceImpl();
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(username);
        UserService userService = new UserServiceImpl();
        UserDTO userDTO1 = userService.findIdByUser(userDTO);
        UserCurrencyDTO userCurrencyDTO = new UserCurrencyDTO();
        userCurrencyDTO.setUserId(userDTO1.getId());
        UserCurrencyDTO userCurrencyDTO1 = userCurrencyService.findUserCurrencyByUserId(userCurrencyDTO);
        session.setAttribute("addressEther",userCurrencyDTO1.getAddress());
        String balanceEther = (String) session.getAttribute("balanceEther");
        request.setAttribute("balanceEther",balanceEther);
        RequestDispatcher rd = request.getRequestDispatcher("/views/web/home/web.jsp");
        rd.forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
