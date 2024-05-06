public class majority {
    public static void main(String[] args) {
        int[] arr = {1,3,3,4,3,3,9,2,3,3,4,3,5,3,6,3};
        int i,j,count=0,maxCount=0;
        int n = arr.length;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(arr[i] == arr[j]){
                    count = count+1;
                }
            }
            if(count >= n/2){
                maxCount = arr[i];
            }
            count = 0;
        }
        System.out.println("majority: "+arr[maxCount-1]);
    }
}
