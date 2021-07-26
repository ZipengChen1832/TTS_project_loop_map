import java.util.*;

public class car_dealer {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Map<String, String> car = new HashMap<>();
        car.put("Civic","Honda");
        car.put("HR-V","Honda");
        car.put("Accord","Honda");
        car.put("Model 3","Tesla");
        car.put("Model S","Tesla");
        car.put("Model X","Tesla");
        car.put("Model Y","Tesla");

        System.out.println("Dear costumer, model are you looking for?");
        String model = input.nextLine();
        if(car.containsKey(model)){
            System.out.println("Oh, you are looking for a "+model+"? Our "+car.get(model)+" selection is right here");
        }
        else
            System.out.println("Sorry, we currently don't have "+model+" here.");
    }
}
