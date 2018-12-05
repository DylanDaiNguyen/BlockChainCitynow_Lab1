package transaction.wallet.service.impl;

import transaction.wallet.core.dao.UserDao;
import transaction.wallet.core.dao.impl.UserDaoImpl;
import transaction.wallet.dto.UserDTO;
import transaction.wallet.persistence.data.UserEntity;
import transaction.wallet.service.UserService;
import transaction.wallet.utils.UserBeanUtil;

public class UserServiceImpl implements UserService {
    public UserDTO isUserExist(UserDTO dto) {
        UserDao userDao = new UserDaoImpl();
        UserEntity entity = userDao.findUserByUsernameAndPassword(dto.getUsername(), dto.getPassword());
        return UserBeanUtil.entity2Dto(entity);
    }


    public void insertUser(UserDTO dto) {
        UserDao userDao = new UserDaoImpl();
        userDao.insertUser(dto.getUsername(),dto.getPassword(),dto.getName(),dto.getEmail(),dto.getPhone());
    }

    public UserDTO findIdByUser(UserDTO dto) {
        UserDao userDao = new UserDaoImpl();
        UserEntity entity = userDao.findIdByUser(dto.getUsername());
        return UserBeanUtil.entity2Dto(entity);
    }
}
