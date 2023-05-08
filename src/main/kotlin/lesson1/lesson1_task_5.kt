package lesson1

fun main(args: Array<String>) {
  val totalSecond = 6480
  val minute = totalSecond/60

  val formattedMinute = String.format("%02d", minute)
  val formattedSecond = String.format("%02d", totalSecond % 60)

  println("$formattedMinute:$formattedSecond")
}