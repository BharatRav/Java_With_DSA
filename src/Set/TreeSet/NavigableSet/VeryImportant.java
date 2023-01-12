package Set.TreeSet.NavigableSet;
//GFG Link;-https://practice.geeksforgeeks.org/problems/86e609332c9ef4f6b8aa79db11a6c0808c4a1bca/1
import java.util.NavigableSet;
import java.util.TreeSet;

public class VeryImportant {
    static long minimizeSum(int N, int arr[]) {

        //Universal safe two if condition
        if (arr==null|| N==0) return 0;
        if (N==1) return arr[0];
        //now logic part    with TreeSet

        NavigableSet<Integer> treeSet = new TreeSet<>();

        for (int value: arr) {
            treeSet.add(value);
        }

        long sum=0;
        while (!treeSet.isEmpty()) {
            int data1 =treeSet.pollFirst();
            int data2 =treeSet.pollFirst();
            sum+=data1+data2;
            if (treeSet.isEmpty()){
                break;      //its needed else you get null vlue ininteger type error
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr ={1,3,7,6,5};
        int[] arr2= {4,5,4,1,3,7,6,3,3};
//        System.out.println(minimizeSum(5,arr));
        System.out.println(minimizeSum(9,arr2));
    }
    ////This Solution is only when you want an element occurecer only onece 3 is used only once
}
