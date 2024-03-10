import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args){
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Physics", 250));
        bookList.add(new Book("Chemistry", 200));
        bookList.add(new Book("English", 190));
        bookList.add(new Book("Maths", 280));
        bookList.add(new Book("Biology", 230));

        Library library = new Library(bookList);
        Iterator iterator = library.createIterator();

        while (iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println("Name: " + book.getBookName());
            System.out.println("Price: " + book.getBookPrice());
        }
    }
}
