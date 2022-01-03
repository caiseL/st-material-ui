package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `118` extends StObject {
  
  var defaultProps: js.UndefOr[PartialSpeedDialActionProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesSpeedDialActio] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialSpeedDialActionProps]] = js.native
}
object `118` {
  
  @scala.inline
  def apply(): `118` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`118`]
  }
  
  @scala.inline
  implicit class `118MutableBuilder`[Self <: `118`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialSpeedDialActionProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesSpeedDialActio): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialSpeedDialActionProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialSpeedDialActionProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
