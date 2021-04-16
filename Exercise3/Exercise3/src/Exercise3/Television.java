package Exercise3;

import java.util.Scanner;

public class Television {
	String brand;
	String model;
	String color;
	String OperatingSystem;
	double size;
	double weight;
	int core;
	
	Scanner in = new Scanner(System.in);
	//No-Arg Constructor
	Television() {
		
		System.out.print("Enter Brand: ");
		this.brand = in.nextLine();		
		
		System.out.print("Enter Model: ");
		this.model = in.nextLine();	
		
		System.out.print("Enter Color: ");
		this.color = in.nextLine();
		
		System.out.print("Enter Operating System: ");
		this.OperatingSystem = in.nextLine();
		
		System.out.print("Enter Screen Size: ");
		this.size = in.nextDouble();
		
		System.out.print("Enter Weight: ");
		this.weight = in.nextDouble();
		
		System.out.print("Enter Number of Cores: ");
		this.core = in.nextInt();
		
	}
	//Parameterized constructor
	Television(String b,String m,String c,String OP,double s,double w,int core){
				this.brand = b;
				this.model = m;
				this.color = c;
				this.OperatingSystem = OP;
				this.size = s;
				this.weight = w;
				this.core = core;
		
		}
}

