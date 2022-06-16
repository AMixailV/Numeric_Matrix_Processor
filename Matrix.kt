package processor

class Matrix(val n: Int, val m: Int, val matrix: MutableList<MutableList<Int>>) {

    object Run {

        fun creat(s: String): Matrix {
            println("Enter size of$s matrix:")
            val (n, m) = readln().split(" ").map { it.toInt() }

            println("Enter$s matrix:")
            val matrix: MutableList<MutableList<Int>> = mutableListOf()
            for (i in 0 until n) {
                val value = readln().split(' ').map { it.toInt() }.toMutableList()
                matrix.add(value)
            }
            return Matrix(n, m, matrix)
        }
    }

    fun printMatrix() {
        matrix.forEach {
            print(it.joinToString(" "))
            println()
        }
    }
}