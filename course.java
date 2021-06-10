import java.util.*;

class course {

    String name;
    private List<Student> students;

    course(String name, List<Student> students) {

        this.name = name;
        this.students = students;

    }

    public List<Student> studentsData() {
        return students;
    }
}

/* College class having a list of Courses */
