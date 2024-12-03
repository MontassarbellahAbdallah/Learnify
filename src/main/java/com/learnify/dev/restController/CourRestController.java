package com.learnify.dev.restController;

import com.learnify.dev.entity.Cour;
import com.learnify.dev.service.CourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/Cour")
public class CourRestController {
    @Autowired
    CourService courService;
    @RequestMapping(method = RequestMethod.POST )

    public Cour ajoutCour(@RequestBody Cour cour){
        return courService.ajouterCour(cour);

    }
    //select(afficher)
    @RequestMapping(method = RequestMethod.GET)
    public List<Cour> afficherCour(){
        return courService.afficherCour();
    }

    //delete
    @RequestMapping(method = RequestMethod.DELETE,value="/{id}")
    public void deleteCour(@PathVariable("id")Long id){
        courService.supprimerCour(id);
    }

    // modifier
    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public Cour modifierCour(@RequestBody Cour cour, @PathVariable("id")Long id){
        return courService.modifierCour(cour);
    }

    //selectbyid
    @RequestMapping(method = RequestMethod.GET,value ="/{id}")
    public Optional<Cour> afficherbyid(@PathVariable("id")Long id){
        Optional<Cour> courid=courService.afficherCourById(id);
        return courid;
    }

}
