package transaction.wallet.controller.web;

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

@WebServlet(urlPatterns = {"/transfer.html","/transfer-bitcoin.html","/transfer-ether.html"})
public class TransferController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserCurrencyCommand command = FormUtil.populate(UserCurrencyCommand.class,request);
        request.setAttribute(WebConstant.LIST_ITEMS, command);
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
        String address = userCurrencyDTO1.getAddress();
        String privatekey = userCurrencyDTO1.getPrivatekey();
        request.setAttribute("address",address);
        request.setAttribute("privatekey",privatekey);
        if(command.getUrlType() !=null && command.getUrlType().equals(WebConstant.URL_TRANSFER)) {
            RequestDispatcher rd = request.getRequestDispatcher("/views/web/home/transfer.jsp");
            rd.forward(request, response);
        } else if(command.getUrlType() !=null && command.getUrlType().equals(WebConstant.URL_TRANSFER_BITCOIN)) {
            RequestDispatcher rd = request.getRequestDispatcher("/views/web/home/transferbitcoin.jsp");
            rd.forward(request, response);
        } else if(command.getUrlType() !=null && command.getUrlType().equals(WebConstant.URL_TRANSFER_ETHER)) {
            RequestDispatcher rd = request.getRequestDispatcher("/views/web/home/transferether.jsp");
            rd.forward(request, response);
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
