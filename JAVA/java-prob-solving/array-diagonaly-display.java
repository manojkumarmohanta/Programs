int n = mat.length;
        if(n==1) return mat[0];
        int[] ans = new int[n*n];
        int count = 0;
        int r=0;
        int c=0;
        while(r<n && c<n && count<(n*n)){
            //System.out.println(mat[r][c]+" r="+r+" c="+c);
            ans[count++] = mat[r][c];
            if((r+c)%2==0){
                r--;
                c++;
                if(c==n){c--; r+=2;}
                if(r==-1) r++;
            }else{
                r++;
                c--;
                if(r==n) {r--; c+=2;}
                if(c==-1) c++;
            }
        }
        return ans;