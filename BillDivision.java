 public static void bonAppetit(List<Integer> bill, int k, int b) {
     int sum = 0;
     for(int num : bill)
          sum = sum+num;
     sum-=bill.get(k);
     sum/=2;
     if(sum == b){
         System.out.println("Bon Appetit");
     }else{
         System.out.println(b -sum);
     }

    }
