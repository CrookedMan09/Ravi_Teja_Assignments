package JavaAs2Qsn7;

public class Candy extends DessertItems{
	float quantity;
	public Candy(float q) {
		quantity=q;
	}
     public float getcost() {
    	 float cost=quantity*2f*60;
    	 float taxamount=(5f/100f)*cost;
    	 float totalcost=cost+taxamount;
    	 return totalcost;
     }
     
}
