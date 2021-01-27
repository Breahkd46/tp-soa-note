package m2ice.services;

import m2ice.Context;
import m2ice.model.Service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
import java.util.stream.Collectors;

@WebService(serviceName = "propose")
public class ListServicesByUser {

    private final Context context;

    public ListServicesByUser() {
        this.context = Context.getContext();
    }


    @WebMethod
    public List<Service> listServicesByUser(String userId) {
        List<Service> services = this.context.getServices().stream()
                .filter(serv -> serv.getUserId().equals(userId)).collect(Collectors.toList());
        return services;
    }
}
