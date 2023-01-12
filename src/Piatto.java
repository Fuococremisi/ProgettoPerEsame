
import java.util.ArrayList;
import java.util.Scanner;

public class Piatto {

    private String nome;
    private String ricetta;
    private ArrayList<Ingrediente> ingredienti;
    private double prezzo;
    private float quantitaIngrediente;

    public ArrayList<Ingrediente> addIngrediente(){
        Scanner sc= new Scanner(System.in);
        boolean b=true;

        String nome;
        int grammi;
        String tipologia;

        do {
            System.out.println("INSERIRE NOME INGREDIENTE");
            nome=sc.nextLine();
            System.out.println("INSERIRE TIPOLOGIA INGREDIENTE\n" + "VEGANO - VEGETARIANO - NORMALE");
            tipologia=sc.nextLine();
            System.out.println("INSERIRE QUANTITA' IN GRAMMI DELL'INGREDIENTE");
            grammi = sc.nextInt();
            sc.nextLine();

            Ingrediente questoIngrediente = new Ingrediente(nome, grammi, tipologia);
            ingredienti.add(questoIngrediente);
            System.out.println("->QUESTO INGREDIENTE-> {" + questoIngrediente.getNome() +" - " + questoIngrediente.getTipologia() + questoIngrediente.getGrammi() +"}");

            System.out.println("INSERIRE NUOVO INGREDIENTE? y/n");
            String risposta = sc.nextLine().toUpperCase();

            if(risposta.equals("N")) {
                b = false;
            }
        }while (b==true);
     return ingredienti;
    }

    public static boolean PiattoVegano (){
        return true;
    }

    public Piatto(String nome, String ricetta, ArrayList<Ingrediente> ingredienti, double prezzo) {
        this.nome = nome;
        this.ricetta = ricetta;
        this.ingredienti = ingredienti;
        this.prezzo = prezzo;
    }

    //GETTER
    public String getNome() {
        return nome;
    }

    public String getRicetta() {
        return ricetta;
    }

    public ArrayList<Ingrediente> getIngredienti() {
        return ingredienti;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public float getQuantitaIngrediente() {
        return quantitaIngrediente;
    }

    //SETTER
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRicetta(String ricetta) {
        this.ricetta = ricetta;
    }

    public void setIngredienti(ArrayList<Ingrediente> ingredienti) {
        this.ingredienti = ingredienti;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setQuantitaIngrediente(float quantitaIngrediente) {
        this.quantitaIngrediente = quantitaIngrediente;
    }
}



