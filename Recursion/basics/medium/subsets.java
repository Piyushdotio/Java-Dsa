import java.util.ArrayList;
import java.util.List;

public class subsets{
    public static List<List<Integer>> brute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        helper(0, nums, result, current);
        return result;

    }
    public static void helper(int i,int[] nums,List<List<Integer>> result,List<Integer> current){
        if(i==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        //pick
        current.add(nums[i]);
        helper(i+1, nums, result, current);

        //Backtrack : Undo pick
        current.remove(current.size()-1);

        //skip
        helper(i + 1, nums,  result,current);


    }
    public static void main(String[] args){
        System.out.println(brute(new int[]{1,2,3}));
    }
}