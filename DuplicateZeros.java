class Solution {
    public void duplicateZeros(int[] arr) {
       // int runner = arr[0];
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 0)
                count++;
        }
        
        for(int i = arr.length-1,j = arr.length+count-1;i < j ;i--,j--){
            if(arr[i] != 0){
                if(j < arr.length) arr[j] = arr[i];
            }else{
                if(j < arr.length) arr[j] = arr[i];
                j--;
                if(j < arr.length) arr[j] = arr[i];
            }
        }
        
        
    }
}
