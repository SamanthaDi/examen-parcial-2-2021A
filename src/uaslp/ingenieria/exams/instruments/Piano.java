package uaslp.ingenieria.exams.instruments;

import uaslp.ingenieria.exams.Instrument;
import uaslp.ingenieria.exams.Nota;

public class Piano implements Instrument {

    public void toca(Nota nota) {

    }

    @Override
    public String getName() {
        return "Piano";
    }
}
