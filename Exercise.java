import java.util.ArrayList;
import java.util.List;

public class Exercise {
  public static final int NUM_BODY_PARTS = 11; // Number of muscle groups
  public static final String[] BODY_PARTS = {"abs", "calves", "biceps", "triceps", "chest", "frontDelts", "sideDelts", "rearDelts", "quads", "hamstrings", "glutes", "lats", "rhomboids", "traps", "SpineErectors"};


  private String name;
  private List<String> muscleGroups;

  public Exercise(String name, List<String> muscleGroups) {
    this.name = name;
    this.muscleGroups = muscleGroups;
  }

  public String getName() {
    return name;
  }

  public List<String> getMuscleGroups() {
    return muscleGroups;
  }
}
