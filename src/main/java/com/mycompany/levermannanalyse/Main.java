package com.mycompany.levermannanalyse;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main 
{ 
    
    //Halloooooooooooo

    public static void main (String...args){
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();

        Unternehmen Unternehmen = new Unternehmen();
        Unternehmen.seteigenkapital((float)200.00);
        Unternehmen.setid(2);
        Unternehmen.setjahresueberschuss((float)20000.00);
      
        session.save(Unternehmen);
        tx.commit();

        session.close();
        HibernateUtil.shutdown();
    }
}
