import java.util.Scanner;


class prog4
{
    static int row;
    static int col;
    static Scanner sc = new Scanner(System.in);

	static int[][] insert(int[][] arr1 ,int row,int col)
	{
        for(int i = 0 ; i< row ; i++)
            {
                for(int j = 0 ; j < col ; j++)
                {
                    System.out.print("Enter the colounm arr1["+i+"]["+j+"] = ");
                    arr1[i][j] = sc.nextInt();

                }

                
            }

        return arr1;
		
		
	}
    static void show(int[][] arr)
    {
        for(int i = 0 ; i< arr.length ; i++)
            {
                for(int j = 0 ; j < arr.length ; j++)
                {
                    System.out.print(arr[i][j] + " ");

                }
                System.out.println("\n");
                
            }

    }
	

	public static void main(String args[])
    {
            

		    System.out.print("Enter the order of the matrix :  ");
		    System.out.print("Enter the row : ");
		    int row = sc.nextInt();
		    System.out.print("Enter the col : ");
	        int col = sc.nextInt();
            
	        int[][] arr1;
            arr1 = insert(arr1,row,col);
            show(arr1);
	
            int[][] arr2;
            arr1 = insert(arr2,row,col);
            show(arr1);
            


    }
}
