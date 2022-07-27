
public class BirleYuzArasi {
    public static void main(String[] args) {

        boolean Asal = false;
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < 100; j++) {
                if (i % j == 0 && i > j) {
                    Asal = false;
                    break;
                } else {
                    Asal = true;
                }
            }
            if (Asal == true || i == 2) {
                System.out.print(i + " ");
            }

        }


    }
}
