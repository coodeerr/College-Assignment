import java.util.Scanner;
public class assg_3_q8 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter the x coodinate: ");
        double a= obj.nextDouble();
        System.out.print("enter the y coordinate: ");
        double b= obj.nextDouble();
        if(a>0 && b>0){
            System.out.println("The coordinates"+ "("+a+ "," +b+ ")" + "are in 1st quadrant");
        }
        else if(a<0 && b>0){
            System.out.println("The coordinates"+ "("+a+ "," +b+ ")" + "are in 2st quadrant");
        }
        else if(a<0 && b<0){
            System.out.println("The coordinates"+ "("+a+ "," +b+ ")" + "are in 3st quadrant");
        }
        else{
            System.out.println("The coordinates"+ "("+a+ "," +b+ ")" + "are in 4st quadrant");
        }

    }
}
