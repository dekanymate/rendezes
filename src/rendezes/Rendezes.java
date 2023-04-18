package rendezes;
public class Rendezes {
    
    private static int n;
    private static int[] tomb = {1,2,3,4,5,6,7,8,9,10};
    public static void main(String[] args) {
        kiir();
    }
    
    public static void kiir(){
        for (int i : tomb) {
            System.out.println(i);
        }
    }
    
    public static void shellshort(tomb, n){
        int interval = n / 2;
        while (interval>0) {            
            for (int i = 0; i < interval; i) {
                int temp = tomb[i];
                int j = i;
                while (j >= interval && tomb[j - interval]> temp) {                    
                    tomb[j] = tomb[j - interval];
                    j -= interval;
                }
                tomb[j] = temp;
            }
            interval /=2;
        }
        
    }
    
}
