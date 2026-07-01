public class Student {

    private String name;
    private int[] marks;

   
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

   
    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }

    public double calculateAverage() {

        if (marks == null || marks.length == 0) {
            return 0.0;
        }

        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        return (double) sum / marks.length;
    }
}