package assignmentt;
import java.util.Scanner;
public class management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] books=new String[4][7];
        books[0][0]="Computer Maintenance";
        books[0][1]="Computer Maintenance";
        books[0][2]="62";
        books[0][3]="Rana Al-Khatib";
        books[0][4]="Storytel";
        books[0][5]="Arabic";
        books[0][6]="2014";
        
        books[1][0]="An introduction to cybernetics";
        books[1][1]="An introduction to cybernetics";
        books[1][2]="133";
        books[1][3]="ýHannah Barton / Irene Connolly / Marion Palmerý";
        books[1][4]="ý alshegrey bookstore";
        books[1][5]="Arabic";
        books[1][6]="2021";
        
        books[2][0]="Artificial Intelligence";
        books[2][1]="Artificial Intelligence";
        books[2][2]="10";
        books[2][3]="Jerry Kaplan";
        books[2][4]="Bookmania";
        books[2][5]="Arabic";
        books[2][6]="2021";
        
        books[3][0]="Digital Governance Department";
        books[3][1]="Digital Governance Department";
        books[3][2]="114";
        books[3][3]="Yuchi Chen";
        books[3][4]="Institute of Public Administration";
        books[3][5]="Arabic";
        books[3][6]="2020";
           
        Scanner radar=new Scanner(System.in);
        
        System.out.println("which method do you want to use to search for a book: \n1-by name of book\n2-by number of book");
        int num=radar.nextInt();
        
        if(num == 1)
        {
            System.out.println("Enter the name of book");
            String choince=radar.nextLine();
            String choice=radar.nextLine();

            for(int i=0; i<4; i++)
            {
                if(choice.equalsIgnoreCase(books[i][0]))
                {
                    System.out.println("Book name: "+books[i][1]);
                    System.out.println("ISBN: "+books[i][2]);
                    System.out.println("Author: "+books[i][3]);
                    System.out.println("Publisher: "+books[i][4]);
                    System.out.println("Language: "+books[i][5]);
                    System.out.println("year published: "+books[i][6]);
                }
            }
        }
        else if(num == 2)
        {
            System.out.println("Enter the number of book");
            String choice=radar.next();

            for(int i=0; i<4; i++)
            {
                if(choice.equalsIgnoreCase(books[i][2]))
                {
                	System.out.println("Book name: "+books[i][1]);
                    System.out.println("ISBN: "+books[i][2]);
                    System.out.println("Author: "+books[i][3]);
                    System.out.println("Publisher: "+books[i][4]);
                    System.out.println("Language: "+books[i][5]);
                    System.out.println("year published: "+books[i][6]);
                }
            }
        }
	}

}
