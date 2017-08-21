package Users;

public class Example10 {

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

    public static boolean isAdmin(User user){

        if(user.admin == true){
            return true;
        }
        else{
            return false;
        }
    }

    public static String getRole(User user){
        if(isAdmin(user)){
            return "Admin";
        }
        else{
            return "Standardbenutzer";
        }
    }

    public static boolean isEmailValid(User user){

        if(user.mail.contains("@")){
            return true;
        }
        else{
            return false;
        }
    }

    public static void checkForRoot(User user){

        String type = "Unbekannt";
        String role = getRole(user);
        String mailValid = "Unbekannt";

        if(user.used == true){
            type = "aktiviert";
        }
        else{
            type = "deaktiviert";
        }

        if(isEmailValid(user)){
            mailValid = "akzeptiete";
        }
        else{
            mailValid = "nicht akzeptierte";
        }

        String username = user.user;
        String password = user.pass;
        String email = user.mail;
        String name = user.name;

        System.out.println("Der Benutzer "+username+" mit dem Passwort "+password+" heißt "+name+" und ist ein "+role+".");
        System.out.println("Außerdem ist dieser Benutzer "+type+" und seine "+mailValid+" e-Mail lautet: "+email);
    }
}
