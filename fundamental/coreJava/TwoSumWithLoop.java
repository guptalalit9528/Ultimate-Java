package coreJava;

public class TwoSumWithLoop {
    public static void main(String[] args) {
        int nums[]={2,5,11,15,7};
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==9){
                    System.out.println("output is right:"+nums[i]+" "+nums[j]);

                }
                else{
                    System.out.println("output is wrong:"+nums[i]+" "+nums[j]);
                    break;
                }
            }
        }
    }
}
