package oopexample_music_shop;

import java.util.ArrayList;

public class Music {
    public static void tune(Instrument instrument) {
        instrument.play();
    }
    public static void tuneAll(ArrayList<Instrument> instruments) {
        for(Instrument instrument : instruments) {
            tune(instrument);
        }
    }
    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList<>();

        StringedInstruments stringedInstrument = new StringedInstruments();
        instruments.add(stringedInstrument);

        Woodwind woodwind = new Woodwind();
        instruments.add(woodwind);

        WindInstruments wind = new WindInstruments();
        instruments.add(wind);

        tuneAll(instruments);
    }
}
