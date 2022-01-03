package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsInputAdornmentTypeM
import com.olvind.mui.muiMaterial.anon.DisablePointerEvents
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputAdornmentInputAdornmentMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Text Fields](https://mui.com/components/text-fields/)
    *
    * API:
    *
    * - [InputAdornment API](https://mui.com/api/input-adornment/)
    */
  @JSImport("@mui/material/InputAdornment/InputAdornment", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsInputAdornmentTypeM, Element] = js.native
  
  type InputAdornmentProps[D /* <: ReactElement */, P] = OverrideProps[InputAdornmentTypeMap[P, D], D]
  
  trait InputAdornmentTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & DisablePointerEvents
  }
  object InputAdornmentTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & DisablePointerEvents): InputAdornmentTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputAdornmentTypeMap[P, D]]
    }
    
    extension [Self <: InputAdornmentTypeMap[?, ?], P, D /* <: ReactElement */](x: Self & (InputAdornmentTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & DisablePointerEvents): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsInputAdornmentTypeM, Element]
  
  /* This means you don't have to write `default`, but can instead just say `inputAdornmentInputAdornmentMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsInputAdornmentTypeM, Element] = default
}
