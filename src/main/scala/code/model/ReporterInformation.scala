package code.model

/**
 * Created by nick on 2/23/14.
 */

import net.liftweb.mapper._

class ReporterInformation extends LongKeyedMapper[ReporterInformation] with IdPK{

  def getSingleton = ReporterInformation

  //object id extends MappedLongIndex(this)
  //object firstName extends MappedString(this,100)
  //object lastName extends MappedString(this,100)
  object Name extends MappedString(this,100)
  object PhoneNumber extends MappedString(this,10)
  object DateOfReport extends MappedDateTime(this)

  // Trafficking Report ID
  // Name
  //
  //


}

object ReporterInformation extends ReporterInformation with LongKeyedMetaMapper[ReporterInformation] {

  override def fieldOrder = List(Name, PhoneNumber, DateOfReport)
}
