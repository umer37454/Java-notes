package Interfaces;

public class NiceCar {
     private Engine engine;
     private final Media player = new Cdplayer();

     public NiceCar(){

     }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void downgrade(){
        engine = new PowerEngine();
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void starts(){
        player.start();
    }

    public void stops(){
        player.stop();
    }

    public void upgradeengine(){
        this.engine = new ElectricEngine();
    }

}
