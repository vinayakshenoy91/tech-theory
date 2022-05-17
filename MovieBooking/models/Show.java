package LLD.MovieBooking.models;

import java.util.Date;

public class Show {

  private static int idCounter=0;

  private int id;

  private Date showTime;

  private Movie movie;

  private Theatre theatre;

  private int availableSeats;


  public Show(Date showTime, Movie movie, Theatre theatre) {
    this.id=++idCounter;
    this.showTime = showTime;
    this.movie = movie;
    this.theatre = theatre;
    this.availableSeats=theatre.getCapacity();
    this.theatre.getShows().add(this);

  }

  public Movie getMovie() {
    return movie;
  }

  public Theatre getTheatre() {
    return theatre;
  }

  public void setTheatre(Theatre theatre) {
    this.theatre = theatre;
  }

  public int getAvailableSeats() {
    return availableSeats;
  }

  public void setAvailableSeats(int availableSeats) {
    this.availableSeats = availableSeats;
  }

  public void updateShow(){

  }


  public synchronized Ticket bookTicket(RegisteredUser user, int seats){

    if(availableSeats >= seats && seats >0){
      Ticket ticket = new Ticket();
      availableSeats -= seats;
      ticket.setOwner(user.getName());
      ticket.setBookedShow(this);
      ticket.setBookingTime(new Date());
      ticket.setNumberOfSeats(seats);
      System.out.println("Successfully booked");
      user.bookingHistory.add(ticket);
      return ticket;
    }
    else{
      System.out.println("Seats not Available");
      return null;
    }

  }

}
