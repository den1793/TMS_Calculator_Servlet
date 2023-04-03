package service;

import entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Denis Smirnov
 */
public class UserService {
    private static List<User> USER_LIST = new ArrayList<>();

    public void save(User user) {
        USER_LIST.add(user);
    }

    public Optional<User> findByUsername(String username) {
        for (User user : USER_LIST) {
            if (user.getUsername().equals(username)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
