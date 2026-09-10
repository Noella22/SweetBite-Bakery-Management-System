package dao;

import java.util.Collections;
import java.util.List;
import model.CakeOrder;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class CakeOrderDao {

    public CakeOrder registerOrder(CakeOrder orderObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();

            ss.save(orderObj);

            tr.commit();
            ss.close();

            return orderObj;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }

    public CakeOrder updateOrder(CakeOrder orderObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();

            ss.update(orderObj);

            tr.commit();
            ss.close();

            return orderObj;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }

    public CakeOrder deleteOrder(CakeOrder orderObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();

            ss.delete(orderObj);

            tr.commit();
            ss.close();

            return orderObj;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }

    public CakeOrder findOrderById(CakeOrder orderObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();

            CakeOrder found = (CakeOrder) ss.get(CakeOrder.class, orderObj.getOrderId());

            ss.close();

            return found;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }
    
        public CakeOrder searchOrder(int orderId){

        Session ss = HibernateUtil.getSessionFactory().openSession();

        CakeOrder order =
                (CakeOrder) ss.get(CakeOrder.class, orderId);

        ss.close();

        return order;
    }



    public List<CakeOrder> findAllOrders() {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();

            List<CakeOrder> orders = ss.createQuery("from CakeOrder").list();

                
            ss.close();

            return orders;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return Collections.EMPTY_LIST;
    }
}