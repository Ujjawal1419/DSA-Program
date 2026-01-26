package ArrayYoutube;

public class ShallowCopyDeepCopy {
    public static void main(String[]args){
        int[] arr={10 ,20,30};
        int[] arra={40,50,60};

        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            arr[i]=arra[i];
            arra[i]=temp;

        }
        System.out.print("\n Array of arr is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n Array of arra is: ");
        for(int i=0;i<arr.length;i++) {

            System.out.print(arra[i]+" ");
        }
    }
}
