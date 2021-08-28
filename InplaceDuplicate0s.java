class Solution {
    public void duplicateZeros(int[] arr) {
        int runner = 0;
      //  int runner2 = 0;
        int[] retarray  = new int[arr.length];
        for(int num : arr){
            if(runner == arr.length)
                break;
              if(num != 0){
                  retarray[runner] = num;
                  runner++;
              }else{
                  retarray[runner++] = num;
                  if(runner == arr.length)
                      break;
                  retarray[runner++] = num;
              }
        }
        
        for(int i=0;i<arr.length;i++){
            arr[i] = retarray[i];
        }
    }
}
