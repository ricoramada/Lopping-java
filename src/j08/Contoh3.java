package j08;

public class Contoh3 {
    public static void main(String[] args) {
        int x;
        //cara 1
        for(x = 1; x <= 20; x+=2)
        {
            System.out.println(x + " ");
        }
        System.out.println();
        
        
        for(x = 2; x <= 20; x+=2)
        {
            System.out.println(x + " ");
        }
        //cara 2
        for(x = 1; x <=20; x++)
        {
            if(x % 2 == 1)
            {
                System.out.println(x +" ");
            }
        }
        
        for(x = 1; x <=20; x++)
        {
            
        }
    }
}
