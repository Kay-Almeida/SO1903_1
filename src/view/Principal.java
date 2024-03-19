package view;

import controller.ThreadController;

public class Principal {
	public static void main(String[] args) {
	
		for(int id=0; id<5; id++) {
			Thread ThreadController = new ThreadController(id); 
			ThreadController.start();
			
		}
		
		
	}

}
