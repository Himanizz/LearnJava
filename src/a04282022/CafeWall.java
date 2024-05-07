package a04282022;


import java.util.*;
import java.awt.*;



public class CafeWall {

	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(500, 500);
	    panel.setBackground(Color.LIGHT_GRAY);
	    Graphics g = panel.getGraphics();
	    int x=0;
	    int y=0;
	    drawLineOfSquares(g);
	    drawLineOfSquares(g);
	    drawRectangle(g);

	}

}
