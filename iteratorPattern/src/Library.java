import java.util.List;

public class Library implements Aggregator{
    //other can use this aggreagtor interface to create iterator and then travel across it
    private List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(bookList);
    }
}
