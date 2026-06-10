package fase_1_fundamentos_da_linguagem.modulo_4_estruturas_de_repeticao_for_while;

public class Main_9 {
    public static void main(String[] args){
        int numb, mult, result;

        System.out.println("Digite um número para receber a tabuada dele: ");
        numb = Integer.parseInt(System.console().readLine());
        for(mult=1; mult<11; mult++){
            result = numb * mult;
            System.out.println("O resultado de "+numb+" multiplicado por "+mult+" é igual a "+result);
        }
    }
}
