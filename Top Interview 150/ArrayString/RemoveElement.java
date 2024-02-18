public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                continue;
            }else{
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args){
        int[] arr = {3,2,2,3};
        System.out.println(removeElement(arr));
    }
}
