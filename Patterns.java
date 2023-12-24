//ELISSA ABOU HASSAN

package project;
import java.util.Scanner;

public class PROJECT {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int patternNumber = 1, size = 0;
        char ch1 = 0, ch2 = 0;
        
        while(patternNumber != 0){
            
            System.out.println("Enter pattern number [1, 4] (0 to quit): ");
            patternNumber = input.nextInt();
            while(patternNumber>4 || patternNumber<0){
                System.out.println("Enter pattern number [1, 4] (0 to quit): ");
                patternNumber = input.nextInt();
            }
            if (patternNumber == 0){
                System.out.println("Thank you for using this application.");
                break;
            }
            
            System.out.println("Enter an alpha-numeric first char: ");
            ch1 = input.next().charAt(0);
            while(!isAlphaNumeric(ch1)){
                System.out.println("Enter an alpha-numeric first char: ");
                ch1 = input.next().charAt(0);
            }
            
            System.out.println("Enter a non alpha-numeric second char: ");
            ch2 = input.next().charAt(0);
            while(isAlphaNumeric(ch2)){
                System.out.println("Enter a non alpha-numeric second char: ");
                ch2 = input.next().charAt(0);
            }
            
            System.out.println("Enter a size >= 3: ");
            size = input.nextInt();
            while(size<3){
                System.out.println("Enter a size >= 3: ");
                size = input.nextInt();
            }
            
            switch(patternNumber){
            case 1:
                pattern1(ch1, ch2, size);
            break;
            
            case 2: 
                pattern2(ch1, ch2, size);
            break;
            
            case 3:
                pattern3(ch1, ch2, size);
            break;
            
            case 4:
                pattern4(ch1, ch2, size);
            }
        }
    }
    
    public static boolean isAlphaNumeric(char ch){
        if((ch>='a' && ch<='z') || (ch>='A' && ch<= 'Z') || (ch>='0' && ch<='9')){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static String stringNchar(char ch, int n){
        int x = n;
        String s = "";
        while(x!=0){
            s=s+ch;
            x=x-1;
        }
        return s;
    }
    
    public static String stringNchar(char ch1, int n1, char ch2, int n2){
        String s2 = stringNchar(ch1,n1) + stringNchar(ch2,n2);
        return s2;
    }
    
    public static String stringNchar(char ch1, char ch2, int n1, int n2){
        String s3;
        s3 = stringNchar(ch1,n1) + stringNchar(ch2,n2) + stringNchar(ch1,n1);
        return s3;
    }
    
    public static void pattern1(char ch1, char ch2, int size){
       String pattern1 = "";
       for(int i = size; i>0; i--){
           pattern1 += "*" + stringNchar(ch2, ch1, i-1, 2*(size-i)+1) + "*\n";
       }
       System.out.println(pattern1);
    }
    
    public static void pattern2(char ch1, char ch2, int size){
        String pattern2 = "";
        for(int i = 1; i<=size; i++){
            pattern2 += "*" + stringNchar(ch2, ch1, i-1, 2*(size-i)+1) + "*\n";
        }
        System.out.println(pattern2);
    }
    
    public static void pattern3(char ch1, char ch2, int size){
        for(int i = 1; i<=size; i++){
           System.out.print("*" + stringNchar(ch1,i,ch2,size-i) + "*\n"); 
        }
        for(int j = size; j>=2; j--){
           System.out.print("*" + stringNchar(ch1,j-1,ch2,(size-j)+1) + "*\n");
        }
    }
    
    public static void pattern4(char ch1, char ch2, int size){
        for(int i = 1; i<=size; i++){
            System.out.print("*" + stringNchar(ch2,size-i,ch1,i) + "*\n");
        }
        for(int j = size; j>=2; j--){
            System.out.print("*" + stringNchar(ch2,(size-j)+1,ch1,j-1) + "*\n");
        }
    }
        
}
 

