package m2ice.services;

import m2ice.Context;
import m2ice.model.Bill;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class SendBillService {
    private final Context context;

    public SendBillService() {
        this.context = Context.getContext();
    }

    @WebMethod
    public boolean sendBill(String userId, String serviceName, String userReturnId) {
        Bill billUser = this.context.getBills().stream()
                .filter(bill -> bill.getUserId().equals(userId) &&
                        bill.getServiceName().equals(serviceName) &&
                        bill.getUserReturnId().equals(userReturnId))
                .findFirst().orElse(null);
        if (billUser != null) {
            System.out.println("Send bill to : " + userId);
            return true;
        }
        return false;
    }
}
