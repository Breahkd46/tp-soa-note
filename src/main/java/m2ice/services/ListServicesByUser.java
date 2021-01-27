package m2ice.services;

import m2ice.Context;
import m2ice.model.Service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
import java.util.stream.Collectors;

@WebService(serviceName = "ListServicesByUser")
public class ListServicesByUser {

    private final Context context;

    public ListServicesByUser() {
        this.context = Context.getContext();
    }


    @WebMethod
    public List<String> listServicesByUser(String userId) {
        List<String> services = this.context.getServices().stream()
                .filter(serv -> serv.getUserId().equals(userId)).map(Service::getName).collect(Collectors.toList());
        return services;
    }
}
