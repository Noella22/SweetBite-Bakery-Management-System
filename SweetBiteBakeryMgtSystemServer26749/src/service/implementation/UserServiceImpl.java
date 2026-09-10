/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;


import dao.UserDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import model.User;
import service.UserService;

public class UserServiceImpl extends UnicastRemoteObject implements UserService{

    public UserServiceImpl() throws RemoteException{
        
    }

    UserDao dao = new UserDao();

    @Override
    public User registerUser(User user) throws RemoteException {
        return dao.registerUser(user);
    }

    @Override
    public User login(User user) throws RemoteException {
        return dao.login(user);
    }


    
}
