import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int [] mass = new int[] {15,14,7,5,9,12,1,4,6,8,13,11,10,3,2};
        sort(mass);
        System.out.println(Arrays.toString(mass));
    }

    public static void sort (int [] ints) {

        for (int i = ints.length/2; i>0; i= i/2) {
            for (int j = i; j<ints.length; j++) {
                for (int k = j-i; k>=0 && ints[k]>ints[k+i]; k= k-i) {
                    int t = ints[k];
                    ints[k] = ints[k+i];
                    ints[k+i] = t;
                }
            }
        }
    }

}
