public class Example5 {

    public static void main(String[] args) {



        boolean check = true;

        if(check == true){
            answer("correct");
        }
        else{
            answer("incorrect");
        }
    }

    public static void answer(String text) {
        System.out.println("Your answer is "+text);
    }
}
