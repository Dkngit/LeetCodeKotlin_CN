package myString;

import java.util.ArrayList;
import java.util.List;

/**
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 * 你的输出需要从左往右逐行读取，产生出一个新的字符串。
 *
 * @since 2022/10/17 11:31
 */
public class SolutionConvertStrWithNumRows {

    /**
     * 输入：s = "PAYPALISHIRING", numRows = 4
     * 输出："PINALSIGYAHRPI"
     * 解释：
     * P     I    N
     * A   L S  I G
     * Y A   H R
     * P     I
     */
    public String convert(String s, int numRows) {
        List<char[]> list = new ArrayList<>();
        char[] chars = s.toCharArray();
        int zRows = 0;
        if (numRows > 2) {
            zRows = numRows - 2;
        }
        int zIndex = 0;
        int charsIndex = 0;
        while (charsIndex < chars.length) {
            char[] arr = new char[numRows];
            if (zIndex == 0) {
                int rowIndex = 0;
                for (int j = charsIndex; j < chars.length; j++) {
                    if (rowIndex == numRows) {
                        break;
                    }
                    arr[rowIndex++] = chars[j];
                }
                charsIndex += rowIndex;
            } else {
                arr[numRows - 1 - zIndex] = chars[charsIndex++];
            }
            list.add(arr);
            zIndex++;
            if (zIndex > zRows) {
                zIndex = 0;
            }
        }
        char[] chars1 = new char[s.length()];
        int chars1Index = 0;
        for (int i = 0; i < numRows; i++) {
            for (char[] arr : list) {
                if (arr[i] != '\u0000') {
                    chars1[chars1Index++] = arr[i];
                }
            }
        }
        return new String(chars1);
    }

    public static void main(String[] args) {
        SolutionConvertStrWithNumRows s = new SolutionConvertStrWithNumRows();
        System.out.println(s.convert("PAYPALISHIRING", 4));
    }
}
