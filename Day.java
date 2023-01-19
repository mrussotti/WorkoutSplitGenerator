import java.util.ArrayList;


public class Day{
  private  ArrayList<Exercise> today;
  private Data idkIfINeedThisClass;
  //constructor
  public Day(){
    today = new ArrayList<Exercise>();
    idkIfINeedThisClass= new Data();
  }


  public void ChestDay(){
   today.add(idkIfINeedThisClass.getExercisesList().get("Bench Press"));
}

public void BackDay(){
  today.add(idkIfINeedThisClass.getExercisesList().get("Pull-ups"));

}

public void RestDay(){
  
}

public void ShouldersDay(){
   today.add(idkIfINeedThisClass.getExercisesList().get("Shoulder Press"));
   
}

public void ArmsDay(){
   today.add(idkIfINeedThisClass.getExercisesList().get("Barbell Curl"));
   
}

public void LegDay(){
   today.add(idkIfINeedThisClass.getExercisesList().get("Squat"));
    
}

  public void print(){
    for (Exercise e : today) {
      e.print();
    }
  }
}