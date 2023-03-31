import java.util.*;

public class TestExercise2{

public static void main(String [] args){

String id;
String desc;
double unitPrice;
int qty;

Scanner get = new Scanner(System.in);

System.out.print("ID          : ");
id = get.nextLine();

System.out.print("DESCRIPTION : ");
desc = get.nextLine();

System.out.print("PRICE       : ");
unitPrice = get.nextDouble();

System.out.print("QUANTITY    : ");
qty = get.nextInt();

Exercise2 e = new Exercise2(id,desc,unitPrice,qty);
e.display();

}


}