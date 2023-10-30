package homework_1;


import java.util.Arrays;


public class main {

    public static void main(String[] args) {
        Country[] countries = new Country[5];
        countries[0] = new Country("Russian", 17.1, 146.7, "Moskow", 12.6);
        countries[1] = new Country("Finland", 0.338, 5.5, "Helsinki", 0.655);
        countries[2] = new Country("France", 0.6438, 67.8, "Paris", 2.1);
        countries[3] = new Country("Andorra", 0.467, 0.0854, "Andorra la Vella", 0.0226);
        countries[4] = new Country("Singapore", 0.725, 5.7);
        Country.printAll(countries);

    }
}



