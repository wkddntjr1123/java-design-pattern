package builder;

public class PcBuilder {
	private String ram;
	private String processor;
	private String hdd;
	private String motherBoard;

	public PcBuilder setRam(String ram) {
		this.ram = ram;
		return this;
	}

	public PcBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}

	public PcBuilder setHdd(String hdd) {
		this.hdd = hdd;
		return this;
	}

	public PcBuilder setMotherBoard(String motherBoard) {
		this.motherBoard = motherBoard;
		return this;
	}

	public Pc getPC() {
		return new Pc(ram, processor, hdd, motherBoard);
	}
}