package composite;

public class Main {
	
	public static void main(String[] args) {
		
		File file1 = new Text(20);
		File file2 = new Text(30);
		
		System.out.println(file1.getSize());
		System.out.println(file2.getSize());
		
		Directory directory = new Directory();
		Directory directory1 = new Directory();
		directory1.addFile(new Text(50));
		directory.addFile(file1,file2,directory1);
		System.out.println(directory.getSize());
	}

}