import reflect.macros.Context
import scala.language.experimental.macros

object Macros {
  def greet(who1: String, who2: String) = macro impl

  def debug() = macro debugImpl

  def debugImpl(c: Context)() = {
    c.universe.reify {
      println("Hello")
    }
  }

  def impl(c: scala.reflect.macros.Context)(who1: c.Expr[String], who2: c.Expr[String]) =
    c.universe.reify({
      println("hello " + who1.splice)
      println("hello " + who2.splice)
    })
}
