public class Student {
    private String name;
    private int rating;
    private static int studentCount;
    public static float totalRating;
    public static float avgRating;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(int rating) {
        this.rating = rating;

        totalRating += rating;
        avgRating = totalRating/studentCount;
    }

    public Student() {
        studentCount++;
        totalRating += rating;
        avgRating = totalRating/studentCount;
    }

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;

        studentCount++;
        totalRating += rating;
        avgRating = totalRating/studentCount;
    }

    public boolean betterStudent(int ratingStudent1, int ratingStudent2) {
        //do something
        return true;
    }

    public String toString() {
        //do something
        return this.name;
    }

    public void changeRating(int rating) {

        totalRating = totalRating - this.rating + rating;
        avgRating = totalRating/studentCount;

        this.rating = rating;

    }

}