package pl.sda.auctionsite.model.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import pl.sda.auctionsite.model.entity.User;
import pl.sda.auctionsite.model.repositories.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(@RequestBody User user) {
        userRepository.save(user);
    }

    public void modifyUser(User user, String login) {
        userRepository.findById(login).map(
                userFromDatabase -> {
                    userFromDatabase.setPassword(user.getPassword());
                    userFromDatabase.setAccountName(user.getAccountName());
                    userFromDatabase.setProvince(user.getProvince());
                    userFromDatabase.setCity(user.getCity());
                    userFromDatabase.setStreetName(user.getStreetName());
                    userFromDatabase.setHouseNo(user.getHouseNo());
                    userFromDatabase.setPostcode(user.getPostcode());
                    userFromDatabase.setAvatarHref(user.getAvatarHref());
                    return userRepository.save(userFromDatabase);
                }
        );
    }

    public void deleteUser(String login) {
        userRepository.deleteById(login);
    }
}
