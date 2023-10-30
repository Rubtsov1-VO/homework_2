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
