public class Exercise1{

private double length;
private double width;

public Exercise1(double length, double width){

this.length = length;
this.width = width;

}

public Exercise1(){

length = 0;
width = 0;

}

public double setLength(double length){

return this.length;

}

public double setWidth(double width){

return this.width;

}

public double getLength(){

return length;

}

public double getWidth(){

return width;

}

public double getArea(){

double rectangle;

return rectangle = length * width;

}

public void display(){

System.out.printf("The area of rectangle is %.1f",getArea());


}



}