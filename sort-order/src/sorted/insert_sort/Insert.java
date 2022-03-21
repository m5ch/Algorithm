package sorted.insert_sort;

/**
 * @ Classname Insert
 * @ Description TODO
 * @ Date 2022/3/21 14:41
 * @ Created by 落尘
 */
public class Insert {
    /*
        1.public static void sort(Comparable[]a):对数组内的元素进行排序
        2.private static boolean greater(Comparable v,Comparable w):判断v是否大于w
        3.private static void exch(Comparable[] a,int i,int j):交换a数组中，索引i和索引j处的值

     */
    //1.排序
    public static void sort(Comparable[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (greater(arr[j] , arr[j - 1])){
                    exch(arr, j ,j - 1);
                }
                else
                    break;
            }
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
