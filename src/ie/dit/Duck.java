package ie.dit;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.util.ArrayList;
import java.util.Random;

public class Duck extends JPanel implements ActionListener,  MouseListener{
	
	
	Timer timer;
	
	Ellipse2D.Double duckBody;
	Ellipse2D.Double duckHead;
	Ellipse2D.Double duckEye;
	Rectangle neck;
	Polygon beak;
	ArrayList<Ellipse2D.Double> duckList = new ArrayList<Ellipse2D.Double>();
	int bodyHeight, bodyWidth, headHeight, headWidth, eyeSize;
	int[] duckX = new int[10];
	int[] duckY = new int[10];
	int speed;
	int test = 500;
	Ellipse2D.Double oval;
	Rectangle rect;
	Image duckImage;
	
	public Duck() {
		
		Random init = new Random();
		//random variable for duck positions
		
		//duck dimensions
		this.bodyHeight = 40;
		this.bodyWidth = 60;
		this.headHeight = 20;
		this.headWidth = 20;
		this.eyeSize = 5;
		
		//duck velocity
		this.speed = 5;
		
		//Initializing duck positions
		for (int i = 0; i <10; i++) {
			
			this.duckX[i] = -1 * init.nextInt(1000);
			this.duckY[i] = init.nextInt(640);
		}
		
		//set timer refresh every 20  milliseconds
		timer = new Timer(20, this);
        timer.start();
        
       	}//end Duck() method
	

	//paintComponent automatically called every time JFrame is changed
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//load duck image
		ImageIcon icon = new ImageIcon("resources/duck.png");
		duckImage = icon.getImage();
		
		//set background
		Color backC = new Color(0, 173, 255);
		this.setBackground(backC);
		
		//create graphics object
		Graphics2D g2 = (Graphics2D) g;
		
		//set color
		Color bodyC = new Color(255, 251, 0);
		g2.setColor(bodyC);
		/*
		
		for (int i = 0; i < 10; i++)
		{
			g2.drawImage(duckImage, duckX[i], duckY[i], bodyWidth, bodyHeight, null);
			duckX[i] += speed;
			
		}
		*/
		
		//changed to image instead of drawing shapes for easier hit detection
		//draw duck within this loop
		for (int i = 0; i < 10; i++)
		{
			
			//duckBody = new Ellipse2D.Double(duckX[i], duckY[i], bodyWidth, bodyHeight);
		    duckBody = new Ellipse2D.Double(duckX[i], duckY[i], bodyWidth, bodyHeight);
			g2.fill(duckBody);
			duckList.add(duckBody);
			
			duckHead = new Ellipse2D.Double(duckX[i] + 40, duckY[i] - 20, headWidth, headHeight);
			g2.fill(duckHead);
			
			g2.setColor(Color.BLACK);
			duckEye = new Ellipse2D.Double(duckX[i] + 50, duckY[i] - 15, eyeSize, eyeSize);
			g2.fill(duckEye);
			
			//coords for beak polygon
			int[] xPoints = {duckX[i] + 55, duckX[i] + 70, duckX[i] + 55};
			int[] yPoints = {duckY[i] - 10, duckY[i] -5, duckY[i]};
			
			g2.setColor(Color.ORANGE);
			beak = new Polygon(xPoints, yPoints , 3);
			g2.fill(beak);
			
			g2.setColor(bodyC);
			neck = new Rectangle(duckX[i] + 42, duckY[i] - 5, 10, 15);
			g2.fill(neck);
			
			duckX[i] += speed;
			
		}
		g2.setColor(bodyC);
		
		//Test shapes
		//oval = new Ellipse2D.Double(test, 500, 100, 100);
		//g2.fill(oval);
		
		//rect = new Rectangle(250, 250, 100, 100);
		//g2.fill(rect);

		
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
		
		//test shape hit detection
		/*if (oval.contains(e.getX(), e.getY()) ) {
			
			System.out.println("Testy test again");
			test = test + 10;
		      repaint();
		   }//end if
		*/   
		
		
		/*attempted duck hit detection
		for(Ellipse2D.Double j : duckList){
			
			if (j.contains(e.getX(), e.getY()) ) {
				
				System.out.println("Testy test again");
			      repaint();
			   }//end if
			
		}//end for loop
		*/
		   
		 }//end MouseClicked

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