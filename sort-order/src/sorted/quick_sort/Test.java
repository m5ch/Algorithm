package sorted.quick_sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ Classname Test
 * @ Description TODO
 * @ Date 2022/3/22 15:23
 * @ Created by 落尘
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Quick.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
