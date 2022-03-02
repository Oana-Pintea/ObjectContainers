import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class Hobby {
    private String nume;
    private int frecventa;
    private List<Adresa> adrese;

    public Hobby(String nume, int frecventa, List<Adresa> adrese) {
        this.nume = nume;
        this.frecventa = frecventa;
        this.adrese = adrese;
    }

    public String getNume(){

        return nume;
    }
    public List<Adresa> getAdrese(){

        return adrese;
    }

        }
