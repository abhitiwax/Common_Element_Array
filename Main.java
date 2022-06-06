public class Main {
    public static void main(String[] args) {
        int[] arr={12,28,12,45,85,14,15,17,1,9,17,28};
        int t=0;//for temperary storage
        for(int a=0;a<arr.length;a++){
            for(int b=a+1;b<arr.length;b++){
                if(arr[a]>arr[b]){
                    t=arr[a];
                    arr[a]=arr[b];
                    arr[b]=t;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
           int count=1,j;
           for(j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   count++;
               }
               else{
                   break;
               }
           }
           if(count>=2) {
               System.out.println(arr[i]);
               i = j-1;
           }
       }
    }
  }

