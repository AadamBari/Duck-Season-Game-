package ie.dit;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Menu extends JPanel implements MouseListener{
	
	Rectangle menu; //menu box
	
	public Menu(){
		
		
		
		
	}
	
	public void paintComponent(Graphics g) {
			
			super.paintComponent(g);
			
			//set background
			Color backC = new Color(0, 173, 255);
			this.setBackground(backC);
			
			//create graphics object
			Graphics2D g2 = (Graphics2D) g;
			
			g2.setColor(Color.BLUE);
			menu = new Rectangle(250, 400, 500, 100);
			g2.fill(menu);
			
			g2.setColor(backC);
			g2.setFont(new Font("Courier New", Font.BOLD, 75));
			g2.drawString("PLAY GAME!", 290, 465);
			
			
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
			if (menu.contains(e.getX(), e.getY()) ) {
				
				System.out.println("Testy test");
				Main.runGame = true;
				
				repaint();
			   }//end if
				
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}//end class Menu
