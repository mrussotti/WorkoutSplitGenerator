import java.util.ArrayList;
import java.util.List;

public class Exercise {


  private String name;
  private List<String> muscleGroups;
  private String suggestedRest;//implement this later

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
