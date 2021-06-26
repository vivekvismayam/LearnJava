package com.pack1;

import java.net.InetAddress;

public class PingSite {
	public static void pingSiteAddress(String url){
        try{
        	System.out.println("Pinging:  " + url);
            InetAddress address = InetAddress.getByName(url);
            System.out.println(address);
            boolean reachable = address.isReachable(10000);

            System.out.println(url+" is reachable?: " + reachable);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
