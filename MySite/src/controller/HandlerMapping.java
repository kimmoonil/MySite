package controller;

public class HandlerMapping {
	private static HandlerMapping instance=new HandlerMapping();
	private HandlerMapping(){}
	public static HandlerMapping getInstance(){
		return instance;
	}
	public Controller create(String command){
		Controller controller=null;
		if(command.equals("clientSite")){
			controller=new ClientController();
		}if(command.equals("login")){
			controller=new LoginController();
		}if(command.equals("logout")){
			controller=new LogoutController();
		}
		return controller;
	}
}
