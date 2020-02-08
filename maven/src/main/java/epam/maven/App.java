package epam.maven;
import java.util.*;
//sweet and chocolate inherited by gift class-inheritence
class Gift
{
	private double price;//when presenting a gift we dont tell price -encapsulation
	 String sendBy;
	 String recievedBy;
	private int count;//encapsulation
	public Gift(double d,String s,String r,int count)
	{
		this.price=d;
		this.sendBy=s;
		this.recievedBy=r;
		this.count=count;
	}
	//override the print function in child to add extra feature-polymorphism
	public void print()
	{
		System.out.println("send by "+sendBy);
		System.out.println("recieved by "+recievedBy);
		System.out.println("price "+price);
		System.out.println("count "+count);
	}
	//calculate to amount spent on sweet based on price and count-abstraction
	public void calculateTotal()
	{
		System.out.println("total cost of the gift is: "+price*count);
	}
	
}
class Chocolate extends Gift
{
    private int chocType;
    private String brand;
	public Chocolate(double d,String s,String r,int chocType,int c,String b) 
	{
	    super(d,s,r,c);	
		this.chocType=chocType;
		this.brand=b;
	}
	public void print()//override-polymorphism
	{
		System.out.println("send by "+sendBy);
		System.out.println("recieved by "+recievedBy);
		System.out.println("chocolate type "+chocType);
		System.out.println("chocolate brand "+brand);
	}
}
class Sweet extends Gift//inheritence
{
	private int sweetType;
	private String shop;
	public Sweet(double p,String s,String r,int sweetType,int c,String sh) 
	{
		super(p,s,r,c);
		this.sweetType=sweetType;
		this.shop=sh;
	}
	public void print()
	{
		System.out.println("send by "+sendBy);
		System.out.println("recieved by "+recievedBy);
		System.out.println("sweet type "+sweetType);
		System.out.println("shop "+shop);
	}
}
public class App 
{
    public static void main( String[] args )
    {
    	
    	List<Chocolate> c=new ArrayList<Chocolate>(); 
    	List<Sweet> s=new ArrayList<Sweet>(); 
    	
    	Chocolate chocolate=new Chocolate(50.0,"ranjith","ravi",1,4,"silk");
    	chocolate.print();
    	chocolate.calculateTotal();
    	Sweet sweet=new Sweet(100.0,"randy","rocky",2,6,"alankar");
    	sweet.print();
    	sweet.calculateTotal();
    	c.add(chocolate);
    	s.add(sweet);
    	System.out.println("process terminated");
        
    }
}
