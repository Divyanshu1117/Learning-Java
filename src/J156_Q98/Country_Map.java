package J156_Q98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Country_Map {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("Bharat", "New Delhi");
        countryMap.put("China", "Beijing");
        countryMap.put("Pakistan", "Islamabad");
        countryMap.put("Sri Lanka", "Colombo");
        countryMap.put("Bangladesh", "Dhaka");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the country name: ");
        String country = input.next();
        if (countryMap.containsKey(country)) {
            System.out.printf("Capital of %s is %s. ", country, countryMap.get(country));
        } else {
            System.out.println("Sorry We don't know the capital");
        }
    }
}