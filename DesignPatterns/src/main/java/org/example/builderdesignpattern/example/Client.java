package org.example.builderdesignpattern.example;

class Client {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder("Taslim", "Shanto") // mandatory parameters
                .addAge("25") // optional
                .addGender("M") // optional
                .build(); // to get back student option
        System.out.println(student);
        System.out.println();

        Student student2 = new Student.StudentBuilder("Rahat", "Hossain") // mandatory parameters
                .addAge("26") // optional
                .addGender("M") // optional
                .addHasExperience(true) // optional
                .build(); // to get back student option
        System.out.println(student2);
        System.out.println();
    }
}
