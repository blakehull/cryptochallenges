package Challenges.Sets.One

import javax.xml.bind.DatatypeConverter
import Functions.Hex._

object ChallengeThree extends App {

  def challengeThree(takeThis: Array[Byte], withThis: Char): Boolean = {
    DatatypeConverter.printHexBinary(XOR(takeThis, withThis)) == "436F6F6B696E67204D432773206C696B65206120706F756E64206F66206261636F6E"
  }

  val h: Array[Byte] = stringToHex("1b37373331363f78151b7f2b783431333d78397828372d363c78373e783a393b3736")
  val f = 'X'

  println(XOR(h, f).map(_.toChar).mkString) // Cooking MC's like a pound of bacon

  challengeThree(h, f)

}
