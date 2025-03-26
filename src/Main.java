import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        // load data file
        String filename = "src/students.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            // TODO: add loop for each line of file
            String line = reader.readLine();
            while (line != null) {
                // separate line by commas
                String[] values = line.split(",");

                // construct Course objects
                // (Mathematics, Art, History, Science, Geography, Economics, Literature)
                Course math = new Course("Mathematics", Integer.parseInt(values[3]));
                Course art = new Course("Art", Integer.parseInt(values[4]));
                // TODO: etc... through values[7]

                // construct Student object
                Student student = new Student(
                        values[0],
                        values[1],
                        values[2],
                        new Course[] {math, art} // TODO: add remaining courses
                );
                students.add(student);

                // read next line
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File read error.");
        }

        // display menu - done for now!

    }
}





