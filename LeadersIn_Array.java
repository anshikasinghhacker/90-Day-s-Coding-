public class LeadersIn_Array {
    //Leader --- Element which do not have any larger element on their right side
    static void LeadersInAnArray(int a[]){
        int largest = Integer.MIN_VALUE;
        for(int i = a.length - 1; i>= 0; i--){
            if(a[i]>largest){
                largest = a[i];
                System.out.println(a[i] +"");
            }

        }
    }

    public static void main(String[] args){
        int a[] = {2,7,6,4,1,3};
        LeadersInAnArray(a);

    }
}
