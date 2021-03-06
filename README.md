Scala macro debugger demo
========

###Features:###

1. Showing of synthetic source code of files containing macro calls
2. Debugging of the synthetic code (all the features - stepping, local variables, etc.)
3. Gutter markers for macro calls

A short screencast, which shows the features in action: [http://www.screenr.com/w877](http://www.screenr.com/w877).

###How to use:###

1. Install [the latest version](http://www.jetbrains.com/idea/download/index.html) of Intellij IDEA (both Ultimate and Community editions work with the macro debugger).

2. Add `scala.macro.debug.enabled=true` to `bin/idea.properties` in the IDEA's install dir.

3. Install the Scala plugin using `Settings -> Plugins`. Macro debugger is bundled with the official Scala plugin for IDEA, so you don't need to download additional software.

4. Clone this repository and open it in IDEA using `File -> Open...` on the directory of the checkout.

5. If you've not yet configured JDK 1.6 in IDEA, [do that](http://www.google.com/).

6. Everything's set up - now you can compile the demo project, set some breakpoints and try out the debugger!


