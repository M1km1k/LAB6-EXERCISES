import java.util.*;

public class TestExercise1{

public static void main(String [] args){

double length;
double width;

Scanner get = new Scanner(System.in);

System.out.print("Enter length: ");
length = get.nextDouble();

System.out.print("Enter width = ");
width = get.nextDouble();

Exercise1 e = new Exercise1(length,width); 
e.display();


}



}