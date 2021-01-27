package m2ice.model;

public class User {

    public String name;
    public String id;

    public User(String name){
        this.name = name;
        this.id = ""+Math.random();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

}
