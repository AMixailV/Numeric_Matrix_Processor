package processor

class Matrix(val n: Int, val m: Int, val matrix: MutableList<MutableList<Int>>) {

    object Run {

        fun creat(): Matrix {
            val (n, m) = readln().split(" ").map { it.toInt() }
            val matrix: MutableList<MutableList<Int>> = mutableListOf()
            for (i in 0 until n) {
                val value = readln().split(' ').map { it.toInt() }.toMutableList()
                matrix.add(value)
            }

            return Matrix(n, m, matrix)
        }

        fun sum(matrix_1: Matrix, matrix_2: Matrix) {
            if (!isError(matrix_1, matrix_2)) {
                val resultMatrix: MutableList<MutableList<Int>> = mutableListOf()


                for (i in 0 until matrix_1.n) {
                    val resultRow: MutableList<Int> = mutableListOf()
                    for (j in 0 until matrix_1.m) {
                        resultRow.add(matrix_1.matrix[i][j] + matrix_2.matrix[i][j])
                    }
                    resultMatrix.add(resultRow)
                }
                resultMatrix.forEach {
                    print(it.joinToString(" "))
                    println()
                }
            }
        }

        private fun isError(matrix_1: Matrix, matrix_2: Matrix): Boolean {
            return if (matrix_1.n != matrix_2.n || matrix_1.m != matrix_2.m) {
                println(Message.ERROR.message)
                true
            } else {
                false
            }
        }
    }
}