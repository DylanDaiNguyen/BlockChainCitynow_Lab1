package transaction.wallet.service.impl;

import transaction.wallet.core.dao.UserCurrencyDao;
import transaction.wallet.core.dao.impl.UserCurrencyDaoImpl;
import transaction.wallet.dto.UserCurrencyDTO;
import transaction.wallet.persistence.data.UserCurrencyEntity;
import transaction.wallet.service.UserCurrencyService;
import transaction.wallet.utils.UserCurrencyBeanUtil;

import java.util.ArrayList;

public class UserCurrencyServiceImpl implements UserCurrencyService {
    public void insertUserCurrency(UserCurrencyDTO dto) {
        UserCurrencyDao dao = new UserCurrencyDaoImpl();
        dao.insertUserCurrency(dto.getUserId(),dto.getTypeCurrency(), dto.getAddress(),dto.getBalance(), dto.getPrivatekey());
    }

    public UserCurrencyDTO findUserCurrencyByUserId(UserCurrencyDTO dto) {
        UserCurrencyDao userDao = new UserCurrencyDaoImpl();
        UserCurrencyEntity entity = userDao.findUserCurrencyByUserId(dto.getUserId());
        return UserCurrencyBeanUtil.entity2Dto(entity);
    }
}
