

public class main {
    public static void main(String args[]) {
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
        } catch (NullPointerException e)
        {

            System.out.println("O frase inicial está nula,default.");
                frase = "Frase vazia";
                novaFrase = frase.toUpperCase();
        }
        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }
}