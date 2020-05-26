package Challenges.Sets.One

import Functions.Hex.{XOR, stringToHex}

object ChallengeTwo extends App {
  // Fixed XOR

  def challengeTwo(takeThis: String, withThis: String): Boolean = {
        XOR(stringToHex(takeThis), stringToHex(withThis)) == "746865206B696420646F6E277420706C6179"
  }

  val takeThis: String = "1c0111001f010100061a024b53535009181c"
  val withThis: String = "686974207468652062756c6c277320657965"

  challengeTwo(takeThis, withThis)

}
