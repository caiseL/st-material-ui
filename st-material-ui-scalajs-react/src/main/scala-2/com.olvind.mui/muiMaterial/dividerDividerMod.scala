package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Absolute
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsDividerTypeMaphr
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerDividerMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Dividers](https://mui.com/components/dividers/)
    * - [Lists](https://mui.com/components/lists/)
    *
    * API:
    *
    * - [Divider API](https://mui.com/api/divider/)
    */
  @JSImport("@mui/material/Divider/Divider", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsDividerTypeMaphr, Element] = js.native
  
  type DividerProps[D /* <: ElementType */, P] = OverrideProps[DividerTypeMap[P, D], D]
  
  @js.native
  trait DividerPropsVariantOverrides extends StObject
  
  @js.native
  trait DividerTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with Absolute = js.native
  }
  object DividerTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ElementType */](defaultComponent: D, props: P with Absolute): DividerTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[DividerTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class DividerTypeMapMutableBuilder[Self <: DividerTypeMap[_, _], P, D /* <: ElementType */] (val x: Self with (DividerTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with Absolute): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsDividerTypeMaphr, Element]
  
  /* This means you don't have to write `default`, but can instead just say `dividerDividerMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsDividerTypeMaphr, Element] = default
}
