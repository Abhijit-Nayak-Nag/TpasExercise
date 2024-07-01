package tpas.gl.training.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<String> names= new ArrayList<>();

        names.add("Abhijit");
        names.add("Satyajit");
        names.add("Somyajit");
        names.add("Biswajit");


        List<String> filterName= names.stream().filter(name->!name.startsWith("A")).collect(Collectors.toList());
        System.out.println("Filtered names: " + filterName);
    }
}
