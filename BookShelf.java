import java.util.ArrayList;

public class BookShelf {
    
    private int max_capacity;
    private ArrayList<Book> books;

    public BookShelf(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book newBook){
        books.add(newBook);

    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public Boolean isBookInShelf(Book book){
        return books.contains(book);
    }

    public void displayBook(Book book) {
        int index = books.indexOf(book);
        if (index >= 0) {
            Book retrievedBook = books.get(index);
            System.out.println(retrievedBook.toString());
        }
        else{
            System.out.println("Book not found.");
        }
    }

        public void displayAllBooks(){
            for (Book aBook : books){
            System.out.println(aBook.toString());
            }
        }

        public static void main(String[] args) {
            BookShelf bookShelf = new BookShelf();
            Book myBook1 = new Book(" Java All-in-One for dummies", "Doug Lowe", 27.6421, "1119986648", 7, 21.0 );
            Book myBook2 = new Book("Mastering Java", "William Buchanan", 7.028165546775, "NA", 1998, 81.0);
            Book myBook3 = new Book("Java in easy steps", "Mike Mcgrath", 10.99, "029574426X", 7, 10.0);
            Book myBook4 = new Book("Effective Java", "Joshua Bloch", 40.49, "0134685997", 3, 6.0);
            bookShelf.addBook(myBook1);
            bookShelf.addBook(myBook2);
            bookShelf.addBook(myBook3);
            bookShelf.addBook(myBook4);
           
            System.out.println("All Books:");
            bookShelf.displayAllBooks();
            System.out.println("Deleting book");
            bookShelf.removeBook(myBook4);
            System.out.println("\nList of books after removal");
            bookShelf.displayAllBooks();

            

        }




    
}
