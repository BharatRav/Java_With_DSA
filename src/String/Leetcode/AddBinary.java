package String.Leetcode;
//LeetcodeLink:-https://leetcode.com/problems/add-binary/
class AddBinary {
    public String addBinary(String a, String b) {
        int len1 =a.length()-1;
        int len2 =b.length()-1;

        String res="";
        boolean carry = false;
        while(len1>=0 && len2>=0) {
            if(a.charAt(len1)=='1' && b.charAt(len2)=='1') {
                if (carry) {
                    res ="1"+res;
                } else {
                    res ="0"+res;
                    carry=true;
                }
            } else if(a.charAt(len1)=='1' || b.charAt(len2)=='1') {
                if (carry) {
                    res ="0"+res;
                    carry=true;
                } else {
                    res ="1"+res;
                    carry=false;
                }
            } else {
                if (carry) {
                    res ="1"+res;
                    carry=false;
                } else {
                    res="0"+res;
                }
            }
            len1--;
            len2--;
        }
        while (len1>=0) {
            if(a.charAt(len1)=='1') {
                if (carry) {
                    res ="0"+res;
                    carry=true;
                } else {
                    res="1"+res;
                    carry=false;
                }
            } else {
                if (carry) {
                    res ="1"+res;
                    carry=false;
                } else {
                    res="0"+res;
                }
            }
            len1--;
        }
        while (len2>=0) {
            if(b.charAt(len2)=='1') {
                if (carry) {
                    res ="0"+res;
                    carry=true;
                } else {
                    res="1"+res;
                    carry=false;
                }
            } else {
                if (carry) {
                    res ="1"+res;
                    carry=false;
                } else {
                    res="0"+res;
                }
            }
            len2--;
        }
        if(carry) {
            res="1"+res;
        }
        return res;
    }
}
