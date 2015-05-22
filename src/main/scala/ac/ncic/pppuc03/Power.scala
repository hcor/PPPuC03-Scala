package ac.ncic.pppuc03

object Power {
  def power(base: Int, exp: Int): Int = {    // recursive method needs result type.
        if (exp == 0)
          1
        else
          base * power(base, exp-1)
  }
}

