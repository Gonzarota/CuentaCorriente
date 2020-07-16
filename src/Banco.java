public class Banco {

    public Banco(){ }

    public Cajero crearCuenta(){
        return new Cajero();
    }

    public void transferencia(Cajero x,Cajero y,int trans){
        x.retirar(trans);
        y.ingresar(trans);




    }
}
