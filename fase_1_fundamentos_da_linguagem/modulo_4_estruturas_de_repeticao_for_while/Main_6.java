package fase_1_fundamentos_da_linguagem.modulo_4_estruturas_de_repeticao_for_while;

public class Main_6 {
    public static void main(String[] args){
        int i, sum=0;

        for(i=0; i<=5; i++){
            sum = sum + i;
        }
        System.out.println("A soma foi: "+sum);
    }
}
