package fase_1_fundamentos_da_linguagem.modulo_4_estruturas_de_repeticao_for_while;

public class Main_3 {
    public static void main(String[] args){
        int i=10;

        while(i<5){
            System.out.println("Esta linha nunca irá rodar, pois I("+i+") é maior que a condição do IF (Menor que 5).");
            i++;
        }
    }
}
