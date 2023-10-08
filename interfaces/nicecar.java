package OOPs.interfaces;

public class nicecar {
    private engine Engine;
    private media player = new Cdplayer();

    public nicecar() {
        Engine = new powerengine();
    }

    public nicecar(engine Engine) {
        this.Engine = Engine;
    }

    public void start() {
        Engine.start();
    }

    public void stop() {
        Engine.stop();
    }

    public void playMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void upgradeengine() {
        this.Engine = new electricengine();
    
}

}