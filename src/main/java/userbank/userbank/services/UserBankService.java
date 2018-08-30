package userbank.userbank.services;

import org.springframework.stereotype.Service;
import userbank.userbank.dao.models.User;

import java.util.List;

@Service
public interface UserBankService {
    List<User> list();
    String create(User user);
    String update(User user);
    String delete(Long id);

}