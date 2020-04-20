package com.revature.beans;

public class Movies {

	private String title;
	private String genre;
	private String genre2;
	private String genre3;
	private String releaseYear;
	
	public String getTitle() {
		return this.title;
	}
	
	public String getGenre() {
		return this.genre;
	}
	
	public String getGenre2() {
		return this.genre2;
	}
	
	public String getGenre3() {
		return this.genre3;
	}
	
	public String getReleaseYear() {
		return this.releaseYear;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void setGenre(String genre, String genre2) {
		this.genre = genre;
		this.genre2 = genre2;
	}
	public void setGenre(String genre, String genre2, String genre3) {
		this.genre = genre;
		this.genre2 = genre2;
		this.genre3 = genre3;
	}
	
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

}
