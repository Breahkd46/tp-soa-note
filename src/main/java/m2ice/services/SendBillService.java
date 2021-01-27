package m2ice.services;

import m2ice.Context;
import m2ice.model.Bill;

import javax.jws.WebMethod;

public class SendBillService {
    private final Context context;

    public SendBillService() {
        this.context = Context.getContext();
    }

    @WebMethod
    public boolean sendBill(String userId, String serviceName) {
        Bill billUser = this.context.getBills().stream()
                .filter(bill -> bill.getUserId().equals(userId) && bill.getServiceName().equals(serviceName))
                .findFirst().orElse(null);
        if (billUser != null) {
            System.out.println("Send bill to : " + userId);
            return true;
        }
        return false;
    }
}
