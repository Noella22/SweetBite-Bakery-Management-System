package dao;

import java.util.Collections;
import java.util.List;
import model.Payment;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class PaymentDao {

    public Payment registerPayment(Payment paymentObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();

            ss.save(paymentObj);

            tr.commit();
            ss.close();

            return paymentObj;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }

    public Payment updatePayment(Payment paymentObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();

            ss.update(paymentObj);

            tr.commit();
            ss.close();

            return paymentObj;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }

    public Payment deletePayment(Payment paymentObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();

            ss.delete(paymentObj);

            tr.commit();
            ss.close();

            return paymentObj;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }

    public Payment findPaymentById(Payment paymentObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();

            Payment found = (Payment) ss.get(Payment.class, paymentObj.getPaymentId());

            ss.close();

            return found;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }
    
    public Payment searchPayment(int paymentId){

    Session ss =
            HibernateUtil.getSessionFactory().openSession();

    Payment payment =
            (Payment) ss.get(Payment.class, paymentId);

    ss.close();

    return payment;
}

    public List<Payment> findAllPayments() {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();

            List<Payment> payments = ss.createQuery("SELECT payment FROM Payment payment").list();

            ss.close();

            return payments;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return Collections.EMPTY_LIST;
    }
}