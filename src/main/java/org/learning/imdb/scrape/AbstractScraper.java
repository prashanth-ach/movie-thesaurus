package org.learning.imdb.scrape;

import java.io.IOException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public abstract class AbstractScraper {

	public Document fetchContent(String url) {
		Document doc = Jsoup.parse(url);
		return null;
	}

	public Document fetchContent(URL url, int timeOut) {
		try {
			Document doc = Jsoup.parse(url, timeOut);
			return doc;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public abstract void extractInfo();

}
