package fase_2_orientacao_a_objetos.modulo_1_classes_objetos_atributos_e_metodos;

public class Main_10 {
    public void fullThrottle(){
        System.out.println("O carro está indo o mais rápido que ele consegue!");
    }
    public void speed(int maxSpeed){
        System.out.println("A velocidade máxima é: "+maxSpeed);
    }
    public static void main(String[] args){
        Main_10 myCar = new Main_10();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}
