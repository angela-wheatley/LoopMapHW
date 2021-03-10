import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LoopExercise
{

    public static void main(String[] args)
    {
        
        List<Integer> numbers = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Input a number: ");
            Integer value = Integer.parseInt(input.nextLine());
            numbers.add(value);
        }
        
        System.out.println(numbers);
        
        int sum = 0;
        for(int i = 0; i < numbers.size(); i++)
        {
            sum += numbers.get(i);
        }
        
        System.out.println("Sum of the elements of the array: " + sum);
        
        int product = 1;
        for(int i = 0; i < numbers.size(); i++)
        {
            product *= numbers.get(i);
        }
        
        System.out.println("Product of the elements of the array: " + product);
        
        int max = numbers.get(0);
        for(int i = 0; i < numbers.size(); i++)
        {
            if(numbers.get(i) > max) 
                {
                    max = numbers.get(i);
                }
        }
        
        System.out.println("Largest of the elements of the array: " + max);
        
        int min = numbers.get(0);
        for(int i = 0; i < numbers.size(); i++)
        {
            if(numbers.get(i) < min) 
                {
                    min = numbers.get(i);
                }
        }
        
        System.out.println("Smallest of the elements of the array: " + min);
        
    }

}
