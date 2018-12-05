package transaction.wallet.core.dao;

import transaction.wallet.core.data.dao.GenericDao;
import transaction.wallet.persistence.data.UserEntity;

public interface UserDao extends GenericDao<Integer, UserEntity> {
    UserEntity isUserExist(String username, String password);
    UserEntity findUserByUsernameAndPassword(String username, String password);
    void insertUser(String username, String password, String name, String email, String phone);
    UserEntity findIdByUser(String username);
}
