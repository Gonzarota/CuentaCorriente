import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cajero cuenta=new Cajero(1000);
        Cajero cuenta2=new Cajero(1000);
        Scanner input=new Scanner(System.in);


        System.out.println("Selecciona que servicios quieres utilizar");
        System.out.println("Ingresar:1");
        System.out.println("Retirar:2");
        System.out.println("transferencia:3");
        int opcion=input.nextInt();
        if(opcion==1){
            System.out.println("Que cantidad quieres ingresar");
            int dinero=input.nextInt();
            cuenta.ingresar(dinero);

        }else if(opcion==2){
            System.out.println("Que cantidad quieres sacar");
            int dinero=input.nextInt();
            cuenta.retirar(dinero);
        }else if(opcion==3){
            Banco banco=new Banco();
            System.out.println("Elige la cantidad a transferir");
            int trans=input.nextInt();
            banco.transferencia(cuenta,cuenta2,trans);
        }
        cuenta.getSaldo();



        System.out.println(cuenta);
        System.out.println(cuenta2);

    }
}

