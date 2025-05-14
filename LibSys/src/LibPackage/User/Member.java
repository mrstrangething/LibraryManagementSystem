package LibPackage.User;
import java.util.*;

public class Member extends User {
    private int borrowedBooksCount;
    private int MAX_BORROW_LIMIT = 5; // Maximum number of books a member can borrow

    @Override
    void displayDashboard() {
        
        System.out.println("Member Dashboard:");
        System.out.println("Borrowed Books Count: " + borrowedBooksCount);
    }
    
    @Override
    public boolean canBorrowBooks() {
        if (borrowedBooksCount < MAX_BORROW_LIMIT) {
            return true;
        } else {
            return false;
        }
    }
   
    public Member(String name, String contactInfo) {
        super(name, contactInfo); // Call the constructor of the User class
        this.borrowedBooksCount = 0; // Initialize borrowed books count to 0
    }

}
