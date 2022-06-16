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

        fun sum(matrixA: Matrix, matrixB: Matrix) {
            if (!isError(matrixA, matrixB)) {
                val resultMatrix: MutableList<MutableList<Int>> = mutableListOf()

                for (i in 0 until matrixA.n) {
                    val resultRow: MutableList<Int> = mutableListOf()
                    for (j in 0 until matrixA.m) {
                        resultRow.add(matrixA.matrix[i][j] + matrixB.matrix[i][j])
                    }
                    resultMatrix.add(resultRow)
                }
                printMatrix(resultMatrix)
            }
        }

        private fun isError(matrixA: Matrix, matrixB: Matrix): Boolean {
            return if (matrixA.n != matrixB.n || matrixA.m != matrixB.m) {
                println(Message.ERROR.message)
                true
            } else {
                false
            }
        }

        fun multiply(matrix: Matrix) {
            val C = readln().toInt()

            for (i in 0 until matrix.n) {
                for (j in 0 until matrix.m) {
                    matrix.matrix[i][j] *= C
                }
            }
            printMatrix(matrix.matrix)
        }

        private fun printMatrix(matrix: MutableList<MutableList<Int>>) {
            matrix.forEach {
                print(it.joinToString(" "))
                println()
            }
        }
    }
}