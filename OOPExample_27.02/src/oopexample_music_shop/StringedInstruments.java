package oopexample_music_shop;

public class StringedInstruments implements Instrument, TypeInstrument{
    @Override
    public void play() {
        System.out.println("StringedInstruments.play()");
    }

    @Override
    public void adjust() {
        System.out.println("StringedInstruments.adjust()");
    }

    @Override
    public void showType() {
        System.out.println("The type is stringed!");
    }
}
