package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		Color lightBlue = new Color (51,153,255);
		StdDraw.setPenColor(lightBlue);
		StdDraw.filledRectangle(.5, .5 ,.4 ,.25 );
		Color yellow = (Color.YELLOW);
		StdDraw.setPenColor(yellow);
		StdDraw.filledCircle(.75, .6, .1);
		Color sand = new Color (210,180,140);
		StdDraw.setPenColor(sand);
		StdDraw.filledCircle(0.5, .2, .15);
		Color blue = (Color.BLUE);
		StdDraw.setPenColor(blue);
		StdDraw.filledRectangle(0.5,.27,0.4,.02);
		Color white = (Color.WHITE);
		StdDraw.setPenColor(white);
		StdDraw.filledRectangle(.5,.0,.4,.25);
		Color brown = new Color (150,75,0);
		Color green = (Color.GREEN);
		StdDraw.setPenColor(brown);
		StdDraw.filledRectangle(0.45,0.35,0.01,0.05);
		StdDraw.setPenColor(green);
		StdDraw.filledCircle(.45,.39 ,.04);

	}
}