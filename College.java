import java.util.*;

class College {

    String collegeName;
    private List<course> courses;

    College(String collegeName, List<course> courses) {
        this.collegeName = collegeName;
        this.courses = courses;
    }

    public int countStudents() {
        int studentsInCollege = 0;
        List<Student> students;
        for (course course : courses) {
            students = course.studentsData();
            for (Student s : students) {
                studentsInCollege++;
            }
        }
        return studentsInCollege;
    }

}

// Returning number of students available in all courses in a given college
