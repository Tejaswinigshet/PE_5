package com.stackroute;
/*Create a Student class that represents the following information of a student: id, name, and age
        all the member variables should be private .
        a. Implement `getter and setter` .
        b. Create a `StudentSorter` class that implements `Comparator interface` .
        c. Write a class `Maintest` create Student class object(minimum 5)
        d. Add these student object into a List of type Student .
        e. Sort the list based on their age in decreasing order, for student having
        same age, sort based on their name.
        f. For students having same name and age, sort them according to their ID.*/
 import java.io.PrintStream;
 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.Comparator;
 import java.util.List;

public class InformationOfStudent{
    private String student_id;
    private String student_name;
    private int student_age;

    InformationOfStudent(String id, String name, int age) {
        this.student_id = id;
        this.student_name = name;
        this.student_age = age;
    }

    public String getName() {
        return this.student_name;
    }

    public String getID() {
        return this.student_id;
    }

    public int getAge() {
        return this.student_age;
    }
}
class StudentSorter implements Comparator {

    StudentSorter() {
    }

    public int compare(Object o1, Object o2) {

        InformationOfStudent s1 = (InformationOfStudent) o1;
        InformationOfStudent s2 = (InformationOfStudent) o2;

        if (s1.getAge() == s2.getAge()) {

            int answer = s1.getName().compareTo(s2.getName());
            return answer == 0 ? s1.getID().compareTo(s2.getID()) : answer;
        } else {
            return s1.getAge() > s2.getAge() ? 1 : -1;
        }
    }
}


class MainTest{
    MainTest() {
    }

    public static void main(String[] args) {

        List<InformationOfStudent> listofstudents = new ArrayList();

        listofstudents.add(new InformationOfStudent("1", "Tejaswini", 22));
        listofstudents.add(new InformationOfStudent("2", "Pavan", 19));
        listofstudents.add(new InformationOfStudent("3", "Srujan", 16));
        listofstudents.add(new InformationOfStudent("4", "Pooja", 25));
        listofstudents.add(new InformationOfStudent("5", "Tejas", 23));

        Collections.sort(listofstudents, new StudentSorter());

        for (int i = 0; i < listofstudents.size(); ++i) {

            PrintStream var1 = System.out;
            String var2 = listofstudents.get(i).getID();
            var1.println(var2 + " " + listofstudents.get(i).getName() + " " + listofstudents.get(i).getAge());
        }

    }
}
