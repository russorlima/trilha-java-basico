public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumento o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }
    public void aumentarCanal(){
        canal++
        System.out.println("Aumentanto o canal para: " + canal);
    }
    public void diminuindoCanal(){
        System.out.println("Diminuindo o canal para: " + canal);
    }

}
