package com.learnify.dev.restController;

import com.learnify.dev.entity.Participant;
import com.learnify.dev.repository.ParticipantRepository;
import com.learnify.dev.service.ParticipantService;
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
@RequestMapping("/Participant")
public class ParticipantRestController {
    private BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
    @Autowired
    ParticipantService participantService;
    @Autowired
    ParticipantRepository participantRepository;

    @RequestMapping(method = RequestMethod.POST )
    //ajouter
    public Participant ajoutParticipant(@RequestBody Participant participant){
        participant.setMdp(this.bCryptPasswordEncoder.encode(participant.getMdp()));
        Participant saveparticipant=participantRepository.save(participant);
        return participantService.ajouterParticipant(participant);
    }

    //midifier avec cryptage de mdp
    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public Participant modifierParticipant(@RequestBody Participant participant, @PathVariable("id")Long id){
        participant.setMdp(this.bCryptPasswordEncoder.encode(participant.getMdp()));
        Participant saveuser= participantRepository.save(participant);
        return participantService.modifierParticipant(participant);
    }

    //select(afficher)
    @RequestMapping(method = RequestMethod.GET)
    public List<Participant> afficherParticipant(){
        return participantService.afficherParticipant();
    }

    //selectbyid
    @RequestMapping(method = RequestMethod.GET,value ="/{id}")
    public Optional<Participant> afficherbyid(@PathVariable("id")Long id){
        Optional<Participant> participantid=participantService.afficherParticipantById(id);
        return participantid;
    }
    //delete
    @RequestMapping(method = RequestMethod.DELETE,value="/{id}")
    public void deleteParticipant(@PathVariable("id")Long id){
        participantService.supprimerParticipant(id);
    }
    //login
    @PostMapping(path = "loginc")
    public ResponseEntity<Map<String, Object>> loginAdmin(@RequestBody Participant participant) {

        HashMap<String, Object> response = new HashMap<>();

        //Participant userFromDB = participantRepository.findParticipantByEmail(participant.getEmail());

//        if (userFromDB == null) {
//            response.put("message", "CLient not found !");
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
//        }  else {
//            boolean compare=this.bCryptPasswordEncoder.matches(participant.getMdp(),userFromDB.getMdp());
//            if (!compare){
//                response.put("message", "Participant not found !");
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
    public ResponseEntity<?> confirmationParticipant(@RequestParam("token")String confirmationToken){
        return participantService.confirmationEmail(confirmationToken);
    }
}
