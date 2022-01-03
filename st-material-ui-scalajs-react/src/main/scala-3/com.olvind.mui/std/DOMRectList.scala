package com.olvind.mui.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMRectList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[DOMRect] {
  
  /* standard dom */
  def item(index: Double): DOMRect | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[DOMRect]] = js.native
  
  /* standard dom */
  val length: Double = js.native
}
