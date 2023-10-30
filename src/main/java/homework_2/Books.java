package homework_2;

import java.util.Arrays;

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

    public Publisher getPublisher() {
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
        if(getAuthor()==null && authors!=null){
            System.out.println("Название книги " + getName() + ", автор книги: " + Arrays.toString(getAuthors()) + ", издатель книги: " + getPublisher().getNamePub() + ", город издания: " + getPublisher().getCity() + ", год издания: " + getYear());

        }else if (getAuthor()!=null){
            System.out.println("Название книги " + getName() + ", автор книги: " + getAuthor() + ", издатель книги: " + getPublisher().getNamePub() + ", город издания: " + getPublisher().getCity() + ", год издания: " + getYear());
        }else {
            System.out.println("Название книги " + getName()  + ", издатель книги: " + getPublisher().getNamePub() + ", город издания: " + getPublisher().getCity() + ", год издания: " + getYear());

        }

    }

    public static void printAll(Books... args) {
        for (Books arg : args) {
            arg.print();
        }
    }
}