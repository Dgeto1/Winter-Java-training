package oopexample_music_shop;

public class WindInstruments implements Instrument, TypeInstrument{
    @Override
    public void play() {
        System.out.println("Wind.play()");
    }

    @Override
    public void adjust() {
        System.out.println("Wind.ajust()");
    }

    @Override
    public void showType() {
        System.out.println("The type is wind");
    }
}
