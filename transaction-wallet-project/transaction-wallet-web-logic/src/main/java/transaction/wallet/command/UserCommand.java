package transaction.wallet.command;

import transaction.wallet.core.web.command.AbstractCommand;
import transaction.wallet.dto.UserDTO;

public class UserCommand extends AbstractCommand<UserDTO> {
    public UserCommand() {
        this.pojo = new UserDTO();
    }
}
