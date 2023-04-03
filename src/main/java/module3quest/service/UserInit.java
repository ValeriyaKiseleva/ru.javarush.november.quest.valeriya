package module3quest.service;
import module3quest.entity.User;

import javax.servlet.ServletException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserInit {
    private static Map<String, User> userList = new ConcurrentHashMap<>();

    public static void addUser(String sessionID, String userName) throws ServletException {
        //System.out.println("OK");
        userList.put(sessionID, new User(userName));
        //System.out.println(userList.get(sessionID).getName());
    }

    public static String getUserNameById(String sessionId) {
        // System.out.println(userList.get(sessionId).getName());
        return userList.get(sessionId).getName();
    }

    public static User getUserById(String sessionId) {
        return userList.get(sessionId);
    }


}
