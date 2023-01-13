import java.util.*;
import java.util.ArrayList;

public class Data{
  //holds all the data complexity for this program
  private static final int NUM_BODY_PARTS = 11; // Number of muscle groups
  private static final String[] BODY_PARTS = {"abs", "calves", "biceps", "triceps", "chest", "frontDelts", "sideDelts", "rearDelts", "quads", "hamstrings", "glutes", "lats", "rhomboids", "traps", "SpineErectors"};
  private static List<Exercise> exercises;
  private static Map<String, MuscleGroups> muscleGroupFatigueNumbers;

  
  public Data(){
    muscleGroupFatigueNumbers = new HashMap<>();
    exercises = new ArrayList<>(); 
  }

  //Add stuff for specific muscles in triceps and biceps
    public static List<Exercise> addExercises() {
            
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

  public int getNumBodyParts(){
    return NUM_BODY_PARTS;
  }

  public String[] getBodyParts(){
    return BODY_PARTS;
  }

  public List<Exercise> getExercises(){
    return exercises;
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