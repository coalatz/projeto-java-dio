
public class SmartTv {



    boolean ligada = false;
    int canal;
    int volume = 0;

    public void controlar() {
        ligada = ligada ? false : true;
    }
    
    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }


    public void mudarCanal() {
        canal++;
    }
    public void escolherCanal(int numero) {
        canal = numero;
    }
}
