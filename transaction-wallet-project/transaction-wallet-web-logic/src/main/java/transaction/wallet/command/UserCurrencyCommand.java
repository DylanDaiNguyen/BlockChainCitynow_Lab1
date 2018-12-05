package transaction.wallet.command;

import transaction.wallet.core.web.command.AbstractCommand;
import transaction.wallet.dto.UserCurrencyDTO;

public class UserCurrencyCommand extends AbstractCommand<UserCurrencyDTO> {
    public UserCurrencyCommand() {
        this.pojo = new UserCurrencyDTO();
    }
}
