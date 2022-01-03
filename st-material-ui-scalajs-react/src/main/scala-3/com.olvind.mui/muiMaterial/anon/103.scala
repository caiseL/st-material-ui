package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `103` extends StObject {
  
  var defaultProps: js.UndefOr[PartialNativeSelectProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesNativeSelectCl] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialNativeSelectProps]] = js.undefined
}
object `103` {
  
  inline def apply(): `103` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`103`]
  }
  
  extension [Self <: `103`](x: Self) {
    
    inline def setDefaultProps(value: PartialNativeSelectProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesNativeSelectCl): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialNativeSelectProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialNativeSelectProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
