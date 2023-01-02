public class Second_Lrg_Ele_Array {
    public static int Second_Largest(int a[]){
        if(a.length < 2) return -1;
        int largest = 0;
        int Second_Largest = -1;
        for(int i =0; i<a.length; i++){
            if(a[i] > a[largest]){
                Second_Largest = largest;
                largest = i;
                
            }
            else if(a[i] < a[largest]){
                if(Second_Largest == -1 || a[i] > a[Second_Largest]){
                    Second_Largest = i;
                }
            }


        }

        return Second_Largest;

    }

    public static void main (String[] args){
        int a[] = {45,70,90,38,10};
        int index = Second_Largest(a);
        System.out.println(a[index]);
    }
}
