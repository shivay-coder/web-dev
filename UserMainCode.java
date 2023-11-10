public class UserMainCode{
    public static void main(String []args){
        System.out.println(findPIN(3521,2452,1352,37));
    }
    public static int findPIN(int input1, int input2, int input3, int input4){             
        int oddsum = osum(input1)+osum(input2)+osum(input3);      
        if(input4%2==0){
           return esum(input1)+esum(input2)+esum(input3);     
        }
        else{
            return oddsum = osum(input1)+osum(input2)+osum(input3);
        }

    }
    public static int esum(int a){
        int sum = 0;
        while(a>0){
            int num = a%10;           
            if(num%2==0){
                sum = sum+num;
            }
            a/=10;
        }      
        return sum;
    }
       public static int osum(int a){
            int num = a%10;           
            if(num%2!=0){
                sum = sum+num;
            }
            a/=10;
        }      
        return sum;
    }
}