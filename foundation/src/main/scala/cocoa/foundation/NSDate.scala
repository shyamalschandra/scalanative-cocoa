package cocoa.foundation

import objc.runtime.id

import scala.language.experimental.macros
import objc.{ObjC, ObjCClass}

import scalanative.native._

@ObjC
class NSDate extends NSObject with NSCopying with NSSecureCoding {
  @inline def initWithTimeIntervalSinceReferenceDate(ti: NSTimeInterval): NSDate = extern
  @inline def initWithCoder(aDecoder: NSCoder): NSDate = extern
  @inline def timeIntervalSinceReferenceDate(): NSTimeInterval = extern
  @inline def timeIntervalSinceDate(anotherDate: NSDate): NSTimeInterval = extern
  @inline def addTimeInterval(seconds: NSTimeInterval): id = extern
  @inline def dateByAddingTimeInterval(ti: NSTimeInterval): NSDate = extern
  @inline def earlierDate(anotherDate: NSDate): NSDate = extern
  @inline def laterDate(anotherDate: NSDate): NSDate = extern
  @inline def compare(other: NSDate): NSComparisonResult = extern
  @inline def isEqualToDate(otherDate: NSDate): BOOL = extern
  @inline def descriptionWithLocale(locale: id): NSString = extern
  @inline def timeIntervalSinceNow(): NSTimeInterval = extern
  @inline def timeIntervalSince1970(): NSTimeInterval = extern
  @inline def initWithTimeIntervalSinceNow(secs: NSTimeInterval): NSDate = extern
  @inline def initWithTimeIntervalSince1970(secs: NSTimeInterval): NSDate = extern
  @inline def initWithTimeInterval(secsToBeAdded: NSTimeInterval, date: NSDate): NSDate = extern
}


@ObjCClass
abstract class NSDateClass extends NSObjectClass {
  @inline def timeIntervalSinceReferenceDate(): NSTimeInterval = extern
  @inline def date(): NSDate = extern
  @inline def dateWithTimeIntervalSinceNow(secs: NSTimeInterval): NSDate = extern
  @inline def dateWithTimeIntervalSinceReferenceDate(ti: NSTimeInterval): NSDate = extern
  @inline def dateWithTimeIntervalSince1970(secs: NSTimeInterval): NSDate = extern
  @inline def dateWithTimeInterval(secsToBeAdded: NSTimeInterval, date: NSDate): NSDate = extern
  @inline def distantFuture(): NSDate = extern
  @inline def distantPast(): NSDate = extern
}

object NSDate extends NSDateClass {
  override type InstanceType = NSDate
}