package Vuko_Bulatovic_JavaOOPTest;

import java.util.ArrayList;
import java.util.List;

public class Fakultet {

    private String naziv;
    private double skolarina;
    private List<Student> studenti;

    public Fakultet(String naziv, double skolarina, List<Student> studenti) {
        this.naziv = naziv;
        this.skolarina = skolarina;
        this.studenti = studenti;
    }

    public Fakultet(String naziv) {
        this.naziv = naziv;
        this.skolarina = 0.0;
        this.studenti = new ArrayList<>();
    }

    public Fakultet(String naziv, double skolarina) {
        this.naziv = naziv;
        this.skolarina = skolarina;
        this.studenti = new ArrayList<>();
    }

    public Fakultet(String naziv, List<Student> studenti) {
        this.naziv = naziv;
        this.studenti = studenti;
        this.skolarina = 0.0;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getSkolarina() {
        return skolarina;
    }

    public void setSkolarina(double skolarina) {
        this.skolarina = skolarina;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public double prosek(){
        double p = 0;
        double u = 0;
        for (Student s : studenti){
            p = p + s.getProsek();
            u ++;
        }
        return p / u;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fakultet: ").append(naziv).append("\n");
        sb.append("Skolarina: ").append(skolarina).append("\n");
        sb.append("Studenti: ").append("\n");
        for (int i = 0; i < studenti.size() - 1; i++) {
            sb.append(studenti.get(i).toString()).append("\n");
        }
        sb.append(studenti.get(studenti.size() - 1));
        /*for (Student st : studenti){
            sb.append(st.toString()).append("\n");
        }*/
        return sb.toString();
    }
}
