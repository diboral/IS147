package Week5;


public class CharacterString {

    public static void main(String[] args) {

      // ASCII and UNICODE
        char ch='a';
        System.out.println (++ch);
        System.out.println ("------------------------------");
        int ascii = ch;
        // You can also cast char to int
        int castAscii = (int) ch;
        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
      

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);

        char letterUni = '\u0041'; //(Unicode)
        System.out.println ("UNICODE  Letter character is "+ letterUni);
        System.out.println ("------------------------------");
        char numCharUni = '\u0034'; //(Unicode)
        System.out.println ("Unicode Number character " +numCharUni);
        System.out.println ("------------------------------");

        //ESCAPE SEQUENCE
        System.out.println ("Hello \n world");
        System.out.println ("------------------------------");

        System.out.println ("Hello \r world");
        System.out.println ("------------------------------");
        System.out.println ("Hello \\ world");
        System.out.println ("------------------------------");
        System.out.println ("Hello \" world");


        // The string Type
        System.out.println ("-------------The String Type---------------");

        String message= "Welcome to Java";
        System.out.println (message);

        String stringMessage = "Welcome to Java";
        System.out.println (stringMessage);


         //Integer I= new Integer (20);
         //System.out.println (I);

        System.out.println ("------------------------------");

        System.out.println ("------------- String Are Immutable---------------");

        String s="Java";
        s="HTML";
        System.out.println ("Original Value of S is Java new value is " + s);


        System.out.println ("------------- String Length---------------");

        String myMessage= "    Welcome to JAVA   ";
        System.out.println ("The length of "+ myMessage + " is " + myMessage.length ());
        System.out.println ("The first character in myMessage is  "+ myMessage.charAt (0));

        System.out.println ("------------- String CASE---------------");
        String myMessageString= " java programming";
        System.out.println ("Uppercase "+ myMessageString.toUpperCase ());
        System.out.println ("Lowercase "+ myMessageString.toLowerCase ());
        System.out.println ("Trim  "+ myMessageString.trim ());

        System.out.println ("------------- Concatenation---------------");

        String s1= " java programming ";
        String s2= " Is easy";

        String s3= s1.concat (s2);
        System.out.println ("Concat example " + s3);

        System.out.println ("------------- String Index of ---------------");

        String str="myemail@umbc.edu";
        int isAt=str.indexOf ("@");
        System.out.println ("@ symbole is at index " + isAt);
        System.out.println ("------------------------------");

        int isDot=str.indexOf ('.');
        System.out.println (isDot);
        System.out.println ("------------------------------");


        System.out.println ("------------- String Specifier ---------------");

        int count=5;
        double amount=45.56;
        String product=" Nike Shoes";

        System.out.printf ("you bought %d product name %s  each at %f per unit", count, product,amount );

        System.out.println ();
        System.out.println ("------------- String Substring ---------------");

        String strSubstring="Java Programming";
        String sub1=strSubstring.substring (0,5);
        String sub2=strSubstring.substring (5);
        System.out.println (sub1);
        System.out.println (sub2);

        System.out.println ("------------- String Equal ---------------");

        String str1="Java programming";
        String str2="is fun";
        String str3= "is fun";

        String result=str1.equals(str2)?"equal": "no equal";
        System.out.println (result);


        boolean result2= str2.equals (str3);
        System.out.println ("Result 2 is " + result2);

        char a = 'a';
        System.out.println(a);
        int charResult = a;
        System.out.println ("ASCII value =" + charResult);


        int one = a - 46;//

        System.out.println(one);

    }
}
