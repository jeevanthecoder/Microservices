package com.user.user_service.service;

import com.user.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private List<User> list = List.of(
            new User(1321L,"Jeevan H","9803248908"),
            new User(1242L,"Mohan Kumar","9803248908"),
            new User(1222L,"Mavericks","9803248908")
    );
    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
