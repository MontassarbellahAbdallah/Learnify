package com.learnify.dev.restController;

import com.learnify.dev.entity.Admin;
import com.learnify.dev.repository.AdminRepository;
import com.learnify.dev.service.AdminService;
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
@RequestMapping("/Admin")
public class AdminRestController {
    @Autowired
    AdminRepository adminRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
    @Autowired
    AdminService adminService;
    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<?> ajoutAdmin(@RequestBody Admin admin){
        HashMap<String,Object>response=new HashMap<>();
        if (adminRepository.existsByEmail(admin.getEmail())){
            response.put("Message","email deja existe");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);

        } else{


            admin.setMdp(this.bCryptPasswordEncoder.encode(admin.getMdp()));
            Admin saveuser= adminRepository.save(admin);
            //return adminService.ajouterAdmin(admin);
            return ResponseEntity.status(HttpStatus.CREATED).body(saveuser);
        }
    }
    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public Admin modifierAdmin(@RequestBody Admin admin, @PathVariable("id")Long id){
            admin.setMdp(this.bCryptPasswordEncoder.encode(admin.getMdp()));
        Admin saveuser= adminRepository.save(admin);
        return adminService.modifierAdmin(admin);
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Admin> afficherAdmin(){
        return adminService.afficherAdmin();
    }
    @RequestMapping(method = RequestMethod.GET,value = "/{id}")
    public Optional<Admin> afficherAdminById(@PathVariable("id")Long id){
        return adminService.affchierAdminById(id);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/{id}")
    public void supprimerAdmin(@PathVariable("id")Long id){
        adminService.supprimerAdmin(id);
    }
    /*
    @PostMapping(path = "login")
    public ResponseEntity<Map<String, Object>> loginAdmin(@RequestBody Admin admin) {

        HashMap<String, Object> response = new HashMap<>();

        Admin userFromDB = adminRepository.findAdminByEmail(admin.getEmail());

        if (userFromDB == null) {
            response.put("message", "Admin not found !");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }  else {
            boolean compare=this.bCryptPasswordEncoder.matches(admin.getMdp(), userFromDB.getMdp());
            if (!compare){
                response.put("message", "Admin not found !");
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
            } else {
                String token = Jwts.builder()
                        .claim("data", userFromDB)
                        .signWith(SignatureAlgorithm.HS256, "SECRET")
                        .compact();
                response.put("token", token);
                return ResponseEntity.status(HttpStatus.OK).body(response);
            }
        }
    }
     */

}
