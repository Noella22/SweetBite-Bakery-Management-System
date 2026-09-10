package dao;

import java.util.Collections;
import java.util.List;
import model.Baker;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class BakerDao {

    public Baker registerBaker(Baker bakerObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();

            ss.save(bakerObj);

            tr.commit();
            ss.close();

            return bakerObj;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }

    public Baker updateBaker(Baker bakerObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();

            ss.update(bakerObj);

            tr.commit();
            ss.close();

            return bakerObj;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }

    public Baker deleteBaker(Baker bakerObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();

            ss.delete(bakerObj);

            tr.commit();
            ss.close();

            return bakerObj;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }

    public Baker findBakerById(Baker bakerObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();

            Baker found = (Baker) ss.get(Baker.class, bakerObj.getBakerId());

            ss.close();

            return found;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }
    
    public Baker searchBaker(int bakerId){

    Session ss = HibernateUtil.getSessionFactory().openSession();

    Baker baker = (Baker) ss.get(Baker.class, bakerId);

    ss.close();

    return baker;
}

    public List<Baker> findAllBakers() {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();

           List<Baker> bakers = ss.createQuery("from Baker").list();

        
           
            ss.close();

            return bakers;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return Collections.EMPTY_LIST;
    }
}