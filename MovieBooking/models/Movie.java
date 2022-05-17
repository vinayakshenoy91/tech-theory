package LLD.MovieBooking.models;

import LLD.MovieBooking.enums.Genre;
import LLD.MovieBooking.enums.Language;

public class Movie {

   private String name;
   private float rating=0.0f;

   private Language language;

   private Genre genre;

  public Movie(String name, Language language, Genre genre) {
    this.name = name;
    this.language = language;
    this.genre = genre;
  }


  public String getName() {
    return name;
  }

  public float getRating() {
    return rating;
  }

  public Language getLanguage() {
    return language;
  }

  public Genre getGenre() {
    return genre;
  }
}
