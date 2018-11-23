package be.ac.umons.odl;

import java.awt.*;

public class ConvexOval implements Drawable
{
	private final Point[] vertices;

	public ConvexOval(Point[] vertices) {this.vertices = vertices;}

	public Point[] getVertices(){return vertices;}

	@Override
	public void draw(Graphics g)
	{

	}
}
