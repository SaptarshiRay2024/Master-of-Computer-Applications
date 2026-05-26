import java.util.*;

class Array1a
{
    int[][] getInput(int[][] a)
    {
        Scanner sc = new Scanner(System.in);
        int i, j;
        for(i=0 ; i<3 ; i++)
        {
            for(j=0 ; j<3 ; j++)
            {
                System.out.print("Enter element : ");
                a[i][j]=sc.nextInt();

            }
        }
        for(i=0 ; i<3 ; i++)
        {
            for(j=0 ; j<3 ; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        return a;
    }

    int[] calculate(int[][] a)
    {
        int[] b = new int[3];
        int i, j, n;
        for(i=0 ; i<3 ; i++)
        {
            n=0;
            for(j=0 ; j<3 ; j++)
            {
                n=n+a[i][j];
            }
            b[i]=n;
        }
        return b;
    }

    void subArray(int[][] a)
    {
        int[][] a1 = new int[2][2];
        int[][] a2 = new int[2][2];
        int[][] a3 = new int[2][2];
        int[][] a4 = new int[2][2];
        int i, j, k;
        for(i=0 ; i<2 ; i++)
        {
            for(j=0 ; j<2 ; j++)
            {
                a1[i][j]=a[i][j];
            }
        }
        for(i=0 ; i<2 ; i++)
        {
            k=0;
            for(j=1 ; j<3 ; j++)
            {
                a2[i][k]=a[i][j];
                k++;
            }
        }
        for(i=1 ; i<3 ; i++)
        {
            k=0;
            for(j=0 ; j<2 ; j++)
            {
                a3[k][j]=a[i][j];
                k++;
            }
        }
        for(i=1 ; i<3 ; i++)
        {
            for(j=1 ; j<3 ; j++)
            {
                a4[i-1][j-1]=a[i][j];
            }
        }
        for(i=0 ; i<2 ; i++)
        {
            for(j=0 ; j<2 ; j++)
            {
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }
        for(i=0 ; i<2 ; i++)
        {
            for(j=0 ; j<2 ; j++)
            {
                System.out.print(a2[i][j] + " ");
            }
            System.out.println();
        }
        for(i=0 ; i<2 ; i++)
        {
            for(j=0 ; j<2 ; j++)
            {
                System.out.print(a3[i][j] + " ");
            }
            System.out.println();
        }
        for(i=0 ; i<2 ; i++)
        {
            for(j=0 ; j<2 ; j++)
            {
                System.out.print(a4[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Array1
{
    public static void main(String[] args)
    {
        int[][] a = new int[3][3];
        int[] b = new int[3];
        int i;
        Array1a obj1 = new Array1a();
        obj1.getInput(a);
        b=obj1.calculate(a);
        for(i=0 ; i<3 ; i++)
        {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        obj1.subArray(a);
    }
}