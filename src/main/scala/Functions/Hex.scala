package Functions

import javax.xml.bind.DatatypeConverter
import org.apache.commons.codec.binary.Base64

object Hex {

  def stringToHex(s: String): Array[Byte] = {
    DatatypeConverter.parseHexBinary(s)
  }

  def hexToBase64(h: Array[Byte]): String = {
    Base64.encodeBase64String(h)
  }

  val hexToString = stringToHex _ andThen hexToBase64

  def XOR(a: Array[Byte], b: Array[Byte]): String ={
    DatatypeConverter.printHexBinary(a.zip(b).map{case (a,b) => (a^b).toByte})
  }

  def XOR(a: Array[Byte], key: Char): Array[Byte] ={
    a.map(e => (e^key).toByte)
  }


}
