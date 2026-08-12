import static java.lang.IO.*;

void main() {
    int escolhas = 0;
    Banco titular1 = new Banco(null, 0, 1500);
    titular1.setTitular();
    println("o nome do titular é " + titular1.getTitular() + "\n Escolha o que fazer: \n");
   while(escolhas != 4){
       escolhas = Integer.parseInt(readln("1- Depositar \n2- Sacar \n3- Ver Dados \n4- Sair \n"));
       if (escolhas == 1){
           titular1.depositar();
       }
       else if (escolhas == 2){
           titular1.sacar();
       }
       else if (escolhas == 3){
           println(titular1);
       }
       else if (escolhas != 4){
           println("Escolha invalida, tente novamente");
       }
   }
  println("Volte novamente!");







}