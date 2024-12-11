package ArrayList_checkin;

import java.util.ArrayList;
import java.util.Collections;

public class HandsOnArrayList {
    public void StudentList() {


        ArrayList<String> students = new ArrayList<>();

        students.add("Wayne");
        students.add("Janell");
        students.add("Jazlynn");
        students.add("Joslynn");
        students.add("Bella");
        students.add("Briella");

        System.out.println("Students List" + students);

        students.remove("Wayne");
        System.out.println("New Update Student was remove" + students);

        Collections.sort(students);
        System.out.println("Students List Sorted" + students);

    }
}
