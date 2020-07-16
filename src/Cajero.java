public class Cajero {

    private int saldo;

    public Cajero(int saldo){
        this.saldo=saldo;
    }

    public Cajero(){ }


    public void retirar(int cantidad){
        if(cantidad>saldo){
            System.out.println("No hay tanto dinero");
        }else{
            saldo=saldo-cantidad;
        }

    }

    public void ingresar(int cantidad){
        saldo=saldo+cantidad;
    }

    public void getSaldo(){
        System.out.println("Tu saldo es " + saldo);

    }

    public String toString(){
        return "CC "+saldo;
    }
}
