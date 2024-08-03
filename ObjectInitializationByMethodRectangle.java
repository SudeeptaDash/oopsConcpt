package oopsConcept;

import java.util.Scanner;

public class ObjectInitializationByMethodRectangle {

	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the length : ");
		r.length = sc.nextInt();
		System.out.println("Input the width : ");
		r.width = sc.nextInt();
		r.insertProperties(r.length,r.width);
		r.calculateArea(r.length,r.width);
		sc.close();

	}
	

}
class Rectangle
{
	int length;
	int width;
	
	public void insertProperties(int l, int w)
	{
		length = l;
		width = w;
	}
	public int calculateArea(int l, int w)
	{
		int area = l*w;
		System.out.println("Area of the rectangle is : "+area);
		return area;
	}
}
