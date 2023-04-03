package module3quest.service;

import module3quest.repository.UserRepository;

import javax.servlet.http.HttpSession;

public class UserInit {

    public static void addUser(HttpSession session, String userName) {
        Integer userId = UserRepository.getIdForNewUser(userName);
        session.setAttribute("userId", userId);
        session.setAttribute("userName", userName);
    }

}
