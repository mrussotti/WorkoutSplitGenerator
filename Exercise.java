import java.util.ArrayList;
import java.util.List;

public class Exercise {


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
