/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;
import java.util.Scanner;
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
            int a=in.nextInt();
            int b=in.nextInt();
            if (a>b)
            {
                System.out.println('>');
            }
            else if(a<b)
            {
                System.out.println('<');
            }
            else
            {
              System.out.println('=');  
            }
        }
        t--;
                
    }
    
}
