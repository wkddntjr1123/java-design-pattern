package builder;

public class Pc {
	private String ram;
	private String processor;
	private String hdd;
	private String motherBoard;

	public Pc(String ram, String processor, String hdd, String motherBoard) {
		super();
		this.ram = ram;
		this.processor = processor;
		this.hdd = hdd;
		this.motherBoard = motherBoard;
	}

	@Override
	public String toString() {
		return "PC [ram=" + ram + ", processor=" + processor + ", hdd=" + hdd + ", motherBoard=" + motherBoard + "]";
	}

}