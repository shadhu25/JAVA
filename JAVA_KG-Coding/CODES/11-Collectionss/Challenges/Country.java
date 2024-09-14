package _12Collectionss.Challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Country {
    public static void main(String[] args) {
        Map<String,String> countryMap=new HashMap<>();
        countryMap.put("Bharat","New Delhi");
        countryMap.put("Bangladesh","Dhaka");
        countryMap.put("Pakistan","Islamabad");
        countryMap.put("Nepal","Kathmandu");
        countryMap.put("Sri Lanka","colombo");

        System.out.print("Enter the country name: ");
        Scanner input=new Scanner(System.in);
        String country=input.nextLine();
        if(countryMap.containsKey(country))
            System.out.printf("Capital of the %s is %s",country,countryMap.get(country));
        else
            System.out.println("we don't know");

    }
}
