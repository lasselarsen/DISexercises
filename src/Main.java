public class Main {

    public static void main(String[] args) {
        String myUsername = "lasselarsen";
        String myPassword = "20zsky2I";

        if(!User.validateUsername(myUsername)) {
            System.out.println("Username doesn't fit the rules. Please check the User class.");
        } else {
            User u = new User(myUsername, User.hashPassword(myPassword));
            System.out.println(u);
        }
    }
}
//Lasse is the best man hehe
