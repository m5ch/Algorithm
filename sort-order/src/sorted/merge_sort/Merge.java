package sorted.merge_sort;

/**
 * @ Classname Merge
 * @ Description 归并排序
 * @ Date 2022/3/21 19:43
 * @ Created by 落尘
 */

/*
1.public static void sort(Comparable[]a):对数组内的元素进行排序
2.private static void sort(Comparable[] a, int lo, int hi):对数组a中从索引lo到索引hi之间的元素进行排序
3.private static void merge(Comparable a, int lo, int mid, int hi):
从索引lo到所以mid为一个子组，从索引mid+1到索引hi为另一个子组，把数组a中的这两个子组的数据合并成一个有序的大组(从索引lo到索引hi )
4.private static boolean less(Comparable v,Comparable w):判断v是否小于w
5.private static void exch(Comparable[] a,int i,int j):交换a数组中，索引i和索引j处的值
 */

public class Merge {
    //辅助数组
    private static Comparable[] arr1;

    public static void sort(Comparable[] arr){
        //初始化辅助数组arr1
        arr1 = new Comparable[arr.length];
        //定义lo和hi变量分别记录数组中最小索引和最大索引
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
            int mid = lo + (hi - lo) / 2;
            //分别对每一组数据进行排序
            sort(arr, lo , mid);
            sort(arr,mid + 1, hi);
            //把两个数组中的数据进行归并
            merge(arr,lo,mid,hi);
        }
    }

    private static void merge(Comparable[] arr,int lo,int mid,int hi){
        //定义三个指针
        int i = lo,p1 = lo, p2 = mid + 1;

        //遍历，移动p1、p2指针，比较对应索引处的值的大小
        //找出小的并放在辅助数组的对应索引处
        while(p1 <= mid && p2 <= hi){
            //比较
            if (less(arr[p1],arr[p2])){
                arr1[i++] = arr[p1++];
            }
            else{
                arr1[i++] = arr[p2++];
            }
        }

        //遍历·如果p1的指针没有走完﹔那么顺序移动p1指针﹐把对应的元素放到辅助数组的对应索引处
        while(p1 <= mid){
            arr1[i++] = arr[p1++];
        }
        //遍历·如果p2的指针没有走完﹔那么顺序移动p1指针﹐把对应的元素放到辅助数组的对应索引处
        while(p2 <= hi){
            arr1[i++] =arr[p2++];
        }
        //把辅助数组中的元素拷贝到原数组中
        for (int j = lo; j <= hi; j++) {
            arr[j] = arr1[j];
        }
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
