package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Cake;
import model.Customer;

public interface CakeService extends Remote{
    
    Cake registerCake(Cake cake) throws RemoteException;
    
    Cake updateCake(Cake cake) throws RemoteException;
    
    Cake deleteCake(Cake cake) throws RemoteException;
    
    Cake findCakeById(Cake cake) throws RemoteException;
    
    Cake searchCake(int cakeId)throws RemoteException;
    
    List<Cake> findAllCakes() throws RemoteException;
}