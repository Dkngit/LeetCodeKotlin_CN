package myString;

import java.util.*;

/**
 * 22. 括号生成
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合
 *
 * @since 2022/9/30 14:29
 */
public class SolutionGenerateParenthesis {

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
        SolutionGenerateParenthesis solution = new SolutionGenerateParenthesis();
        List<String> list = solution.generateParenthesis(3);
        for (String s : list) {
            System.out.println(s);
        }
    }

    public List<String> generateParenthesis(int n) {
        return new ArrayList<>(leaf(n));
    }

    public Set<String> leaf(int n) {
        if (n == 0) {
            return null;
        }
        if (n == 1) {
            return new HashSet<>(Collections.singleton("()"));
        }
        int m = n -1;
        Set<String> list = new HashSet<>();
        for (int i = 0; i <= m; i++) {
            Set<String> listA = new HashSet<>();
            Set<String> list1 = leaf(i);
            if (list1 == null) {
                listA.add("()");
            } else {
                for (String s : list1) {
                    listA.add("(" + s + ")");
                }
            }
            Set<String> listB = leaf(m - i);
            if (listB == null) {
                list.addAll(listA);
            } else {
                for (String itemA : listA) {
                    for (String itemB : listB) {
                        list.add(itemA + itemB);
                    }
                }
            }
        }

        return list;
    }
}
