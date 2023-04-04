package module3quest.repository;

import module3quest.entity.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class UserRepository {
    private static Map<Integer, User> userList = new ConcurrentHashMap<>();
    private static AtomicInteger counter = new AtomicInteger(0);

    public static User getUserById(Integer userId) {
        return userList.get(userId);
    }

    public static Integer getIdForNewUser(String userName) {
        Integer userId = counter.incrementAndGet();
        userList.put(userId, new User(userName));
        return userId;
    }
}
