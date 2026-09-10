package controller;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import service.implementation.BakerServiceImpl;
import service.implementation.CakeOrderServiceImpl;
import service.implementation.CakeServiceImpl;
import service.implementation.CustomerServiceImpl;
import service.implementation.PaymentServiceImpl;
import service.implementation.UserServiceImpl;

public class Server {

    public static void main(String[] args) {

        try {

            Registry reg = LocateRegistry.createRegistry(5004);

            reg.rebind("customer", new CustomerServiceImpl());
            reg.rebind("cake", new CakeServiceImpl());
            reg.rebind("baker", new BakerServiceImpl());
            reg.rebind("order", new CakeOrderServiceImpl());
            reg.rebind("payment", new PaymentServiceImpl());
            reg.rebind("user", new UserServiceImpl());

            System.out.println("Server is running on port 5004");

        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }
}