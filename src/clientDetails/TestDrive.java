/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientDetails;

/**
 *
 * @author wjdgh
 */
public class TestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClientComponent allClients = new ClientCategory("전체 고객");
        ClientComponent business = new ClientCategory("기업 고객");
        ClientComponent general = new ClientCategory("일반 고객");

        // 전체 고객
        allClients.add(allClients);
        allClients.add(business);
        allClients.add(general);

        // 기업 고객
        //business.add(new ClientItem("CM1593120705069", 276.0000, 282.6666, 0.988100, 6.5873, 42.7670, 281.7176));
        //business.add(new ClientItem("CM1593120705069", 276.0000, 282.6666, 0.988100, 6.5873, 42.7670, 281.7176));
        //business.add(new ClientItem("CM1593120705069", 276.0000, 282.6666, 0.988100, 6.5873, 42.7670, 281.7176));
        // 일반 고객
        //general.add(new ClientItem("CM1593120705069", 276.0000, 282.6666, 0.988100, 6.5873, 42.7670, 281.7176));
        //general.add(new ClientItem("CM1593120705069", 276.0000, 282.6666, 0.988100, 6.5873, 42.7670, 281.7176));
        
        ClientComponent b1 = new ClientItem("CM1593120705069", 276.0000, 282.6666, 0.988100, 6.5873, 42.7670, 281.7176);
        ClientComponent g1 = new ClientItem("CM1593120705069", 276.0000, 282.6666, 0.988100, 6.5873, 42.7670, 281.7176);

        business.add(b1);
        general.add(g1);

        ClientDisplay clientDisplay = new ClientDisplay(allClients);
        clientDisplay.allPrint();

    }

}
