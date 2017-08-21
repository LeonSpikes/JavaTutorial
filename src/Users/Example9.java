package Users;

public class Example9 {

    public static void main(String[] args) {

        User user1=new User();
        user1.name = "Max Mustermann";
        user1.admin = false;
        user1.mail = "max@maximann.de";
        user1.pass = "12345678";
        user1.used = true;
        user1.user = "maximann123";
        checkForRoot(user1);
    }

    public static void checkForRoot(User user){

        String type = "Unbekannt";
        String role = "Unbekannt";

        if(user.used == true){
            type = "aktiviert";
        }
        else{
            type = "deaktiviert";
        }

        if(user.admin == true){
            role = "Admin";
        }
        else{
            role = "Standardbenutzer";
        }

        String username = user.user;
        String password = user.pass;
        String email = user.mail;
        String name = user.name;

        System.out.println("Der Benutzer "+username+" mit dem Passwort "+password+" heißt "+name+" und ist ein "+role+".");
        System.out.println("Außerdem ist dieser Benutzer "+type+" und seine e-Mail lautet: "+email);
    }
}
