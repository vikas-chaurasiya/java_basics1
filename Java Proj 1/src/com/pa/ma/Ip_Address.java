package com.pa.ma;

import java.net.InetAddress;


public class Ip_Address {

	public static void main(String[] args) throws Exception {
		InetAddress ip=InetAddress.getLocalHost();
		System.out.println("Ip address "+ip.getHostAddress());
		System.out.println("Ip address "+ip.getHostName());
		System.out.println("Ip address "+ip.getCanonicalHostName());
		System.out.println("Ip address "+ip.getLocalHost());

	}

}
