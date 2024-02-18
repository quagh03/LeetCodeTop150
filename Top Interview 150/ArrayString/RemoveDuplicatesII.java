public class RemoveDuplicatesII {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(i < nums.length - 2){
                if(nums[i] != nums[i+2]){
                    nums[k] = nums[i];
                    k++;
                }else{
                    continue;
                }
            }else{
                nums[k] = nums[i];
                k++;
            }
        }
        return k;    
    }

    public static void main(String[] args){

    }
}
