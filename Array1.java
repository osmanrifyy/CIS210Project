public class Array1{
   public static void main(String[]args)
   { 
      //Create array
      int[] numbers= new int[5];
      
      //Assign values to array
      numbers[0]=2;
      numbers[1]=5;
      numbers[2]=3;
      numbers[3]=1;
      numbers[4]=7;
      
      //Create and assign at the same time, 5 values to array
      //int[] numbers={2,5,6,7,7};
      
      //Output
     for (int i=0; i<numbers.length;i++)
     {
         System.out.println(numbers[i]);
     }
     
    }
}
     
