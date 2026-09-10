
package dao;

import java.util.Collections;
import java.util.List;
import model.Cake;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class CakeDao {

    public Cake registerCake(Cake cakeObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();

            ss.save(cakeObj);

            tr.commit();
            ss.close();

            return cakeObj;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }

    public Cake updateCake(Cake cakeObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();

            ss.update(cakeObj);

            tr.commit();
            ss.close();

            return cakeObj;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }

    public Cake deleteCake(Cake cakeObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();

            ss.delete(cakeObj);

            tr.commit();
            ss.close();

            return cakeObj;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }
      
    public Cake searchCake(int cakeId){

    Session ss = HibernateUtil.getSessionFactory().openSession();

    Cake cake = (Cake) ss.get(Cake.class, cakeId);

    ss.close();

    return cake;
}
    
    
    public Cake findCakeById(Cake cakeObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();

            Cake found = (Cake) ss.get(Cake.class, cakeObj.getCakeId());

            ss.close();

            return found;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }

    public List<Cake> findAllCakes() {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();

            List<Cake> cakes = ss.createQuery("from Cake").list();

            ss.close();

            return cakes;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return Collections.EMPTY_LIST;
    }
}