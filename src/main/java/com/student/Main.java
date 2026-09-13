package com.student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    manager.addStudent(
                        new Student(id, name, course, marks)
                    );

                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.println("\nID | Name | Course | Marks");

                    for (Student student : manager.getStudents()) {
                        System.out.println(student);
                    }
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    int searchId = sc.nextInt();

                    Student student = manager.findStudent(searchId);

                    if (student != null)
                        System.out.println(student);
                    else
                        System.out.println("Student not found.");

                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int deleteId = sc.nextInt();

                    if (manager.deleteStudent(deleteId))
                        System.out.println("Student deleted.");
                    else
                        System.out.println("Student not found.");

                    break;

                case 5:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}