/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import dao.CustomerDao;
import dao.HibernateUtil;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Customer;
import org.hibernate.Session;
import service.CustomerService;

/**
 *
 * @author Noella
 */
public class CustomerServiceImpl extends UnicastRemoteObject implements CustomerService{

    public CustomerServiceImpl() throws RemoteException{
        
    }

    CustomerDao dao = new CustomerDao();

    @Override
    public Customer registerCustomer(Customer customer) throws RemoteException {
        return dao.registerCustomer(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) throws RemoteException {
        return dao.updateCustomer(customer);
    }

    @Override
    public Customer deleteCustomer(Customer customer) throws RemoteException {
        return dao.deleteCustomer(customer);
    }

    @Override
    public Customer findCustomerById(Customer customer) throws RemoteException {
        return dao.findCustomerById(customer);
    }

    @Override
    public List<Customer> findAllCustomers() throws RemoteException {
        return dao.findAllCustomers();
    }
    
    @Override
     public Customer searchCustomer(int customerId) throws RemoteException {

        
    Session ss = HibernateUtil.getSessionFactory().openSession();
            

    Customer customer = (Customer) ss.get(Customer.class, customerId);
            

    ss.close();

    return customer;
}
}
