package m2ice;

import m2ice.model.Bill;
import m2ice.model.Service;
import m2ice.model.User;

import java.util.ArrayList;
import java.util.List;

public class Context{
    private static Context instance;
    private List<User> users;
    private List<Service> services ;
    private List<Bill> bills ;

     private Context(){
        this.users = new ArrayList<User>();
        this.services = new ArrayList<Service>();
        this.bills = new ArrayList<Bill>();
    }

    public static Context getContext(){
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
