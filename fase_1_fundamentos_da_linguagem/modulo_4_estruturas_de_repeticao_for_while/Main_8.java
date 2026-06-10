package fase_1_fundamentos_da_linguagem.modulo_4_estruturas_de_repeticao_for_while;

public class Main_8 {
    public static void main(String[] args){
        int i;

        for(i=10; i<5; i++){
            System.out.println("Esta linha nunca irá rodar, pois o I("+i+") está fora da condição do FOR (Menor que 5).");
        }
    }
}
