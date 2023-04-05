package com.example.lesson_4;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UsersController {
    List<User> users = new ArrayList<>();
    {
        User user1 = new User(1, "Clayton Morales", 38, "male", "IMMUNICS", "claytonmorales@immunics.com", "+1 (896) 557-3663");
        User user2 = new User(2, "Carmela Faulkner", 22, "female", "BLEENDOT","carmelafaulkner@bleendot.com", "+1 (841) 478-2829");
        User user3 = new User(3, "Francine Mccarty",21,"female","PLAYCE","francinemccarty@playce.com","+1 (896) 560-3012");
        User user4 = new User(4, "Mia Tillman",23,"female","HOTCAKES","miatillman@hotcakes.com","+1 (996) 414-3174");
        User user5 = new User(5,"Carolina Mendez",23,"female","MIXERS","carolinamendez@mixers.com","+1 (824) 460-3558");
        User user6 = new User(6, "Vickie Gallagher",27,"female","QUIZKA","vickiegallagher@quizka.com","+1 (843) 593-3264");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
    }
    private static User findUserById(int id, List<User> users) {
        for (User elementUser : users) {
            if (elementUser.getId() == id) {
                return elementUser;
            }
        }
        return null;
    }

    @GetMapping("/all-users")
    public List<User> getAllUsers() {
        return users;
    }

    @GetMapping("/user")
    public User getOneUser(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        String userId = httpServletRequest.getParameter("id");
        User findUser = findUserById(Integer.parseInt(userId), users);
        if (findUser == null) {
            httpServletResponse.sendError(400, "User with this id was not found");
        }
        return findUser;
    }

 }