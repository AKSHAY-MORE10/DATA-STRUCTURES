//? create an Array
//* Datatype arrayname[] = new Datatype[size] [size mean kitna size ke location chaheya ]

// //? create an array using  different datatype
//  int arr1[] = new int[50];
//  int arr2[] = new int{1, 2, 3, 4};
//  String arr3[] = {"apples", "banana", "mango"}


// import java.util.*;
// public class arrayOP {

//     public static void main(String[] args) {
//                Scanner scnr = new Scanner(System.in);
//         // datatype arrname[] = new datatype[size];

//        int arr1[] = new int[5];

//        int length = arr1.length;
//        System.out.println(length);

// arr1[0] = 10;
// arr1[1] = 20;
// arr1[2] = 30;
// arr1[3] = 40;
// arr1[4] = 50;

// System.out.println(arr1[3]);

// arr1[4] = 60;
// System.out.println(arr1[4]);



//  int marks[] = new int[10];

//         marks[0] = scnr.nextInt();
//         marks[1] = scnr.nextInt();
//         marks[2] = scnr.nextInt();



//         System.out.println("maths: " + marks[0]);
//         System.out.println("eng: " + marks[1]);
//         System.out.println("sci: " + marks[2]);
//         System.out.println("Marks: " + Arrays.toString(marks));

//         marks[2] = 100; // updated
//         marks[2] = marks[2] + 1; // updated 


//         System.out.println("sci: " + marks[2]);

//         int persentage = (marks[0] + marks[1] + marks[2]) / 3;
//         System.out.println("Persentage: " + persentage+ "%");




//         int arr1[] = new int[50];
//         int arr2[] = new int[]{1, 2, 3, 4};
//         String arr3[] = {"apples", "banana", "mango"};

//         // System.out.println(Arrays.toString(arr1));
//         System.out.println(Arrays.toString(arr2));
//         System.out.println(Arrays.toString(arr3));


//     }
// }



import java.util.*;

public class arrayOP {

  public static void update(int marks[]) {
    
        for (int i = 0; i < marks.length - 1; i++) {
            marks[i] = marks[i + 1];
        }
    }

    public static void main(String[] args) {

       int marks[] = {99,19,91};
        update(marks); // Update marks

        // Display updated marks array
        System.out.print("Updated marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }       
}




public class app {


public static void PrintArray(int arr[]){
arr[0] = 23;

System.out.print("[ ");
for(int i : arr){

System.out.print(   i + " ");

}
System.out.print(" ] ");
System.out.println();
}

public static void PlusOne(int num){
    num += 1;
    System.out.println(num);
}


    public static void main(String[] args) {
       
//*   Decelaring array 
 

//    ? Valid

// int arr[] = {2,3,4,5} ;
// int[] arr = {2,3,4,5,677,78};
// int arr []  = new int[20];
// int [] arr   = new int[20];
int arr    []= new int[20];



// System.out.print("[ ");
// for(int i : arr){

// System.out.print(   i + " ");

// }
// System.out.print(" ] ");
// System.out.println();


// ! Invalid tarika hai ye 
//  int arr[];
//  int arr[20]; = new int[]
// int arr[] = /int{2,3,4,5};
// int arr[] = new  int{2,3,4,5};


// System.out.print(arr);


// arr[0]= 23;
// arr[10] = 99;
// System.out.print(arr[0]);
// System.out.print("[ ");
// for(int i : arr){

// System.out.print(   i + " ");

// }
// System.out.print(" ] ");
// System.out.println();


// ? array as parameter 


//   * Accessing array element and updating array element

//  ? sending array as argument in the function / methods 

int arr234[] = {2,3,4,5};

// PrintArray(arr234);

// System.out.println(" this is printin in main  ");
// System.out.print("[ ");
// for(int i : arr234){

// System.out.print(   i + " ");

// }
// System.out.print(" ] ");
// System.out.println();
// PrintArray(new int[20]);

// ! invalid 
// PrintArray(new []int{2,3,43});
// PrintArray(int[20]);
// PrintArray(int[20] {2,3,4});
// PrintArray(new int[4]{2,3,4,5});

// ! array is always called by  reference 

// int num = 20 ;
// PlusOne(num);
// System.out.print( "this is printing in main " +num);


//  * array as argument in function , now array is passed as  reference not as value , that is  it is called by reference 
// ! invlaid


// Loops on array 
int arr12 [] = {2,3,4,5};


// for(int i = 0 ;  i < arr12.length ; i++){

//     System.out.print(arr12[i]);
// }

// for(int i : arr12){ // i in arrayname 
//     System.out.print(i);

// }

    }
}