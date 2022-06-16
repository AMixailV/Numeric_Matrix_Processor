package processor

class Solution {

    init {
        while (true) {
            println(Message.MENU.message)

            when (readln().toInt()) {
                1 -> add()
                2 -> multiplyByConstant()
                3 -> multiplyMatrices()
                4 -> break
            }
        }
    }

    private fun add() {
        val firstMatrix = Matrix.Run.creat(" first")
        val secondMatrix = Matrix.Run.creat(" second")
        sum(firstMatrix, secondMatrix)
    }

    private fun sum(firstMatrix: Matrix, secondMatrix: Matrix) {
        if (!isError(firstMatrix, secondMatrix)) {
            for (i in 0 until firstMatrix.n) {
                for (j in 0 until firstMatrix.m) {
                    firstMatrix.matrix[i][j] += secondMatrix.matrix[i][j]
                }
            }
            println(Message.RESULT.message)
            firstMatrix.printMatrix()
        }
    }

    private fun isError(firstMatrix: Matrix, secondMatrix: Matrix): Boolean {
        return if (firstMatrix.n != secondMatrix.n || firstMatrix.m != secondMatrix.m) {
            println(Message.ERROR.message)
            true
        } else {
            false
        }
    }


    private fun multiplyByConstant() {
        val matrix = Matrix.Run.creat("")

        println(Message.ENTER_CONSTANT.message)

    }

    private fun multiply(matrix: Matrix) {
        val C = readln().toInt()

        for (i in 0 until matrix.n) {
            for (j in 0 until matrix.m) {
                matrix.matrix[i][j] *= C
            }
        }
        Matrix.Run.printMatrix(matrix.matrix)
    }

}