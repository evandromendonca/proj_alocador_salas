package br.uff.alocadorSalas.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
 
public class EntityManagerUtil {
  private static EntityManagerFactory emf;
 
    public static EntityManager getEntityManager() {
         if (emf == null){
                  emf = Persistence.createEntityManagerFactory("ProjetoFinalPU");
         }
         return emf.createEntityManager();
    }
}