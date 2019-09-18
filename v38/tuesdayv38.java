import java.util.Scanner;

public class tuesdayv38 {

	public static void main(String[] args) {
		
		int tal1 = 0;
		int tal2 = 0;
		int tal3 = 0;
		int tal4 = 0;
		int tal5 = 0;

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv 5 tal");
		
		tal1 = input.nextInt(); //Lägger skrivna tal in i variablar
		
		tal2 = input.nextInt();
		
		tal3 = input.nextInt();
		
		tal4 = input.nextInt();
		
		tal5 = input.nextInt();
		
		double mid = (tal1+tal2+tal3+tal4+tal5); //för någon anledning fungerar det inte att ha som bara en variabel
		double mid2 = mid/5;
		
		if(tal1 >= tal2 && tal1 >= tal3 && tal1 >= tal4 && tal1 >= tal5){
		System.out.println("högst tal: "+tal1);
		}
		else if(tal2 >= tal1 && tal2 >= tal3 && tal2 >= tal4 && tal2 >= tal5){
		System.out.println("högst tal: "+tal2);
		}
		else if(tal3 >= tal1 && tal3 >= tal2 && tal3 >= tal4 && tal3 >= tal5){
		System.out.println("högst tal: "+tal3);
		}
		else if(tal4 >= tal1 && tal4 >= tal2 && tal4 >= tal3 && tal4 >= tal5){
		System.out.println("högst tal: "+tal4);
		}
		else if(tal5 >= tal1 && tal5 >= tal2 && tal5 >= tal3 && tal5 >= tal4){
		System.out.println("högst tal: "+tal5);
		}
		//Printar högst tal
		
		
		if(tal1 <= tal2 && tal1 <= tal3 && tal1 <= tal4 && tal1 <= tal5){
		System.out.println("lägst tal: "+tal1);
		}
		else if(tal2 <= tal1 && tal2 <= tal3 && tal2 <= tal4 && tal2 <= tal5){
		System.out.println("lägst tal: "+tal2);
		}
		else if(tal3 <= tal1 && tal3 <= tal2 && tal3 <= tal4 && tal3 <= tal5){
		System.out.println("lägst tal: "+tal3);
		}
		else if(tal4 <= tal1 && tal4 <= tal2 && tal4 <= tal3 && tal4 <= tal5){
		System.out.println("lägst tal: "+tal4);
		}
		else if(tal5 <= tal1 && tal5 <= tal2 && tal5 <= tal3 && tal5 <= tal4){
		System.out.println("lägst tal: "+tal5);
		}
		//Printar lägst tal
	
		
		System.out.println("Medelvärde: "+mid2); //Printar medelvärde
	}

}
