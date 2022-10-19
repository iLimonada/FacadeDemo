public class Burguer extends Produto {
    private int gramas;

    public int getGramas() {
        return gramas;
    }

    public void setGramas(int gramas) {
        this.gramas = gramas;
    }


    public Burguer(String descricao, double preco, int gramas) {
        super(descricao, preco);
        setGramas(gramas);
    }
}