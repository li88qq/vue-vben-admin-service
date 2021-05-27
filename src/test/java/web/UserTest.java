package web;

import org.example.Application;
import org.example.entity.User;
import org.example.repo.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = Application.class)
public class UserTest {

    @Resource
    private UserRepo userRepo;

    @Test
    public void saveUserTest() {
        User user = new User();
        user.setUsername("root");
        user.setPassword("123456");
        userRepo.save(user);

        List<User> users = userRepo.findAll();
        users.forEach(a -> {
            System.out.printf("id:%d,username:%s,password:%s%n", a.getId(), a.getUsername(), a.getPassword());
        });
    }
}
