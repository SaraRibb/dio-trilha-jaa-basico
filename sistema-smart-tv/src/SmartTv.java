public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){ //método com parâmetro que manipulam as variaveis predefinidas pelo objeto principal

        canal = novoCanal;
        System.out.println("Mudar canal para " + canal);

    }
    public void aumentarCanal(){
        canal++;  //somando +1
        System.out.println("Aumentando o canal para " + canal);

    }
    public void diminuirCanal(){
        canal--; //subtraindo -1
        System.out.println("Diminuindo o canal para " + canal);
    }

    public void aumentarVolume(){

        volume++;
        System.out.println("Aumentando o volume para " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para " + volume);
    }
    public void ligar (){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}
