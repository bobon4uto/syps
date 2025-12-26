import scala.io.StdIn.readLine
object Main {
  def main(args: Array[String]): Unit =
    while true do {
      val line = readLine()
      if Option(line).isEmpty then { return }
      println(swapstr(line))
    }
    // System.err.println("yikes, an error happened")
  def sanitize(line: String): String =
    line
      .replaceAllLiterally("\u001b[90m", "")
      .replaceAllLiterally("\u001b[31m", "")
      .replaceAllLiterally("\u001b[32m", "")
      .replaceAllLiterally("\u001b[0m", "")
      .strip()

  def swapstr(line: String): String =
    // val line: String = sanitize(line)

    val l0 = line(0)
    if l0 == '[' then {
      val i = line.indexOf("]");
      sanitize({ line.slice(i + 1, line.size - 1) + line.slice(0, i + 1) })
    } else sanitize(line)
}
