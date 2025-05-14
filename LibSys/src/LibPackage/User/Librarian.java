package LibPackage.User;

public class Librarian extends User {
    private String employeeNumber; // Unique ID of the librarian
    
    void displayDashboard() {
        System.out.println("Librarian Dashboard:");
        System.out.println("Employee Number: " + employeeNumber);
    }
    public boolean canBorrowBooks() {
        return true; // Librarians cannot borrow books
    }
    void addNewBook(books book){

    }

    void removeBook(books book){

    }
}
