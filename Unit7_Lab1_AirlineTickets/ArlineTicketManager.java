// Brian Soltani - I haven't given nor recieved unauthorized aid on this assignment

import java.util.*;
public class ArlineTicketManager
{
   
   private String row;
   private int seat = 0;
   private int group;
   private int number = 0;
   
   public ArlineTicketManager(int number, String row, int seat, int group) 
   {
   
        this.number = number;
        this.row = row;
        this.seat = seat;
        this.group = group;
   
   }
   
   public int getGroup()
   {
   
      return group;
   
   }
   
   public String getRow()
   {
   
      return row;
   
   }
   
   public int getSeat()
   {
   
      return seat;
   
   }
   
   public int getNum()
   {
   
      return number;
   
   }
   

   public String toString()
   {
   
      return "" + "Passenger: #" + number + ", Row: " + row + ", Seat: " + seat + ", Group: " + group;
   
   }

}