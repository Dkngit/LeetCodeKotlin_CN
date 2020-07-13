package myString;

/**
 * 外观数列
 */
public class Solution7 {

    /*
    1.     1
    2.     11
    3.     21
    4.     1211
    5.     111221
    */

    public String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder s1 = new StringBuilder();
            char c = 'a';
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (c != s.charAt(j)) {
                    if (c != 'a'){
                        s1.append(count);
                        s1.append(c);
                    }
                    count = 1;
                    c = s.charAt(j);
                }else{
                    count++;
                }
            }

            if (c != 'a'){
                s1.append(count);
                s1.append(c);
            }

            s = s1.toString();

            System.out.println(s);
        }

        return s;
    }

    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();

        long l = System.currentTimeMillis();
        System.out.println("result: "+solution7.countAndSay(30));
        System.out.println("result: "+solution7.countAndSay(30));
        System.out.println("result: "+solution7.countAndSay(30));
        System.out.println((System.currentTimeMillis()-l)/3);
    }
}
