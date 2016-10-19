/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devstation.emailsender.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Shekhar Ullah
 */
public class EmailSenderEntityManager {

    static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("OpenEmailSenderPU");

    public static void persist(Object obj) {
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();
        entitymanager.persist(obj);
        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
}
