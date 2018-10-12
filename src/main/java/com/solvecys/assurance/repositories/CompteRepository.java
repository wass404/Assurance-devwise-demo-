package com.solvecys.assurance.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.solvecys.assurance.entities.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Integer> {
    @Query(value = "SELECT compte.*,credit.id_credit,credit.capital, credit.date, credit.souscripteur, assurance.id_ln_assurance, assurance.montant, assurance.type_assurance, assurancecredit.date_souscription FROM compte as compte, credit as credit,ln_assurance as assurance, ln_assurance_has_credit as assurancecredit where (assurancecredit.assurance_id_ln_assurance = assurance.id_ln_assurance) and (assurancecredit.credit_id_credit =credit.id_credit) and (credit.id_compte = compte.id_compte)\r\n" + 
    		"",
            nativeQuery = true)
    List<Map<String, Object>> ListTousLesComptes();

}
