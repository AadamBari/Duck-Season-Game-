package ie.dit;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.Timer;

public class Duck extends JComponent implements ActionListener{
	
	Timer timer;
	
	int duckHeight, duckWidth;
	int duckX, duckY, speed;
	
	public Duck() {
		
		this.duckHeight = 60;
		this.duckWidth = 40;
		this.duckX = 0;
		this.duckY = 0;
		this.speed = 1;
		
		timer = new Timer(10, this);
        timer.start();
	}
	

	//paintComponent automatically called everytime JFrame is changed
	public void paintComponent(Graphics g) {
		
		//create graphics object
		Graphics2D g2 = (Graphics2D) g;
		
		//set color
		Color bodyC = new Color(255, 251, 0);
		g2.setColor(bodyC);
		
		//create ellipse for duck body
		Ellipse2D.Double duckBody = new Ellipse2D.Double(duckX, duckY, duckHeight, duckWidth);
		g2.fill(duckBody);
		
		/*
		Point2D.Double p1 = new Point2D.Double(200, 200);
		Point2D.Double p2 = new Point2D.Double(500, 200);
		
		Line2D.Double l2 = new Line2D.Double(p1, p2);
		g2.draw(l2);
		*/
	}//end paintComponent
	
	public void actionPerformed(ActionEvent e) {
		
		duckX += speed;
		
		
		repaint();
	}
	
	
	
}//end class
