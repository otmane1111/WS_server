package Client;

import proxy.BanqueServer;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWs {
    public static void main(String[] args) {
        BanqueServer proxy = new BanqueWS().getBanqueServerPort();
        System.out.println(proxy.conversioneutotoDh(600));
        Compte cp = proxy.getcompte(600);
        System.out.println("-----------------------");
        System.out.println(cp.getSolde());
        System.out.println(cp.getCode());
        System.out.println(cp.getDateCreation());
        System.out.println("-----------------------");
        List<Compte> compteList =proxy.listcompte();
        for (Compte c : compteList) {
            System.out.println(c.getSolde());
            System.out.println(c.getCode());
            System.out.println(c.getDateCreation());

        }

    }
}
