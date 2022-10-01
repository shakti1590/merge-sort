import java.util.Scanner;
/*  Program for Multiplication of Two Matrices */
public class Mularrays {

    public static void main(String[] args) {
        
        int i,j,m,n,p,q,sum=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows of first matrix:");
        m=sc.nextInt();
        System.out.print("Enter number of columns of first matrix:");
        n=sc.nextInt();
        System.out.println("");
        System.out.print("Enter number of rows of second matrix:");
        p=sc.nextInt();
        System.out.print("Enter number of columns of second matrix:");
        q=sc.nextInt();
        System.out.println("");
        
        if(n!=p)
        System.out.println("Sorry multiplication can’t be done!!");
        else 
        {
        int a[][]=new int[m][n];
        int b[][]=new int[p][q];
        int mul[][]=new int[m][q];
        
//--------------Enter_data---------------------------------------------
        
System.out.println("Enter values of first matrix :: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(" "+i+j+" position:");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter values of 2nd matrix :: ");
        for(i=0;i<p;i++)
        {
            for(j=0;j<q;j++)
            {
                System.out.print(" "+i+j+" position:");
                b[i][j]=sc.nextInt();
            }
        }
//----------------Display-------------------------------------------------
        
        System.out.println("Ist matrix :: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(" "+a[i][j]);
              
            }
            System.out.println("");
        }
        
        System.out.println("2nd matrix :: ");
        for(i=0;i<p;i++)
        {
            for(j=0;j<q;j++)
            {
                System.out.print(" "+b[i][j]);
              
            }
            System.out.println("");
        }
//----------------Multiplication-------------------------------------------
        
        for(i=0;i<m;i++)
        {
            for(j=0;j<q;j++)
            {
                mul[i][j]=0;
                
                for(int k=0;k<n;k++)
                {
                    mul[i][j] = mul[i][j] + a[i][k]*b[k][j];
                }
            }
        }
        
//-------------Display_multiplication_matrix--------------------------------

        System.out.println("Multiplication of matrices are:: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<q;j++)
            {
                System.out.print(" "+mul[i][j]);
              
            }
            System.out.println("");
        }
        
    }
    
}
}