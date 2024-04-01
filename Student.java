package Class;

//creating class
public class Student {

    //attributes
    public String name;
    public int registration;
    public Course course;   //attribute from Course
    public int age;
    public int discount;


    public Student(String name, int registration, Course course, int age, int discount) {
        if(name != null && !name.isEmpty()){
            this.name = name;
        } else {
            System.out.println("Error: invalid name");
        }
        if (registration >= 0){
            this.registration = registration;
        } else {
            System.out.println("Error: invalid registration");
        }
        if(course != null){
            this.course = course;
        } else {
            System.out.println("Error: invalid course");
        }
        if(age > 0){
            this.age = age;
        } else {
            System.out.println("Error: invalid age");
        }
        if(discount >= 0){
            this.discount = discount;
        } else {
            System.out.println("Error: invalid discount");
        }
    }

    //methods
    public double studentDiscount(){
        double discountedPrice = course.price * (this.discount / 100.0); //calculation
        if (discountedPrice < 0) {
            System.out.println("Error: Invalid discount value.");
            return 0;
        }
        System.out.println("\n-PRICE-");
        System.out.printf("Discounted Price: %.2f", discountedPrice);
        double newPrice = course.price - discountedPrice; //print the result
        System.out.printf("\nNew price: %.2f", newPrice);
        return newPrice;
    }
    //update discount value
    public void updateDiscount(int newDiscount) {
        if (newDiscount < 0) {
            System.out.println("Error: Invalid new discount value.");
        }
        System.out.println("\nDISCOUNT HAS BEEN UPDATED");
        this.discount = newDiscount;
    }
    public void updateData(String newName, int newRegistration, Course newCourse, int newAge, int newDiscount){
        //verify if name is not null or empty
        if(newName != null && !newName.isEmpty()){
            System.out.println("\nDATA HAS BEEN UPDATED");
            this.name = newName;
        } else {
            System.out.println("Error: invalid new name");
        }
        //verify if registration is not negative or zero
        if(newRegistration > 0) {
            this.registration = newRegistration;
        } else {
            System.out.println("Error: new registration invalid");
        }
        //verify if course is not empty or null
        if(newCourse != null && !newCourse.name.isEmpty()) {
            this.course = newCourse;
        } else {
            System.out.println("Error: new course invalid");
        }
        //verify if new age is positive
        if(newAge > 0) {
            this.age = newAge;
        } else {
            System.out.println("Error: invalid new age");
        }
        //check id the new discount is within a valid range
        if(newDiscount >= 0 && newDiscount<= 100) {
            this.discount = newDiscount;
        } else {
            System.out.println("Error: invalid new discount");
        }
    }

}