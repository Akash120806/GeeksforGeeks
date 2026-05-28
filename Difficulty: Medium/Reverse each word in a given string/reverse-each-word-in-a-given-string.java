class Solution {

    public String reverseWords(String s) {

        String[] st = s.trim().split("\\s+");

        StringBuilder ans = new StringBuilder();

        for(String w : st){

            for(int i = w.length() - 1; i >= 0; i--){

                ans.append(w.charAt(i));
            }

            ans.append(" ");
        }

        return ans.toString().trim();
    }
}