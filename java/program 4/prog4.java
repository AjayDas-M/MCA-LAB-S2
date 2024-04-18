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
                    System.out.print("Enter the element["+i+"]["+j+"] = ");
                    arr1[i][j] = sc.nextInt();

                }

                
            }System.out.println();

        return arr1;
		
		
	}

    static void show(int[][] arr,int row,int col)
    {
        int i,j;
        for( i = 0 ; i< row ; i++)
            {
            
                for(j = 0 ; j < col ; j++)
                {
                    
                    System.out.print(arr[i][j] + " ");

                }
                System.out.println();

                
            }

    }
	
    static int[][] add(int[][] arr1,int arr2[][],int row,int col)
    {
        int[][] arr = new int[row][col];
        for(int i = 0 ; i < row ; i++)
        {
            for(int j = 0 ; j < col ; j++)
            {
                arr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return arr;
    }
  static void hypershow(int[][] arr1,int arr2[][],int arr3[][],int row, int col)
    {
        for(int i = 0 ; i < row ; i++)
        {
            
            for(int j = 0 ; j < col ; j++)
            {
                
                System.out.print(arr1[i][j] + " ");

            }
            System.out.print(" + ");
            for(int j = 0 ; j < col ; j++)
            {
                
                System.out.print(arr2[i][j] + " ");

            }
            System.out.print(" = ");
            for(int j = 0 ; j < col ; j++)
            {
                
                System.out.print(arr2[i][j] + " ");

            }
            System.out.println();
        }
    }
	public static void main(String args[])
    {
             
		    System.out.println("Enter the order of the matrix ");
		    System.out.print("Enter the row : ");
		    int row = sc.nextInt();
		    System.out.print("Enter the col : ");
	        int col = sc.nextInt();
            System.out.println();
            
            System.out.println("1st Matrix");
	        int[][] arr1 =  new int[row][col];
            arr1 = insert(arr1,row,col);
            System.out.println();
            show(arr1,row,col);
            System.out.println();
            
            System.out.println("2nd matrix");
            int[][] arr2 = new int[row][col];
            arr2 = insert(arr2,row,col);
            System.out.println();
            show(arr2,row,col);
            System.out.println();
            
            int[][] arr3 = new int[row][col];
            arr3 = add(arr1,arr2,row,col);
            
          /*show(arr1,row,col);
            System.out.print(" + ");
            show(arr2,row,col);
            System.out.print(" = ");
            */
            hypershow(arr1,arr2,arr3,row,col);
            


    }
}
