package m2ice.services;

import m2ice.Context;
import m2ice.model.User;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "searchuser")
public class SearchUserService {

    private final Context context;

    public SearchUserService() {
        this.context = Context.getContext();
    }


    @WebMethod
    public String searchUserService(String name) {
        String result = "";
        for (User u : this.context.getUsers()) {
            if (u.getName().equals(name)){
                result = u.getId();
            }
        }
        return result;
    }
}
