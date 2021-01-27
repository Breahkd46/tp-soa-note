package m2ice.services;

import m2ice.Context;
import m2ice.model.Bill;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class GenerateBillService {

    private final Context context;

    public GenerateBillService() {
        this.context = Context.getContext();
    }

    @WebMethod
    public boolean generateBill(String user, String service, String usReturn) {
        return this.context.getBills().add(new Bill(user, service, usReturn));

    }
}
