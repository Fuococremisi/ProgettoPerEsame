import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){

        String nome="pizza";
        String ricetta="ricetta pizza";
        List<Ingrediente> ingredienti= new ArrayList<>();
        double prezzo= 6.50;


        Piatto pizza= new Piatto(nome, ricetta, ingredienti, prezzo);
        pizza.addIngrediente();
        System.out.println("ORA CONTROLLO SE HANNO TUTTI GLI INGREDIENTI");
        List<Ingrediente> listaconveniente= pizza.getIngredienti();
        for (Ingrediente i : listaconveniente)
            System.out.println("{"+i.toString()+"}");

    }
}
