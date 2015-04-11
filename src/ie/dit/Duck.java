package ie.dit;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.util.Random;

public class Duck extends JPanel implements ActionListener,  MouseListener{
	
	Timer timer;
	
	int bodyHeight, bodyWidth, headHeight, headWidth;
	int[] duckX = new int[10];
	int[] duckY = new int[10];
	int speed;
	
	public Duck() {
		
		Random init = new Random();
		//random variable for duck positions
		
		//duck dimensions
		this.bodyHeight = 40;
		this.bodyWidth = 60;
		this.headHeight = 20;
		this.headWidth = 20;
		
		//duck velocity
		this.speed = 5;
		
		//Initializing duck positions
		for (int i = 0; i <10; i++) {
			
			this.duckX[i] = -1 * init.nextInt(1000);
			this.duckY[i] = init.nextInt(640);
		}
		
		//set timer refresh every ten milliseconds
		timer = new Timer(10, this);//use 10
        timer.start();
        
       	}//end Duck() method
	

	//paintComponent automatically called every time JFrame is changed
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//set background
		Color backC = new Color(0, 173, 255);
		this.setBackground(backC);
		
		//create graphics object
		Graphics2D g2 = (Graphics2D) g;
		
		//set color
		Color bodyC = new Color(255, 251, 0);
		g2.setColor(bodyC);
		
		//create ellipse for duck body
		for (int i = 0; i < 10; i++)
		{
			Ellipse2D.Double duckBody = new Ellipse2D.Double(duckX[i], duckY[i], bodyWidth, bodyHeight);
			g2.fill(duckBody);
			
			Ellipse2D.Double duckHead = new Ellipse2D.Double(duckX[i] + 40, duckY[i] - 20, headWidth, headHeight);
			g2.fill(duckHead);
			
			duckX[i] += speed;
			
		}
		
		Ellipse2D.Double oval = new Ellipse2D.Double(500, 500, 100, 100);
		g2.fill(oval);
		

		
		/*
		Point2D.Double p1 = new Point2D.Double(200, 200);
		Point2D.Double p2 = new Point2D.Double(500, 200);
		
		Line2D.Double l2 = new Line2D.Double(p1, p2);
		g2.draw(l2);
		*/
	}//end paintComponent
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		Random reInit = new Random(); //random class for duck position
		//Reinitializing duck position after duck reaches the end of the screen
		for(int i = 0; i < 10; i++)
		{
			
			if (duckX[i] > 1000)//when duck reaches end of screen
			{
				duckX[i] = -1 * reInit.nextInt(1000);
				duckY[i] = reInit.nextInt(640);
				
			}//end if
		}//end for
		
		
		repaint();
	} //end actionPerformed()


	@Override
	public void mouseClicked(MouseEvent e) {
		
		
		   
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
	
	
	
}//end class
