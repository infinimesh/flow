package com.eon.opcuapubsubclient.parser.datasetmessage

import com.eon.opcuapubsubclient.cache._
import com.eon.opcuapubsubclient.domain.PayloadTypes.DataSetFieldEncodings.RawFieldEncoding
import com.eon.opcuapubsubclient.domain.PayloadTypes.DataSetMessageFrame.DataSetMessageKeyFrame
import com.eon.opcuapubsubclient.domain.PayloadTypes.DataSetMessageHeader
import com.eon.opcuapubsubclient.parser.OpcUAPubSubParser.ParsePosition
import com.eon.opcuapubsubclient.parser.ParserUtils
import scodec.bits.ByteVector

// TODO: Implementation pending
object DataSetMessageKeyFrameParser extends (ByteVector => DataSetMessageHeader => ParsePosition => (DataSetMessageKeyFrame, ParsePosition)) {

  override def apply(v1: ByteVector): DataSetMessageHeader => ParsePosition => (DataSetMessageKeyFrame, ParsePosition) =
    dataSetMsgHeader => parsePosition => (DataSetMessageKeyFrame(), parsePosition)

  def parseDataSetMessageKeyFrame(byteVector: ByteVector, dataSetMsgHeader: DataSetMessageHeader, parsePosition: ParsePosition) = {
    /*
      Look at Page OPC UA PubSub Spec version 1.04, Part 14, Page 71, Table 82
      The FieldCount shall be omitted if RawData field encoding is set in the EncodingFlags defined in 7.2.2.3.4.
     */
    val (fieldCount, pos1) = dataSetMsgHeader.dataSetFlags1.dataSetFieldEncoding match {
      case RawFieldEncoding =>
        (None, parsePosition)
      case _ =>
        val (fldCnt, pos) = ParserUtils.parseUInt16(byteVector, parsePosition)
        (Some(fldCnt), pos)
    }

    // TODO: PublisherId need to be injected into the class so that we can do a look up for it!

    // Get the DataSetMetaData from the cache for the given PublisherId and ConfigVersion
    //val metaData = new SimpleDataSetMetaDataCache().get(dataSetMsgHeader.)

    // Iterate over the fieldCount

    // Get the FieldMetaData for the given fieldCount

    // Get the StructureDataType from the DataSetMetaData and iterate over it

    //
  }
}
