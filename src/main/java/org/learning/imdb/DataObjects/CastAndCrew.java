package org.learning.imdb.DataObjects;

/**
 * Created by yesh on 4/16/17.
 */
public class CastAndCrew {
	private String castandcrew_id;
	private String realname;
	private String moviename;
	private String director;
	private String writers;

	public String getCastandcrew_id() {
		return castandcrew_id;
	}

	public void setCastandcrew_id(String castandcrew_id) {
		this.castandcrew_id = castandcrew_id;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getWriters() {
		return writers;
	}

	public void setWriters(String writers) {
		this.writers = writers;
	}

}
