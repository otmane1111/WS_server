package WS;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
@WebService(serviceName = "banqueWS")
public class BanqueServer {
    @WebMethod(operationName = "conversioneutotoDh")
    public  double Conversion(@WebParam(name ="montant") double amount) {
        return amount*10;
    }
    public  Compte getcompte(@WebParam(name = "code") int code) {
        return new Compte(code,1000+Math.random()*9000,new Date());

    }
    @WebMethod
    public List<Compte> listcompte(){
        return List.of(
                new   Compte(1,1000+Math.random()*9000,new Date()),
                new   Compte(2,1000+Math.random()*9000,new Date()),
                new   Compte(3,1000+Math.random()*9000,new Date())
        );
    }
}