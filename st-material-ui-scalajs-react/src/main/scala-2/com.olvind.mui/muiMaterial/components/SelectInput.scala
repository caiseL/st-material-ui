package com.olvind.mui.muiMaterial.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiMaterial.anon.Node
import com.olvind.mui.muiMaterial.anon.PartialMenuProps
import com.olvind.mui.muiMaterial.createThemeMod.Theme
import com.olvind.mui.muiMaterial.muiMaterialStrings.filled
import com.olvind.mui.muiMaterial.muiMaterialStrings.outlined
import com.olvind.mui.muiMaterial.muiMaterialStrings.standard
import com.olvind.mui.muiMaterial.selectInputMod.SelectChangeEvent
import com.olvind.mui.muiMaterial.selectInputMod.SelectInputProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.mod.HTMLAttributes
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectInput {
  
  @scala.inline
  def apply(autoWidth: Boolean, multiple: Boolean, native: Boolean): Builder = {
    val __props = js.Dynamic.literal(autoWidth = autoWidth.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SelectInputProps[Any]]))
  }
  
  @JSImport("@mui/material/Select/SelectInput", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends StBuildingComponent[js.Object] {
    
    @scala.inline
    def IconComponent(value: ElementType): this.type = set("IconComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def MenuProps(value: PartialMenuProps): this.type = set("MenuProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def SelectDisplayProps(value: HTMLAttributes[HTMLDivElement]): this.type = set("SelectDisplayProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputRef(value: /* ref */ HTMLSelectElement | Node[Any] => Callback): this.type = set("inputRef", js.Any.fromFunction1((t0: /* ref */ HTMLSelectElement | Node[Any]) => value(t0).runNow()))
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: ReactFocusEventFrom[Any with Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any with Element]) => value(t0).runNow()))
    
    @scala.inline
    def onChange(
      value: (/* event */ SelectChangeEvent[Any], /* child */ japgolly.scalajs.react.facade.React.Node) => Callback
    ): this.type = set("onChange", js.Any.fromFunction2((t0: /* event */ SelectChangeEvent[Any], t1: /* child */ japgolly.scalajs.react.facade.React.Node) => (value(t0, t1)).runNow()))
    
    @scala.inline
    def onClose(value: /* event */ ReactEventFrom[Element] => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[Element]) => value(t0).runNow()))
    
    @scala.inline
    def onFocus(value: ReactFocusEventFrom[Any with Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any with Element]) => value(t0).runNow()))
    
    @scala.inline
    def onOpen(value: /* event */ ReactEventFrom[Element] => Callback): this.type = set("onOpen", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[Element]) => value(t0).runNow()))
    
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renderValue(value: /* value */ js.UndefOr[Any] => japgolly.scalajs.react.facade.React.Node): this.type = set("renderValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def sx(value: SxProps[Theme]): this.type = set("sx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sxFunction1(value: Theme => SystemStyleObject[Theme]): this.type = set("sx", js.Any.fromFunction1(value))
    
    @scala.inline
    def sxNull: this.type = set("sx", null)
    
    @scala.inline
    def sxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): this.type = set("sx", js.Array(value :_*))
    
    @scala.inline
    def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Any): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def variant(value: standard | outlined | filled): this.type = set("variant", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SelectInputProps[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
