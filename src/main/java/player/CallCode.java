package player;

public class CallCode extends PlayerCode{
    public static void main(String[] args) {
        PlayerCode pc = new PlayerCode();
        pc.play();
        pc.pause();
        pc.stop();

        pc.record();
        pc.pause();
        pc.stop();
    }
}
