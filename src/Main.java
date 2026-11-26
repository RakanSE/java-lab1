import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

// Q1

        System.out.print("Enter the first number: ");
        int num = in.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();

        System.out.println(num+ " + "+ num2 + " = " + (num + num2));
        System.out.println(num+ " - "+ num2 + " = " + (num - num2));
        System.out.println(num+ " * "+ num2 + " = " + (num * num2));
        System.out.println(num+ " / "+ num2 + " = " + (num / num2));
        System.out.println(num+ " mod "+ num2 + " = " + (num % num2));

        System.out.println("---------------------------------------");

// Q2

        System.out.print("Enter The number: ");
        int nmb = in.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(nmb + " X " + i + " = " + nmb * i);
        }

        System.out.println("---------------------------------------");

// Q3

        System.out.print("Enter the Radius: ");
        double rds = in.nextDouble();

        double pra = 2 * Math.PI * rds;
        double are = Math.PI * rds * rds;

        System.out.println("The perimetir is: " + pra);
        System.out.println("The Area is: " + are);

        System.out.println("---------------------------------------");

// Q4

        System.out.print("Enter the count of the numbers: ");
        double cnt = in.nextDouble();

        double c = 1;
        double cunt = 0;

        while (c <= cnt){

            System.out.print("Enter the integer number: ");
            double ntg = in.nextDouble();

            cunt = cunt + ntg;

            c++;
        }
        double avg = cunt / cnt;
        System.out.println("The avreage is: " + avg );

        System.out.println("---------------------------------------");

// Q5

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter The Second number: ");
        int numm2 = in.nextInt();

        System.out.print("Enter the therd number: ");
        int num3 = in.nextInt();

        if (num1 + numm2 == num3){
            System.out.println("This result is: True ");
        }
        else {
            System.out.println("This result is: False ");
        }

        System.out.println("---------------------------------------");


// Q6

        System.out.print("Enter the word: ");
        in.nextLine();
        String wrd = in.nextLine();

        String rev = "";

        for (int i = wrd.length() - 1; i >= 0; i--){
            rev = rev + wrd.charAt(i);

        }
        System.out.println("Reverse Word: "+ rev);

        System.out.println("---------------------------------------");


// Q7

        System.out.print("Enter the number: ");
        int nmm = in.nextInt();

        if (nmm % 2 ==0 ){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
        System.out.println("---------------------------------------");


// Q8

        System.out.print("Enter the temperatuer in centigrade: ");
        double cent = in.nextInt();

        double fehr = cent * 9 / 5 + 32;

        System.out.println("The temperatuer in fehrenhite: " + fehr);


        System.out.println("---------------------------------------");


// Q9

        System.out.print("Enter the String: ");
        in.nextLine();
        String str = in.nextLine();

        System.out.print("Enter the number: ");
        int nms = in.nextInt();

        System.out.println(str.charAt(nms));

        System.out.println("---------------------------------------");


// Q10

        System.out.print("Enter the Width: ");
        double wd = in.nextDouble();

        System.out.print("Enter the Height: ");
        double ht = in.nextDouble();

        double arr = wd * ht;
        double pera = 2 * (wd + ht);

        System.out.println("Area is: "+ wd + " * " + ht + " = " + (wd *ht));
        System.out.println("Perimater is: 2 * ("+wd+ " + "+ht+") = "+ 2 * (wd+ht) );

        System.out.println("---------------------------------------");


// Q11

        System.out.print("Enter the first number: ");
        int fnn = in.nextInt();

        System.out.print("Enter the second number: ");
        int snn = in.nextInt();

        if (fnn > snn){
            System.out.println(snn+ " != " + fnn+"\n" +
                    ""+ snn + " < "+fnn +"\n" +
                    ""+ snn+" <= "+ fnn);
        }
        else {
            System.out.println(fnn+ " != " + snn+"\n" +
                    ""+ fnn + " < "+snn +"\n" +
                    ""+ fnn+" <= "+ snn);
        }
        System.out.println("---------------------------------------");




// Q12

        System.out.print("Enter the seconds: ");
        int sec = in.nextInt();

        int hours = sec / 3600;
        int minutes = (sec % 3600) / 60;
        int seconds = sec % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);

        System.out.println("---------------------------------------");


// Q13


        System.out.print("Enter first number: ");
        int ff1 = in.nextInt();

        System.out.print("Enter second number: ");
        int ss2 = in.nextInt();

        System.out.print("Enter the third number: ");
        int tt3 = in.nextInt();

        System.out.print("Enter the fourth number: ");
        int oo4 = in.nextInt();

        if (ff1 == ss2 && ff1 == tt3 && ff1 == oo4){
            System.out.println("The numbers are equal ");
        }
        else {
            System.out.println("The numbers are not equal!");
        }

        System.out.println("---------------------------------------");


// Q14


        System.out.print("Enter the number: ");
        int nnn = in.nextInt();

        if (nnn > 0){
            System.out.println("Number is positive");
        }
        else if (nnn == 0){
            System.out.println("Number is Zero");
        }
        else {
            System.out.println("Number is negative");
        }
        System.out.println("---------------------------------------");


// Q15


        int pos = 0;
        int neg = 0;
        int zero = 0;

        while (true) {
            System.out.print("Enter the number or -1 to exit: ");
            int numm = in.nextInt();

            if (numm == -1){
                break;
            }

            else if (numm > 0) {
                pos++;
            }
            else if (numm < 0) {
                neg++;
            }
            else {
                zero++;
            }
        }

        System.out.println(pos + " positives");
        System.out.println(zero + " zero");
        System.out.println(neg + " negatives");

        System.out.println("---------------------------------------");



// Q16


        System.out.print("Enter the numbers: ");
        int inn = in.nextInt();

        int reve = 0;

        while (inn != 0 ){

            int digit = inn % 10;
            reve = reve * 10 + digit;

            inn /= 10;
        }

        System.out.println("The reverse number is: " + reve);

        System.out.println("---------------------------------------");



// Q17


        System.out.print("Enter the number or 00 to exit: ");
        int nbb = in.nextInt();

        int lrg = nbb;
        int sml = nbb;

        while (true) {
            System.out.print("Enter the number or 00 to exit: ");
            nbb = in.nextInt();

            if (nbb == 00) {
                break;
            }
            else if (nbb > lrg) {
                lrg = nbb;
            }

            else if (nbb < sml) {
                sml = nbb;
            }
        }

        System.out.println("The largest number: " + lrg);
        System.out.println("The smalles number: " + sml);

        System.out.println("---------------------------------------");


// Q18


        System.out.print("Enter the string: ");
        in.nextLine();
        String sttr = in.nextLine();

        char trg = 'a';

        int cntt = 0;

        for (int t = 0; t < sttr.length(); t++) {

            if (sttr.charAt(t) == trg) {
                cntt++;
            }
        }
        System.out.println("The numbers of a " + cntt);

    }
}