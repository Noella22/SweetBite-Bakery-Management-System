package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Payment;

public interface PaymentService extends Remote{
    
    Payment registerPayment(Payment payment) throws RemoteException;
    
    Payment updatePayment(Payment payment) throws RemoteException;
    
    Payment deletePayment(Payment payment) throws RemoteException;
    
    Payment findPaymentById(Payment payment) throws RemoteException;
    
     Payment searchPayment(int paymentId) throws RemoteException;
           
    
    List<Payment> findAllPayments() throws RemoteException;
}