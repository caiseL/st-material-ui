package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target[T] extends StObject {
  
  var target: Name[T]
}
object Target {
  
  inline def apply[T](target: Name[T]): Target[T] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target[T]]
  }
  
  extension [Self <: Target[?], T](x: Self & Target[T]) {
    
    inline def setTarget(value: Name[T]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
