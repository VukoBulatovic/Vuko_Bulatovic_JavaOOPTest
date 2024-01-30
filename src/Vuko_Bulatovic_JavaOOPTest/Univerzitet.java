package Vuko_Bulatovic_JavaOOPTest;

import java.util.ArrayList;
import java.util.List;

public abstract class Univerzitet implements Servis {

    private String naziv;
    private List<Fakultet> fakulteti;

    public Univerzitet(String naziv, List<Fakultet> fakulteti) {
        this.naziv = naziv;
        this.fakulteti = fakulteti;
    }

    public Univerzitet(String naziv) {
        this.naziv = naziv;
        this.fakulteti = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public List<Fakultet> getFakulteti() {
        return fakulteti;
    }

    public void setFakulteti(List<Fakultet> fakulteti) {
        this.fakulteti = fakulteti;
    }

    @Override
    public Fakultet nalaziSe(Student st) {
        Fakultet f = null;
        for (Fakultet fk : fakulteti) {
            for (Student sta : fk.getStudenti()) {
                if (sta == st) {
                    f = fk;
                    break;
                }
            }
        }
        return f;
    }

    @Override
    public void ispisi(Student s) {
        System.out.println(s.toString());
    }

    @Override
    public boolean daLiJeNaBudzetu(Student s) {
        return false; //TODO:
    }

    public double ukupniProsek(){
        double p = 0;
        double s = 0;
        for (Fakultet f : fakulteti){
            p = p + f.prosek();
            s ++;
        }
        return p / s;
    }

    public Student najboljiStudent(){
        double max = Double.MIN_VALUE;
        Student st = new Student();
        for (Fakultet f : fakulteti){
            for (Student s : f.getStudenti()){
                if(s.getProsek() > max){
                 max = s.getProsek();
                 st = s;}
            }
        }
        return st;
    }

    public Fakultet najjeftinijiFakultet(){
        double min = Double.MAX_VALUE;
        Fakultet fk = null;
        for (Fakultet f : fakulteti){
            if(f.getSkolarina() < min){
                min = f.getSkolarina();
                fk = f;
            }
        }
        return fk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Univerzitet: ").append(naziv).append(" ima fakultete:").append("\n");
//        for (Fakultet f : fakulteti){
//            sb.append(f.getNaziv()).append("\n");
//        }
        for (int i = 0; i < fakulteti.size() - 1; i++) {
            sb.append(fakulteti.get(i).getNaziv()).append("\n");
        }
        sb.append(fakulteti.get(fakulteti.size()-1).getNaziv());
        return sb.toString();
    }


}
