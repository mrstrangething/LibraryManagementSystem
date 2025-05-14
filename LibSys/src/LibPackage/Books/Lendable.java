package LibPackage.Books;

public interface Lendable {

    boolean isAvailable(); // Check if the item is available for lending

    void lend(); // Lend the item to a user

    void returnbook(); // Return the item after lending
 
}
