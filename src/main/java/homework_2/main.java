package homework_2;

import java.util.Arrays;

public class main{

    public static void main(String[] args) {
        Publisher mos = new Publisher();
        mos.setNamePub("Проспект");
        mos.setCity("Москва");
        Publisher piter = new Publisher();
        piter.setNamePub("Питер");
        piter.setCity("Санкт-Петербург");
        Publisher bhv = new Publisher();
        bhv.setNamePub("БХВ");
        bhv.setCity("Санкт-Петебург");
        Publisher kiev = new Publisher();
        kiev.setNamePub("Диалектива");
        kiev.setCity("Киев");

        String[] ArrAuthors = new String[]{"Седжвик Роберт", "Уэйн Кевин"};
        Publisher[] publishers = new Publisher[]{mos, piter, bhv, kiev};

        Books book1 = new Books("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", ArrAuthors, 2018, piter);
        Books book2 = new Books("Разработка требований к программному обеспечению. 3-е издание, до- полненное", "Вигерс Карл", 2019, bhv);
        Books book3 = new Books("Java. Полное руководство, 10-е издание", "Шилдт Герберт", 2018, kiev);
        Books book4 = new Books("C/C++. Процедурное программирование", "Полубенцева М.И.", 2017, bhv);
        Books book5 = new Books("Конституция РФ", 2020, mos);

        Books[] arrayBook = new Books[]{book1, book2, book3, book4, book5};

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
            Books.printAll(arrayBook);


        }
    }
}


class Publisher {
    private String namePub;
    private String city;

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

class Books {
    private String name;
    private int year;
    private String author;
    private String[] authors;
    private Publisher pub;


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

    public Publisher getString() {
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

    public void setPublisher(Publisher pub) {
        if (pub != null) {
            this.pub = pub;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Books(String name, String author, int year, Publisher pub) {
        setName(name);
        setAuthor(author);
        setPublisher(pub);
        setYear(year);
    }

    public Books(String name, int year, Publisher pub) {
        setName(name);
        setPublisher(pub);
        setYear(year);
    }

    public Books(String name, String[] authors, int year, Publisher pub) {
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

    public static void printAll(Books... args) {
        for (Books arg : args) {
            System.out.println(arg);
        }
    }
}

