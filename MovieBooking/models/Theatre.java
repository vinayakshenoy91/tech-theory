package LLD.MovieBooking.models;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

  private static int idCounter=0;

  private int id;

  private String name;

  private String location;

  private int capacity;

  private List<Show> shows;


  public Theatre(String name, String location, int capacity) {
    this.id=++idCounter;
    this.name = name;
    this.location = location;
    this.capacity = capacity;
    this.shows=new ArrayList<Show>();
  }



  public String getName() {
    return name;
  }

  public int getCapacity() {
    return capacity;
  }

  public List<Show> getShows() {
    return shows;
  }
}
