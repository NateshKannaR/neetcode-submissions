class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();
        char[]a=s1.toCharArray();
        Arrays.sort(a);
        String s=new String(a);
        for(int i=0;i<=n-m;i++){
           char[]t=s2.substring(i,i+m).toCharArray();
           Arrays.sort(t);
        if(s.equals(new String(t))){
            return true;
        }
        }
        return false;
        }
    }
