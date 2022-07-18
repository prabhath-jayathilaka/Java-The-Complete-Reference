public class LifeTime {
    public static void main(String[] args) {

        int x;
        for (x=0;x<3;x++){
            int y=-1;// yis initialize each time block is entered
            System.out.println("y is : "+y);
            y=100;
            System.out.println("y is now: "+y);

        }


        // scope error class
        int bar =1;{
//            int bar =2;
//            compile time error -bar already define
        }
    }
}
