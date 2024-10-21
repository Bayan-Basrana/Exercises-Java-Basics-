import java.awt.geom.Arc2D;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

/*
 Question 1 : Develop a program that takes the weight (in kilograms) and height (in meters)
       as input and calculates the BMI, then prints it.
 */

        Scanner input =new Scanner(System.in);

     System.out.println("please enter the Weight (KG) ");
      double weight = input.nextDouble();
     System.out.println("please enter the height (M)");
      double height = input.nextDouble();
     //BMI
     System.out.println("The BMI = " + (weight/(height*height) ));

/*
2-Write a program that takes the obtained marks and total marks as input and
calculates the percentage, then prints it.
 */

  System.out.println("please enter the obtained marks ");
    double  marks = input.nextDouble();
  System.out.println("please enter the total marks ");
    double total = input.nextDouble();
//calculates the percentage
    double percentage = (marks/total) ;
System.out.println("Percentage = "+ (percentage *100) + "%");

/*
3-Create a program that takes an amount in one currency and an exchange rate
as input, then converts and prints the amount in another currency.
 */
        //Input: amount and exchange rate
    System.out.print("Enter the amount in original currency: ");
        double amount = input.nextDouble();
    System.out.print("Enter the exchange rate: ");
        double exchangeRate = input.nextDouble();
        // Conversion
        double convertedAmount = amount * exchangeRate;
        // print the convert
    System.out.println("The amount in the new currency is: " +convertedAmount);

 /*
4-. Create a program that takes a string as input, calculates its length, and then
reverses the string using the StringBuilder class, finally printing both the length and
reversed string.
 */
        System.out.println("please enter string ");
        String str = input.nextLine();
        StringBuilder sb =new StringBuilder(str);
        System.out.println("Length of the string: " + str.length() );
        System.out.println(" And Reversed string: " + sb.reverse());


 /*
5-. Develop a program that takes a sentence as input and extracts a substring from
it, then prints the extracted substring.
 */

        System.out.println("Enter a sentence ");
        String sentence= input.nextLine();
        System.out.println("Enter the world to extract ");
        String extract= input.nextLine();

        // the index of start and end of extracted word
        int startIndex = sentence.indexOf(extract);
        int endIndex = startIndex + extract.length();

        String substring = sentence.substring(startIndex ,endIndex);
        System.out.println("the extracted substring : " + substring);



 /*
6- Write a program that takes a sentence and a keyword as input, then check if
the keyword is present in the sentence and prints the result.
 */
        System.out.println("Enter a sentence");
        String sentence3 = input.nextLine();

        System.out.println("Enter a keyword");
        String keyWord = input.nextLine();

        // Print result using contains()
        System.out.println("Keyword \"" + keyWord + "\" is present in the sentence: "
                + sentence3.contains(keyWord));
 /*
7-Develop a program that takes a sentence and a word to replace as input, then
replace all occurrences of the word with another word and prints the modified
sentence.
 */

        System.out.println("please enter sentence");
        String sentence1 = input.nextLine();

        System.out.println("please enter the Word to Replace");
        String oldWord = input.nextLine();

        System.out.println("please enter Replacement Word ");
        String newWord  = input.nextLine();
        System.out.println("modified sentence : "+(sentence1.replace(oldWord,newWord)));



 /*
8-Write a program that takes two strings as input and check if they are equal,
ignoring the case, then prints whether they are equal or not.
 */
        System.out.println("please enter first string");
        String first_string = input.next();
        System.out.println("please enter 2nd string");
        String second_string = input.next();

        System.out.println("Strings are equal (ignoring case) : "+first_string.equalsIgnoreCase(second_string));

    }
}