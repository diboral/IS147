package Week3;


public class DataTypes {
    public static void main(String[] args) {
        char letter = 'U';
        // For unicode code point, use \u followed by 4-digit hex value
        char unicode = '\u00DA'
        boolean done = false;
        int radius = 10;
        //byte can be from -127 to +127 it can be used to create saturation of colors
        byte red = 127;
        //it is small than int
        short age = 21;
        long population = 32145141;
        float price = 10.78f;
        double circleArea = Math.PI * radius * radius;

        // strings are arrays of characters string are not primitive data types, they are immutable
        String name = "Shiva Sharma";


        System.out.println (letter);
        System.out.println (done);
        System.out.println (radius);
        System.out.println (red);
        System.out.println (age);
        System.out.println (population);
        System.out.println (price);
        System.out.println (circleArea);
        System.out.println (name);


    }
}
