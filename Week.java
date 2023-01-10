import java.util.*;
import java.util.ArrayList;

public class Week
  //simply an array of day objects
{

     private static Day [] thisWeek;

    public Week()
    {
        thisWeek= new Day [7];    
      for(int i=0;i<thisWeek.length;i++){
        thisWeek[i]=new Day();
      }
        //initializeBodyParts();//fix this method
        //intializeWeeklyFatigue();
        printWeeklyFatigue();
        //need to add info for back muscle groups

        //will generate a split that brings each muscle group from mev to mrv over a mesocycle (not including deload)
        // add a data type that represents the amount of sets the user accumulates for each muscle group (display this to the user)
        //in order to do this i need to add exersises that will increase the set count 
    }

    public static void printWeeklyFatigue()
    {
      for(int i=0;i<thisWeek.length;i++){
        thisWeek[i].print();
      }
    }
    

  public void ConstructWeekObject(){
    printWeeklyFatigue();
    //makes a week array full of days

    //construct the initial week object with all exercises

    //later weeks repeat exercises but make sure to progressively overload
  }
}
