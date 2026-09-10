/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;


import dao.CakeOrderDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.CakeOrder;
import service.CakeOrderService;

public class CakeOrderServiceImpl extends UnicastRemoteObject implements CakeOrderService{

    public CakeOrderServiceImpl() throws RemoteException{
        
    }

    CakeOrderDao dao = new CakeOrderDao();

    @Override
    public CakeOrder registerOrder(CakeOrder order) throws RemoteException {
        return dao.registerOrder(order);
    }

    @Override
    public CakeOrder updateOrder(CakeOrder order) throws RemoteException {
        return dao.updateOrder(order);
    }

    @Override
    public CakeOrder deleteOrder(CakeOrder order) throws RemoteException {
        return dao.deleteOrder(order);
    }

    @Override
    public CakeOrder findOrderById(CakeOrder order) throws RemoteException {
        return dao.findOrderById(order);
    }
    
     @Override
    public CakeOrder searchOrder(int orderId) throws RemoteException {
        return dao.searchOrder(orderId);
    }

    @Override
    public List<CakeOrder> findAllOrders() throws RemoteException {
        return dao.findAllOrders();
    }
}
