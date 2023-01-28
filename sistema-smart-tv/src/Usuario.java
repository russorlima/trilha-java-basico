public class Usuario {
    
    public static void main(String[] args) {

        SmartTv SmartTv = new SmartTv();

        System.out.println("Tv ligada? " + SmartTv.ligada);
        System.out.println("Canal Atual: " + SmartTv.canal);
        System.out.println("Volume Atual: " + SmartTv.volume);

        SmartTv.ligar();
        System.out.println("Novo Status -> Tv ligada? " + SmartTv.ligada);

        SmartTv.desligar();
        System.out.println("Novo Status -> Tv ligada? " + SmartTv.ligada);

        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.diminuirVolume();
        SmartTv.aumentarVolume();
        System.out.println("Volume Atual: " + SmartTv.volume);

        System.out.println("Canal Atual: " + SmartTv.canal);

        SmartTv.mudarCanal(13);

        System.out.println("Canal Atual: " + SmartTv.canal);
        
    }
}
