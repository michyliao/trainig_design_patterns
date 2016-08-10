package creation.singleton.apps;

import creation.singleton.domains.RequestHandler;

public class SingletonClient {
	
	public static void main(String[] agrs){
		RequestHandler handler1 = RequestHandler.getInstance();
		
		System.out.println(handler1.hashCode());
		
		RequestHandler handler2 = RequestHandler.getInstance();
		
		System.out.println(handler2.hashCode());
		
		
		Runnable runnable = new Runnable(){
			@Override
			public void run(){
				RequestHandler handler = RequestHandler.getInstance();
				System.out.println(Thread.currentThread().getName()+handler.hashCode());
				
			}
			};
			Thread t1 = new Thread(runnable, "ash");
			Thread t2 = new Thread(runnable,"bash");
			Thread t3 = new Thread(runnable, "tash");
			
			t1.start();
			t2.start();
			t3.start();
			
	}
	
	
	

}
