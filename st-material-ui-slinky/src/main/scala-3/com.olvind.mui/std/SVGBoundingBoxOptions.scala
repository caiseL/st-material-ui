package com.olvind.mui.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGBoundingBoxOptions extends StObject {
  
  /* standard dom */
  var clipped: js.UndefOr[Boolean] = js.undefined
  
  /* standard dom */
  var fill: js.UndefOr[Boolean] = js.undefined
  
  /* standard dom */
  var markers: js.UndefOr[Boolean] = js.undefined
  
  /* standard dom */
  var stroke: js.UndefOr[Boolean] = js.undefined
}
object SVGBoundingBoxOptions {
  
  inline def apply(): SVGBoundingBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGBoundingBoxOptions]
  }
  
  extension [Self <: SVGBoundingBoxOptions](x: Self) {
    
    inline def setClipped(value: Boolean): Self = StObject.set(x, "clipped", value.asInstanceOf[js.Any])
    
    inline def setClippedUndefined: Self = StObject.set(x, "clipped", js.undefined)
    
    inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setMarkers(value: Boolean): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    inline def setStroke(value: Boolean): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
