import java.util.Scanner;

public class MemoryGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] game= new int[10];
        int point=0;

        game[0]=1;
        game[1]=5;
        game[2]=3;
        game[3]=8;
        game[4]=155;
        game[5]=1;
        game[6]=8;
        game[7]=3;
        game[8]=155;
        game[9]=5;

        for (int i=0; i < 5 ; i++) {
            System.out.println("please enter a number between 0-9");
            int guess1 = scanner.nextInt();
            System.out.println("please enter a number between 0-9");
            int guess2 = scanner.nextInt();

            if (game[guess1] == game[guess2])
                point++;
            System.out.println("your point is : "+point);
        }

        if (point<3)
            System.out.println("haha loser");
        else
            System.out.println("you are the man / woman");





    }
}
