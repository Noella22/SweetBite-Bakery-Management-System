package dao;

import model.User;
import org.hibernate.Session;


public class UserDao {

    public User registerUser(User userObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.beginTransaction();

            ss.save(userObj);

            ss.getTransaction().commit();
            ss.close();

            return userObj;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }

    public User login(User userObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();

            User user = (User) ss.createQuery(
                    "FROM User u WHERE u.username=:username AND u.password=:password")
                    .setParameter("username", userObj.getUsername())
                    .setParameter("password", userObj.getPassword())
                    .uniqueResult();

            ss.close();

            return user;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }
}