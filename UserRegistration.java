import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class User {
    private String name;
    private String email;
    private String password;
    private String address;

    public User(String name, String email, String password, String address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }
}

class UserRepository {
    private List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public boolean isEmailTaken(String email) {
        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }
}

public class UserRegistration {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your Email Address: ");
        String email = scanner.nextLine();
        System.out.print("Enter your Password: ");
        String password = scanner.nextLine();
        System.out.print("Enter your Shipping Address: ");
        String address = scanner.nextLine();
        if (name.isEmpty()||email.isEmpty()||password.isEmpty()||address.isEmpty()) {
            System.out.println("All fields are required.Please try again later.");
        } else if (!isValidEmail(email)) {
            System.out.println("Invalid email address format.Please try again later.");
        } else if (userRepository.isEmailTaken(email)) {
            System.out.println("Email address is already registered use a different email address");
        } else {
            User user = new User(name, email, password, address);
            userRepository.registerUser(user);
            System.out.println("User registration successful!");
        }
        scanner.close();
    }

    private static boolean isValidEmail(String email) {
        String emailRegex = "[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}