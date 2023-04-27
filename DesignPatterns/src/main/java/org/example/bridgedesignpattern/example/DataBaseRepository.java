package org.example.bridgedesignpattern.example;
import javax.persistence.EntityTransaction;
import javax.persistence.EntityManager;

class DataBaseRepository implements StorageRepository{
    public void store(BaseEntiy entiy){

        EntityTransaction tx = getEntityManager().getTransaction();


        try {

            tx.begin();

            getEntityManager().persist(entiy);

            tx.commit();

        } catch (Exception ex) {

            if (tx.isActive()) {

                tx.rollback();

            }

        }

    }

}