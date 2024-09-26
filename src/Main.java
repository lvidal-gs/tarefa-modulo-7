public class Main {
    public static void main(String[] args) {
        Carro c = new Carro();

        c.setCor("Vermelho");
        c.setModelo("Corolla");
        c.setPotencia(140);
        c.setFlex(true);
        c.setMarca("Toyota");

        String isFlex = c.isFlex() ? "flex" : "";

        System.out.printf("Meu carro é um %s %s %s %s e tem %dhp %n",
                c.getMarca(),
                c.getModelo(),
                isFlex,
                c.getCor(),
                c.getPotencia());

        c.ligar();
        c.subirVidro();
        c.descendoVidro();
        c.desligar();
    }
}