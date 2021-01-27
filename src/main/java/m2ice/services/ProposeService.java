package m2ice.services;

import m2ice.Context;
import m2ice.model.Service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "propose")
public class ProposeService {

    private final Context context;

    public ProposeService() {
        this.context = Context.getContext();
    }


    @WebMethod
    public boolean proposeService(String id, String name) {
        return this.context.getServices().add(new Service(name, id));
    }
}
