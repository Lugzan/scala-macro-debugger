import reflect.macros.Context
import scala.language.experimental.macros

object Macros {
  def debugImpl(c: Context)() = {
    c.universe.reify {
      println("Hello")
    }
  }

  def debug() = macro debugImpl
}
