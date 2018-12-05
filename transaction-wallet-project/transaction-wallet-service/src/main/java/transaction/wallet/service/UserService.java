package transaction.wallet.service;

import transaction.wallet.dto.UserDTO;

public interface UserService {
    UserDTO isUserExist (UserDTO dto);
    void insertUser(UserDTO dto);
    UserDTO findIdByUser(UserDTO dto);
}
