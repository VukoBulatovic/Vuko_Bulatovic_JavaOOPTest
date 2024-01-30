package Vuko_Bulatovic_JavaOOPTest;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Student vuko = new Student("Vuko","Bulatovic",6.8);
        Student vukas = new Student("Vukas","Ciric",7);
        Student straja = new Student("Straja","Piric",8);
        Student ogi = new Student("Ogi","Bezjak",10);
        List<Student> students1 = new ArrayList<>();
        students1.add(vuko);
        students1.add(vukas);
        students1.add(straja);
        students1.add(ogi);


        Student slaki = new Student("Slavisa","Djinovic",6.8);
        Student maki = new Student("Marko","Antic",10);
        Student steva = new Student("Steva","Acic",9);
        Student david = new Student("Davic","Antic",10);
        List<Student> students2 = new ArrayList<>();
        students2.add(slaki);
        students2.add(maki);
        students2.add(steva);
        //students2.add(david);


        Fakultet f = new Fakultet("FZP",11000,students1);
        Fakultet u = new Fakultet("PMF",10000,students2);
        List<Fakultet> faxovi = new ArrayList<>();
        faxovi.add(f);
        faxovi.add(u);

        //Univerzitet uz = new Univerzitet("UCG",faxovi);
        Drzavni uz = new Drzavni("UCG",faxovi);
        //System.out.println(uz.nalaziSe(david));
        //uz.ispisi(vukas);
        System.out.println(uz.ukupniProsek());
        System.out.println(uz.najboljiStudent());
        System.out.println(uz.najjeftinijiFakultet());

        System.out.println(uz);

        Kombinovani kb = new Kombinovani("KMB",faxovi);
        System.out.println(kb.daLiJeNaBudzetu(ogi));

        Privatni pp = new Privatni("PFK",faxovi);
        System.out.println(pp.daLiJeNaBudzetu(ogi));

        uz.ispisi(ogi);
        System.out.println(uz.nalaziSe(ogi));


    }
}
