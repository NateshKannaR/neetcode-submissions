class Solution {

    public String encode(List<String> strs) {
         StringBuilder v=new StringBuilder();
         for(String s:strs){
         v.append(s.length()).append("#").append(s);
    }
    return v.toString();
    }
    public List<String> decode(String str) {
     List<String>list=new ArrayList<>();
     int i=0;
     while(i<str.length()){
        int j=i;
        while(str.charAt(j)!='#'){
        j++;
        }
          int l=Integer.parseInt(str.substring(i,j));
          String n=str.substring(j+1,j+1+l);
          list.add(n);
          i=j+1+l;
        }
      return list;
    }
}
