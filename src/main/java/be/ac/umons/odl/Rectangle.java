package be.ac.umons.odl;

public class Rectangle extends ConvexPolygon
{
	public Rectangle(Point a, Point b)
	{					//rectangle->tab de pts
		super(new Point[]{a, new Point(a.getX(), b.getY()), b, new Point(b.getX(), a.getY())});
	}
}
