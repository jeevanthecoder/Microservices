package com.contact.service;

import com.contact.entity.Contacts;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceIml implements ContactService{

    List<Contacts> list = List.of(
      new Contacts(1L,"jeevanharish897@gmail.com","Jeevan",1321L),
      new Contacts(2L,"jacklSparrow897@gmail.com","Sparrow",1321L),
      new Contacts(3L,"MacInTosh897@gmail.com","Mack",1311L),
      new Contacts(4L,"Mavricks897@gmail.com","Mavrick",3321L)
    );

    @Override
    public List<Contacts> getContactsOfUser(Long userId) {
        return this.list.stream().filter(contacts -> contacts.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
