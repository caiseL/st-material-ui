package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `57` extends StObject {
  
  var defaultProps: js.UndefOr[PartialCollapseProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesCollapseClassK] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialCollapseProps]] = js.undefined
}
object `57` {
  
  inline def apply(): `57` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`57`]
  }
  
  extension [Self <: `57`](x: Self) {
    
    inline def setDefaultProps(value: PartialCollapseProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesCollapseClassK): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialCollapseProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialCollapseProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
