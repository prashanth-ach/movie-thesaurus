package org.learning.imdb.scrape;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.learning.imdb.DataObjects.CastAndCrew;

public class CastAndCrewScraper extends AbstractScraper {

	private CastAndCrew cc;

	public CastAndCrewScraper() {
		cc = new CastAndCrew();
	}

	public static void main(String[] args) {

	}

	@Override
	public void extractInfo() {
		Map<String, ArrayList<String>> t = new HashMap<String, ArrayList<String>>();
		Elements credit = doc.getElementsByTag("tr");

		for (Element element : credit) {
			String key = "";
			try {
				key = element.getElementsByClass("name").first().text();
			} catch (Exception e) {
				key = "";
			}
			try {
				Elements link = element.select("td.name > a");
				String url = link.attr("href");
				String s = "http://www.imdb.com" + url;
				String p = key + "|" + element.getElementsByClass("credit").first().text();
				if (t.containsKey(s)) {
					t.get(s).add(p);
				} else {
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(p);
					t.put(s, temp);

				}

			} catch (Exception e) {

			}

		}
		System.out.println(t);

	}

}
