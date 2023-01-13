package Adapter;

public class Main {
	
	public static void main(String[] args) {
		
		Voltage5w voltage5w = new VoltageAdapter();
		System.out.println(voltage5w.volatge5w());
		
	}

}

