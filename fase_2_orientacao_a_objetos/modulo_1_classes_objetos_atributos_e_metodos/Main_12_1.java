package fase_2_orientacao_a_objetos.modulo_1_classes_objetos_atributos_e_metodos;

public class Main_12_1 {
    String brand1 = "Mitsubishi", brand2 = "Fiat", model1 = "Lancer", model2 = "Abarth, FastBack";
    int year1 = 2025, year2 = 2026, speed1 = 0, speed2 = 0, my = 1, increment;
    boolean first = false;

    public void accelerate(){
        System.out.println("Quanto você quer acelerar o carro? ");
        increment = Integer.parseInt(System.console().readLine());
        if(my==1){
            speed1 = speed1 + increment;
        } else{
            speed2 = speed2 + increment;
        }
    }

    public void data(){
        do{
            if(first){
                System.out.println("As informações atuais são: ");
            }
            if(my==1){
                System.out.println("A marca do carro é: "+brand1);
                System.out.println("O modelo do carro é: "+model1);
                System.out.println("O ano do carro é: "+year1);
                System.out.println("A velocidade atual é: "+speed1);
            } else{
                System.out.println("A marca do carro é: "+brand2);
                System.out.println("O modelo do carro é: "+model2);
                System.out.println("O ano do carro é: "+year2);
                System.out.println("A velocidade atual é: "+speed2);
            }
            if(first){
                first=false;
            }
        }while(first);

    }

    public static void main(String[] args){
        Main_12_1 myCar = new Main_12_1();
        System.out.println("Você deseja saber a informação de qual carro?");
        System.out.println("1 - Meu");
        System.out.println("2 - Outro");
        myCar.my = Integer.parseInt(System.console().readLine());
        myCar.data();
        myCar.accelerate();
        myCar.first=true;
        myCar.data();
    }
}
