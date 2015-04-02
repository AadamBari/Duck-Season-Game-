package ie.dit;

import javax.swing.JFrame;


public class Frame extends JFrame {
	
	Duck d = new Duck();

	public Frame()
    {
		
        this.setTitle("Duck Season");
        this.setSize(1024, 768);
        this.setLocationRelativeTo(null);// Puts frame to center of the screen.
        this.setResizable(false);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(d);
    }
	
	
	public static void main(String[] args){
		
		
		
	}
	

}
