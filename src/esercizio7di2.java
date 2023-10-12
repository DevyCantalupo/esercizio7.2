public class esercizio7di2 {
    public static boolean pariOdispari(int a){
        boolean x = a % 2 == 0 || !(a % 2 != 0);
        return x;
    }
    public static void main(String[] args) {
        boolean risultato = pariOdispari(3);
        System.out.println("risultato = " + risultato);
    }
}
