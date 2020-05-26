package Challenges.Sets.One

import Domain.DecryptOutput
import io.circe.generic.auto._, io.circe.syntax._

import scala.io.{BufferedSource, Source}
import Functions.Hex._

object ChallengeFour extends App {

  val AllChars = (' ' to 'z').toArray

  val data: BufferedSource = Source.fromFile("./src/main/scala/Challenges/Sets/One/encrypted.txt")

  val f: Seq[String] = data.getLines.toSeq

  f.map(s => stringToHex(s.trim)).flatMap(e =>
    AllChars.map(k =>
      DecryptOutput(e.toString,
        k.toString,
        XOR(e, k).map(_.toChar).mkString
      )
    )
  )
    .map(e => e.asJson.noSpaces)
    .filter(_.toCharArray.forall(_ < 128)) // non-ascii characters
    .filter(!_.contains("\\u")) // unicode disasters
    .filter(e => e.contains("the") || e.contains(" and") || e.contains(" or")) // Zipf's law says these are the most popular words in English
    .foreach(println)

  // this whole thing gives us the answer: Now that the party is jumping
  // kinda surprised it worked as well as it did.

  data.close()

}
