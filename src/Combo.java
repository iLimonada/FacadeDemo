public class Combo{

    private Bebida bebida ;
    private Burguer burguer;
    private Sobremesa sobremesa;

    public void CriarCombo(int escolha) {
        if(escolha == 1){
            burguer = new Burguer("BigBrasille", 22.50, 350);
            bebida = new Bebida("Guarana", 5.00, 350);
            sobremesa = new Sobremesa("Batata Frita", 7.00, "200ml");
        }
        if(escolha == 2){
        burguer = new Burguer("BigAmerica", 22.50, 350);
        bebida = new Bebida("Coca-Cola", 5.00, 350);
        sobremesa = new Sobremesa("Sorvete", 7.00, "200ml");
        }
    }
    public void MostrarCombo(){
        System.out.println("Burguer: " + burguer.getDescricao() + " R$: " + burguer.getPreco() + " Tamanho: " + burguer.getGramas());
        System.out.println("Bebida: " + bebida.getDescricao() + " R$: " + bebida.getPreco() + " Tamanho: " + bebida.getMl());
        System.out.println("Sobremesa: " + sobremesa.getDescricao() + " R$: " + sobremesa.getPreco() + " Tamanho: " + sobremesa.getTamanho());
        System.out.println("Valor do Combo: " + (burguer.getPreco() + bebida.getPreco() + sobremesa.getPreco()));
        System.out.println("Valor do Combo com desconto: " + (burguer.getPreco() * 0.80 + bebida.getPreco() * 0.70 + sobremesa.getPreco() * 0.75));
    }
}
