import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("===== QUIZ APPLICATION =====");

        // Question 1
        System.out.println("\n1. What is the capital of India?");
        System.out.println("a) Chennai");
        System.out.println("b) Delhi");
        System.out.println("c) Mumbai");
        System.out.print("Answer: ");

        char ans1 = sc.next().charAt(0);

        if(ans1 == 'b' || ans1 == 'B')
            score++;

        // Question 2
        System.out.println("\n2. Which language is used for Java programming?");
        System.out.println("a) Java");
        System.out.println("b) Python");
        System.out.println("c) HTML");
        System.out.print("Answer: ");

        char ans2 = sc.next().charAt(0);

        if(ans2 == 'a' || ans2 == 'A')
            score++;

        // Question 3
        System.out.println("\n3. How many days are there in a week?");
        System.out.println("a) 5");
        System.out.println("b) 6");
        System.out.println("c) 7");
        System.out.print("Answer: ");

        char ans3 = sc.next().charAt(0);

        if(ans3 == 'c' || ans3 == 'C')
            score++;

        // Question 4
        System.out.println("\n4. Which planet is known as Red Planet?");
        System.out.println("a) Mars");
        System.out.println("b) Earth");
        System.out.println("c) Venus");
        System.out.print("Answer: ");

        char ans4 = sc.next().charAt(0);

        if(ans4 == 'a' || ans4 == 'A')
            score++;

        // Question 5
        System.out.println("\n5. Java is a ?");
        System.out.println("a) Programming Language");
        System.out.println("b) Database");
        System.out.println("c) Operating System");
        System.out.print("Answer: ");

        char ans5 = sc.next().charAt(0);

        if(ans5 == 'a' || ans5 == 'A')
            score++;

        System.out.println("\n===== RESULT =====");
        System.out.println("Total Score: " + score + "/5");

        if(score >= 4)
            System.out.println("Excellent!");
        else if(score >= 3)
            System.out.println("Good!");
        else
            System.out.println("Need Improvement!");

        sc.close();
    }
}