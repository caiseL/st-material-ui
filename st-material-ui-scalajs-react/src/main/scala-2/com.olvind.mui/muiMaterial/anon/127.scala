package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `127` extends StObject {
  
  var defaultProps: js.UndefOr[PartialSvgIconPropssvg] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesSvgIconClassKe] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialSvgIconPropssvg]] = js.native
}
object `127` {
  
  @scala.inline
  def apply(): `127` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`127`]
  }
  
  @scala.inline
  implicit class `127MutableBuilder`[Self <: `127`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialSvgIconPropssvg): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesSvgIconClassKe): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialSvgIconPropssvg]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialSvgIconPropssvg*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
