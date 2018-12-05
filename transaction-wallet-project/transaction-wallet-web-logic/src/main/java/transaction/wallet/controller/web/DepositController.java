package transaction.wallet.controller.web;

import transaction.wallet.command.UserCommand;
import transaction.wallet.command.UserCurrencyCommand;
import transaction.wallet.core.web.common.WebConstant;
import transaction.wallet.core.web.utils.FormUtil;
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

@WebServlet(urlPatterns = {"/deposit.html","/deposit-bitcoin.html","/deposit-ether.html"})
public class DepositController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String addressEther = (String) session.getAttribute("addressEther");
        UserCurrencyCommand command = FormUtil.populate(UserCurrencyCommand.class,request);
        request.setAttribute(WebConstant.LIST_ITEMS, command);
        request.setAttribute("addressEther",addressEther);
        String balanceEther  = request.getParameter("balanceEther");
        session.setAttribute("balanceEther", balanceEther);
        if(command.getUrlType() !=null && command.getUrlType().equals(WebConstant.URL_DEPOSIT)) {
            RequestDispatcher rd = request.getRequestDispatcher("/views/web/home/deposit.jsp");
            rd.forward(request, response);
        } else if(command.getUrlType() !=null && command.getUrlType().equals(WebConstant.URL_DEPOSIT_BITCOIN)) {
            RequestDispatcher rd = request.getRequestDispatcher("/views/web/home/depositbitcoin.jsp");
            rd.forward(request, response);
        } else if(command.getUrlType() !=null && command.getUrlType().equals(WebConstant.URL_DEPOSIT_ETHER)) {
            RequestDispatcher rd = request.getRequestDispatcher("/views/web/home/depositether.jsp");
            rd.forward(request, response);
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
