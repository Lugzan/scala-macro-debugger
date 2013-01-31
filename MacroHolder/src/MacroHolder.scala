import reflect.macros.Context
import scala.language.experimental.macros

/**
 * Created with IntelliJ IDEA.
 */
object MacroHolder {
  def debugImpl(c: Context)() = {
    c.universe.reify {
      println("Hello")
    }
  }

  def debug() = macro debugImpl
}
