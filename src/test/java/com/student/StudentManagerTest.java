package com.student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentManagerTest {

    @Test
    void testAddStudent() {

        StudentManager manager = new StudentManager();

        manager.addStudent(
            new Student(101, "Jash", "CSE", 85)
        );

        assertNotNull(manager.findStudent(101));
    }

    @Test
    void testDeleteStudent() {

        StudentManager manager = new StudentManager();

        manager.addStudent(
            new Student(101, "Jash", "CSE", 85)
        );

        assertTrue(manager.deleteStudent(101));
        assertNull(manager.findStudent(101));
    }
}