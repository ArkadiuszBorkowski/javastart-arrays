import java.util.Arrays;

class ArraaysExample {
     public static void main(String[] args) {
         String[] names = {"Basia" ,"Kasia", "Wojtek", "Agnieszka", "Kacper"};
         Integer[] numbers = {4,7, 2,1,14,23,10,5};

         System.out.println("Names:");
         printArray(names);

         System.out.println(Arrays.toString(names));

         System.out.println("Numbers:");
         printArray(numbers);
         System.out.println(Arrays.toString(numbers));

         String[] names2 = Arrays.copyOf(names, names.length);
         Integer[] numbers2 = Arrays.copyOf(numbers, numbers.length);

         Arrays.sort(names);
         System.out.println(Arrays.toString(names));
         System.out.println(Arrays.toString(names2));

         Arrays.sort(numbers);
         System.out.println(Arrays.toString(numbers));

         System.out.println(Arrays.equals(numbers, numbers2));

         String[] strings = new String[5];
         Arrays.fill(strings,"Wacek");
         printArray(strings);
     }



     public static <T> void printArray( T[] arr){
         for (T t : arr) {
             System.out.println(t + " ");
         }
         System.out.println();
     }
}
