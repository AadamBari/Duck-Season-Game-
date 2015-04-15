package ie.dit;

import java.awt.Cursor;

import javax.swing.JFrame;


public class Frame extends JFrame {
	
	

	public Frame()
    {
		
        this.setTitle("Duck Season");
        this.setSize(1000, 700);
        this.setLocationRelativeTo(null);// Puts frame to center of the screen.
        this.setResizable(false);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        Cursor crossHair = new Cursor(Cursor.CROSSHAIR_CURSOR);
        setCursor(crossHair);
        
    }
	
	

	
	public static void main(String[] args){
		
		
		
	}
	

}
