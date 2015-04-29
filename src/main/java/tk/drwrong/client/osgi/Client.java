package tk.drwrong.client.osgi;

import tk.drwrong.server.osgi.IHelloWorldSvc;

public class Client {
	private IHelloWorldSvc helloWorldSvc;
	
	public IHelloWorldSvc getHelloWorldSvc(){
		return helloWorldSvc;
	}
	
	public void setHelloWorldSvc(IHelloWorldSvc helloWorldSvc){
		this.helloWorldSvc = helloWorldSvc;
	}
	
	public void init(){
		if(helloWorldSvc != null){
			helloWorldSvc.sayHello("kitty");
		} else{
			System.out.println("Null reference to server");
		}
	}

}
