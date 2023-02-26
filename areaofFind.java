import java.util.*;
class Tragral{
	float leangth ;
	float breath ;
	float area ;
	
	public void input()
	{
		System.out.println("The find out the area  of tragal ");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a lenght ");
		leangth = scan.nextFloat();
		
		System.out.println("Enter a breath ");
		breath = scan.nextFloat();
	}
	public void compunt() {
		area = leangth*breath ;
	}
	public void show() {
		System.out.println("The area of tragal = "+area);
	}

}

class square{
	float length;
	float area;
	public void input()
	{
	System.out.println(" ");	
	System.out.println("The find out the area of square ");
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a length ");
	length = scan.nextFloat();
	}
	
	public void compunt() {
		area = length * length;
	}
	
	public void show() {
		System.out.println("The area of squra : "+area);
	}
	
}

class circle{
	float pi = 3.14f;
	float radius;
	float area ;
	
	public void input()
	{
		System.out.println(" ");
		System.out.println("The find area of circal ");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a radius ");
		radius = scan.nextFloat(); 
	}
	
	public void compunt() {
		area = pi * radius ;
	}
	
	public void show()
	{
		System.out.println("The area of circle "+area);
	}
}
public class areaofFind {

	public static void main(String[] args) {
	 Tragral tr = new Tragral();
	 tr.input();
	 tr.compunt();
	 tr.show();
	 
	 square sq = new square();
	 sq.input();
	 sq.compunt();
	 sq.show();
	 
	 circle cr = new circle();
	 cr.input();
	 cr.compunt();
	 cr.show();

	}

}
