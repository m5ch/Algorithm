package sorted.bubble_sort.demo2;

/**
 * 1.public static void sort(Comparable[]a):对数组内的元素进行排序
 * 2.private static boolean greater(Comparable v,Comparable w):判断v是否大于w
 * 3.private static void exch(Comparable[] a,int ij,int j):交换a数组中，索引i和索引j处的值
 */
public class Sort {
    //1.排序
    public static void sort(Comparable[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (greater(arr[j], arr[j + 1]))
                    exch(arr, j,j+1);
            }
        }
    }

    //2. 比较
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
