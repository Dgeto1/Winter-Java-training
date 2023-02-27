package oopexample_music_shop;

public class Woodwind extends WindInstruments{
    @Override
    public void play() {
        System.out.println("Woodwind.play()");
    }

    @Override
    public void showType() {
        System.out.println("The type is woodwind!");
    }
}
