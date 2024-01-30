package Vuko_Bulatovic_JavaOOPTest;

import java.util.List;

public class Drzavni extends Univerzitet{

    public Drzavni(String naziv, List<Fakultet> fakulteti) {
        super(naziv, fakulteti);
    }

    public Drzavni(String naziv) {
        super(naziv);
    }

    @Override
    public boolean daLiJeNaBudzetu(Student s) {
        return s.getProsek() >= 7.5;
    }

}
