package org.learning.imdb.scrape;

import org.jsoup.nodes.Document;
import org.learning.imdb.DataObjects.Movie;

public class MovieScraper extends AbstractScraper {

	private Movie movie;
	private Document doc;

	public MovieScraper() {
		movie = new Movie();
	}

	@Override
	public void extractInfo() {
		

	}

	public static void main(String[] args) {
		MovieScraper ms = new MovieScraper();
		ms.doc = ms.fetchContent("http://www.imdb.com/title/tt0848228/");

	}

}
