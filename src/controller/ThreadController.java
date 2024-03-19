package controller;

public class ThreadController extends Thread {
	
	 int id; 

	public ThreadController (int id) {
		this.id = id; 
	}
	
	public void run() {
		id = (int) getId(); 
		System.out.println(id);
	}
	
}
