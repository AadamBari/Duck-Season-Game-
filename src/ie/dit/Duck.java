package ie.dit;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;;

public class Duck extends JComponent{

	//paintComponent automatically called everytime JFrame is changed
	public void paintComponent(Graphics g) {
		//create graphics object
		Graphics2D g2 = (Graphics2D) g;
		//set color
		Color bodyC = new Color(255, 251, 0);
		g2.setColor(bodyC);
		//create ellipse for duck body
		Ellipse2D.Double duckBody = new Ellipse2D.Double(100, 100, 50, 20);
		g2.fill(duckBody);
		
		/*
		Point2D.Double p1 = new Point2D.Double(200, 200);
		Point2D.Double p2 = new Point2D.Double(500, 200);
		
		Line2D.Double l2 = new Line2D.Double(p1, p2);
		g2.draw(l2);
		*/
	}//end paintComponent
	
	
	
}//end class
