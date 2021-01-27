package model;

public class Bill {
    String userId;
    String serviceName;

    public Bill(String userId , String serviceName){
        this.serviceName = serviceName;
        this.userId = userId;
    }
}