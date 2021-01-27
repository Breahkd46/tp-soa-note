package m2ice.services;

import m2ice.Context;
import m2ice.model.Bill;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "UpdateService")
public class UpdateService {

    private final Context context;

    public UpdateService() {
        this.context = Context.getContext();
    }

    @WebMethod
    public boolean acceptService(String user, String service) {
        return true;
    }
}
