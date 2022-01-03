package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ButtonBaseActions
import com.olvind.mui.muiMaterial.muiMaterialStrings.contained
import com.olvind.mui.muiMaterial.muiMaterialStrings.error
import com.olvind.mui.muiMaterial.muiMaterialStrings.info
import com.olvind.mui.muiMaterial.muiMaterialStrings.inherit
import com.olvind.mui.muiMaterial.muiMaterialStrings.large
import com.olvind.mui.muiMaterial.muiMaterialStrings.medium
import com.olvind.mui.muiMaterial.muiMaterialStrings.outlined
import com.olvind.mui.muiMaterial.muiMaterialStrings.primary
import com.olvind.mui.muiMaterial.muiMaterialStrings.secondary
import com.olvind.mui.muiMaterial.muiMaterialStrings.small
import com.olvind.mui.muiMaterial.muiMaterialStrings.success
import com.olvind.mui.muiMaterial.muiMaterialStrings.text
import com.olvind.mui.muiMaterial.muiMaterialStrings.warning
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.std.NonNullable
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @mui/types.@mui/types.DistributiveOmit<ButtonTypeMap<{}, 'button'>['props'], 'classes'> */
@js.native
trait DistributiveOmitButtonTypeMapbuttonprops extends StObject {
  
  var LinkComponent: js.UndefOr[ReactElement] = js.native
  
  var TouchRippleProps: js.UndefOr[PartialTouchRippleProps] = js.native
  
  var action: js.UndefOr[com.olvind.mui.react.mod.Ref[ButtonBaseActions]] = js.native
  
  var centerRipple: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var color: js.UndefOr[inherit | primary | secondary | success | error | info | warning] = js.native
  
  var disableElevation: js.UndefOr[Boolean] = js.native
  
  var disableFocusRipple: js.UndefOr[Boolean] = js.native
  
  var disableRipple: js.UndefOr[Boolean] = js.native
  
  var disableTouchRipple: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var endIcon: js.UndefOr[ReactElement] = js.native
  
  var focusRipple: js.UndefOr[Boolean] = js.native
  
  var focusVisibleClassName: js.UndefOr[String] = js.native
  
  var fullWidth: js.UndefOr[Boolean] = js.native
  
  var href: js.UndefOr[String] = js.native
  
  var onFocusVisible: js.UndefOr[FocusEventHandler[Any]] = js.native
  
  var size: js.UndefOr[small | medium | large] = js.native
  
  var startIcon: js.UndefOr[ReactElement] = js.native
  
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
  
  var tabIndex: js.UndefOr[NonNullable[js.UndefOr[Double]]] = js.native
  
  var variant: js.UndefOr[text | outlined | contained] = js.native
}
object DistributiveOmitButtonTypeMapbuttonprops {
  
  @scala.inline
  def apply(): DistributiveOmitButtonTypeMapbuttonprops = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributiveOmitButtonTypeMapbuttonprops]
  }
  
  @scala.inline
  implicit class DistributiveOmitButtonTypeMapbuttonpropsMutableBuilder[Self <: DistributiveOmitButtonTypeMapbuttonprops] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: com.olvind.mui.react.mod.Ref[ButtonBaseActions]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionFunction1(value: /* instance */ ButtonBaseActions | Null => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActionNull: Self = StObject.set(x, "action", null)
    
    @scala.inline
    def setActionReactRef(value: ReactRef[ButtonBaseActions]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setCenterRipple(value: Boolean): Self = StObject.set(x, "centerRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterRippleUndefined: Self = StObject.set(x, "centerRipple", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setColor(value: inherit | primary | secondary | success | error | info | warning): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisableElevation(value: Boolean): Self = StObject.set(x, "disableElevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableElevationUndefined: Self = StObject.set(x, "disableElevation", js.undefined)
    
    @scala.inline
    def setDisableFocusRipple(value: Boolean): Self = StObject.set(x, "disableFocusRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableFocusRippleUndefined: Self = StObject.set(x, "disableFocusRipple", js.undefined)
    
    @scala.inline
    def setDisableRipple(value: Boolean): Self = StObject.set(x, "disableRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableRippleUndefined: Self = StObject.set(x, "disableRipple", js.undefined)
    
    @scala.inline
    def setDisableTouchRipple(value: Boolean): Self = StObject.set(x, "disableTouchRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableTouchRippleUndefined: Self = StObject.set(x, "disableTouchRipple", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEndIcon(value: ReactElement): Self = StObject.set(x, "endIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIconUndefined: Self = StObject.set(x, "endIcon", js.undefined)
    
    @scala.inline
    def setFocusRipple(value: Boolean): Self = StObject.set(x, "focusRipple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusRippleUndefined: Self = StObject.set(x, "focusRipple", js.undefined)
    
    @scala.inline
    def setFocusVisibleClassName(value: String): Self = StObject.set(x, "focusVisibleClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusVisibleClassNameUndefined: Self = StObject.set(x, "focusVisibleClassName", js.undefined)
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setLinkComponent(value: ReactElement): Self = StObject.set(x, "LinkComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkComponentUndefined: Self = StObject.set(x, "LinkComponent", js.undefined)
    
    @scala.inline
    def setOnFocusVisible(value: SyntheticFocusEvent[Any] => Unit): Self = StObject.set(x, "onFocusVisible", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusVisibleUndefined: Self = StObject.set(x, "onFocusVisible", js.undefined)
    
    @scala.inline
    def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStartIcon(value: ReactElement): Self = StObject.set(x, "startIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIconUndefined: Self = StObject.set(x, "startIcon", js.undefined)
    
    @scala.inline
    def setSx(value: SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSxFunction1(
      value: com.olvind.mui.muiMaterial.createThemeMod.Theme => SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
    ): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSxNull: Self = StObject.set(x, "sx", null)
    
    @scala.inline
    def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    @scala.inline
    def setSxVarargs(
      value: (Boolean | SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme] | (js.Function1[
          com.olvind.mui.muiMaterial.createThemeMod.Theme, 
          SystemStyleObject[com.olvind.mui.muiMaterial.createThemeMod.Theme]
        ]))*
    ): Self = StObject.set(x, "sx", js.Array(value :_*))
    
    @scala.inline
    def setTabIndex(value: NonNullable[js.UndefOr[Double]]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setTouchRippleProps(value: PartialTouchRippleProps): Self = StObject.set(x, "TouchRippleProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchRipplePropsUndefined: Self = StObject.set(x, "TouchRippleProps", js.undefined)
    
    @scala.inline
    def setVariant(value: text | outlined | contained): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
