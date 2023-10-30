package homework_1;

class Country {
    private String name;
    private double square;
    private double population;
    private String name_of_the_capital;
    private double population_of_the_capital;


    public Country(String name, double square, double population, String name_of_the_capital, double population_of_the_capital) {
        setName(name);
        setSquare(square);
        setPopulation(population);
        setName_of_the_capital(name_of_the_capital);
        setPopulation_of_the_capital(population_of_the_capital);
    }

    public Country(String name, double square, double population) {
        setName(name);
        setSquare(square);
        setPopulation(population);
    }

    public String getName() {
        return name;
    }

    public double getSquare() {
        return square;
    }

    public double getPopulation() {
        return population;
    }

    public String getName_of_the_capital() {
        return name_of_the_capital;
    }

    public double getPopulation_of_the_capital() {
        return population_of_the_capital;
    }

    public double getDensity() {
        return population / square;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setSquare(double square) {
        if (square > 0) {
            this.square = square;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setPopulation(double population) {
        if (population > 0) {
            this.population = population;
        } else {
            throw new IllegalArgumentException();
        }

    }

    public void setName_of_the_capital(String name_of_the_capital) {
        if (name_of_the_capital != null && !name_of_the_capital.isEmpty()) {
            this.name_of_the_capital = name_of_the_capital;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setPopulation_of_the_capital(double population_of_the_capital) {
        if (population_of_the_capital > 0) {
            this.population_of_the_capital = population_of_the_capital;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setCapital(String name_of_the_capital, double population_of_the_capital) {
        setPopulation_of_the_capital(population_of_the_capital);
        setName_of_the_capital(name_of_the_capital);
    }

    public void print() {
        System.out.println(name);
        System.out.println(square);
        System.out.println(population);
        if (name_of_the_capital != null && !name.isEmpty()) {
            System.out.println(name_of_the_capital);
            System.out.println(population_of_the_capital);
        }
    }

    public static void printAll(Country... args) {
        for (Country arg : args) {
            System.out.println(arg);
        }
    }

    public String toString() {
        return "name = " + name + ", square = " + square + " млн.кв.км., population = " + population + " млн. чел., name_of_the_capital = " + name_of_the_capital + ", population_of_the_capital = " + population_of_the_capital + " млн. чел.]";
    }
}


