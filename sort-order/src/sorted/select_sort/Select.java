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
