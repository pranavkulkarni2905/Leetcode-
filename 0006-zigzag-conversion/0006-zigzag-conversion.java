class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows>=s.length()) return s; // special case
        StringBuilder[] zigzag= new StringBuilder[numRows];// will store different lines in the different elements in this array
        for(int i=0;i<numRows;i++){
            zigzag[i] = new StringBuilder();
        }
        int j=0; // variable to insert in the position of the array
        boolean x=false;// variable to check j will increase or decrease
        for(int i=0;i<s.length();i++){
            if(j==0) x=true;
            if(j==numRows-1) x=false;

            zigzag[j].append(s.charAt(i));
            if(x==true) j++;
            else j--;
        }

        StringBuilder ans = new StringBuilder();
        for(int i=0;i<numRows;i++){
            ans.append(zigzag[i]);
        }
        return ans.toString();
    }
}