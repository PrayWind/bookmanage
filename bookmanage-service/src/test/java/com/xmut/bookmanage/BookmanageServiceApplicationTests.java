package com.xmut.bookmanage;

import com.xmut.bookmanage.module.user.entity.User;
import com.xmut.bookmanage.module.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookmanageServiceApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {

        User user1 = userService.findByUsername("admin");
        User user2 = userService.findByUsernameAndPassword("admin", "111");

        System.out.println(user1);
        System.out.println(user2);

    }

}
