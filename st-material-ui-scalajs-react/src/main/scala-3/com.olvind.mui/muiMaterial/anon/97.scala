package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `97` extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemTextPropsspanp] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesListItemTextCl] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialListItemTextPropsspanp]] = js.undefined
}
object `97` {
  
  inline def apply(): `97` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`97`]
  }
  
  extension [Self <: `97`](x: Self) {
    
    inline def setDefaultProps(value: PartialListItemTextPropsspanp): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesListItemTextCl): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialListItemTextPropsspanp]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialListItemTextPropsspanp*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
