package ac.ncic.syssw.pppuc03

object Nth {
  def withSuffix(num: Int) =
    println(s"$num${suffix(num)}")

  def suffix(num: Int) = {
    (num % 10) match {
      case 1 => if (num % 100 == 11) "th" else "st"
      case 2 => if (num % 100 == 12) "th" else "nd"
      case 3 => if (num % 100 == 13) "th" else "rd"
      case _ => "th"
    }
  }
}

