import java.util.*;
import java.util.ArrayList;

public class Data{
  //holds all the data complexity for this program
  private static final int NUM_BODY_PARTS = 11; // Number of muscle groups
  private static final String[] BODY_PARTS = {"abs", "calves", "biceps", "triceps", "chest", "frontDelts", "sideDelts", "rearDelts", "quads", "hamstrings", "glutes", "lats", "rhomboids", "traps", "SpineErectors"};
private static Map<String, Exercise> mapOfAllExercises;
  private static Map<String, MuscleGroups> muscleGroupFatigueNumbers;

  
  public Data(){
    muscleGroupFatigueNumbers = new HashMap<>();
    mapOfAllExercises = new HashMap<>();
    addExercises();
  }

  //Add stuff for specific muscles in triceps and biceps
    public static void addExercises() {
    mapOfAllExercises.put("Bench Press", new Exercise("Bench Press", List.of("chest", "triceps", "frontDelts")));
    mapOfAllExercises.put("Barbell Curl", new Exercise("Barbell Curl", List.of("biceps")));
    mapOfAllExercises.put("Cable Tricep Extension", new Exercise("Cable Tricep Extension", List.of("triceps")));
    mapOfAllExercises.put("Seated Calf Raise", new Exercise("Seated Calf Raise", List.of("calves")));
    mapOfAllExercises.put("Deadlift", new Exercise("Deadlift", List.of("lats", "rhomboids", "traps", "spinalErectors", "hamstrings", "glutes", "forearms")));
    mapOfAllExercises.put("Squat", new Exercise("Squat", List.of("quads", "hamstrings", "glutes", "lower back")));
    mapOfAllExercises.put("Lunges", new Exercise("Lunges", List.of("quads", "hamstrings", "glutes")));
    mapOfAllExercises.put("Leg Press", new Exercise("Leg Press", List.of("quads", "hamstrings")));
    mapOfAllExercises.put("Shoulder Press", new Exercise("Shoulder Press", List.of("frontDelts", "sideDelts", "triceps")));
    mapOfAllExercises.put("Push-ups", new Exercise("Push-ups", List.of("chest", "triceps", "frontDelts")));
    mapOfAllExercises.put("Pull-ups", new Exercise("Pull-ups", List.of("lats", "rhomboids", "traps")));
    mapOfAllExercises.put("Lat Pulldown", new Exercise("Lat Pulldown", List.of("lats", "rhomboids")));
    mapOfAllExercises.put("Seated Row", new Exercise("Seated Row", List.of("lats", "rhomboids", "traps")));
    mapOfAllExercises.put("Bicep Curl", new Exercise("Bicep Curl", List.of("biceps")));
    mapOfAllExercises.put("Tricep Dips", new Exercise("Tricep Dips", List.of("triceps")));
    mapOfAllExercises.put("Crunches", new Exercise("Crunches", List.of("abs")));
    mapOfAllExercises.put("Plank", new Exercise("Plank", List.of("abs")));
    mapOfAllExercises.put("Side Plank", new Exercise("Side Plank", List.of("abs")));
}

  public int getNumBodyParts(){
    return NUM_BODY_PARTS;
  }

  public String[] getBodyParts(){
    return BODY_PARTS;
  }

  public static Map<String, Exercise> getExercisesList(){
    return mapOfAllExercises;
  }

private static void muscleInfo() {
    muscleGroupFatigueNumbers.put("abs", new MuscleGroups(0, 0, 16, 20, 25));
    muscleGroupFatigueNumbers.put("calves", new MuscleGroups(6, 8, 12, 16, 20));
    muscleGroupFatigueNumbers.put("biceps", new MuscleGroups(6, 8, 14, 20, 26));
    muscleGroupFatigueNumbers.put("triceps", new MuscleGroups(4, 6, 10, 14, 18));
    muscleGroupFatigueNumbers.put("chest", new MuscleGroups(8, 10, 12, 22, 22));
    muscleGroupFatigueNumbers.put("frontDelt", new MuscleGroups(0, 0, 6, 8, 12));
    muscleGroupFatigueNumbers.put("sideDelt", new MuscleGroups(6, 8, 16, 22, 26));
    muscleGroupFatigueNumbers.put("rearDelt", new MuscleGroups(0, 8, 16, 22, 26));
    muscleGroupFatigueNumbers.put("quads", new MuscleGroups(6, 8, 12, 18, 20));
    muscleGroupFatigueNumbers.put("hamstrings", new MuscleGroups(4, 6, 10, 16, 20));
    muscleGroupFatigueNumbers.put("glutes", new MuscleGroups(0, 0, 4, 12, 16));
    muscleGroupFatigueNumbers.put("lats", new MuscleGroups(8, 10, 16, 22, 26));
    muscleGroupFatigueNumbers.put("rhomboids", new MuscleGroups(4, 6, 10, 14, 18));
    muscleGroupFatigueNumbers.put("traps", new MuscleGroups(6, 8, 12, 18, 22));
    muscleGroupFatigueNumbers.put("spineErectors", new MuscleGroups(8, 10, 14, 20, 24));
}

   
  
}