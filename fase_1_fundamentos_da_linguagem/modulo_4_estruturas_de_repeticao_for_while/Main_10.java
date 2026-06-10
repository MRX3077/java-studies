package fase_1_fundamentos_da_linguagem.modulo_4_estruturas_de_repeticao_for_while;

public class Main_10 {
    public static void main(String[] args){
        String pass;

        System.out.println("Digite a senha: ");
        do{
            pass = System.console().readLine();
            if(!pass.equals("Java123")){
                System.out.println("Senha incorreta! Tente novamente: ");
            }
        } while(!pass.equals("Java123"));
        System.out.println("Acesso permitido!");
    }
}
