using System;
using System.Collections.Generic;

public struct muscleGroup
{
    public string name;
    public int MV; //MV = Maintenance Volume, maintain current size
    public int MEV;//MEV = Minimum Effective Volume, least work to do to grow muscles
    public int MAVMin;//MAV = Maximum Adaptive Volume, range of volumes that you make the best gains, bottom of the range
    public int MAVMax;//MAV = Maximum Adaptive Volume, top of the range
    public int MRV;//MRV = Maximum Recoverable Volume, work up to this

};

class Program
{

    public static Dictionary<string, int> weeklyFatigue;//turn this into an array, one weekly fatigue variable for each week of the split

    public static void Main(string[] args)
    {
        weeklyFatigue = new Dictionary<string, int>();
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

    }

    private static void intializeWeeklyFatigue()
    {
        weeklyFatigue.Add("chest", 0);

        weeklyFatigue.Add("biceps", 0);
        weeklyFatigue.Add("triceps", 0);

        weeklyFatigue.Add("frontDelt", 0);
        weeklyFatigue.Add("sideDelt", 0);
        weeklyFatigue.Add("rearDelt", 0);

        weeklyFatigue.Add("quads", 0);
        weeklyFatigue.Add("hamstrings", 0);
        weeklyFatigue.Add("glutes", 0);

        weeklyFatigue.Add("abs", 0);
        weeklyFatigue.Add("calves", 0);
    }

    public static void printWeeklyFatigue()
    {
        string output = "";
        foreach (KeyValuePair<string, int> temp in weeklyFatigue)
        {
            output += string.Format("MuscleGroup = {0}, Weekly sets programmed = {1}", temp.Key, temp.Value);
            output += "\n";
        }
        Console.WriteLine(output);
    }
}
