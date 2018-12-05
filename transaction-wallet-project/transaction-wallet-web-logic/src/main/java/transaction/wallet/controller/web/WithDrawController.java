package transaction.wallet.controller.web;

import transaction.wallet.command.UserCurrencyCommand;
import transaction.wallet.core.web.common.WebConstant;
import transaction.wallet.core.web.utils.FormUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/withdraw.html","/withdraw-bitcoin.html","/withdraw-ether.html"})
public class WithDrawController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserCurrencyCommand command = FormUtil.populate(UserCurrencyCommand.class,request);
        request.setAttribute(WebConstant.LIST_ITEMS, command);
        if(command.getUrlType() !=null && command.getUrlType().equals(WebConstant.URL_WITHDRAW)) {
            RequestDispatcher rd = request.getRequestDispatcher("/views/web/home/withdraw.jsp");
            rd.forward(request, response);
        } else if(command.getUrlType() !=null && command.getUrlType().equals(WebConstant.URL_WITHDRAW_BITCOIN)) {
            RequestDispatcher rd = request.getRequestDispatcher("/views/web/home/withdrawbitcoin.jsp");
            rd.forward(request, response);
        } else if(command.getUrlType() !=null && command.getUrlType().equals(WebConstant.URL_WITHDRAW_ETHER)) {
            RequestDispatcher rd = request.getRequestDispatcher("/views/web/home/withdrawether.jsp");
            rd.forward(request, response);
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
