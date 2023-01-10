import java.util.*;
import java.util.ArrayList;

public class Week
{

     private static Map<String, Integer> weeklyFatigue;//turn this into an array, one weekly fatigue variable for each week of the split

    public Week()
    {
        weeklyFatigue= new HashMap<String, Integer>();                
        initializeBodyParts();
        intializeWeeklyFatigue();
        printWeeklyFatigue();
        //need to add info for back muscle groups

        //will generate a split that brings each muscle group from mev to mrv over a mesocycle (not including deload)
        // add a data type that represents the amount of sets the user accumulates for each muscle group (display this to the user)
        //in order to do this i need to add exersises that will increase the set count 
    }

    private static void initializeBodyParts()
    {
      /*
        muscleGroup abs;
        abs.MV = 0;
        abs.MEV = 0;
        abs.MAVMin = 16;
        abs.MAVMax = 20;
        abs.MRV = 25;

        muscleGroup calves;
        calves.MV = 6;
        calves.MEV = 8;
        calves.MAVMin = 12;
        calves.MAVMax = 16;
        calves.MRV = 20;

        muscleGroup biceps;
        biceps.MV = 6;
        biceps.MEV = 8;
        biceps.MAVMin = 14;
        biceps.MAVMax = 20;
        biceps.MRV = 26;

        muscleGroup triceps;
        triceps.MV = 4;
        triceps.MEV = 6;
        triceps.MAVMin = 10;
        triceps.MAVMax = 14;
        triceps.MRV = 18;

        muscleGroup chest;
        chest.MV = 8;
        chest.MEV = 10;
        chest.MAVMin = 12;
        chest.MAVMax = 22;
        chest.MRV = 22;

        muscleGroup frontDelts;
        frontDelts.MV = 0;
        frontDelts.MEV = 0;
        frontDelts.MAVMin = 6;
        frontDelts.MAVMax = 8;
        frontDelts.MRV = 12;

        muscleGroup sideDelts;
        sideDelts.MV = 6;
        sideDelts.MEV = 8;
        sideDelts.MAVMin = 16;
        sideDelts.MAVMax = 22;
        sideDelts.MRV = 26;

        muscleGroup rearDelts;
        sideDelts.MV = 0;
        sideDelts.MEV = 8;
        sideDelts.MAVMin = 16;
        sideDelts.MAVMax = 22;
        sideDelts.MRV = 26;

        muscleGroup quads;
        quads.MV = 6;
        quads.MEV = 8;
        quads.MAVMin = 12;
        quads.MAVMax = 18;
        quads.MRV = 20;

        muscleGroup hamstrings;
        hamstrings.MV = 4;
        hamstrings.MEV = 6;
        hamstrings.MAVMin = 10;
        hamstrings.MAVMax = 16;
        hamstrings.MRV = 20;

        muscleGroup glutes;
        glutes.MV = 0;
        glutes.MEV = 0;
        glutes.MAVMin = 4;
        glutes.MAVMax = 12;
        glutes.MRV = 16;

//Add info for specific back muscles
*/
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

    public static void printWeeklyFatigue()
    {
        System.out.println(weeklyFatigue);
    }
    //Add stuff for specific muscles in triceps and biceps
    public static List<Exercise> addExercises() {
      List<Exercise> exercises = new ArrayList<>();
      exercises.add(new Exercise("Bench Press", List.of("chest", "triceps", "frontDelts")));
      exercises.add(new Exercise("Barbell Curl", List.of("biceps")));
      exercises.add(new Exercise("Cable Tricep Extension", List.of("triceps")));
      exercises.add(new Exercise("Seated Calf Raise", List.of("calves")));
      exercises.add(new Exercise("Deadlift", List.of("lats", "rhomboids", "traps", "spinalErectors", "hamstrings", "glutes", "forearms")));
      exercises.add(new Exercise("Squat", List.of("quads", "hamstrings", "glutes", "lower back")));
      exercises.add(new Exercise("Lunges", List.of("quads", "hamstrings", "glutes")));
      exercises.add(new Exercise("Leg Press", List.of("quads", "hamstrings")));
      exercises.add(new Exercise("Shoulder Press", List.of("frontDelts", "sideDelts", "triceps")));
      exercises.add(new Exercise("Push-ups", List.of("chest", "triceps", "frontDelts")));
      exercises.add(new Exercise("Pull-ups", List.of("lats", "rhomboids", "traps")));
      exercises.add(new Exercise("Lat Pulldown", List.of("lats", "rhomboids")));
      exercises.add(new Exercise("Seated Row", List.of("lats", "rhomboids", "traps")));
      exercises.add(new Exercise("Bicep Curl", List.of("biceps")));
      exercises.add(new Exercise("Tricep Dips", List.of("triceps")));
      exercises.add(new Exercise("Crunches", List.of("abs")));
      exercises.add(new Exercise("Plank", List.of("abs")));
      exercises.add(new Exercise("Side Plank", List.of("abs")));
    
      
      return exercises;
    }
}
