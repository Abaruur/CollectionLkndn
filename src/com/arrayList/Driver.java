package com.arrayList;
import java.util.ArrayList;
import java.util.List;
public class Driver {
    public static void main(String[] args) {
        Occupants Akir = new Occupants("Akir", "Dough", false);
        Occupants joh = new Occupants("Joh", "Parkish", false);
        Occupants Martin = new Occupants("Martin", "Tom", true);
        Occupants Marry = new Occupants("Marry", "Weershe", true);

        List<Occupants> checkinList = new ArrayList<>(100);
        checkinList.add(Akir);
        checkinList.add(joh);

        print(checkinList);

        checkinList.add(0, Martin);
        print(checkinList);

        checkinList.get(2).setLoyaltyProgramMember(true);

        checkinList.addAll(1, List.of(joh, Marry));
        print(checkinList);

        checkinList.remove(checkinList.size() - 1);
        print(checkinList);

        System.out.println(checkinList.indexOf(joh));
    }

    public static void print(List<Occupants> list) {

        System.out.format("%n--List Contents--%n");

        for (int x = 0; x < list.size(); x++) {
            Occupants guest = list.get(x);
            System.out.format("%x: %s %n", x, guest.toString());
        }
    }
}