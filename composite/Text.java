package composite;

public class Text implements File {
	int size = 0;
	
	Text(int size){
	this.size = size;	
	}

	@Override
	public String getFileType() {
		return ".txt";
	}

	@Override
	public int getSize() {
		return size;
	}
	
}
