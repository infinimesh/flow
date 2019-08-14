package com.eon.opcuapubsubclient.parser

import com.eon.opcuapubsubclient.domain.OpcUAPubSubTypes.OptionSet
import com.eon.opcuapubsubclient.parser.OpcUAPubSubParser.ParsePosition
import scodec.bits.ByteVector

// TODO: Not yet fully implemented
// FIXME: Implementation is not fully according to the logic! This need to be reimplemented
object OptionSetParser extends (ByteVector => ParsePosition => (OptionSet, ParsePosition)) {

  // FIXME: For now I'm just reading 10 bytes from the position. This just works for the sample data!
  override def apply(byteVector: ByteVector): ParsePosition => (OptionSet, ParsePosition) = parsePosition => {
    val (valueLength, pos1) = (ParserUtils.sliceToUInt(byteVector, parsePosition, parsePosition + 4), parsePosition + 4)
    val (value, pos2) = (ParserUtils.sliceToUByte(byteVector, parsePosition, pos1 + valueLength), pos1 + valueLength)
    val (validBitLength, pos3) = (ParserUtils.sliceToUInt(byteVector, pos2, pos2 + 4), pos2 + 4)
    val (validBits, pos4) = (ParserUtils.sliceToUByte(byteVector, parsePosition, pos3 + validBitLength), pos3 + validBitLength)
    (OptionSet(
      value,
      validBits
    ), pos4)
  }
}
