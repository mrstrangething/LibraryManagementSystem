package LibPackage.User;


import java.util.*;


public abstract class User {
    private String name; // Name of the user
    private String UserId;// Unique ID of the user
    private String contactInfo; // Contact information of the user
   // private static int uniqueId = 0; // Static variable to keep track of unique IDs

        public User (){
            // uniqueId++; // Increment the unique ID counter
            //     this.UserId =  String.valueOf(uniqueId); // Generate a unique ID for the user
                this.UserId = String.valueOf(generateUniqueId()); // Generate a unique ID for the user
        }

        private int generateUniqueId() {
            return 0;
        }
            
        public String userId() { // Method to get the unique ID of the user
                    return UserId; // Return the unique ID of the user
                }

        public User(String name, String contactInfo) {// Constructor to initialize user details
           this.name = name;   // Set the name of the user
           this.contactInfo = contactInfo;// Set the contact information of the user
        }

        public void setname(String name) { // Setter method for name
           this.name = name;
        }
       public void setContactInfo(String contactInfo) { // Setter method for contact information
            this.contactInfo = contactInfo;
       }
    public void getname() { // Getter method for name
        System.out.println("Name: " + name);
       }
    public void getContactInfo() { // Getter method for contact information
        System.out.println("Contact Info: " + contactInfo);
        }
        public int getUserId() { // Getter method for unique ID
            return Integer.parseInt(UserId); // Return the unique ID of the user as an integer
        }
        public String getName() { // Getter method for name
            return name; // Return the name of the user
        }
    
    public User(User user1) { // Copy constructor to create a new user object from an existing one
        this.name = user1.name; // Copy the name from the existing user
        this.UserId = user1.UserId; // Copy the unique ID from the existing user
        this.contactInfo = user1.contactInfo; // Copy the contact information from the existing user
    }
    
    abstract void displayDashboard();
    abstract boolean canBorrowBooks();


}
