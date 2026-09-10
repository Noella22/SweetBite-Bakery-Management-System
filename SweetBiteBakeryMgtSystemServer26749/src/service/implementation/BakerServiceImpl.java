/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;


import dao.BakerDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Baker;
import service.BakerService;

public class BakerServiceImpl extends UnicastRemoteObject implements BakerService{

    public BakerServiceImpl() throws RemoteException{
        
    }

    BakerDao dao = new BakerDao();

    @Override
    public Baker registerBaker(Baker baker) throws RemoteException {
        return dao.registerBaker(baker);
    }

    @Override
    public Baker updateBaker(Baker baker) throws RemoteException {
        return dao.updateBaker(baker);
    }

    @Override
    public Baker deleteBaker(Baker baker) throws RemoteException {
        return dao.deleteBaker(baker);
    }

    @Override
    public Baker findBakerById(Baker baker) throws RemoteException {
        return dao.findBakerById(baker);
    }

    @Override
    public List<Baker> findAllBakers() throws RemoteException {
        return dao.findAllBakers();
    }
    
    @Override
    public Baker searchBaker(int bakerId) throws RemoteException {
         return dao.searchBaker(bakerId);
    }
}
