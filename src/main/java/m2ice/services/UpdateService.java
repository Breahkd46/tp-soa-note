package m2ice.services;

import m2ice.Context;
import m2ice.model.Bill;
import m2ice.model.Service;

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
        Service serviceUser = this.context.getServices().stream()
                .filter(service1 -> service1.getUserId().equals(user) &&
                        service1.getName().equals(service)).findFirst().orElse(null);
        if (serviceUser != null) {
            serviceUser.setDone(true);
            return true;
        }
        return false;
    }
}
