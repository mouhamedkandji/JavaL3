/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import models.Classe;
import models.Personne;

/**
 *
 * @author 22177
 */
public class DaoPersonne {
    private final String SQL_SELECT_BY_CLASSE="select * from personne " + " where type='Etudiant' and classe_id=?";
    
    public List<Personne> findByClasse(Classe classe){
       List<Personne> lEtudiants= new ArrayList<>();
       //Recuperation
       return lEtudiants;
    }
}
