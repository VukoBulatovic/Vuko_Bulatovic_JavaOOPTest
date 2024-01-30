package Vuko_Bulatovic_JavaOOPTest;

import java.util.Objects;

public class Student {

    private String ime;
    private String prezime;
    private double prosek;

    public Student(String ime, String prezime, double prosek) {
        this.ime = ime;
        this.prezime = prezime;

        if(prosek >= 6.0 && prosek <= 10.0)
            this.prosek = prosek;
        else
            this.prosek = 6.0;
    }

    public Student() {
        this.ime = "";
        this.prezime = "";
        this.prosek = 6.0;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public double getProsek() {
        return prosek;
    }

    public void setProsek(double prosek) {
        this.prosek = prosek;
    }

    public boolean jednaki(Student s){
        return Objects.equals(this.ime, s.ime) && Objects.equals(this.prezime, s.prezime);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" ").append(prezime).append(" # ").append(prosek);
        return sb.toString();
    }




}
