import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        // Tìm dãy con có tổng lớn nhất
        // 1 -2 3 -1 2 -4 2 3
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i=0;i<n;i++) {
            curSum+=a[i];
            maxSum=Math.max(maxSum,curSum);
            if(curSum<0) curSum = 0;
        }
        System.out.println(maxSum);
    }
}
