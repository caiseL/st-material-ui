package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `90` extends StObject {
  
  var defaultProps: js.UndefOr[PartialLinkPropsa] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesLinkClassKey] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialLinkPropsa]] = js.undefined
}
object `90` {
  
  inline def apply(): `90` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`90`]
  }
  
  extension [Self <: `90`](x: Self) {
    
    inline def setDefaultProps(value: PartialLinkPropsa): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesLinkClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialLinkPropsa]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialLinkPropsa*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
