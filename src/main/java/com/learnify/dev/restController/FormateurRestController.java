package com.learnify.dev.restController;


import com.learnify.dev.entity.Formateur;
import com.learnify.dev.repository.FormateurRepository;
import com.learnify.dev.service.FormateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/Formateur")
public class FormateurRestController {
    private BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
    @Autowired
    FormateurService formateurSerive;
    @Autowired
    FormateurRepository formateurRepository;

    @RequestMapping(method = RequestMethod.POST )
//RequestBody:tekhdh vrb tabaathhom lel contrl kn sar c bon snn erreur
    //ajouter
    public Formateur ajoutFormateur(@RequestBody Formateur formateur){
        formateur.setMdp(this.bCryptPasswordEncoder.encode(formateur.getMdp()));
        Formateur saveformateur=formateurRepository.save(formateur);
        return formateurSerive.ajouterFormateur(formateur);


    }

    //midifier avec cryptage de mdp
    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public Formateur modifierFormateur(@RequestBody Formateur formateur, @PathVariable("id")Long id){
        formateur.setMdp(this.bCryptPasswordEncoder.encode(formateur.getMdp()));
        Formateur saveuser= formateurRepository.save(formateur);
        return formateurSerive.modifierFormateur(formateur);
    }

    //select(afficher)
    @RequestMapping(method = RequestMethod.GET)
    public List<Formateur> afficherFormateur(){
        return formateurSerive.afficherFormateur();
    }

    //selectbyid
    @RequestMapping(method = RequestMethod.GET,value ="/{id}")
    public Optional<Formateur> afficherbyid(@PathVariable("id")Long id){
        Optional<Formateur> formateurid=formateurSerive.afficherFormateurById(id);
        return formateurid;
    }
    //delete
    @RequestMapping(method = RequestMethod.DELETE,value="/{id}")
    public void deleteFormateur(@PathVariable("id")Long id){
        formateurSerive.supprimerFormateur(id);
    }
    //login
    @PostMapping(path = "loginc")
    public ResponseEntity<Map<String, Object>> loginAdmin(@RequestBody Formateur formateur) {

        HashMap<String, Object> response = new HashMap<>();

//        Formateur userFromDB = formateurRepository.findFormateurByEmail(formateur.getEmail());
//
//        if (userFromDB == null) {
//            response.put("message", "CLient not found !");
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
//        }  else {
//            boolean compare=this.bCryptPasswordEncoder.matches(formateur.getMdp(),userFromDB.getMdp());
//            if (!compare){
//                response.put("message", "Formateur not found !");
//                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
//            }
//            else {
//                String token = Jwts.builder()
//                        .claim("data", userFromDB)
//                        .signWith(SignatureAlgorithm.HS256, "SECRET")
//                        .compact();
//                response.put("token", token);
//
//
//                return ResponseEntity.status(HttpStatus.OK).body(response);
//            }
//        }
        return null;
    }

    @RequestMapping(value = "/confirmationCompte", method = {RequestMethod.GET,RequestMethod.POST})
    public ResponseEntity<?> confirmationFormateur(@RequestParam("token")String confirmationToken){
        return formateurSerive.confirmationEmail(confirmationToken);
    }
}
