import java.util.Scanner;
class arr
{
    void create(int r , int c)
    {
        int a[][] = new int[r][c];

    }

    int[][] show(int[][] a )
    {
        for(int i = 0 ; i< row ; i++)
        {
            for(int j = 0 ; j < col ; j++)
            {
                System.out.print(a[i][j] + " ");

            }
            System.out.println("\n");
            
        }
    }

}

class prog4
{
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the order of the matrix :  ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        arr arr1 = new arr();
        arr1.create(row,col);

        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];
        int[][] arr3 = new int[row][col]; 
        

        for(int i = 0 ; i< arr2.length ; i++)
        {
            for(int j = 0 ; j < arr2.length ; j++)
            {
                System.out.print(arr2[i][j] + " ");

            }
            System.out.println("\n");
            
        }

        for(int i = 0 ; i< arr1.length ; i++)
        {
            for(int j = 0 ; j< arr1.length ; j++)
            {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for(int i = 0 ; i < arr1.length ; i++)
        {
            for(int j = 0 ; j < arr1.length ; j++)
            {
                System.out.print(arr3[i][j] + " " );
            }
            System.out.println();
        }


    }
}
