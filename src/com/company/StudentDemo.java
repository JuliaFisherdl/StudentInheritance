package com.company;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {

    public static void main(String[] args) {


        Student student = new Student("Dan", "12345");
        BandMember bandMember = new BandMember("Jason", "56789", "Saxaphone, French Horn, guitar",
                7);
        BandMember bandMember1 = new BandMember("Ayah", "98765", "Drums", 10);

        student.showStudent();
        bandMember.showStudent();
        bandMember1.showStudent();
    }
}
