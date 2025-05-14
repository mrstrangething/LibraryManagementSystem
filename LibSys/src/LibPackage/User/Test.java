package LibPackage.User;

public class Test {
    public static void main(String[] args) {
        // Create a new user using the default constructor
        User user1 = new User();
        user1.setname("John Hughman");
        user1.setContactInfo("123456789");
        user1.getname(); // Print the name of the user
        user1.getContactInfo(); // Print the contact information of the user
        //System.out.println("User ID: " + user1.UserId); // Print the unique ID of the user
        user1.getUserId(); // Print the unique ID of the user
        System.out.println("User ID: " + user1.userId()); // Print the unique ID of the user
    }
        
    
}
