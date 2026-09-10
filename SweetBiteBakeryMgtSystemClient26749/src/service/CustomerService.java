package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Customer;

public interface CustomerService extends Remote{
    
    Customer registerCustomer(Customer customer) throws RemoteException;
    
    Customer updateCustomer(Customer customer) throws RemoteException;
    
    Customer deleteCustomer(Customer customer) throws RemoteException;
    
    Customer findCustomerById(Customer customer) throws RemoteException;
    
     Customer searchCustomer(int customerId)throws RemoteException;
    
    List<Customer> findAllCustomers() throws RemoteException;
}