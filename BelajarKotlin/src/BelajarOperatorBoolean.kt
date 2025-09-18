fun main() {
    val quizPoint=50
    val finalExamPoint=70

    val passQuiz = quizPoint > 80
    val passfinalExam = finalExamPoint > 90

    val pass = passQuiz && passfinalExam

    println("You : $pass")
}