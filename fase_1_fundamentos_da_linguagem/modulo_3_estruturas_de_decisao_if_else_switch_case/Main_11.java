package fase_1_fundamentos_da_linguagem.modulo_3_estruturas_de_decisao_if_else_switch_case;

public class Main_11 {
    public static void main(String[] args){
        int age;

        do{
            System.out.println("Digite sua idade: ");
            age = Integer.parseInt(System.console().readLine());
            if(age<0){
                System.out.println("Idade inválida");
            }
        }while(age<0);
        if(age>=0 && age <=12){
            System.out.println("Você é uma criança.");
        } else if(age>=13 && age <=17){
            System.out.println("Você é um adolescente.");
        } else if(age>=18 && age<=59){
            System.out.println("Você é um adulto.");
        } else{
            System.out.println("Você é um idoso.");
        }
    }
}
