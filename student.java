import java.util.Scanner;

public class student{

	Scanner sc = new Scanner(System.in);

	String []name;
	String []grade;
	int []avg;
	int s,maxIndex,minIndex;
	int max,min;
	
	public void input(){

		//User can enter number of student
		System.out.print("Number of Students: ");
		s=sc.nextInt();

		//store all data in the array
		name=new String[s];
		grade=new String[s];
		avg=new int[s];

		System.out.println("---------------------------");


		for (int i=0;i<s ;i++ ) {
			System.out.print("Student name: ");
			name[i]=sc.next();

			System.out.print("Grade : ");
			grade[i]=sc.next();
	
			System.out.print("Average : ");
			avg[i]=sc.nextInt();
			System.out.println("---------------------------");	
		}
	}

	public void calculate(){

		//Find the maximum mark
		max = avg[0];
        min = avg[0];
        maxIndex = 0;
        minIndex = 0;

        // Find the maximum mark
        for (int a = 0; a < s; a++) {
            if (avg[a] > max) {
                max = avg[a];
                maxIndex = a;
            }
        }

        System.out.println("---------------------------");
        System.out.println("Name: " + name[maxIndex]);
        System.out.println("Best marks are: " + avg[maxIndex]);

        // Find the minimum mark
        for (int c = 0; c < s; c++) {
            if (avg[c] < min) {
                min = avg[c];
                minIndex = c;
            }
        }

        System.out.println("---------------------------");
        System.out.println("Name: " + name[minIndex]);
        System.out.println("Lowest marks are: " + avg[minIndex]);
    }
				
	
	public static void main(String[] args) {

		Scanner ab = new Scanner(System.in);
		
		int password=123; //Hard code password
		int a;

		System.out.println("Enter the password :");
		a=ab.nextInt();

		//Create the object
		student ss = new student();

		if(password==a){
			//Call the methords
			ss.input();
			ss.calculate();
		}
		else{
			System.out.println("Wrong password"+a);
		}
	}
}