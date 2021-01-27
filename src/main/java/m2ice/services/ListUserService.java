package m2ice.services;

import m2ice.Context;
import m2ice.model.Service;
import m2ice.model.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(serviceName = "listuser")
public class ListUserService {

    private final Context context;

    public ListUserService() {
        this.context = Context.getContext();
    }


    @WebMethod
    public List<String> listUserService(String serviceName) {
        List<String> userIds = new ArrayList<>();
        for (Service s : this.context.getServices()){
            if(s.getName().equals(serviceName)){
                userIds.add(s.getUserId());
            }
        }
        return userIds;
    }
}