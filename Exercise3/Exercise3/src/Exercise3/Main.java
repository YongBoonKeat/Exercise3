package Exercise3;

public class Main {

	public static void main(String[] args) {
		
		Television Samsung = new Television();
		System.out.println("Brand: " + Samsung.brand);//Samsung
		System.out.println("Model: " + Samsung.model);//UN65AU8000
		System.out.println("Color: " + Samsung.color);//Black
		System.out.println("Operating System: " + Samsung.OperatingSystem);//Tizen6.0
		System.out.println("Screen Size: " + Samsung.size + "inches");//64.5
		System.out.println("Weight: "	+ Samsung.weight + "Kg");//20.9
		System.out.println( "CPU Core: " + Samsung.core);//4
		System.out.println();
		System.out.println("===============================================");
	
		Television Sony = new Television("Sony","KD-50X80J","Silver","Android 10",49.5,12.3,4);
		System.out.println("Brand: " + Sony.brand);
		System.out.println("Model: " + Sony.model);
		System.out.println("Color: " + Sony.color);
		System.out.println("Operating System: " + Sony.OperatingSystem);
		System.out.println("Screen Size: " + Sony.size + "inches");
		System.out.println("Weight: "	+ Sony.weight + "Kg");
		System.out.println( "CPU Core: " + Sony.core);
	}

}
