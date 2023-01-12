package builder;


public class Main {

	public static void main(String[] args) {

		PcBuilder builder = new PcBuilder();
		Pc pc = builder.setProcessor("core i7").setHdd("samsung").getPC();
		System.out.println(pc.toString());
	}

}