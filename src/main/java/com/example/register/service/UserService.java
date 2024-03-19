package com.example.register.service;



import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.register.model.User;


@Service("UserService")
public class UserService {
    private List<User> store =new ArrayList<>();


    public UserService(){
        store.add(new User(Integer.parseInt(UUID.randomUUID().toString()) ,"suraj","suraj@gmail.com"));
        store.add(new User(Integer.parseInt(UUID.randomUUID().toString()) ,"pankaj","pankaj@gmail.com"));
        store.add(new User(Integer.parseInt(UUID.randomUUID().toString()) ,"amit","amit@gmail.com"));
        store.add(new User(Integer.parseInt(UUID.randomUUID().toString()) ,"ranjan","au@gmail.com"));
        store.add(new User(Integer.parseInt(UUID.randomUUID().toString()) ,"ashok","ashok@gmail.com"));
    }

    public List<User> getSet(){
        System.out.println(store+"suraj chaursiya ");
        return this.store;
    }
}
