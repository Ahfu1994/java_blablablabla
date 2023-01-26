import java.util.Scanner;

public class ED11_2Table
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [][]x = new char[][]
                        { {'a','b','c','d'},
                          {'e','f','g','h'},
                          {'i','j','k','l'},
                          {'m','n','o','p'}};
        Print(x);
        while (true)
        {
         int n = sc.nextInt();
         sc.nextLine();
         if (n == -1)
         {
             break;
         }
         String c = sc.nextLine();
         if(c.charAt(0) == 'l')
         {
                 char t = x[n][0];
                 for (int i = 0; i <x[0].length-1 ; i++) {
                     x[n][0] = x[n][i+1];
                 }
                  x[n][x.length-1] = t;
         }
         if (c.charAt(0) == 'r')
         {
                 char t = x[n][x.length-1];
                 for (int i = x.length-1; i >0 ; i--) {
                     x[n][i] = x[n][i-1];
                 }
                 x[n][0] = t;
         }
         if(c.charAt(0) == 'u')
         {
             char t = x[0][n];
             for (int i = 0; i <x[0].length-1 ; i++) {
                 x[i][n] = x[i+1][n];
             }
             x[x.length-1][n] = t;
         }
         if(c.charAt(0) =='d')
         {
             char t = x[0][n];
             for (int i = x[0].length-1; i >0 ; i--) {
                 x[i][n] = x[i-1][n];
             }
             x[x[0].length-1][n] = t;
         }
         Print(x);

        }
    }
    public static void Print(char[][]x)
    {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }
}
