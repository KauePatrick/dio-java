public class Usuario {
    public static void main(String[] args) throws Exception {
        
            smartTv smartTv = new smartTv();

            System.out.println("TV ligada? " + smartTv.ligada);
            System.out.println("Canal atual? " + smartTv.canal);
            System.out.println("Volume atual? " + smartTv.volume);

            smartTv.ligar();
            System.out.println("Eu liguei a tv? " + smartTv.ligada);

            smartTv.aumentarVolume();
            System.out.println("qual volume atual? " + smartTv.volume);
            

            smartTv.mudarCanal(26);
            System.out.println("qual o canal atual? " + smartTv.canal);
    }
}
