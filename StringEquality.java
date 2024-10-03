import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {
        String s1 = "Abc";

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            String s2 = sc.next();

//           if(s1.equals(s2)) {
//               System.out.println("Equal");
//           }
//           else {
//               System.out.println("Not equal");
//           }

            int res = s2.compareTo(s1);
            if(res>0){
                System.out.println(res);
                System.out.println("S2 is bigger");
            } else if (res<0) {
                System.out.println(res);
                System.out.println("S2 is smaller");
            }
            else {
                System.out.println(res);
                System.out.println("Both are equal");
            }


        }
    }
}
