import java.util.*;
import java.util.ArrayList;

public class Week
  
{
    //Each week is an array of day objects coupled with a summerry of weekly volume
     private static Day [] thisWeek;
     private static Map<String, Integer> weeklyFatigue;

    public Week()
    {
      weeklyFatigue= new HashMap<String, Integer>();
      intializeWeeklyFatigue();

      thisWeek= new Day [7];    
      for(int i=0;i<thisWeek.length;i++){
        thisWeek[i]=new Day();
      }
        //initializeBodyParts();//fix this method
        printWeeklyFatigue();
        //need to add info for back muscle groups

        //will generate a split that brings each muscle group from mev to mrv over a mesocycle (not including deload)
        // add a data type that represents the amount of sets the user accumulates for each muscle group (display this to the user)
        //in order to do this i need to add exersises that will increase the set count 
    }

    public static void printWeeklyFatigue()
    {
      for (Map.Entry<String, Integer> me : weeklyFatigue.entrySet()) {
        System.out.print(me.getKey() + ":");
        System.out.println(me.getValue());
      }
    }
    
  
  public void ConstructBroSplit(){
      thisWeek[0].ChestDay();
      thisWeek[1].BackDay();
      thisWeek[2].RestDay();
      thisWeek[3].ShouldersDay();
      thisWeek[4].ArmsDay();
      thisWeek[5].RestDay();
      thisWeek[6].LegDay();
  }

  private static void intializeWeeklyFatigue()
    {
      
        weeklyFatigue.put("chest", 0);

        weeklyFatigue.put("biceps", 0);
        weeklyFatigue.put("triceps", 0);

        weeklyFatigue.put("frontDelt", 0);
        weeklyFatigue.put("sideDelt", 0);
        weeklyFatigue.put("rearDelt", 0);

        weeklyFatigue.put("quads", 0);
        weeklyFatigue.put("hamstrings", 0);
        weeklyFatigue.put("glutes", 0);

        weeklyFatigue.put("abs", 0);
        weeklyFatigue.put("calves", 0);

        weeklyFatigue.put("lats", 0);
        weeklyFatigue.put("rhomboids", 0);
        weeklyFatigue.put("traps", 0);
        weeklyFatigue.put("spineErectors", 0);
      
    }
  public void print(){
    for(int i=0;i<thisWeek.length;i++){
        thisWeek[i].print();
      }
  }
}
