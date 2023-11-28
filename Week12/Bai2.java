import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []a = new int[n];
        for (int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        int cnt = 0;
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<n;i++) {
            if(set.contains(k-a[i])) {
                cnt++;
                set.remove(k-a[i]);
                set.remove(a[i]);
                continue;
            }
            set.add(a[i]);
        }
        System.out.println(cnt);
    }
}
