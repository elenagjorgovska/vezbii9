package zad2;

import java.util.ArrayList;
import java.util.List;
public class Glavna {

    public static void main(String[] args) {

        List<Vraboten> v = new ArrayList<Vraboten>();

        v.add(new Vraboten("Katerina", "Petkovska", "20000"));
        v.add(new Vraboten("Natasa", "Dolevskai", "30000"));
        v.add(new Vraboten("Ivana", "Markovska", "55000"));

        XML xml = new XML();
        xml.createXMLFile("xml.xml", v);
    }
}