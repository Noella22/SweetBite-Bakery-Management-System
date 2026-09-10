package dao;

import java.util.Collections;
import java.util.List;
import model.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class CustomerDao {

    // CRUD OPERATIONS

    public Customer registerCustomer(Customer customerObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();

            ss.save(customerObj);

            tr.commit();
            ss.close();

            return customerObj;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }

    public Customer updateCustomer(Customer customerObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();

            ss.update(customerObj);

            tr.commit();
            ss.close();

            return customerObj;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }

    public Customer deleteCustomer(Customer customerObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();

            ss.delete(customerObj);

            tr.commit();
            ss.close();

            return customerObj;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }

    public Customer findCustomerById(Customer customerObj) {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();

            Customer found = (Customer) ss.get(Customer.class, customerObj.getCustomerId());

            ss.close();

            return found;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return null;
    }
    
    public Customer searchCustomer(int customerId){

    Session ss = HibernateUtil.getSessionFactory().openSession();

    Customer customer =
            (Customer) ss.get(Customer.class, customerId);

    ss.close();

    return customer;
}

    public List<Customer> findAllCustomers() {

        try {

            Session ss = HibernateUtil.getSessionFactory().openSession();

            List<Customer> customers = ss.createQuery("SELECT customer FROM Customer customer").list();

            ss.close();

            return customers;

        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return Collections.EMPTY_LIST;
    }
}