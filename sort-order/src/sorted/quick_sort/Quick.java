package sorted.quick_sort;

/**
 * @ Classname Quick
 * @ Description TODO
 * @ Date 2022/3/22 15:23
 * @ Created by 落尘
 */

/*
1.public static void sort(Comparable[]a):对数组内的元素进行排序
2.private static void sort(Comparable[] a, int lo, int hi):对数组a中从索引lo到索引hi之间的元素进行排序
3.public static int partition(Comparable[] a,int lo,int hi):对数组a中，从索引 lo到索引 hi之间的元素进行分组，并返回分组界限对应的索引
4.private static boolean less(Comparable v,Comparable w):判断v是否小于w
5.private static void exch(Comparable[] a,int i,int j):交换a数组中，索引i和索引j处的值
 */
public class Quick {
    public static void sort(Comparable[] arr){
        //
        int lo = 0 , hi = arr.length - 1;
        //调用sort重载方法完成数组arr中，从索引lo到索引hi的元素排序
        sort(arr,lo,hi);
    }

    private static void sort(Comparable[] arr,int lo,int hi){
        //安全性校验
        if (lo >= hi)
            return;
        else{
            //对lo到hi之间的数据进行分组
            int mid = partition(arr,lo,hi);
            //左边有序
            sort(arr, lo , mid - 1);
            //右边有序
            sort(arr,mid + 1, hi);
        }
    }

    private static int partition(Comparable[] arr,int lo,int hi){
        //确定分界值
        Comparable key = arr[lo];
        //定义两个指针，分别指向带切分元素的最小索引处和最大索引处的下一个位置
        int left = lo;
        int right = hi + 1;
        //切分
        while(true){
            //先从右往左扫描，找到比分界值小的元素，停止
            while(less(key,arr[--right])){
                if (right == lo)
                    break;
            }

            //先从左往右扫描，找到比分界值大的元素，停止
            while(less(arr[++left],key)){
                if (left == hi)
                    break;
            }
            //判断left >= right?扫描完毕:交换元素位置
            if (left >= right)
                break;
            else
                exch(arr,left,right);
        }
        //交换分界值
        exch(arr,lo,right);

        return right;
    }

    private static boolean less(Comparable x,Comparable y){
        return x.compareTo(y) < 0;
    }

    private static void exch(Comparable[] arr, int x,int y){
        Comparable temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
