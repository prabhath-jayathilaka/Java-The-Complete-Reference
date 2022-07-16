public class CharDemo {
    public static void main(String[] args) {
        char ch1, ch2;
        ch1 = 88; //code of X
        ch2 = 'Y';

        System.out.println("ch1 and ch2 : "+ch1 + " " + ch2);
//        System.out.print(ch1 + " " + ch2);

        charDemo2();
    }

    // for chardemo2  class
    static void charDemo2(){
        char ch1;
        ch1 = 88; //code of X


        System.out.println("ch1 contains : " +ch1);

        ch1++;// increment ch1
        System.out.println("ch1 is now : " +ch1);

    }
}
