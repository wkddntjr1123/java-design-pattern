package composite;

import java.util.ArrayList;

public class Directory implements File {
	
	ArrayList<File> files = new ArrayList<File>();
	
	void addFile(File... files) {
		for(File file:files) {
			this.files.add(file);
		}
	}
	

	@Override
	public String getFileType() {
		return ".dir";
	}

	@Override
	public int getSize() {
		int size =0 ;
		
	 for(File file : files) {
		 size += file.getSize();
	 }

		return size;
	}
	
}
