public class Ingrediente {
    private String tipologia;
    private String nome;
    private int grammi;

    public Ingrediente(String nome, int grammi, String tipologia) {
        this.nome = nome;
        this.grammi = grammi;
        this.tipologia = tipologia;
    }


    //GETTER
    public String getNome() {
        return nome;
    }

    public int getGrammi() {
        return grammi;
    }
    public String getTipologia() { return tipologia; }

    //SETTER
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGrammi(int grammi) {
        this.grammi = grammi;
    }
}
