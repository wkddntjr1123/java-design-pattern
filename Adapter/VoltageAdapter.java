package Adapter;

public class VoltageAdapter extends Voltage220wImp implements Voltage5w{

	@Override
	public int volatge5w() {
		return getVoltage220()/44;
	}

}