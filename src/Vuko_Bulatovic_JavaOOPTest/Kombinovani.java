package Vuko_Bulatovic_JavaOOPTest;

import java.util.List;

public class Kombinovani extends Univerzitet {


    public Kombinovani(String naziv, List<Fakultet> fakulteti) {
        super(naziv, fakulteti);
    }

    public Kombinovani(String naziv) {
        super(naziv);
    }

    @Override
    public boolean daLiJeNaBudzetu(Student s) {
        double x = 0;
        for (int i = 0; i < String.valueOf(s.getIme()).length(); i++) {
            x ++;
        }
        for (int i = 0; i < String.valueOf(s.getPrezime()).length(); i++) {
            x ++;
        }
        double y = 9.0 - (0.05 * x);
        return s.getProsek() >= y;
    }
}
