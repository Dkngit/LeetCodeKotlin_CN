package myArray;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * 旋转图像
 *
 * 给定一个 n × n 的二维矩阵表示一个图像。
 * 将图像顺时针旋转 90 度。
 *
 * 说明：
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 */
public class Solution10 {

    /*
    *
    * 示例 1:

给定 matrix =
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

原地旋转输入矩阵，使其变为:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]
示例 2:

给定 matrix =
[
  [ 5, 1, 9,11],
  [ 2, 4, 8,10],
  [13, 3, 6, 7],
  [15,14,12,16]
],

原地旋转输入矩阵，使其变为:
[
  [15,13, 2, 5],
  [14, 3, 4, 1],
  [12, 6, 8, 9],
  [16, 7,10,11]
]
    * */


    public void rotate(int[][] matrix) {
        Map<String, Integer> map = new HashMap<>();

        int core = matrix.length -1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                int i0 = core - j;

                int origin = matrix[i0][i];

                String mapKey = i0 +"-"+ i;
                if (map.containsKey(mapKey)) {
                    origin = map.remove(mapKey);
                }

                map.put(i+"-"+j, matrix[i][j]);
                matrix[i][j] = origin;
            }

        }
    }

    public static void main(String[] args) throws IOException {
        Solution10 solution10 = new Solution10();

        ObjectMapper mapper = new ObjectMapper();

        int[][] a = mapper.readValue("[\n" +
                "  [1,2,3],\n" +
                "  [4,5,6],\n" +
                "  [7,8,9]\n" +
                "]", int[][].class);

        int[][] b = mapper.readValue("[\n" +
                "  [ 5, 1, 9,11],\n" +
                "  [ 2, 4, 8,10],\n" +
                "  [13, 3, 6, 7],\n" +
                "  [15,14,12,16]\n" +
                "]", int[][].class);

        solution10.rotate(a);
        solution10.rotate(b);
        System.out.println(mapper.writeValueAsString(a));
        System.out.println(mapper.writeValueAsString(b));


    }
}
