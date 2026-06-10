package fase_1_fundamentos_da_linguagem.modulo_2_variaveis_e_tipos_de_dados;

public class Main_2 {
    public static void main(String[] args){
        float firstN, secondN, thirdN, medium;

        System.out.println("Digite o peimrio valor: ");
        firstN = (Float.parseFloat(System.console().readLine()))*2;
        System.out.println("Digite o segundo número: ");
        secondN = (Float.parseFloat(System.console().readLine()))*3;
        System.out.println("Digite o terceiro número: ");
        thirdN = (Float.parseFloat(System.console().readLine()))*5;
        medium = (firstN+secondN+thirdN)/10;
        System.out.println("A média ponderada é de: " + medium);
    }
}
