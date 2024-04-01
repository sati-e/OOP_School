package Class;

public class StudentTest {

    public static void main(String[] args) {

        Course literature = new Course("Literature", 1300, 8);
        Course music = new Course("Music", 1200, 8);
        Course games = new Course("Games", 1600, 8);

        //creating object
        Student lysandre = new Student("Lysandre", 84927502, literature, 21, 50);
        Student castiel = new Student("Castiel", 56790926, music, 22,40);
        Student armin = new Student("Armin", 54892312 , games, 17, 100);

        //lysandre
        System.out.printf("Name: %s\nRegistration: %s\nCourse: %s\nAge: %d\nDiscount: %d",
                lysandre.name, lysandre.registration, lysandre.course.name, lysandre.age, lysandre.discount);
        System.out.println(lysandre.studentDiscount());
        lysandre.updateData("Lysandre", 84927502, music, 22, 70);
        System.out.printf("Name: %s\nRegistration: %s\nCourse: %s\nAge: %d\nDiscount: %d",
                lysandre.name, lysandre.registration, lysandre.course.name, lysandre.age, lysandre.discount);
        lysandre.updateDiscount(20);
        System.out.printf("Name: %s\nRegistration: %s\nCourse: %s\nAge: %d\nDiscount: %d",
                lysandre.name, lysandre.registration, lysandre.course.name, lysandre.age, lysandre.discount);
        System.out.println(lysandre.studentDiscount());

        //castiel
        System.out.printf("\nName: %s\nRegistration: %s\nCourse: %s\nAge: %d\nDiscount: %d",
                castiel.name, castiel.registration, castiel.course.name, castiel.age, castiel.discount);
        System.out.println(castiel.studentDiscount());
        castiel.updateData("Castiel", 56790926, music, 22, 40);
        System.out.printf("Name: %s\nRegistration: %s\nCourse: %s\nAge: %d\nDiscount: %d",
                castiel.name, castiel.registration, castiel.course.name, castiel.age, castiel.discount);
        castiel.updateDiscount(20);
        System.out.printf("Name: %s\nRegistration: %s\nCourse: %s\nAge: %d\nDiscount: %d",
                castiel.name, castiel.registration, castiel.course.name, castiel.age, castiel.discount);
        System.out.println(castiel.studentDiscount());

        //armin
        System.out.printf("\nName: %s\nRegistration: %s\nCourse: %s\nAge: %d\nDiscount: %d",
                armin.name, armin.registration, armin.course.name, armin.age, armin.discount);
        System.out.println(armin.studentDiscount());
        armin.updateData("Armin", 54892312, music, 17, 100);
        System.out.printf("Name: %s\nRegistration: %s\nCourse: %s\nAge: %d\nDiscount: %d",
                armin.name, armin.registration, armin.course.name, armin.age, armin.discount);
        armin.updateDiscount(20);
        System.out.printf("Name: %s\nRegistration: %s\nCourse: %s\nAge: %d\nDiscount: %d",
                armin.name, armin.registration, armin.course.name, armin.age, armin.discount);
        System.out.println(armin.studentDiscount());
    }

}