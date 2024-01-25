public class SegitigaTerbalik
{
    public static void Segitiga(int n)
    {
        int i, j;
        for(i=1; i<=n; i++) { //outer loop for number of rows(n)
            for(j=n; j>=i; j--) { // inner loop for spaces
                System.out.print("* "); // printing space
            }
        
        System.out.println(); // ending line after each row
        }
    }
    // Driver Function
    public static void main(String args[])
    {
        int n = 5;
        Segitiga(n);
    }
}