import java.util.Scanner;

public class Conta  {
    private static class main(String[] args{
        Scanner contaDoFilipe  = new Scanner(System.in);

        int numero;

        String titular;
        double saldo;
        double limite;

        public boolean deposita(double valor){
            this.saldo += valor;

            return true;
        }
        public boolean saca(double valor){

            if (this.saldo >= valor) {
                this.saldo -= valor;
                return true;
            } else {
                return false;
            }

        }

        public void info ( int numero, String titular,double saldo, double limite){

        }

    }

}