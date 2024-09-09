public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while (i < 1000) {
            boolean b = i % 3 == 0;
            boolean c = i % 5 == 0;
            if (b){
                count++;
        }
            else if (c) {
              count++;
            }
            i++;
        }
        System.out.println(count);

    }
}
