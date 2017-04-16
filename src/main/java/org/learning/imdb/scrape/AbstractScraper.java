package org.learning.imdb.scrape;

import java.io.IOException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public abstract class AbstractScraper {

	public Document doc;

	public Document fetchContent(String url) {
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return doc;
	}

	public Document fetchContent(URL url, int timeOut) {
		try {
			doc = Jsoup.parse(url, timeOut);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return doc;
	}

	public abstract void extractInfo();

}
