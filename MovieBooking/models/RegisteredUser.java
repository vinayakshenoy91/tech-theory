package LLD.MovieBooking.models;

import java.util.ArrayList;
import java.util.List;

public class RegisteredUser extends User{

  public List<Ticket> bookingHistory;


  public RegisteredUser(String name){
    super(name);
    this.bookingHistory=new ArrayList<Ticket>();
  }

  public void cancelTicket(Ticket ticket){

  }

}
