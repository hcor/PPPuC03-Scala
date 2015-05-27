package ac.ncic.pppuc03

object Power {
  def power(base: Int, exp: Int): BigInt = {    // basic normal recursion, and mind that recursive method needs result type.
        if (exp == 0) 1 else base * power(base, exp-1)    // adding `final` and `tailrec` *may* lead to tailrec optimization.
  }

  def powerTailRec(base: Int, exp: Int): BigInt = {    // tail recursive version: final action is to call `impl`.
    @scala.annotation.tailrec
    def impl(acc: BigInt, exp: Int): BigInt = exp match {
      case 0 => acc
      case _ => impl(base*acc, exp-1)    // pass the result of current step to the inner step.
    }
    impl(1, exp)
  }
}

