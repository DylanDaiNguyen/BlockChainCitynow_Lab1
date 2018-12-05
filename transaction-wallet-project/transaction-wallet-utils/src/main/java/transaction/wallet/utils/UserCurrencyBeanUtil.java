package transaction.wallet.utils;

import transaction.wallet.dto.UserCurrencyDTO;
import transaction.wallet.persistence.data.UserCurrencyEntity;

public class UserCurrencyBeanUtil {
    public static UserCurrencyDTO entity2Dto(UserCurrencyEntity entity) {
        UserCurrencyDTO dto = new UserCurrencyDTO();
        dto.setId(entity.getId());
        dto.setTypeCurrency(entity.getTypeCurrency());
        dto.setAddress(entity.getAddress());
        dto.setBalance(entity.getBalance());
        dto.setUserId(entity.getUserId());
        dto.setPrivatekey(entity.getPrivatekey());
        return dto;
    }

    public static UserCurrencyEntity dto2Entity(UserCurrencyDTO dto) {
        UserCurrencyEntity entity = new UserCurrencyEntity();
        entity.setId(dto.getId());
        entity.setTypeCurrency(dto.getTypeCurrency());
        entity.setAddress(dto.getAddress());
        entity.setBalance(dto.getBalance());
        entity.setUserId(dto.getUserId());
        entity.setPrivatekey(dto.getPrivatekey());
        return entity;
    }
}
