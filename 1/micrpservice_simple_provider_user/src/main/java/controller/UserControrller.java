package controller;

import dao.UserRepository;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create By dongxiaoyong on /2021/3/5
 * description: 用户controller
 *
 * @author dongxiaoyong
 */
@RestController
public class UserControrller {

    @Autowired
    private UserRepository userRepository;

    public User findById(@PathVariable Long id){
        return userRepository.findOne(id);
    }
}
