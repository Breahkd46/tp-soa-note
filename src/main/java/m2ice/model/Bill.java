package m2ice.model;

public class Bill {
    String userId;
    String serviceName;
    String userReturnId;

    public Bill(String userId , String serviceName, String userReturnId){
        this.serviceName = serviceName;
        this.userId = userId;
        this.userReturnId = userReturnId;
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

    public String getUserReturnId() {
        return userReturnId;
    }

    public void setUserReturnId(String userReturnId) {
        this.userReturnId = userReturnId;
    }
}
