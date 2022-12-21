public class DelEle_Array {
    public static int Delete(int a[], int key){
    int i = 0;
    int n = a.length;
    for(;i<n;i++){
       if(a[i]==key) {
        break;
       }
    }
    if(i==n)return n;
    for(int j = i; j<n-1;j++){
        a[j] = a[j+1];
    }
    return n-1;
    }
    public static void main(String[]args){
        int a[] = {40,70,60,120,80};
        int key = 60;
        Delete(a, key);
        for(int e:a){
            System.out.println(e +" ");
        }
    }
}
