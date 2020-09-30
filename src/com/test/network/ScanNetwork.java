package com.test.network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class ScanNetwork {

	public static String getSubnet(String currentIP) {
		int firstSeparator = currentIP.lastIndexOf("/");
		int lastSeparator = currentIP.lastIndexOf(".");
		return currentIP.substring(firstSeparator + 1, lastSeparator + 1);
	}

	public static void main(String[] args) {

		System.out.println("--------------");
		try {

			String ip = "192.168.1."; // first 3 octects go here
			for (int i = 1; i < 255; i++) {
				if (InetAddress.getByName(ip + i).isReachable(200)) {
					
					System.out.println(ip + i);
					
					InetAddress ia = InetAddress. getByName(ip + i);
                System.out.println(ia.getHostAddress() + "  " + ia.getHostName() + "  " + ia.getLocalHost());

				}

			}

//			
//		        Enumeration nis = NetworkInterface.getNetworkInterfaces();
//		        while(nis.hasMoreElements())
//		        {
//		            NetworkInterface ni = (NetworkInterface) nis.nextElement();
//		            Enumeration ias = ni.getInetAddresses();
//		            while (ias.hasMoreElements())
//		            {
//		                InetAddress ia = (InetAddress) ias.nextElement();
//		                System.out.println(ia.getHostAddress() + "  " + ia.getHostName() + "  " + ia.getLocalHost());
//		            }
//
//		        }
		} catch (SocketException ex) {
			ex.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		try {
//			String myip = InetAddress.getLocalHost().getHostAddress();
//
//			System.out.println(myip);
//
//			
//
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}
}
