package lab3;

public class FirstClass {
    public static void main(String[] arg) {
        int[] k = {23, 55, 13, 44, 65, 70, 17};
        boolean flag = false;
        int i;
        int j;

            for (i = 0; i <= k.length; i++) {
                for (j = 2; j <= k[i] / 2; j++) {
                    if (k[i] % j == 0)
                        flag = true;
                    break;



                }
                if (!flag)
                    System.out.println(k[i]);
        }
    }
}

