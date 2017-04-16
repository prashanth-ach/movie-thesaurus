package org.learning.imdb.scrape;

import org.jsoup.nodes.Element;
import org.learning.imdb.DataObjects.Movie;

public class MovieScraper extends AbstractScraper {

	private Movie movie;

	public MovieScraper() {
		movie = new Movie();
	}

	@Override
	public void extractInfo() {
		Element element = doc.getElementsByClass("title_block").first();

		// Get all the data which is easy 1st
		movie.setRating(element.getElementsByAttributeValue("itemprop", "ratingValue").first().text());
		movie.setTitle(element.getElementsByAttributeValue("itemprop", "name").first().text());
		movie.setContentRating(element.getElementsByAttributeValue("itemprop", "contentRating").first().text());
		movie.setRuntime(element.getElementsByAttributeValue("itemprop", "duration").first().text());
		movie.setGenres(element.getElementsByAttributeValue("itemprop", "genre").first().text());
		movie.setContentRating(element.getElementsByAttributeValue("itemprop", "contentRating").first().text());
		movie.setReleasedate(element.getElementsByAttributeValue("itemprop", "datePublished").first().attr("content"));

		System.out.println(movie.toString());
	}

	public static void main(String[] args) {
		MovieScraper ms = new MovieScraper();
		ms.doc = ms.fetchContent("http://www.imdb.com/title/tt0848228/");
		ms.extractInfo();
	}

}
