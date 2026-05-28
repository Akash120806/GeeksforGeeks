class Solution {
    public int val(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
           
        }
        return 0;
        
    }
    public int romanToDecimal(String s) {
        // code 
        int sum=0;
        for(int i=0;i<s.length();i++){
            int curr = val(s.charAt(i));
            if(i+1<s.length( )&& curr < val(s.charAt(i+1))){
                sum-=curr;
            }
            else{
                sum+=curr;
            }
        }
        return sum;
        
    }
}
