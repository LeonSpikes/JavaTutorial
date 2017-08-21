package Users;

public class Example8 {
    public static void main(String[] args) {

        User user1=new User();
        user1.name="Max";
        answer(user1);
    }

    public static void answer(User user){

        System.out.println("Der Benutzer heißt "+user.name+".");
    }
}
