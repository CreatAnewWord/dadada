package ssRank;

import java.util.Random;
import java.util.Scanner;

public class Main {
    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli",
            "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
            "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};



    private String ZagadonoyeSlovo;

    private String Podskazka;

private String startComand;



    public static void main(String[] args){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
     //   Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.println("Ведите стартовую команду");
   //     String string = scanner.nextLine();

SearchName();




    }
    public static void StartGame(String startComand){
if (startComand == "Start"){
    int inGame = 1;
}else {
    System.out.println("Вы ввели не правильное старт слово, пожалуйста введите " + "'Start'");

}



        System.out.println("Game was started");
    }
    public static   void SearchName(){
        Random random = new Random();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int rand_int1 = random.nextInt(2);
        double rand_dub1 = random.nextDouble();




        System.out.println(rand_dub1);







    }




}
