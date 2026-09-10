package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.CakeOrder;

public interface CakeOrderService extends Remote{
    
    CakeOrder registerOrder(CakeOrder order) throws RemoteException;
    
    CakeOrder updateOrder(CakeOrder order) throws RemoteException;
    
    CakeOrder deleteOrder(CakeOrder order) throws RemoteException;
    
    CakeOrder findOrderById(CakeOrder order) throws RemoteException;
    
     CakeOrder searchOrder(int orderId) throws RemoteException;
    
    List<CakeOrder> findAllOrders() throws RemoteException;
}