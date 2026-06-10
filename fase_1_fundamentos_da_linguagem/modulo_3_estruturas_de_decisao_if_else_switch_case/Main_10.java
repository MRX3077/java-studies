package fase_1_fundamentos_da_linguagem.modulo_3_estruturas_de_decisao_if_else_switch_case;

public class Main_10 {
    public static void main(String[] args){
        int cond;
        float price=128.32f;

        System.out.println("O valor do produto é: R$"+price);
        System.out.println("Qual a forma de pagamento desejada?");
        System.out.println("1 - À vista.");
        System.out.println("2 - Parcelado.");
        cond = Integer.parseInt(System.console().readLine());
        if(cond==1){
            price = price - (price * 0.1f);
        } else{
            price = price + (price * 0.05f);
        }
        System.out.println("O preço final ficou: R$"+price);
    }
}
