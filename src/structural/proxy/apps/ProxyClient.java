package structural.proxy.apps;

import structural.proxy.domains.*;

public class ProxyClient {

	public static void print(NetAccess obj){
		obj.grantPermission();
	}
	
	public static void main(String[] args) {
		NetAccess proxy = new ProxyNetAccess();
		
		//Proxy is used to represent the Real Subject
		proxy.setEmpGrade(9);
		
		print(proxy);
	}

}
