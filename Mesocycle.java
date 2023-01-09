
public class Mesocycle{
  Week [] meso;
  int numWeeks;
  
  public Mesocycle(){//take user input as parameter
    numWeeks=8;//make user input # of weeks
    meso = new Week[numWeeks];
  }

  private void fillWeeks(){
    for(int i=0; i<numWeeks; i++){
      //meso[i].ConstructWeekObject();//fill this out in Week class
    }
  }

  public void print(){
        System.out.print("nuts");
  }
  
}