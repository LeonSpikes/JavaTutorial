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
        String textt = "correct";
        System.out.println(textt);
    }

    public static void incorrect(){
        String textf = "incorrect";
        System.out.println(textf);
    }
}
