
import java.util.Arrays;


public class main {

    public  static void main(String[] args) {

        country.printAll();


        publisher mos = new publisher();
        mos.setNamePub("Проспект");
        mos.setCity("Москва");
        publisher piter = new publisher();
        piter.setNamePub("Питер");
        piter.setCity("Санкт-Петербург");
        publisher bhv = new publisher();
        bhv.setNamePub("БХВ");
        bhv.setCity("Санкт-Петебург");
        publisher kiev = new publisher();
        kiev.setNamePub("Диалектива");
        kiev.setCity("Киев");

        String[] ArrAuthors = new String[]{"Седжвик Роберт", "Уэйн Кевин"};
        publisher[] publishers = new publisher[]{mos, piter, bhv, kiev};

        books book1 = new books("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", ArrAuthors, 2018, piter);
        books book2 = new books("Разработка требований к программному обеспечению. 3-е издание, до- полненное", "Вигерс Карл", 2019, bhv);
        books book3 = new books("Java. Полное руководство, 10-е издание", "Шилдт Герберт", 2018, kiev);
        books book4 = new books("C/C++. Процедурное программирование", "Полубенцева М.И.", 2017, bhv);
        books book5 = new books("Конституция РФ", 2020, mos);

        books[] arrayBook = new books[]{book1, book2, book3, book4, book5};

        for (int i = 0; i < publishers.length; i++) {
            if (publishers[i].getNamePub().equals("Проспект")) {
                if (!publishers[i].getCity().equals("Москва")) {
                    System.out.println("Неверно написан город " + publishers[i].getCity() + ". Изменился вывод у издателя " + publishers[i].getNamePub());
                    publishers[i].setCity("Москва");
                }
            }
            if (publishers[i].getNamePub().equals("Питер")) {
                if (!publishers[i].getCity().equals("Санкт-Петербург")) {
                    System.out.println("Неверно написан город " + publishers[i].getCity() + ". Изменился вывод у издателя " + publishers[i].getNamePub());
                    publishers[i].setCity("Санкт-Петербург");
                }
            }
            if (publishers[i].getNamePub().equals("БХВ")) {
                if (!publishers[i].getCity().equals("Санкт-Петербург")) {
                    System.out.println("Неверно написан город " + publishers[i].getCity() + ". Изменился вывод у издателя " + publishers[i].getNamePub());
                    publishers[i].setCity("Санкт-Петербург");
                }
            }
            if (publishers[i].getNamePub().equals("Диалектика")) {
                if (!publishers[i].getCity().equals("Киев")) {
                    System.out.println("Неверно написан город " + publishers[i].getCity() + ". Изменился вывод у издателя " + publishers[i].getNamePub());
                    publishers[i].setCity("Киев");
                }
            }
            books.printAll(arrayBook);


        }
    }
static class country {
        String name;
        double square;
        double population;
        String name_of_the_capital;
        double population_of_the_capital;


        public country() {
            country[] countries = new country[5];
            countries[0] = new country("Russian", 17.1, 146.7, "Moskow", 12.6);
            countries[1] = new country("Finland", 338, 5.5, "Helsinki", 655);
            countries[2] = new country("France", 643.8, 67.8, "Paris", 2.1);
            countries[3] = new country("Andorra", 467, 85.4, "Andorra la Vella", 22.6);
            countries[4] = new country("Singapore", 725, 5.7);
            System.out.println(Arrays.toString(countries));

        }


        public country(String name, double square, double population, String name_of_the_capital, double population_of_the_capital) {
            setName(name);
            setSquare(square);
            setPopulation(population);
            setName_of_the_capital(name_of_the_capital);
            setPopulation(population_of_the_capital);


        }

        public country(String name, double square, double population) {
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

        public void setCapital(String name_of_the_capital, double population_of_the_capital) {
            setPopulation(population_of_the_capital);
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

        public  static void printAll(country... args) {
            for (country arg : args) {
                System.out.println(arg);
            }
        }

        public String toString() {
            return "name = " + name + ", square = " + square + ", population = " + population + ", name_of_the_capital = " + name_of_the_capital + ", population_of_the_capital = " + population_of_the_capital + "]";
        }

        public static void printAll() {

            country String = new country();


        }
    }


static class publisher {
        String namePub;
        String city;

        public String getNamePub() {
            return namePub;
        }

        public String getCity() {
            return city;
        }

        public void setNamePub(String namePub) {
            if (namePub != null && !namePub.isEmpty()) {
                this.namePub = namePub;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void setCity(String city) {
            if (city != null && !city.isEmpty()) {
                this.city = city;
            } else {
                throw new IllegalArgumentException();
            }
        }
}

static class books {
        String name;
        int year;
        String author;
        String[] authors;
        publisher pub;


        public String getName() {
            return name;
        }

        public int getYear() {
            return year;
        }

        public String[] getAuthors() {
            return authors;
        }

        public String getAuthor() {
            return author;
        }

        public publisher getString() {
            return pub;
        }

        public void getCount() {
            System.out.println(authors.length);
        }

        public String getAuthor(int i) {
            if (authors != null) {
                return authors[i];
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void setName(String name) {
            if (name != null && !name.isEmpty()) {
                this.name = name;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void setAuthor(String author) {
            if (author != null && !author.isEmpty()) {
                this.author = author;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void setAuthors(String[] authors) {
            if (authors == null || authors.length == 0) {
                authors = new String[]{author};
            } else {
                this.authors = authors;
            }
        }

        public void setYear(int year) {
            this.year = year;
            if (year > 0) {
                this.year = year;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void setPublisher(publisher pub) {
            if (pub != null) {
                this.pub = pub;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public books(String name, String author, int year, publisher pub) {
            setName(name);
            setAuthor(author);
            setPublisher(pub);
            setYear(year);
        }

        public books(String name, int year, publisher pub) {
            setName(name);
            setPublisher(pub);
            setYear(year);
        }

        public books(String name, String[] authors, int year, publisher pub) {
            setName(name);
            setAuthors(authors);
            setPublisher(pub);
            setYear(year);

        }

        public void print() {
            System.out.println(name);
            System.out.println(year);
            System.out.println(pub);
            if (authors != null && !name.isEmpty()) {
                System.out.println(Arrays.toString(authors));

            }
        }

        public String toString() {
            return "name = " + name + ", publisher = " + pub + ", year = " + year + ", authors = " + authors + "]";
        }

        public static void printAll(books... args) {
            for (books arg : args) {
                System.out.println(arg);
            }
        }
    }
}

