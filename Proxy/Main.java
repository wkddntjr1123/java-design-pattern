package Proxy;

public class Main {
	
	public static void main(String[] args) {
		
		News news = new ProxyNews("india tv");
		news.loadNews();
		news = new ProxyNews("xyzs");
		news.loadNews();
		
	}

}