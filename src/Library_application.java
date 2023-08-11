import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

class Book2{
    String name;
    String gener;
    String author;

    public Book2(String name, String gener, String author){
        this.name = name;
        this.gener = gener;
        this.author = author;
    }
}
class Library{
    ArrayList<Book2> list1 = new ArrayList<>();
    Library(){
        this.list1 = new ArrayList<>();
    }
    void addBook(Book2 obj1){
        list1.add(obj1);

    }
}

public class Library_application {

    public static void main(String[] args) {



        Book2 book1 = new Book2("book1", "fantsy_123", "Aslam");
        Book2 book2 = new Book2("book2", "fiction_456", "Akram");
        Book2 book3 = new Book2("book2", "fiction_456", "Ajaz");

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);


        for (int i = 0; i < library.list1.size(); i++) {
            Book2 currentBook = library.list1.get(i);
            System.out.println("Book Name: " + currentBook.name);
            System.out.println("Genre: " + currentBook.gener);
            System.out.println("Author: " + currentBook.author);
            System.out.println("...................."); // Add an empty line for separation
        }
/////////////////////////////////////////////////////////////////////////
        /////////////////////      Or Or Or Or OrOr Or Or Or Or Or Or Or Or Or Or

//        for (Book2 book : library.list1) {
//            System.out.println("Book Name: " + book.name);
//            System.out.println("Genre: " + book.gener);
//            System.out.println("Author: " + book.author);
//            System.out.println(); // Add an empty line for separation
//        }






    }
}