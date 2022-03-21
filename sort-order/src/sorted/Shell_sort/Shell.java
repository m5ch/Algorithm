package sorted.Shell_sort;

/**
 * @ Classname Shell
 * @ Description 希尔排序
 * @ Date 2022/3/21 16:33
 * @ Created by 落尘
 */

/*
    排序原理:
    1.选定一个增长量h，按照增长量h作为数据分组的依据，对数据进行分组;
    2.对分好组的每一组数据完成插入排序;
    3.减小增长量，最小减为1，重复第二步操作。
 */
public class Shell {
    //1.排序
    public static void sort(Comparable[] arr){
        //根据数组的长度，确定增长量h的初始值
        int h = 1;
        while(h < arr.length / 2){
//            h *= 2 + 1;
            h = 2 * h + 1;
        }
        //希尔排序
        while (h >= 1) {
            //找到戴待插入的元素
            for (int i = h; i < arr.length; i++) {
                //把待插入的元素插入到有序数列中
                for (int j = i; j >= h ; j -= h) {
                    //待插入的元素是a[j],比较a[j]和a[j-h]
                    if (greater(arr[j - h],arr[j]))
                        exch(arr,j-h,j);
                    else
                        break;
                }
            }
            h /= 2;
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
