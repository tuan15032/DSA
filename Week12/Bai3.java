import java.util.*;

public class Bai3 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<n;i++) {
            int x = sc.nextInt();
            list.add(x);
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer x = iterator.next();
            if (set.contains(x)) {
                iterator.remove();
            } else {
                set.add(x);
            }
        }
        for (Integer x:list) {
            System.out.print(x + " ");
        }
    }
}
