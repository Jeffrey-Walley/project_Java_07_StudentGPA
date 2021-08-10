// project 07 Grade Point Average system     https://www.youtube.com/watch?v=9vSW6-Dp9hQ&list=PLtQo0sxRN7JKKla3_GAF05dySjyy3nINa&index=7
/*
 1. create student class
 2. for student object store subject and grades with ArrayLists
 3. find the GPA: A=4.0, B=3.0, C=2.0, D=1.0, F=0

 */

public class Main {
    public static void main(String[] args) {
        Student trelvyn = new Student("Trelvyn");
        trelvyn.add("Math", 'C');
        trelvyn.add("English", 'B');
        trelvyn.add("History", 'B');
        trelvyn.add("P.E.", 'A');
        trelvyn.add("Civics", 'C');
        trelvyn.add("Flute", 'B');
        System.out.println(trelvyn.getName() + " has a GPA of " + trelvyn.getGPA() + ". The classes tallied are: ");

        for (String subjects: trelvyn.getSubjects()) {
            System.out.println(subjects);
        }

        Student jimmel = new Student("Jimmel");
        jimmel.add("Math", 'B');
        jimmel.add("English", 'B');
        jimmel.add("History", 'D');
        jimmel.add("P.E.", 'B');
        jimmel.add("Civics", 'C');
        jimmel.add("Trumboat", 'B');

        Student ra = new Student("Ra");
        ra.add("Math", 'B');
        ra.add("English", 'A');
        ra.add("History", 'A');
        ra.add("P.E.", 'A');
        ra.add("Civics", 'A');
        ra.add("Drums", 'B');

    }
}
