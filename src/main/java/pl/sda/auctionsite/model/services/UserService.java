package pl.sda.auctionsite.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.sda.auctionsite.model.entity.User;
import pl.sda.auctionsite.model.repositories.RoleRepository;
import pl.sda.auctionsite.model.repositories.UserRepository;

import java.time.LocalDate;
import java.util.Arrays;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public void addUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setAccountCreationDate(LocalDate.now());
        user.setAccountStatus("Active");
        user.setRoles(Arrays.asList(roleRepository.findByName("ROLE_USER")));
        userRepository.save(user);
    }

    public User findByLogin(String login) {
        return userRepository.findByLogin(login).get();
    }

    public void modifyUser(User user, String login) {
        User userFromDatabase = findByLogin(login);
        userFromDatabase.setPassword(user.getPassword());
        userFromDatabase.setAccountName(user.getAccountName());
        userFromDatabase.setEmail(user.getEmail());
        userFromDatabase.setProvince(user.getProvince());
        userFromDatabase.setCity(user.getCity());
        userFromDatabase.setStreetName(user.getStreetName());
        userFromDatabase.setHouseNo(user.getHouseNo());
        userFromDatabase.setPostcode(user.getPostcode());
        userFromDatabase.setAvatarHref(user.getAvatarHref());
        userRepository.save(userFromDatabase);
    }

    public void deleteUser(String login) {
        userRepository.deleteByLogin(login);
    }
}