package ArrayYoutube;

public class p1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enter the Element: ");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }


//    public static void main(String[] args) {
//      int[] arr={2, 25, 86 ,74 ,69, 85 ,15,23};
//      int[] arr1={4, 56, 25 ,62,78,35,75,25,12};
//  int len=Math.min(arr.length,arr1.length);
//      for(int i=0;i<arr.length;i++){
//          int temp=arr[i];
//          arr[i]=arr1[i];
//          arr1[i]=temp;
//      }
////        System.out.println("A= "+Arrays.toString(arr));
////        System.out.println("B= "+Arrays.toString(arr1));
//     for(int  x:arr){
//         System.out.print(x+" ");
//     }
//        System.out.println("==============");
//     for(int y:arr1){
//         System.out.print(y+" ");
//      }
//    }

//public static void main(String[] args) {
//
//    int[] arr  = {2, 25, 86, 74, 69, 85, 15, 23};
//    int[] arr1 = {4, 56, 25, 62, 78, 35, 75, 25, 12};
//
//    int len = Math.min(arr.length, arr1.length);
//
//    for (int i = 0; i < len; i++) {
//        int temp = arr[i];
//        arr[i] = arr1[i];
//        arr1[i] = temp;
//    }
//
//    for (int x : arr) {
//        System.out.print(x + " ");
//    }
//
//    System.out.println("\n==============================");
//
//    for (int y : arr1) {
//        System.out.print(y + " ");
//    }
//}


    public static void main(String[]args){
        String[] arr={"Java","programing","is","very","easy", "java","is","Development","under","the","right is the playing"};

        for(String s:arr){
            System.out.println(s+"= "+s.length());
        }
    }
}
