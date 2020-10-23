import java.util.Arrays;
public class Demo{
  public static String arrToString(int[] arr){
  String out="{";
  for (int i=0;i<arr.length-1;i++){
    out+=arr[i]+", ";
  }
  if(arr.length>0){
  out+=arr[arr.length-1];}
  out+="}";
  return out;
}

public static String arrToString(String[] arr){
  String out="{";
  for (int i=0;i<arr.length-1;i++){
    out+=arr[i]+", ";
  }
  if(arr.length>0){
  out+=arr[arr.length-1];}
  out+="}";
  return out;
}

public static String arrayDeepToString(int[][] arr){
String[] stringArr = new String[arr.length];
  for(int i=0;i<arr.length;i++){
    stringArr[i]=arrToString(arr[i]);
  }
  return arrToString(stringArr);
}

public static int[][] create2DArray(int rows, int cols, int maxValue){
  int[][] arr = new int[rows][cols];
  for(int ROW=0;ROW<arr.length; ROW++){
    for(int COL=0;COL<arr[ROW].length;COL++){
      arr[ROW][COL]=(int)(Math.random()*maxValue*1.1);
    }
  }
  return arr;
}

public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
  int[][] arr = new int[rows][];
  for(int i=0;i<arr.length;i++){
    int col=(int)(Math.random()*cols*1.2);
    arr[i]=create2DArray(1,col,maxValue)[0];
  }
  return arr;
}

  public static void main(String[] args){

    int[] arr0={7,11,9};
    int[] arr1= {69,45,2,89,4};
    int[] arr2= {2,5,6,5};
    int[] arr3={7,8,8,4,54,5};
    int[] arr4= {9,0,5,43,43,54,43};
    int[][] arr2d ={arr0,arr1};
    System.out.println(arrayDeepToString(arr2d));
    System.out.println(arrayDeepToString(create2DArray(5,4,4)));
    System.out.println(arrayDeepToString(create2DArrayRandomized(5,4,4)));

    int[][][]arrays = new int[3][][];
    arrays[0]=create2DArray(3,6,5);
    arrays[1]=create2DArray(6,3,100);
    arrays[2]=create2DArrayRandomized(9,2,10);

    System.out.println("Random 3X6 up to 5 - compare to Arrays.toString method");
    System.out.println(Arrays.deepToString(arrays[0]).replace("], ","],\n"));
    System.out.println(arrayDeepToString(arrays[0]).replace("}, ","},\n"));
    System.out.println("\nRandom 6X3 up to 100");
    System.out.println(arrayDeepToString(arrays[1]).replace("}, ","},\n"));
    System.out.println("\nRandom 9X(0,1 or 2) up to 10");
    System.out.println(arrayDeepToString(arrays[2]).replace("}, ","},\n"));

}
}
