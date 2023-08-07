package day3;

public class Conditionalclass {

public static void main(String[]  args) {
    int age = 18;
    float percentage = 50.20F;

    if (age >= 18) {     //>, <, =, <=, >=
        System.out.println("you are eligible to vote...");
    }
    else {
        System.out.println("you are not eligible to vote...");
    }
    if(percentage > 80 ) {
        System.out.println("A");
    }
    else if(percentage > 60) {
        System.out.println("B");
    }
    else {
        System.out.println("C");
    }
    String switch_case = "Books";
    switch (switch_case) {
        case "tamil":
            System.out.println("Tamil!!!");
            break;
        case  "english":
            System.out.println("English!!!");
            break;
        case "maths":
            System.out.println("Maths!!!");
            break;
        case "science":
            System.out.println("Science!!!");
            break;
        default:
            System.out.println("You have selected nothing from the case!!");
            break;
    }
}
}


