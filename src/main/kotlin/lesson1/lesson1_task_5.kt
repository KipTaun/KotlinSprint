package lesson1

fun main(args: Array<String>) {
  val totalSecond: Int =  6480
  var minute: Int = totalSecond/60
  var second: Int = totalSecond-(minute*60)

  println("$minute:0$second")
}