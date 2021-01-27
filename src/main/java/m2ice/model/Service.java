package m2ice.model;

public class Service {

    String name;
    String userId;
    boolean done;

    public Service(String name, String userId){
        this.name = name;
        this.userId = userId;
        this.done = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
