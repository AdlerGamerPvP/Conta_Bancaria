import static java.lang.IO.*;

public class Banco {

    private String titular;
    private double saldo = 0;
    private double limite;
    private double divida = 0;

    public double getSaldo(){
        return saldo;
    }
   public String setTitular(){
        this.titular = readln("Digite o nome do titular: \n");
        return null;
   }
   public String getTitular(){
        return titular;
    }
   public void depositar(){
        double deposito = Double.parseDouble(readln("Digite o valor para ser depositado: \n"));
        if(deposito > 0){
        deposito = deposito - divida;
        saldo = saldo + deposito;
        println("voce depositou" + deposito + "R$ na sua conta \n");
        }
        else {
            println("Esse valor é invalido, tente novamente");
        }
   }
   public void sacar(){
        double remqua = Double.parseDouble(readln("Digite o valor para retirar: \n"));
        if (saldo - remqua > -1) {
        saldo = saldo - remqua;
        println("voce sacou" + remqua + "R$ da sua conta \n");
        }
        else {
            println("Voce não tem saldo suficiente, você deseja pegar do seu limite? 1- sim 2- não");
            int escolha = Integer.parseInt(readln());
            if(escolha == 1){
                remqua = Double.parseDouble(readln("Digite o valor para retirar do limite: \n"));
                if (limite - remqua > -1){
                    limite = limite - remqua;
                    println("voce sacou" + remqua + "R$ do seu limite \n voce esta devendo" + remqua + "para o banco");
                    divida = divida + remqua;
                }
                else {
                    println("você não tem limite suficiente");
                }
            }
            else if (escolha == 2){
                println("Operação cancelada");
            }
            else{
                println("Opção invalida, tente novamente");
            }
        }
   }
   public Banco(String titular, double saldo, double limite){
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
   }
    public String toString() {
        return "Titular: " + titular + "\n" + "Saldo: " + saldo + "\n" + "Limite: " + limite +  "\n Divida: " + divida + "\n";
    }

}
