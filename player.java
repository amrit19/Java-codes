public class player {
    public static void DisplayHighSchoolPosition(String name,int position)
    {
        System.out.println(name+" managed to get into position "+position+" on the high score table");
    }
public static int CalculateHighScorePosition(int score)
{
    if (score>=1000)
        return 1;
    else if(score>=500 && score<1000)
        return 2;
    else if(score>=100 && score<500)
        return 3;
    else
        return 4;
}

    public static void main(String[] args) {
        int a;
        String n="Amrit";
        a=CalculateHighScorePosition(1500);
        DisplayHighSchoolPosition(n,a);
        a=CalculateHighScorePosition(900);
        DisplayHighSchoolPosition(n,a);
        a=CalculateHighScorePosition(400);
        DisplayHighSchoolPosition(n,a);
        a=CalculateHighScorePosition(50);
        DisplayHighSchoolPosition(n,a);

    }
}
