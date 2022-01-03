package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Classes
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsAppBarTypeMapheader
import com.olvind.mui.muiMaterial.anon.DistributiveOmitPaperPropsPaperTypeMapdi
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appBarAppBarMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [App Bar](https://mui.com/components/app-bar/)
    *
    * API:
    *
    * - [AppBar API](https://mui.com/api/app-bar/)
    * - inherits [Paper API](https://mui.com/api/paper/)
    */
  @JSImport("@mui/material/AppBar/AppBar", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsAppBarTypeMapheader, Element] = js.native
  
  type AppBarProps[D /* <: ElementType */, P] = OverrideProps[AppBarTypeMap[P, D], D]
  
  @js.native
  trait AppBarPropsColorOverrides extends StObject
  
  @js.native
  trait AppBarTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with DistributiveOmitPaperPropsPaperTypeMapdi with Classes = js.native
  }
  object AppBarTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ElementType */](defaultComponent: D, props: P with DistributiveOmitPaperPropsPaperTypeMapdi with Classes): AppBarTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppBarTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class AppBarTypeMapMutableBuilder[Self <: AppBarTypeMap[_, _], P, D /* <: ElementType */] (val x: Self with (AppBarTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with DistributiveOmitPaperPropsPaperTypeMapdi with Classes): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsAppBarTypeMapheader, Element]
  
  /* This means you don't have to write `default`, but can instead just say `appBarAppBarMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsAppBarTypeMapheader, Element] = default
}
