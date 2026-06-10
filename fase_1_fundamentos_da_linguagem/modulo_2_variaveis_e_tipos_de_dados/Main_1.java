package fase_1_fundamentos_da_linguagem.modulo_2_variaveis_e_tipos_de_dados;

public class Main_1 {
    public static void main(String[] args){
        String product = "Sapato";
        int quant = 15;
        float price = 79.83f;
        boolean sale = false;
        System.out.println("O produto: " + product);
        System.out.println("Quantidade em estoque: " + quant);
        System.out.println("O preço é: " + price);
        if(sale==true){
            System.out.println("O produto está a venda");
        } else{
            System.out.println("O produto não está a venda");
        }
    }
}
