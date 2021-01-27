package main.java;
import main.java.model.Bill;
import main.java.model.Service;
import main.java.model.User;

import java.util.ArrayList;
import java.util.List;

public class Context{
    private static Context instance;
    private List<User> users = new ArrayList<User>();
    private List<Service> services = new ArrayList<Service>();
    private List<Bill> bills = new ArrayList<Bill>();

     private Context(){
        this.users = new ArrayList<User>();
        this.services = new ArrayList<Service>();
        this.bills = new ArrayList<Bill>();
    }

    public Context getContext(){
        if(instance == null){
            instance = new Context();
        }
        return instance;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }


}