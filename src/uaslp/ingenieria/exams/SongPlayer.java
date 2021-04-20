package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.*;

import java.util.Iterator;

public class SongPlayer {

    public void play(Song song, Instrumento instrumento) {

        Instrument instrument = new Piano();
        Iterator<Nota> notas = song.getSongIterator();

        /*
        Piano piano = new Piano();
        Guitarra guitarra = new Guitarra();
        Violin violin = new Violin();
        Flauta flauta = new Flauta();*/

       while (notas.hasNext()) {
            Nota nota = notas.next();
            instrument.getName();
            instrument.toca(nota);

        }

    }

}
