package org.example;

import java.util.Scanner;

public class Ex1 {

    public static void main(String [] args){

          Scanner scanner = new Scanner(System.in);

//////        1. Develop a program that takes the weight (in kilograms) and height (in meters)
//////        as input and calculates the BMI, then prints it.
//////           • Input: Weight (kg) = 70, Height (m) = 1.75
//////           • Expected Output: BMI = 22.86

           System.out.print("Weight (Kg) = ");
           int weight = scanner.nextInt();


           System.out.print("Height (m) = ");
           double height = scanner.nextDouble();


           double bmi = weight / (height * height);
           double temp = Math.round(bmi * 100.0) / 100.0;
           System.out.println("BMI = " + temp);

           System.out.println("-------------------------------------");

//////        2. Write a program that takes the obtained marks and total marks as input and
//////        calculates the percentage, then prints it.
//////           • Input: Obtained Marks = 85, Total Marks = 100
//////           • Expected Output: Percentage = 85.0%

            System.out.print("Obtained Marks = ");
            double marks = scanner.nextDouble();

            System.out.print("Total Marks = ");
            double total = scanner.nextDouble();

            double percentage = ((marks / total) * 100);

            System.out.println("Percentage = " + percentage + "%");

            System.out.println("-------------------------------------");

//////        3. Create a program that takes an amount in one currency and an exchange rate
//////        as input, then converts and prints the amount in another currency.
//////           • Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
//////           • Expected Output: Amount in EUR = 85.0

            System.out.print("Amount in USD = ");
            double usd = scanner.nextDouble();

            System.out.print("Exchange Rate (USD to EUR) = ");
            double eur = scanner.nextDouble();

            scanner.nextLine();

            double amount = usd * eur;

            System.out.println("Amount in EUR = " + amount);

            System.out.println("-------------------------------------");

////        4. Create a program that takes a string as input, calculates its length, and then
////        reverses the string using the StringBuilder class, finally printing both the length and
////        reversed string.
////        • Input: "Hello, World!"
////        • Expected Output: Length of the string: 13 And Reversed string: "!dlroW
////                ,olleH"

            System.out.println("Enter the string: ");
            String str = scanner.nextLine();

            StringBuilder build = new StringBuilder(str).reverse();

            System.out.println("Length of the string: " + str.length() + " " + "And Reversed string: " + build);

            System.out.println("-------------------------------------");

////        5. Develop a program that takes a sentence as input and extracts a substring from
////        it, then prints the extracted substring.
////          • Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index
////                = 10, End Index = 20
////          • Expected Output: "brown fox"

             System.out.println("Enter the sentence: ");
             String sen = scanner.nextLine();
             scanner.nextLine();

             System.out.println("Enter the start index: ");
             int stIndex = scanner.nextInt();
             scanner.nextLine();

             System.out.println("Enter the end index: ");
             int endIndex = scanner.nextInt();
             scanner.nextLine();

             String exSen = sen.substring(stIndex, endIndex);

             System.out.println(exSen);

             System.out.println("-------------------------------------");

////        6. Write a program that takes a sentence and a keyword as input, then check if
////        the keyword is present in the sentence and prints the result.
////            • Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword =
////                "jumps"
////            • Expected Output: Keyword "jumps" is present in the sentence.

               System.out.println("Enter the sentence: ");
               String sen2 = scanner.nextLine();
               scanner.nextLine();

               System.out.println("Enter the keyword: ");
               String word = scanner.nextLine();
               scanner.nextLine();
               System.out.println(sen2.contains(word));

                 //another display of output to be as the question

                 if(sen2.contains(word)){

                     System.out.println("Keyword " + word + " is present in the sentence");
                 }else{

                     System.out.println("Keyword "+  word + " is not present in the sentence");
                 }

                 System.out.println("-------------------------------------");

////        7. Develop a program that takes a sentence and a word to replace as input, then
////        replace all occurrences of the word with another word and prints the modified
////        sentence.
////         • Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to
////        Replace = "fox", Replacement Word = "cat"
////         • Expected Output: "The quick brown cat jumps over the lazy dog"

                 System.out.println("Enter the sentence: ");
                 String sen3 = scanner.nextLine();
                 scanner.nextLine();

                 System.out.println("Word to replace: ");
                 String toReplace = scanner.nextLine();
                 scanner.nextLine();

                 System.out.println("Replacement word: ");
                 String repWord = scanner.nextLine();
                 scanner.nextLine();

                 String repOperation = sen3.replaceAll(toReplace, repWord);

                 System.out.println(repOperation);

                 System.out.println("-------------------------------------");

//        8. Write a program that takes two strings as input and check if they are equal,
//                ignoring the case, then prints whether they are equal or not.
//                • Input: String 1 = "Hello", String 2 = "hello"
//                • Expected Output: Strings are equal (ignoring case).

                  System.out.println("String 1 = ");
                  String st1 = scanner.nextLine();
                  scanner.nextLine();

                  System.out.println("String 2 = ");
                  String st2 = scanner.nextLine();
                  scanner.nextLine();

                  System.out.println(st1.equalsIgnoreCase(st2));

                  //another display of output to be as the question

                 if (st1.equalsIgnoreCase(st2)){

                     System.out.println("Strings are equal (ignoring case).");
                 }else{

                     System.out.println("Strings are not equal");
                 }

                     System.out.println("-------------------------------------");


          }
      }
