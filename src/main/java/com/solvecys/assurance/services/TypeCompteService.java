package com.solvecys.assurance.services;

import com.solvecys.assurance.entities.TypeCompte;
import com.solvecys.assurance.repositories.TypeCompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeCompteService {
    @Autowired
    private TypeCompteRepository typeCompteRepository;

    public void create(TypeCompte typeCompte) {

        typeCompteRepository.save(typeCompte);
    }

    public List<TypeCompte> findAll() {
        return typeCompteRepository.findAll();
    }


}
