public class Example2 {
    public static void main(String[] args) {
        int num;  //this declares a variable called num
        num = 100; // this assign num the value
        System.out.println("This is num: " + num);
        num = num * 2;
        System.out.print("The value of num *2 is ");
        System.out.println(num);



        /*
         * Next part is control statements
         * For loop
         * */


        for (int i = 0; i < 10; i++) {
            System.out.println("Number : " + i);
            System.out.println("loop line works" + i);
        }
    }
}
