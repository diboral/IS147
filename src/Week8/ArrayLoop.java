public static void main(String[] student) {
        student=new String[5];
        student[0]="A";
        student[1]="B";
        student[2]="C";
        student[3]="D";
        student[4]="E";

        System.out.println (" The number of parameter is " + student.length);
        for (int i = 0; i < 5; i++) {
            System.out.println ("args[" + i + "]:" + student[i]);
        }
        System.out.println ("-------------------------------------- ");
        for (int i = 0; i < student.length; i++) {
            System.out.println ("args[" + i + "]:" + student[i]);
        }
        System.out.println ("-------------------------------------- ");
        for(String s: student){
            System.out.println (s);
        }
    }
