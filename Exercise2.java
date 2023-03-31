public class Exercise2{

private String id,desc;
private double unitPrice;
private int qty;

public Exercise2(String id, String desc, double unitPrice, int qty){

this.id = id;
this.desc = desc;
this.unitPrice = unitPrice;
this.qty = qty;

}

public int setQty(int qty){

return this.qty;

}

public double setUnitPrice(double unitPrice){

return this.unitPrice;

}


public String getID(){

return id;

}

public int getQty(){

return qty;

}

public String getDesc(){

return desc;

}

public double getTotal(){

double totalprice = unitPrice * qty;

return totalprice;

}

public void display(){

System.out.print ("ID              :  "+id.toString()+"\n");
System.out.print ("DESCRIPTION     : "+desc.toString()+"\n");
System.out.printf("PRICE           : Php%.2f\n",unitPrice);
System.out.printf("QUANTITY        :  %d\n",getQty());
System.out.printf("TOTAL           : Php%.2f\n",getTotal());

}



}