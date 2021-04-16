package cn.lizhi.test;

import cn.lizhi.controller.UserController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Create By lizhi on 11/12/20.
 */
public class UserServiceTest extends BasicTest{
    @Autowired
    private UserController userController;
    @Test
    public void testEms(){
        System.out.println("hello");


    }
}
