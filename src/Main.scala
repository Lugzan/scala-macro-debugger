
object Main {
  def main(args: Array[String]) {
    def test(who: String) = {
      Macros.greet(who, who)
    }
    test("AaaA")
  }
}
