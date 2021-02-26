import java.util.*;
public class CarFuelUsage{
/*
	Problem description :

	Car had fuel x liters , with fuel usage y liters/100km with driver in it
	If there are a passengers p , Then Basic fuel usage increase by 5% for each passenger
	If condition c is on (boolean) , Then total fuel usage increase by 10%
	write a function that return the distance that the car can travel depending in given info (fuel,fuelUsage,passengers,condition)
	distance's tolerance should be 0.1
*/

private static double getCarMaxDistance(double fuel,double fuelUsage,int passengers,boolean condition){
	double distance;
	double passengerTotalConsump=passengers*(fuelUsage*5/100);
	fuelUsage = fuelUsage + passengerTotalConsump;
	if(condition) {
		//if condition is on , total fuel usage increase by 10%
		fuelUsage+=fuelUsage*10/100;
	}
	distance=(fuel*100)/fuelUsage;
	//now round it to one digit after the point
	distance = Math.round(distance * 10d)/10d;

	return distance;
}

public static void main(String ar[]){
	//Testing with (70.0 , 7.0 , 0 , false) , (36.1 , 8.6 , 3 , true ) , (55.5 , 5.5 , 5 , false)

	System.out.println("A car with 70 liters & fuelUsage of 7 liters/100km & "+
	"0 passengers & without condition can travel for " + getCarMaxDistance(70.0 , 7.0 , 0 , false));

	System.out.println("A car with 36.1 liters & fuelUsage of 8.6 liters/100km & "+
		"3 passengers & with condition can travel for " + getCarMaxDistance(36.1 , 8.6 , 3 , true));

	System.out.println("A car with 55.5 liters & fuelUsage of 5.5 liters/100km & "+
		"5 passengers & without condition can travel for " + getCarMaxDistance(55.5 , 5.5 , 5 , false));

}
}