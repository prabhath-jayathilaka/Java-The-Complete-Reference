public class Scope {
    public static void main(String[] args) {
        int x;//know to all code within main
        x = 10;

        if (x == 10) {
            int y = 20; //know only to this block
            // x and y both know here
            System.out.println("x and y:" + x + " " + y);
            x = y * 2;
        }
        //y =100;//error y not know here
        // x still know here

        System.out.println("x sis " + x);

    }
}
