// Brian Soltani - I have neither given no rrecieved unauthroized aid on this assessment

//Tom Li
//There probably could have been a better name for this class...
//Also, to keep it friendly, there are no deaths, for now...
import java.util.Random;
public class Person
{
    private Random random = new Random();
    public static int totalImmunity;                         //Sum of immunity of all existing Person; used to calculate average immunity
    private int immuneRate;                                  //immunity of a specific person, ranges from 20(lowest) -> 90(highest), initially randomized
    private int infectRate;                                  //0 if isInfected==false, ranges from 50 -> 100; depends on sicknessStage (direct relationship)
    private int sicknessStage;                               //10 stages, 0 -> 9, 0==healthy, infectRate increase if stage increases
    private boolean isInfected;                              //Specify whether this person is infected

    /*
     *  No-arg constructor
     *  Initialize all private instance variables
     */
    public Person()
    {
        resetStatus();
        immuneRate = (int) (Math.random() * 71) + 20;
        infectRate = 0;
        sicknessStage = 0;
        isInfected = false;
        resetStatus();

    }

    /*
     *  Accessor method for immuneRate
     */
    public int getImmuneRate()
    {
        return immuneRate;
    }

    /*
     *  Accessor method for infectRate
     */
    public int getInfectRate()
    {
        return infectRate;
    }

    /*
     *  Sets the person to be infected and their infect rate to 50
     */
    public void setInfected()
    {
        isInfected = true;
        infectRate = 50;
    }

    /*
     *  "Cures" the person by removing infection; sets their infect rate to 0
     */
    public void setHealthy()
    {
        isInfected = false;
    }
    
    
   public void outbreak() // HI MR PUGH THIS IS ONE OF MY MODIFICATIONS!!!! I CALL IT OUTBREAK WHERE ALL THE NUMBERS GO CRAZY AND PEOPLE GET INFECTED LIKE CRAZY
   {
   
      infectRate = 100;
      if (sicknessStage + 2 <= 10)
      {
         sicknessStage += 2;
      }
      else
      {
      
         sicknessStage = 10;
      
      }
   
   }
   
   
   public void booster() // HI AGAIN MR PUGH  THIS IS ANOTHER MOD WHERE I MAKE SOMEONE HAVE THE IMMUNE SYSTEM OF SUPERMAN
   {
   
      int ran = (int) (Math.random() * 100) + 1;
      if (ran == 5 || ran == 10 || ran == 20 || ran == 40 || ran == 80)
      {
      
         immuneRate = 90;
      
      }
   
   }

    /*
     *  boolean check to see whether this.Person is infected
     */
    public boolean isInfected()
    {
        return isInfected;
    }

    /*
     *  Accessor for sicknessStage of this.Person
     */
    public int getSicknessStage()
    {
        return sicknessStage;
    }

    /*
     *  reset this.Person to initial state like that of constructor
     */
    public void resetStatus()
    {
      int min = 40;
      int max = 90;
      totalImmunity -= immuneRate;
      immuneRate = (int) ((Math.random() * (max - min)) + min);
      infectRate = 0;
      sicknessStage = 0;
      isInfected = false;
      totalImmunity += immuneRate;
         
        /**
         * WRITE THIS METHOD
         *
         * 1) Subtract immuneRate from totalImmunity
         * 2) Set immuneRate to a random number between 40 and 90, inclusive
         * 3) Reset infectRate and sicknessRate to 0, and set the person to not infected
         * 4) Add immuneRate to totalImmunity
         */
    }

    /*
     *  Overall update method of Person; updates infect status, sicknessStage, and all the rates; occurs for every Person every cycle
     */
    public void update()
    {
        
        totalImmunity -= immuneRate;
        int oneTen = (int) (Math.random() * 10) + 1;
        int twen = (int) (Math.random() * 5) + 1;
        int drop = (int) (Math.random() * 3) + 1;
        if (isInfected())
        {
           sicknessStage++;
           immuneRate += oneTen;
           if (immuneRate >= 90)
           {
           
            immuneRate = 90;
           
           }
           
           oneTen = (int) (Math.random() * 10) + 1;
           infectRate += oneTen;
           
           if (sicknessStage == 10)
           {
           
            sicknessStage = 0;
            infectRate = 0;
            setHealthy();
           
           }
        
        }
        else
        {
        
         if (twen == 1)
         {
         
            immuneRate -= drop;
            
            if (immuneRate - drop >= 40)
            {
            
               immuneRate = 40;
            
            }
            
         
         }
        
        }
                
        /**
         * WRITE THIS MEHTOD
         *
         * 1) Subtract the immuneRate from the totalImmunity
         * 2) If the person is infected:
         *      a) Increment their sickness stage by 1
         *      b) Increment their immune rate by a random number between 1 and 10
         *          Note: Immune rate is capped at 90
         *      c) Increment their infect rate by a random number between 1 and 10
         *      d) If the person has reached sickness stage 10:
         *          i) They are no longer infected
         *          ii) Their sickness stage and infect rate go to 0
         *
         *     If the person was NOT infected:
         *      a) There is a 20% chance that their immuneRate drops by a random number between 1 and 3
         *          Note: Immune rate is floored at 40
         *
         * 3) Increment totalImmunity by the newly calculated immune rate.
         */

    }

    /*
     *  return > 0 if infectRate of this.Person is greater than immuneRate of p; if return > 0, this.Person will infect p (this is handled in RoomPanel)
     *  return <= 0 if infectRate of this.Person is less than or equal to immuneRate of p; if return < 0, infection will not spread
     */
    public int compareTo(Person p)
    {
        return infectRate - p.getImmuneRate();
    }

    /*
     *  return a String with this.Person's status
     */
    public String toString()
    {
        String temp = "Status: ";
        if(isInfected())
        {
            temp += "infected";
        }
        else
        {
            temp += "healthy";
        }
        return temp;
    }
}