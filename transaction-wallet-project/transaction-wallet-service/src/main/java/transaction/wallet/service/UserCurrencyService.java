package transaction.wallet.service;

import transaction.wallet.dto.UserCurrencyDTO;

import java.util.ArrayList;
import java.util.List;

public interface UserCurrencyService {
    void insertUserCurrency(UserCurrencyDTO dto);
//    ArrayList<UserCurrencyDTO> findUserCurrencyByUserId(UserCurrencyDTO dto);
    UserCurrencyDTO findUserCurrencyByUserId(UserCurrencyDTO dto);
}
