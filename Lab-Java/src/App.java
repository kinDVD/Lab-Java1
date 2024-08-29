import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.List;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

Boolean run = true;

    //Array of students
    ArrayList<String> travelerNames = new ArrayList<>(List.of("Yuppy", "Yumi", "Yuri", "Yu-Gi-Oh", "Yurnext", "Yogurt", "Yoda"));
    
    //Hashset of countries visited
    ArrayList<HashSet<String>> countriesVisited = new ArrayList<>(); 
    countriesVisited.add(new HashSet<>(List.of("Democratic People's Republic of Korea", "Turkmenistan", "Iran", "Libya"))); 
    countriesVisited.add(new HashSet<>(List.of("Catistan", "Cathaven", "Catterlands", "Kittya", "Other Mother's Domain", "Portugal"))); 
    countriesVisited.add(new HashSet<>(List.of("Japan", "Brazil", "USA", "Spain")));
    countriesVisited.add(new HashSet<>(List.of("South Korea", "Japan", "Malaysia", "Singapore", "Thailand")));
    countriesVisited.add(new HashSet<>(List.of("Canada")));
    countriesVisited.add(new HashSet<>(List.of("Greece", "India", "Russia", "Australia")));
    countriesVisited.add(new HashSet<>(List.of("Coruscant", "Dagobah", "Kashyyyk", "Florida")));
    while(run){
    //Lists travelers
    System.out.println("Here is the current list of travelers:");
    for(String n: travelerNames){
        System.out.println(n);
    }

    //Menu
    System.out.println("Would you like to:");
    System.out.println("search for people who visited a country? ENTER: NAMES");
    System.out.println("add a country to a traveler's set of countries? ENTER: ADD");
    System.out.println("list all countries a person has visited? ENTER: COUNTRIES");
    System.out.println("or quit? ENTER: QUIT");
    String response = sc.nextLine().toLowerCase();
    System.out.print("\033\143");
    //COUNTsc.nextLine();

    //display travelers who visited a country
    if(response.equals("names")){
        displayTravelers(travelerNames, countriesVisited);
}
    //adds country to traveler
    else if(response.equals("add")){
        addCountry(travelerNames, countriesVisited);
    }

    //displays countries visited by particular traveler
    else if(response.equals("countries")){
        displayCountries(travelerNames, countriesVisited);
    }
    else if(response.equals("quit")){
        run = false;
    }
    else{
        System.out.println("Please enter a valid response");
        response = sc.nextLine();
    }

}

/*Extended Challenges:
2 Points: Start with a list of allowed countries. When the user adds a country, check if the country is in the list; if not, print out a message stating so.
2 Points: Allow the input to be case-insensitive when searching for names or countries. */
   sc.close(); 
}
static void displayTravelers(ArrayList<String> travelerNames, ArrayList<HashSet<String>> countriesVisited){
    {
        System.out.print("\033\143");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a country name:");
        String countryName = sc.nextLine();
        
        for(int i = 0; i < countriesVisited.size(); i++){
            if(countriesVisited.get(i).contains(countryName)){
                System.out.println(travelerNames.get(i));
            }
        }
    }
}
static void addCountry(ArrayList<String> travelerNames, ArrayList<HashSet<String>> countriesVisited){
    {
        System.out.print("\033\143");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of the traveler.");
        String traveler = sc.nextLine();
        int t = travelerNames.indexOf(traveler);
        
        System.out.println(String.format("You selected %s", traveler, "."));
        System.out.println("They have visited:");
      
            HashSet<String> tCountries = countriesVisited.get(t);
            for(String trC: tCountries){
                System.out.println(trC);
            }
        
        System.out.println("Please enter a country to add to the list.");
        String addCountry = sc.nextLine();
        countriesVisited.get(t).add(addCountry);
    }
}
static void displayCountries(ArrayList<String> travelerNames, ArrayList<HashSet<String>> countriesVisited){
    System.out.print("\033\143");
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the name of the traveler.");
    String traveler = sc.nextLine();
    int t = travelerNames.indexOf(traveler);
        
    System.out.println(String.format("You selected %s", traveler, "."));
    System.out.println("They have visited:");
        HashSet<String> tCountries = countriesVisited.get(t);
        for(String trC: tCountries){
            System.out.println(trC);
        }
    
}
}
