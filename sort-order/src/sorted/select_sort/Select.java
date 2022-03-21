package sorted.select_sort;

/**
 * @Classname Select
 * @Description TODO
 * @Date 2022/3/19 21:16
 * @Created by 落尘
 */
public class Select {
    //1.
    public static void sort(Comparable[] arr){
        for (int i = 1; i < arr.length - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (greater(arr[i], arr[j])){
                    minindex = j;
                }
            }
            exch(arr, i, minindex);
        }
    }
    //2.比较
    private static boolean greater(Comparable x, Comparable y){
        return x.compareTo(y) > 0;
    }

    //3. 交换
    private static void exch(Comparable[] a, int x , int y){
        Comparable temp = a[x];
        a[x] = a[y];
        a[y] = temp;

    }
}
