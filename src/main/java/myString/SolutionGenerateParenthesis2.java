package myString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 22. 括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合
 *
 * @since 2022/9/30 14:29
 */
public class SolutionGenerateParenthesis2 {

    /*
     * 示例 1：
     * 输入：n = 3
     * 输出：["((()))","(()())","(())()","()(())","()()()"]
     *
     * 示例 2：
     * 输入：n = 1
     * 输出：["()"]
     *
     * 提示：
     * 1 <= n <= 8
     *
     * */
    public static void main(String[] args) {
        SolutionGenerateParenthesis2 solution = new SolutionGenerateParenthesis2();
        List<String> list = solution.generateParenthesis(3);
        for (String s : list) {
            System.out.println(s);
        }
    }

    public List<String> generateParenthesis(int n) {
        return leaf(n);
    }

    public List<String> leaf(int n) {
        if (n == 0) {
            return new ArrayList<>(Collections.singleton(""));
        }
        if (n == 1) {
            return new ArrayList<>(Collections.singleton("()"));
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<String> listA = leaf(i);
            for (String left : listA) {
                List<String> listB = leaf(n -1 - i);
                for (String right : listB) {
                    list.add("("+left+")" + right);
                }
            }
        }

        return list;
    }
}
