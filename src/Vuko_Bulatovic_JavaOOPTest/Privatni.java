package Vuko_Bulatovic_JavaOOPTest;

import java.util.List;

public class Privatni extends Univerzitet{

    public Privatni(String naziv, List<Fakultet> fakulteti) {
        super(naziv, fakulteti);
    }

    public Privatni(String naziv) {
        super(naziv);
    }

    @Override
    public boolean daLiJeNaBudzetu(Student s) {
        double x = 0;
        for (int i = 0; i < String.valueOf(s.getIme()).length(); i++) {
                if(String.valueOf(s.getIme().charAt(i)).equalsIgnoreCase("a") ||
                   String.valueOf(s.getIme().charAt(i)).equalsIgnoreCase("e") ||
                   String.valueOf(s.getIme().charAt(i)).equalsIgnoreCase("i") ||
                   String.valueOf(s.getIme().charAt(i)).equalsIgnoreCase("o") ||
                   String.valueOf(s.getIme().charAt(i)).equalsIgnoreCase("u")
            )
                 x ++;
        }
        for (int i = 0; i < String.valueOf(s.getPrezime()).length(); i++) {
            if(String.valueOf(s.getPrezime().charAt(i)).equalsIgnoreCase("a") ||
                    String.valueOf(s.getPrezime().charAt(i)).equalsIgnoreCase("e") ||
                    String.valueOf(s.getPrezime().charAt(i)).equalsIgnoreCase("i") ||
                    String.valueOf(s.getPrezime().charAt(i)).equalsIgnoreCase("o") ||
                    String.valueOf(s.getPrezime().charAt(i)).equalsIgnoreCase("u")
            )
                x ++;
        }
        double y = 9.5 - (0.01 * x);
        return s.getProsek() >= y;
    }
}
