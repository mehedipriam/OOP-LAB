public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        int a=5,b=10;
        int sum=a+b;
        System.out.println("This is sum : " +(sum));

        // single line comment
        /*
        multiline comment
         */

        float p=1.5f,q=1.3f;
        System.out.println("Sum of Floating : " +(p+q));


        /*
        without initial that value create array
        int array[] = new int[declare size];
        */
        // array max number
        System.out.println("Find the max number of this array (2,3,9,8,13,1,5,19,15,8,4)");
        int[] arr={2,3,9,8,13,1,5,19,15,8,4};
        int max = arr[0];
        for (int i=0; i<11; i++)
        {
            if (max<arr[i])
            {
                max= arr[i];
            }
        }
        System.out.println("Max number is : "+(max));
    }
}
