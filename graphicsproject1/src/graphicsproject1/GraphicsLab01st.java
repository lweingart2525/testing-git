package graphicsproject1;


 import java.awt.*;
		 import java.applet.*;

		 public class GraphicsLab01st extends Applet 
	 {
	public void paint(Graphics g) {
		 
		
		
			// DRAW CUBE
		g.drawRect(50, 50, 200, 200);
		g.drawRect(200, 200, 200, 200);
		g.drawLine(50, 50, 200, 200);
		g.drawLine(250,250 ,400 ,400 );
		g.drawLine(250, 50, 400, 200);
		g.drawLine(200, 400, 50, 250);
			// DRAW SPHERE
		
			
			g.drawOval(100, 100, 250, 250);
			g.drawOval(100, 150, 250, 150);
			g.drawOval(100, 200, 250, 50);
			g.drawOval(150, 100, 150, 250);
			g.drawOval(200, 100, 50, 250);            
	
			// DRAW TRIANGLE	
			g.drawLine(200, 525,400 , 350);
			g.drawLine(400, 350,550 , 525);
			g.drawLine(550, 525,200 , 525);
			g.drawLine(400, 525,400 , 350);
			g.drawLine(200, 525,475 , 437);
			g.drawLine(550, 525,315 , 425);
		

}
}
