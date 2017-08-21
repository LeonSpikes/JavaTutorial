public class Example7 {
    public static void main(String[] args) {

        int imax=1000;
        int i;
        for(i=1; i <= imax; i = i + 1) {
            answer(i);
        }
    }

    public static void answer(int count){
        System.out.println("Diese Methode wurde "+count+" mal aufgerufen.");
    }
}
