package ie.dit;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.util.Random;

public class Duck extends JPanel implements ActionListener{
	
	Timer timer;
	
	int bodyHeight, bodyWidth, headHeight, headWidth;
	int[] duckX = new int[10];
	int[] duckY = new int[10];
	int speed;
	
	public Duck() {
		
		this.bodyHeight = 40;
		this.bodyWidth = 60;
		this.headHeight = 20;
		this.headWidth = 20;
		this.speed = 5;
		
		for (int i = 0; i <10; i++) {
			
			this.duckX[i] = -50;
			this.duckY[i] = 300;
		}
		
		timer = new Timer(10, this);//use 10
        timer.start();
        
       	}
	

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

		
		/*
		Point2D.Double p1 = new Point2D.Double(200, 200);
		Point2D.Double p2 = new Point2D.Double(500, 200);
		
		Line2D.Double l2 = new Line2D.Double(p1, p2);
		g2.draw(l2);
		*/
	}//end paintComponent
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		Random num = new Random();
		
		for(int i = 0; i < 10; i++)
		{
			
			if (duckX[i] > 1000)
			{
				duckX[i] = -1 * num.nextInt(200);
				
			}
		}
		
		
		repaint();
	}
	
	
	
}//end class
