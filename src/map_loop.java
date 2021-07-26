import java.util.*;


public class map_loop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        for(int i=0;i<5;i++){
            System.out.print("Enter number "+(i+1)+": ");
            nums.add(input.nextInt());
        }

        int sum = 0, max = nums.get(0), min=nums.get(0), product = 1;
        for(int num : nums){
            sum += num;
            product *= num;
            if(num>max)
                max = num;
            if(num<min)
                min = num;
        }

        System.out.println("The sum of the numbers is "+sum);
        System.out.println("The product of the numbers is "+product);
        System.out.println("The largest number is "+max);
        System.out.println("The smallest number is "+min);

    }
}
