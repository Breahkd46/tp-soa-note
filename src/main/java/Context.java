package main.java;
import main.java.model.User;

import java.util.ArrayList;
import java.util.List;

public class Context{
    private static Context instance;
    private List<User> users = new ArrayList<User>();
    private Context(){

    }

    public Context getContext(){
        if(instance == null){
            instance = new Context();
        }
        return instance;
    }
}