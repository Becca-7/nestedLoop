import java.util.ArrayList;

public class nestedLoopLand {


        public static void main(String[] args) {
            System.out.println("Practicin' :)");
            System.out.println();
            nestedLoopLand Practicing = new nestedLoopLand();

        }
        public nestedLoopLand() {
pattern1();
pattern2();
pattern3();
pattern4();
pattern5();
pattern6();
pattern7();
pattern75();
pattern8();
pattern9();
pattern11();
pattern12();

        }
    public void pattern1(){
            System.out.println("***  Pattern One  ***");
            for (int x=0;x<=25;x+=5){
                System.out.println(x);
            }
            System.out.println();
        }
    public void pattern2(){
        System.out.println("***  Pattern Two  ***");
        for (int x=2;x<=27;x+=5){
            System.out.println(x);
        }
        System.out.println();
    }
    public void pattern3(){
        System.out.println("***  Pattern Three  ***");
        for (int x=21;x>=1;x-=4){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println();
    }
    public void pattern4(){
        System.out.println("***  Pattern Four  ***");
        for (int x=1;x<=6;x++){
            System.out.print(x*x+"\t");
        }
        System.out.println();
        System.out.println();
    }
    public void pattern5(){
        System.out.println("***  Pattern Five  ***");
       for (int x=1;x<4;x++) {
           for (int y = 1; y <= 4; y++) {
               System.out.print(y+" ");
           }
           System.out.println();
       }
        System.out.println();
    }
    public void pattern6(){
        System.out.println("***  Pattern Six  ***");
        for (int x=1;x<5;x++) {
            for (int y = 0; y <= x; y++) {
                System.out.print(" ");
            }
            System.out.println(x);
        }
        System.out.println();
    }
    public void pattern7(){
            System.out.println("***   pattern Seven   ***");
    for (int x=1;x<=5;x++){
                for (int y=0;y<=x-1;y++){
                    System.out.print(x);

                }
                System.out.println();
            }
}
    public void pattern75(){
        System.out.println("***   pattern Seven.five   ***");
        for (int x=1;x<=5;x++){
            for (int y=x;y<=5;y++){
                System.out.print(x);

            }
            System.out.println();
        }
    }
    public void pattern8(){
        System.out.println("***   pattern Eight   ***");
        for (int x=1;x<5;x++) {
            for (int y = 0; y <= x; y++) {
                System.out.print(" ");
            }
            for(int z=0;z<5-x;z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern9(){
        System.out.println("***   pattern Nine   ***");
        for (int x=1;x<5;x++) {
            for (int y = 0; y <= x; y++) {
                System.out.print(" ");
            }
            for(int z=0;z<9-2*x;z++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public void pattern11(){
        System.out.println("***   pattern Eleven   ***");
        for (int x=1;x<=5;x++){
            for (int y=0;y<=x-1;y++){
                System.out.print("#");

            }
            System.out.println();
        }
    }
    public void pattern12(){
        System.out.println("***   pattern Twelve   ***");
        for (int x=1;x<=5;x++){
            for (int y=0;y<=x-1;y++){
                System.out.print("#");
            }
            for (int z=0;z<=2*(5-x);z++){
                System.out.print(" ");
            }
            for (int y=0;y<=x-1;y++){
                System.out.print("#");
            }
            System.out.println();
        }
    }






    }

