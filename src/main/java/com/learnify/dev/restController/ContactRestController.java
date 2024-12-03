package com.learnify.dev.restController;

import com.learnify.dev.entity.Contact;
import com.learnify.dev.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/Contact")
public class ContactRestController {
    @Autowired
    ContactService contactService;
    @RequestMapping(method = RequestMethod.POST )
    //ajouter
    public Contact ajoutContact(@RequestBody Contact contact){
        return contactService.ajouterContact(contact);

    }
    //select(afficher)
    @RequestMapping(method = RequestMethod.GET)
    public List<Contact> afficherContact(){
        return contactService.afficherContact();
    }

    //delete
    @RequestMapping(method = RequestMethod.DELETE,value="/{id}")
    public void deleteContact(@PathVariable("id")Long id){
        contactService.supprimerContact(id);
    }

}
