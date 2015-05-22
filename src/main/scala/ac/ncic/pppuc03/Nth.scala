package ac.ncic.pppuc03

class Nth(num: Int) {    // i'm a newbie so give `class` a try :)
  def withSuffix = 
    println(s"$num${suffix}")    // String Interpolation allows you to embed varaiable references directly in
                                 // processed string literals.
  def suffix = {
    (num % 10) match {
      case 1 => if (num % 100 == 11) "th" else "st"    // in scala, there is no `? :` operator.
      case 2 => if (num % 100 == 12) "th" else "nd"    // but the `if else` looks very much like `? :`.
      case 3 => if (num % 100 == 13) "th" else "rd"    // also, `:` conflicts with typing syntax, and `?` conflicts
      case _ => "th"                                   // with the `ask` syntax of actors.
    }
  }
}

