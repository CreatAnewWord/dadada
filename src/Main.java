
public class Main {





    //- Звернути увагу на методи: toCharArray, charAt , indexOf, intern, contains, startWith, valueOf
    //
    //1. Створити порожній проект в IntelliJ IDEA
    //
    //2. Створити метод findSymbolOccurance. Метод приймає як параметр рядок і символ. Необхідно обчислити, скільки разів символ зустрічається в переданому рядку і повернути це числове значення.
    //
    //3. Створити метод findWordPosition. Метод приймає як параметри два рядки (source, target). Необхідно з'ясувати, чи є target (підрядок) частиною рядка source. Якщо так, тоді повернути номер позиції (індекс) першого елемента підрядка у рядку, інакше повернути -1.
    //
    //Приклад 1:
    //
    //Source: Apollo
    //
    //Target: pollo
    //
    //Result: 1
    //
    //Приклад 2:
    //
    //Source: Apple
    //
    //Target: Plant
    //
    //Result: -1
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // Random random = new Random();

        //System.out.println("  " );
        //   String string = scanner.nextLine();
        //  System.out.println(string);
        reverseString("GLORY");


        isPalindrome("ele");
findSymbolOccurance("С С аша шляпик","С");
        String abc = "I love $";
findWordPosition("Я саша шляпик","4");



    }
    public static void findSymbolOccurance(String inputString, String symbol) {
        int count = 0;
        int position = inputString.indexOf(symbol);
        for (int i = 0; i <inputString.length() ; i++) {
            for (int j = 0; j <inputString.length() ; j++) {
                if(position != -1){
                    count++;
                } else {
                    System.out.println("Eror 404");

                }
            }




        }
        System.out.println(count);

        }



    public static void findWordPosition(String source, String target) {


        int position = source.indexOf(target);


        if (position != -1) {
            System.out.println("Слово '" + target+ "' знаходиться на позиції " + position + " у рядку '" + source + "'.");
        } else {
            System.out.println("Слово '" + target + "' не знайдено у рядку '" + source + "'.");
        }




    }

    public  static   void reverseString(String str) {
        // create a StringBuilder object
        // with a String pass as parameter
        StringBuilder s = new StringBuilder(str);

        // print string
        System.out.println("String = "
                + str.toString());

        // reverse the string
        StringBuilder reverseStr = s.reverse();

        // print string
        System.out.println("Reverse String = "
                + reverseStr.toString());
        //4. Створити метод stringReverse. Метод приймає як параметр - рядок. Необхідно її розгорнути та повернути змінений варіант.
        //
        //Наприклад:
        //
        //Hello -> olleH
    }


    public static void isPalindrome(String str) {
        // Видаляємо пробіли і переводимо все в нижній регістр для порівняння
        String cleanStr = str.replaceAll("\\s", "").toLowerCase();


// Порівнюємо рядок з його реверсом
        String reversedStr = new StringBuilder(cleanStr).reverse().toString();


        if (cleanStr.equals(reversedStr)){
            System.out.println(reversedStr+"->True");
        }else {
            System.out.println(reversedStr+"->False");
        }
    }

}