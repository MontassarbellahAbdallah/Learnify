package com.learnify.dev.service;

import com.learnify.dev.entity.Cour;
import com.learnify.dev.entity.Cour;
import com.learnify.dev.repository.CourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourServiceImpl implements CourService {
    @Autowired
    CourRepository courRepository;

    @Override
    public Cour ajouterCour(Cour cour) {
        return courRepository.save(cour);
    }

    @Override
    public Cour modifierCour(Cour cour) {
        return courRepository.save(cour);
    }

    @Override
    public Optional<Cour> afficherCourById(Long id) {
        return courRepository.findById(id);
    }

    @Override
    public void supprimerCour(Long id) {
        courRepository.deleteById(id);
    }

    @Override
    public List<Cour> afficherCour() {
        return courRepository.findAll();
    }

}
