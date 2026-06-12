package fase_2_orientacao_a_objetos.modulo_1_classes_objetos_atributos_e_metodos;

public class Main_13 {
    static class bankAccount{
        int owner;
        double money;

        public void deposit(double quant){
            money+=quant;
        }

        public void withdraw(double quant){
            if(money<quant){
                System.out.println("Quantidade retirada maior do que o saldo em conta.");
            } else{
                money-=quant;
            }
        }

        public void data(){
            System.out.println("Dono da conta: "+owner);
            System.out.println("Saldo em conta: "+money);
        }
    }

    public static void main(String[] args){
        int users, i;
        boolean exist = false;
        System.out.println("Quantos usuarios o banco possui? ");
        do{
            users = Integer.parseInt(System.console().readLine());
            if(users<0){
                exist = true;
                System.out.println("Número inválido, digite um número positivo: ");
            } else{
                exist = false;
            }
        } while(exist);
        if(users==0){
            System.out.println("Banco sem clientes.");
        } else{

            bankAccount[] account = new bankAccount[users];

            for(i=0; i<users; i++){
                account[i] = new bankAccount();
                account[i].owner = (i+1);
                account[i].money = 90;
                account[i].data();
                account[i].deposit(20);
                account[i].data();
                account[i].withdraw(12);
                account[i].data();
                System.out.println();
            }
        }

    }
}
