import java.util.Scanner;

public class HurricaneSpeed {
    public static void main (String[] args){
        int windSpeed = 0;
        Scanner input = new Scanner(System.in);
        String hurricaneCategory = "";

        System.out.print("Enter a hurricane wind speed: ");
        windSpeed = input.nextInt();

        if(windSpeed < 74 ) {
            hurricaneCategory = "too weak to be a hurricane.";
        } else if (windSpeed < 95) {
            hurricaneCategory = "Category 1";
        } else if (windSpeed < 110) {
            hurricaneCategory = "Category 2";
        } else if (windSpeed < 129) {
            hurricaneCategory = "Category 3";
        } else if (windSpeed < 156) {
            hurricaneCategory = "Category 4";
        } else {
            hurricaneCategory = "Category 5";
        }

        System.out.println("That is " + hurricaneCategory);
    }
}
