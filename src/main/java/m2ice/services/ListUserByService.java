package m2ice.services;

import m2ice.Context;
import m2ice.model.Service;
import m2ice.model.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@WebService(serviceName = "listuser")
public class ListUserByService {

    private final Context context;

    public ListUserByService() {
        this.context = Context.getContext();
    }


    @WebMethod
    public List<String> listUserByService(String serviceName) {
        List<String> userIds = new ArrayList<>();
        for (Service s : this.context.getServices()){
            if(s.getName().equals(serviceName)){
                userIds.add(s.getUserId());
            }
        }
        return userIds;
    }

    @WebMethod
    public List<String> listUser() {
        List<String> userIds = this.context.getUsers().stream().map(user -> user.id).collect(Collectors.toList());
        return userIds;
    }
}
