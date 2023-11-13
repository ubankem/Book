import java.util.ArrayList;
public class TestBook {
    public static void main(String[] args) {
         ArrayList<Book> store = new ArrayList<>();
        Book myBook = new Book("Java All-in-One for Dummies", "Doug Lowe", 34.99, "1119986648", 7, 21 );
        Book myBook2 = new Book("Purple Hibiscus", "Chimamanda Ngozi Adichie", 200, "111343567", 8,  10 );
        store.add(myBook);
        store.add(myBook2);
        for (Book aBook: store){
            System.out.println(aBook);
        }
        // System.out.println(group.toString());

        
       

    }
}
