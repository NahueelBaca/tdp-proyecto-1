package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
		
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	
            	Student estudiante = new Student(126776,"Baca","Nahuel","nahuelbaca@outlook.com","https://github.com/NahueelBaca","/images/tdp.png");
            	SimplePresentationScreen frame = new SimplePresentationScreen(estudiante);
            	frame.setVisible(true);
            	
            }
        });
    }
}