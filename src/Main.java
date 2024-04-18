import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> classGrades = new HashMap<String,Integer>();

        // Variables
        int numOfClasses;
        int low = 150;
        int high = -1;
        String lowestClass = "";
        String highestClass = "";
        double sum = 0;
        double avg;

        // Adding classes
        classGrades.put("Calc", 85);
        classGrades.put("CSA", 90);
        classGrades.put("business", 100);

        numOfClasses = classGrades.size();

        // Loops through every class, checks for highest and lowest grade
        for (String subject: classGrades.keySet()) {
            System.out.printf("\n%-20s %5d", subject, classGrades.get(subject));

            if (classGrades.get(subject) > high) {
                high = classGrades.get(subject);
                highestClass = subject;
            }

            if (classGrades.get(subject) < low) {
                low = classGrades.get(subject);
                lowestClass = subject;
            }

            sum += classGrades.get(subject);
        }

        avg = sum/classGrades.size();

        System.out.println(" ");
        System.out.printf("\n%-20s %5d", "Number of Classes:", classGrades.size());
        System.out.printf("\n%-35s %5d", "Lowest Grade (" + lowestClass + "):", low);
        System.out.printf("\n%-35s %5d", "Highest Grade (" + highestClass + "):", high);
        System.out.printf("\n%-20s %5f", "Average Grade:", avg);
    }
}