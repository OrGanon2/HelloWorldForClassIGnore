package HomeTask.BooksTask;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        List<Book> booksLists = new ArrayList<>();

        Book book1 = new Book();
        book1.setName("little Ofir");
        book1.setPrice(500);
        book1.setPagesAmount(300);

        Book book2 = new Book();
        book2.setName("the path of shadow ");
        book2.setPrice(100);
        book2.setPagesAmount(306);

        Book book3 = new Book();
        book3.setName("The witcher");
        book3.setPrice(100);
        book3.setPagesAmount(225);

        booksLists.add(book1);
        booksLists.add(book2);
        booksLists.add(book3);

        printBookInformation(booksLists);
    }
    public static void printBookInformation(List<Book> books ){
        for (Book book : books) {
            System.out.println("book infromation ");
            System.out.println("title: " + book.getName());
            System.out.println("Page Amount: " + book.getPagesAmount());
            System.out.println();

        }

    }

}

