import java.util.*;

public class AttendanceTracker {

    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    static void markAttendance(String subject, String student) {

        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> list = attendance.get(subject);

        if (list.contains(student))
            System.out.println(student + " already marked in " + subject);
        else {
            list.add(student);
            System.out.println("Attendance Marked");
        }
    }

    static void display() {

        for (String subject : attendance.keySet()) {

            ArrayList<String> list = attendance.get(subject);

            System.out.println("\nSubject : " + subject);

            for (String student : list)
                System.out.println(student);

            System.out.println("Total Students = " + list.size());
        }
    }

    public static void main(String[] args) {

        markAttendance("Java", "Deepika");
        markAttendance("Java", "Riya");
        markAttendance("Java", "Deepika");

        markAttendance("SQL", "Aman");
        markAttendance("SQL", "Deepika");

        display();
    }
}