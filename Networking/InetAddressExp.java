package Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExp{
    public static void main(String argv[]) throws UnknownHostException{
        try{
        //     InetAddress address=InetAddress.getLocalHost();
        // System.out.println(address);
        InetAddress adr=InetAddress.getByName("www.youtube.com");
        System.out.println(adr);
        }catch(UnknownHostException e){
            System.out.println(e.getMessage());
        }
    }
}