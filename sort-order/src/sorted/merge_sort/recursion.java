package sorted.merge_sort;

/**
 * @ Classname recursion
 * @ Description 递归
 * @ Date 2022/3/21 19:45
 * @ Created by 落尘
 */
public class recursion {
    public static void main(String[] args) {
        long a = 5;
        System.out.println(fun(a));
    }
    
    private static long fun(long a){
        if (a == 1 || a ==0)
            return 1;
        else{
            return fun(a - 1) * a;
        }
    }
}
