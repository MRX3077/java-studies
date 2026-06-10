package fase_1_fundamentos_da_linguagem.modulo_3_estruturas_de_decisao_if_else_switch_case;

public class Main_9 {
    public static void main(String[] args){
        int x=20, y=18;

        if(x>y){
            System.out.println("X("+x+") é maior que Y("+y+")");
            System.out.println("Este linha irá rodar somente se a condição for verdadeira, pois ela está dentro do IF.");
        }

        System.out.println("Esta linha irá rodar independente se a condição for verdadeira ou falsa, pois ela está fora do IF.");
    }
}
