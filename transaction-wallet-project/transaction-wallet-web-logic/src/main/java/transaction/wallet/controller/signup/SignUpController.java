package transaction.wallet.controller.signup;

import transaction.wallet.command.UserCommand;
import transaction.wallet.common.ReadJSONFile;
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
import java.io.IOException;

@WebServlet("/signup.html")
public class SignUpController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/views/signup/signup.jsp");
        rd.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserCommand command = FormUtil.populate(UserCommand.class, request);
        UserDTO pojo = command.getPojo();
        UserService userService = new UserServiceImpl();
        UserCurrencyService userCurrencyService = new UserCurrencyServiceImpl();
        try{
            userService.insertUser(pojo);
            String[] objects = new ReadJSONFile().Read(pojo.getUsername());
            UserDTO userDTO = userService.findIdByUser(pojo);
            UserCurrencyDTO userCurrencyDTO = new UserCurrencyDTO();
            userCurrencyDTO.setUserId(userDTO.getId());
            userCurrencyDTO.setTypeCurrency("Ether");
            userCurrencyDTO.setAddress(objects[0]);
            userCurrencyDTO.setBalance(0.0);
            userCurrencyDTO.setPrivatekey(objects[1]);
            userCurrencyService.insertUserCurrency(userCurrencyDTO);
        } catch(NullPointerException e) {
            request.setAttribute(WebConstant.ALERT, WebConstant.TYPE_ERROR );
            request.setAttribute(WebConstant.MESSAGE_RESPONSE, "Incorrect");
        }
        response.sendRedirect("/login.html");
    }
}
