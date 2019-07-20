package pl.sda.auctionsite.model.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import pl.sda.auctionsite.model.entity.User;
import pl.sda.auctionsite.model.repositories.RoleRepository;
import pl.sda.auctionsite.model.repositories.UserRepository;

import java.time.LocalDate;
import java.util.Arrays;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UserService(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    public void addUser(@RequestBody User user) {
        user.setAccountCreationDate(LocalDate.now());
        user.setAccountStatus("Active");
        user.setRoles(Arrays.asList(roleRepository.findByName("ROLE_USER")));
        userRepository.save(user);
    }

    public void modifyUser(User user, Long id) {
        userRepository.findById(id).map(
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

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}