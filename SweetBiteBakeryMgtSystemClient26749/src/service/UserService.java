package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import model.User;

public interface UserService extends Remote{
    
    User registerUser(User user) throws RemoteException;
    
    User login(User user) throws RemoteException;
}