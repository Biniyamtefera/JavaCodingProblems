package StreamJava8IQ.MapMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamMap {
    //will transform the data from the source by applying operation store in another collection or apply another method
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus","Car","bicycle","flight", "train");
        //convert the list of vehicles in upper cases and store in another collection
        //Before Java 8 without using stream
        List<String> upperVehicles = new ArrayList<>();
        for(String name : vehicles) {
            upperVehicles.add(name.toUpperCase());
        }
        System.out.println(upperVehicles);

        //Let us now use Stream   Stream -----> map
        List<String> upperVehicles2 = vehicles.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperVehicles2);
        System.out.println("***To print without storing in another collection***");
        vehicles.stream().map(name ->name.toUpperCase()).forEach(str -> System.out.println(str));
    }
}
