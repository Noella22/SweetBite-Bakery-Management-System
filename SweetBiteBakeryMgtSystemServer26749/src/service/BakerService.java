package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Baker;

public interface BakerService extends Remote{
    
    Baker registerBaker(Baker baker) throws RemoteException;
    
    Baker updateBaker(Baker baker) throws RemoteException;
    
    Baker deleteBaker(Baker baker) throws RemoteException;
    
    Baker findBakerById(Baker baker) throws RemoteException;
    
    Baker searchBaker(int bakerId) throws RemoteException;
    
    List<Baker> findAllBakers() throws RemoteException;
}