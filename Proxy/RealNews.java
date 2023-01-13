package Proxy;

public class RealNews implements News {

	String url;
	
	public RealNews(String url) {
		this.url = url;
	}
	
	@Override
	public void loadNews() {
		System.out.println("loading news: "+url);
	}
	
}
