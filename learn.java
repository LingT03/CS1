public class learn {
    public static void main(String[] args) {
        // example of a use of continue statment
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                System.out.println("found 4");
                continue;
            }
            System.out.println(i);
        }
    }
}