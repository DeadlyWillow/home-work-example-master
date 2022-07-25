package ru.skypro.homework09;

public class Main {

    public static void main(String[] args) {
        Book eugeneOnegin = new Book("Eugene Onegin", "Alexander Sergeevich Pushkin", 1833);
        System.out.println(eugeneOnegin);
        Author pushkin = new Author("Alexander", "Pushkin");
        System.out.println(pushkin);
        eugeneOnegin.setYear(2021);
        System.out.println("setYear() = " + eugeneOnegin.getYear());

        Book childhood = new Book("Childhood", "Lev Nikolayevich Tolstoy", 1852);
        Author tolstoy = new Author("Lev", "Tolstoy");
        Author tolstoy2 = new Author("Lev", "Tolstoy");
        System.out.println(childhood);
        System.out.println(tolstoy);

        System.out.println("Author equal: " + pushkin.equals(tolstoy));
        System.out.println("Author equal by hashCode: " + pushkin.equals(tolstoy));
        System.out.println("Author copies equal: " + tolstoy.equals(tolstoy2));
        System.out.println("Author copies equal by hashCode: " + tolstoy.equals(tolstoy2));
    }
}
