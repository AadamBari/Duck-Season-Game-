package ie.dit;

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
    }
	
	

	
	public static void main(String[] args){
		
		
		
	}
	

}
