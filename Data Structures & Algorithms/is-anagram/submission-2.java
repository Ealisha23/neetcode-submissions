class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int freq[] = new int [26];

        for (int i = s.length()- 1 ; i>= 0 ; i-- ){
            
            freq [ s.charAt(i) - 'a']++ ;
             freq[ t.charAt(i) - 'a']-- ;

        }

        for (int count : freq){
            if (count != 0){
                return false ;

            }
        }
        return true ;
}
}
