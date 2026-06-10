package fase_1_fundamentos_da_linguagem.modulo_4_estruturas_de_repeticao_for_while;

public class Main_2 {
    public static void main(String[] args){
        int countdown=3;

        while(countdown>0){
            System.out.println(countdown+" segundos para o ano novo!");
            countdown--;
        }
        System.out.println("Feliz ano novo!!!");
    }
}
