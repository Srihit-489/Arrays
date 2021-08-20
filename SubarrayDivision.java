public static int birthday(List<Integer> s, int d, int m) {
    int[] sum = new int[s.size()];
    sum[0] = s.get(0);
    for(int i=1;i<s.size();i++){
        sum[i] = sum[i-1] + s.get(i);
    }
    
    int count = 0;
    if(s.size() >= m && sum[m-1] == d)
      count++;
    for(int i =0;i<sum.length-m;i++){
        if(sum[i+m] - sum[i] == d)
        count++;
    }
    return count;

    }
