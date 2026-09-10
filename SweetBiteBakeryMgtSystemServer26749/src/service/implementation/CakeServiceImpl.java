package service.implementation;

import dao.CakeDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Cake;
import service.CakeService;

public class CakeServiceImpl extends UnicastRemoteObject implements CakeService{

    public CakeServiceImpl() throws RemoteException{
        
    }

    CakeDao dao = new CakeDao();

    @Override
    public Cake registerCake(Cake cake) throws RemoteException {
        return dao.registerCake(cake);
    }

    @Override
    public Cake updateCake(Cake cake) throws RemoteException {
        return dao.updateCake(cake);
    }

    @Override
    public Cake deleteCake(Cake cake) throws RemoteException {
        return dao.deleteCake(cake);
    }

    @Override
    public Cake findCakeById(Cake cake) throws RemoteException {
        return dao.findCakeById(cake);
    }
    
    @Override
    public Cake searchCake(int cakeId) throws RemoteException {
    return dao.searchCake(cakeId);
}
    
    @Override
    public List<Cake> findAllCakes() throws RemoteException {
        return dao.findAllCakes();
    }
}