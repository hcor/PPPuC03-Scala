package ac.ncic.pppuc03

object Palindrome {
  def isPalindrome(s: String): Boolean =
    (s.size >= 2) && {
      val p = s.replaceAll("[^\\p{L}]", "").toLowerCase;    // account for odd space and punctuation.
                                                            // note: `\p{L}` means charactors belonging to the 
                                                            // "letter" category.
      p == p.reverse    // `reverse` is already implemented, so just call it; i know i'm lazy :)
    }
}

