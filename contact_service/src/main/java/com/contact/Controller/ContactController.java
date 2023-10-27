package com.contact.Controller;

import com.contact.entity.Contacts;
import com.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("contact")
public class ContactController {
@Autowired
    private ContactService contactService;

@RequestMapping("/user/{userId}")
    public List<Contacts> getContacts(@PathVariable("userId") Long userId){
    return this.contactService.getContactsOfUser(userId);
}

}
