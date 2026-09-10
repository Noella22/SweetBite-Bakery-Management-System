/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;


import dao.PaymentDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Payment;
import service.PaymentService;

public class PaymentServiceImpl extends UnicastRemoteObject implements PaymentService{

    public PaymentServiceImpl() throws RemoteException{
        
    }

    PaymentDao dao = new PaymentDao();

    @Override
    public Payment registerPayment(Payment payment) throws RemoteException {
        return dao.registerPayment(payment);
    }

    @Override
    public Payment updatePayment(Payment payment) throws RemoteException {
        return dao.updatePayment(payment);
    }

    @Override
    public Payment deletePayment(Payment payment) throws RemoteException {
        return dao.deletePayment(payment);
    }

    @Override
    public Payment findPaymentById(Payment payment) throws RemoteException {
        return dao.findPaymentById(payment);
    }
    
    @Override
public Payment searchPayment(int paymentId)
        throws RemoteException {

    return dao.searchPayment(paymentId);
}
    
    
    @Override
    public List<Payment> findAllPayments() throws RemoteException {
        return dao.findAllPayments();
    }
}