import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //CREAZIONE INGREDIENTI
        /*
        String nome="pizza";
        String ricetta="ricetta pizza";
        ArrayList<Ingrediente> ingredienti= new ArrayList<>();
        double prezzo= 6.50;


        Piatto pizza= new Piatto(nome, ricetta, ingredienti, prezzo);
        pizza.addIngrediente();

        ArrayList<Ingrediente> listaconveniente= pizza.getIngredienti();
        System.out.println("ARRAYLISTA INGREDIENTI");
        for (Ingrediente i : listaconveniente)
            System.out.println("{"+i.getNome()+" - "+i.getTipologia()+" - "+i.getGrammi() +"}");
        */

        //CREAZIONE PIATTI
        Scanner sc= new Scanner(System.in);
        int numMenu = 2;

        ArrayList<Piatto> menu= new ArrayList<>();

        for(int i=0; i<numMenu; i++){

            System.out.println("NOME PIATTO");
            String nomePiatto= sc.nextLine();

            System.out.println("RICETTA");
            String ricetta= sc.nextLine();

            System.out.println("INGREDIENTI");
            ArrayList<Ingrediente> ingreientiPiatto= new ArrayList<>();

            System.out.println("PREZZO");
            double prezzoPiatto= sc.nextDouble();
            sc.nextLine();



            Piatto questoPiatto= new Piatto(nomePiatto, ricetta, ingreientiPiatto, prezzoPiatto);
            menu.add(questoPiatto);
        }
        for (Piatto p: menu)
            System.out.println("[ " + p.getNome().toUpperCase() + " - " + p.getRicetta() + " - " +"€"+ p.getPrezzo() + " ]");

    }
}
