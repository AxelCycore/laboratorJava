package lab3;

public class FirstClass {
    public static void main(String[] args){
        int[] k={23,55,13,44,65,70,17};

        for(int i=1;i<=k.length;i++) {
            if (k[i] % 2 == 1) {
                for (int j = 2; j <= k[i] / 2; j++)
                    if (k[i] % j == 0)
                        break;

                System.out.println(k[i]);
            }
        }
    }
}
