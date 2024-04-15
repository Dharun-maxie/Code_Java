package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student {
    int Rank;
    String Name;

    public student(int rank, String name) {
        Rank = rank;
        Name = name;
    }

    public String toString() {
        return "student{" +
                "Rank=" + Rank +
                ", Name='" + Name + '\'' +
                '}';
    }
}

public class CollectionSortStringByLength {
    public static void main(String[] args) {

        Comparator<student> comp = (o1, o2) -> o1.Rank > o2.Rank ? 1 : -1;

        List<student> list = new ArrayList<>();

        list.add(new student(7, "Ishaq"));
        list.add(new student(9, "Dharunpandi"));
        list.add(new student(2, "Jerome"));
        list.add(new student(1, "Ahmed"));

        Collections.sort(list, comp);

        System.out.println(list);
    }
}
