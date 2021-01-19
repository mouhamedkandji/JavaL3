/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import dao.DaoClass;
import dao.DaoPersonne;
import java.util.List;
import models.Classe;
import models.Personne;

/**
 *
 * @author 22177
 */
public class Service {
    private DaoClass daoClasse;
    private DaoPersonne daoPersonne;   
        

    public Service() {
        daoClasse=new DaoClass();
        daoPersonne=new DaoPersonne();
    }
     
    public List<Personne> listerEtudiantParClasse(Classe classe){
       return daoPersonne.findByClasse(classe);
    
    }
    
     public boolean creerClasse(Classe classe){
        int nbreLigne= daoClasse.insert(classe); 
         if(nbreLigne==0) return false; else return true;
                 }
     
     public List<Classe> ListerClasse(){
         return daoClasse.findAll();
     }
       
            
        
        }

    
 


 
