package Proxy;

public class ProxyNews implements News {
	
	String newsUrl;
	News realNews; 
	
	public ProxyNews(String newsUrl) {
		this.newsUrl = newsUrl;
	}
	

	@Override
	public void loadNews() {
		//if this type of news url comes we'll navigate it to different url
		if(newsUrl.contains("xyz")) {
			newsUrl = "abc";
		}
		
		if(realNews==null) {
			realNews = new RealNews(newsUrl);
		}
		realNews.loadNews();
		
	}
	
}