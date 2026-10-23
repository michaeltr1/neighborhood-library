import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //List of Owned Books

        Book[] bookList = {
                new Book(1, "054792822X", "The Hobbit"),
                new Book(2, "059035342X", "Harry Potter"),
                new Book(3, "0441172717", "Dune"),
                new Book(4, "0743273567", "The Great Gatsby"),
                new Book(5, "0061120081", "To Kill a Mockingbird"),
                new Book(6, "0439023521", "The Hunger Games"),
                new Book(7, "0618640150", "The Lord of the Rings"),
                new Book(8, "0141439513", "Pride and Prejudice"),
                new Book(9, "0141439475", "Frankenstein"),
                new Book(10, "014143984X", "Dracula"),
                new Book(11, "0316769487", "The Catcher in the Rye"),
                new Book(12, "0451526341", "Animal Farm"),
                new Book(13, "0062315005", "The Alchemist"),
                new Book(14, "0147514010", "Little Women"),
                new Book(15, "0375842209", "The Book Thief"),
                new Book(16, "0142437247", "Moby-Dick"),
                new Book(17, "0141441143", "Jane Eyre"),
                new Book(18, "0553418025", "The Martian"),
                new Book(19, "0553212419", "Sherlock Holmes"),
                new Book(20, "006440188X", "The Secret Garden")

        };
        //Home screen
        Scanner read = new Scanner(System.in);
        int homeScreen;

        do {
            System.out.println("Welcome to the Home Screen Input #1-3 to Continue ");
            System.out.println(" 1 - if you would like to check out a book that are available!");
            System.out.println(" 2 - Show Checked out Books ");
            System.out.println(" 3 - Exit Home Screen");
            homeScreen = read.nextInt();
            //Pulling up the Lists of Books Im P Sure
            if (homeScreen == 1) {
                for (int i = 0; i < bookList.length; i++) {
                    if (bookList[i].isCheckedOut() == false) {
                        System.out.println(bookList[i].getId() + " " + bookList[i].getIsbn() + " " + bookList[i].getTitle());
                    }}}}
                    while (homeScreen != 3);
                    //pulling data from ids
                    int bookChoice = read.nextInt();




                    }
                }
