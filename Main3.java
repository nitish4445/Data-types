import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main4 {
    public static void main (String[] args) {
                      // Your code here
    Scanner in =new Scanner(System.in);
   int input1=in.nextInt();
   long input2=in.nextLong();
   float input3=in.nextFloat();
   double input4=in.nextDouble();
   char input5=in.next().charAt(0);
   System.out.println(input1);
   System.out.println(input2);
   System.out.printf("%.2f\n",input3);
   System.out.printf("%.4f\n",input4);
   System.out.println(input5);
    
    }
}