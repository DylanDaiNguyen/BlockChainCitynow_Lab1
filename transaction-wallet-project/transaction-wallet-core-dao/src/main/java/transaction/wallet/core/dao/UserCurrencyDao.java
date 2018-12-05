package transaction.wallet.core.dao;

import transaction.wallet.core.data.dao.GenericDao;
import transaction.wallet.persistence.data.UserCurrencyEntity;

import java.util.ArrayList;

public interface UserCurrencyDao extends GenericDao<Integer, UserCurrencyEntity> {
    void insertUserCurrency(Integer userId, String typeCurrency, String address, Double balance, String privatekey);
//    ArrayList<UserCurrencyEntity> findUserCurrencyByUserId(Integer userId);
    UserCurrencyEntity findUserCurrencyByUserId(Integer userId);
}
