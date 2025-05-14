package LibPackage.Books;

public abstract class books implements Lendable {
// Class representing a book in the library system
    
    String isbn;
String title;
String author;
boolean isAvailable;
public boolean lend(User user) {
    // Implement the logic to lend the book to the user
    if (isAvailable) {
        isAvailable = false; // Mark the book as not available
        return false;
    } return true;  }

    @Override
    public void returnbook(User user) {
            // TODO Auto-generated method stub
            isAvailable = true; // Mark the book as available again    
    }
    @Override
    public boolean isAvailable() {
            // TODO Auto-generated method stub
            return false;
    }

    public abstract void displayDetails(); // Abstract method to display book details
}
