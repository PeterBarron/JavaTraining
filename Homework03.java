/**
 * Created by Peter.Barron on 29/06/2016.
 */
public class Homework03 {

    public static void main(String[] args) {
        int totalRating;

        Student s1 = new Student();
        s1.setName("Tom");
        s1.setRating(5);

        Student s2 =
                new Student("Dick", 6);

        Student s3 =
                new Student("Harry", 3);

        s2.changeRating(8);

        //totalRating =  s1.getRating()+s2.getRating()+s3.getRating();
        System.out.println("Total rating = " + Student.totalRating);
        System.out.println("Average rating = " + Student.avgRating);
    }
}
