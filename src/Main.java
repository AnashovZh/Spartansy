import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /** спартанцы деген класс тузунуз,
        анын лучники,рыцари, всадники, философы деген сабкласстары болсун,
         ар кимдин ар кандай 2 ден полялары болсун, жана 2 ден методдору болсун,
         спартанцы классында баары тиешелуу name, count(кол-во) деген полялары анан 1 метод болсун,
        count(кол-во) менен сортировка кылган метод тузунуз*/
        Scanner scanner=new Scanner(System.in);
        System.out.print("Write quantity knights: ");
        int number= scanner.nextInt();
        System.out.print("Write quantity riders: ");
        int number1= scanner.nextInt();
        System.out.print("Write quantity archers: ");
        int number2= scanner.nextInt();
        System.out.print("Write quantity philosophy: ");
        int number3= scanner.nextInt();
       Knights knights=new Knights("Knights",number,"Right knights","Left knights");
        System.out.println(knights.getGroupName()+" "+knights.getCount()+" "+knights.getRightKnights()+" "+knights.getLeftKnights());
        knights.ordinaryKnights();
        knights.eliteKnights();
       Riders riders=new Riders("Riders",number1,"White horse","Black horse");
        System.out.println(riders.getGroupName()+" "+riders.getCount()+" "+riders.getWhiteHorse()+" "+riders.getBlackHorse());
        riders.rightRiders();
        riders.leftRiders();
       Archers archers=new Archers("Archers",number2,"Mountain archers","Archers on the ground");
        System.out.println(archers.getGroupName()+" "+archers.getCount()+" "+archers.getMountainArchers()+" "+archers.getArchersOnTheGround());
        archers.archersMountain();
        archers.ArchersOnTheGrounds();
       Philosophers philosophers=new Philosophers("Philosophers",number3,"First degree","Second degree");
        System.out.println(philosophers.getGroupName()+" "+philosophers.getCount()+" "+philosophers.getFirstDegree()+" "+philosophers.getSecondDegree());
        philosophers.advice();
        philosophers.adviceOnStrategy();

        Spartans [] spartans=new Spartans[]{knights,riders,archers,philosophers};
        Spartans spartans1=new Spartans();

        Spartans [] sorSpartans=spartans1.counter(spartans);
        for (int i = 0; i < spartans.length; i++) {
            System.out.println(sorSpartans[i].getGroupName()+" "+sorSpartans[i].getCount());
        }
        System.out.println();
        System.out.println(" All quantity of Sparta soldiers="+spartans1.counters(spartans));
    }
}