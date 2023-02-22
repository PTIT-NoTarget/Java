import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;
        T = sc.nextInt();
        int[] arr = new int[100000];
        for(int t = 1;t <= T;t++){
            int n = sc.nextInt();
            for(int i = 0;i < n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr, 0, n);
            int sum = 0;
            for(int i = 0;i < n;i++){
                sum += arr[i] * i;
            }
            System.out.println(sum);
        }
    }
}
