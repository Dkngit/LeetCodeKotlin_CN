package myArray

class KotlinSolution0 {

    fun removeDuplicates(nums: IntArray): Int {
        var i0 = 0
        var i1 = 1
        while (i1 < nums.size - 1) {
            if (nums[i0] >= nums[i0 + 1]) {
                while (i1 < nums.size) {
                    if (nums[i0] < nums[i1]) {
                        nums[i0 + 1] = nums[i1]
                        break
                    }
                    i1++
                }
            }
            i0++
            if (i1 >= nums.size) {
                return i0
            }
        }
        return nums.size
    }

    fun main() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val solution0 = KotlinSolution0()
        val len = solution0.removeDuplicates(nums)

        for (i in 0 until len) {
            println(nums[i])
        }
    }
}