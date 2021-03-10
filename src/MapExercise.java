import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExercise
{

    public static void main(String[] args)
    {
        Map<String, String> cars = new HashMap<>();
        
        cars.put("Civic", "Honda");
        cars.put("Soul", "Kia");
        cars.put("CR-V", "Honda");
        cars.put("Elantra", "Hyundai");
        cars.put("Mustang", "Ford");
        cars.put("Camaro", "Chevrolet");
        cars.put("Prius", "Toyota");
        cars.put("Wrangler", "Jeep");

        System.out.println(cars);
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("What car model are you looking for?");
        String customerModel = input.nextLine();
        
        if(cars.containsKey(customerModel))
        {
            System.out.print("Oh, you're looking for a " + customerModel + "? Our " + cars.get(customerModel) + " selection is right over here.");
        }
        else
        {
            System.out.print("Sorry, we don't have any " + customerModel + "s.");
        }
    }

}
