import java.util.ArrayList;

class Question2 {
    
    public static void removeSmallest(ArrayList<Integer> nums) {
        //This method removes the smallest number in the list nums
        int min = nums.get(0);
        int index = 0;
        for(int i = 0; i < nums.size(); i++) {
           min = Math.min(min, nums.get(i));
        }
        for(int j = nums.size() - 1; j >= 0; j--) {
           if(nums.get(j) == min) nums.remove(j); 
        }
    }
  
    public static void main (String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            nums.add( (int) (Math.random()*100) );
        }
        
        System.out.println("Our list before: " + nums);
        removeSmallest(nums); 
        System.out.println("Our list after:  " + nums);
    }
    
    
}
