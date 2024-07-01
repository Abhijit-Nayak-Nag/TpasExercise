package tpas.gl.training.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalMapDemo {
    public static void main(String[] args) {
        // Create a map with some key-value pairs
        Map<String, String> map = new HashMap<>();
        map.put("name", "Abhijit");
        map.put("city", "Nagpur");
        map.put("profession", "SWE");

        // Retrieve and print the value for a key that exists
        String existingKey = "name";
        Optional<String> existingValue = getValueFromMap(map, existingKey);
        System.out.println(existingKey + ": " + existingValue.orElse("Key not found"));

        // Retrieve and print the value for a key that does not exist
        String nonExistingKey = "age";
        Optional<String> nonExistingValue = getValueFromMap(map, nonExistingKey);
        System.out.println(nonExistingKey + ": " + nonExistingValue.orElse("Key not found"));

        // Using ifPresent to perform an action if the value is present
        existingValue.ifPresent(value -> System.out.println("Existing value in uppercase: " + value.toUpperCase()));
    }

       public static Optional<String> getValueFromMap(Map<String, String> map, String key) {
        return Optional.ofNullable(map.get(key));
       }
}
