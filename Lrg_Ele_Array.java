public class Lrg_Ele_Array {
    public static int Max(int a[]){
        if(a.length == 0) return -1;
        int max = 0;
        for(int i = 1; i<a.length;i++){
            if(a[i] > a[max]){
                max = i;
            }

        }
        return max;
    }

    public static void main(String[]args){
        int a[]={50,60,90,30,78};
        int index = Max(a);

        System.out.println(index);

    }
    
}
