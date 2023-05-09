package lesson1

fun main() {
  val totalSecond = 6480
  val minute = totalSecond / 60

  println(String.format("%d:%02d", minute, totalSecond % 60))
}