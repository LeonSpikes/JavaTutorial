public class Example4 {

    //psvm
    public static void main(String[] args) {

        boolean check = true;

        if(check == true){
            correct();
        }
        else{
            incorrect();
        }
    }

    public static void correct(){
        String textt = "Richtig";
        System.out.println(textt);
    }

    public static void incorrect(){
        String textf = "Falsch";
        System.out.println(textf);
    }
}
