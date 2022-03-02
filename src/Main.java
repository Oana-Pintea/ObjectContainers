import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person oana = new Employee("Oana", 27);
        Person catalin = new Student("Catalin", 37);
        Person diana = new Unemployee("Diana", 28);

        TreeSet<Person> treeSetByName = new TreeSet<>(new ComparatorByName());

        treeSetByName.add(oana);
        treeSetByName.add(catalin);
        treeSetByName.add(diana);

        System.out.println("Persoanele in ordinea numelor: " + treeSetByName);


        TreeSet<Person> treeSetByAge = new TreeSet<>(new ComparatorByAge());

        treeSetByAge.add(oana);
        treeSetByAge.add(catalin);
        treeSetByAge.add(diana);
        
        System.out.println("Persoanele in ordinea varstelor: " + treeSetByAge);


        HashMap<Person, List<Hobby>> map = new HashMap<Person, List<Hobby>>();

        List<Adresa> adrese_reading = new ArrayList<>();
        adrese_reading.add(new Adresa("Romania", "Transilvania", "Brasov", 50005));
        adrese_reading.add(new Adresa("Romania", "Moldova", "Iasi", 40007));
        adrese_reading.add(new Adresa("Bulgaria", "Centru", "Sofia", 40047));

        List<Adresa> adrese_swimming = new ArrayList<>();
        adrese_swimming.add(new Adresa("Grecia", "Insule", "Santorini", 53455));
        adrese_swimming.add(new Adresa("Italia", "Sud", "Sicilia", 40327));
        adrese_swimming.add(new Adresa("Franta", "Coasta de Azur", "Nisa", 42347));

        List<Adresa> adrese_movies = new ArrayList<>();
        adrese_movies.add(new Adresa("Norvegia", "Fiorduri", "Oslo", 10005));
        adrese_movies.add(new Adresa("Suedia", "Sud", "Stockholm", 60008));


        List<Hobby> hobbies_oana = new ArrayList<>();
        hobbies_oana.add(new Hobby("reading", 2, adrese_reading));
        hobbies_oana.add(new Hobby("swimming", 1, adrese_swimming));

        List<Hobby> hobbies_catalin = new ArrayList<>();
        hobbies_catalin.add(new Hobby("movies", 5, adrese_movies));
        hobbies_catalin.add(new Hobby("swimming", 2, adrese_swimming));

        List<Hobby> hobbies_diana = new ArrayList<>();
        hobbies_diana.add(new Hobby("reading", 1, adrese_reading));

        map.put(oana, hobbies_oana);
        map.put(catalin, hobbies_catalin);
        map.put(diana, hobbies_diana);



        List<Hobby> hobbies = map.get(oana);

        System.out.println("Am intrebat care sunt hobbiurile pentru "+ oana.getName() + " si tarile in care se pot practica");
        for (Hobby h: hobbies){
            System.out.print(h.getNume() + ": ");

            Set<String> tari = new TreeSet<>();

            for(Adresa a: h.getAdrese())
                tari.add(a.getCountry());

            System.out.println(tari);
        }

    }
}
