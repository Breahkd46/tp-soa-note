package m2ice.model;

public class Bill {
    String userId;
    String serviceName;

    public Bill(String userId , String serviceName){
        this.serviceName = serviceName;
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
