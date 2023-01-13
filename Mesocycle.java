
public class Mesocycle{
  Week [] meso;
  int numWeeks;
  
  public Mesocycle(){//take user input as parameter
    numWeeks=8;//make user input # of weeks
    meso = new Week[numWeeks];
    for(int i=0; i<numWeeks; i++){
      meso[i]=new Week();
    }
    BroSplit();
  }

  //constructs a bro split
  private void BroSplit(){
    for(int i=0; i<numWeeks; i++){
      meso[i].ConstructFirstWeek();//fill this out in Week class
    }
  }

  public void print(){
        System.out.print("nuts");
  }
  
}