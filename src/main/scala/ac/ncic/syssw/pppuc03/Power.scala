package ac.ncic.syssw.pppuc03

object Power {
  def power(base: Int, exp: Int): BigInt = {
        if (exp == 0) 1 else base * power(base, exp-1)
  }

  def powerTailRec(base: Int, exp: Int): BigInt = {
    @scala.annotation.tailrec
    def impl(acc: BigInt, exp: Int): BigInt = exp match {
      case 0 => acc
      case _ => impl(base*acc, exp-1)
    }
    impl(1, exp)
  }
}

