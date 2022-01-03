package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.react.mod.CSSProperties
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassNameRef[C] extends StObject {
  
  // TODO: Remove implicit props. Up to each component.
  var className: js.UndefOr[String] = js.undefined
  
  var ref: js.UndefOr[com.olvind.mui.react.mod.Ref[Any]] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object ClassNameRef {
  
  inline def apply[C](): ClassNameRef[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassNameRef[C]]
  }
  
  extension [Self <: ClassNameRef[?], C](x: Self & ClassNameRef[C]) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setRef(value: com.olvind.mui.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefReactRef(value: ReactRef[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
