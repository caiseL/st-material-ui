package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.muiMaterialStrings.body
import com.olvind.mui.muiMaterial.muiMaterialStrings.footer
import com.olvind.mui.muiMaterial.muiMaterialStrings.head
import com.olvind.mui.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tablelvl2ContextMod extends Shortcut {
  
  @JSImport("@mui/material/Table/Tablelvl2Context", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[Tablelvl2ContextProps]] = js.native
  
  trait Tablelvl2ContextProps extends StObject {
    
    var variant: head | body | footer
  }
  object Tablelvl2ContextProps {
    
    inline def apply(variant: head | body | footer): Tablelvl2ContextProps = {
      val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tablelvl2ContextProps]
    }
    
    extension [Self <: Tablelvl2ContextProps](x: Self) {
      
      inline def setVariant(value: head | body | footer): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Context[js.UndefOr[Tablelvl2ContextProps]]
  
  /* This means you don't have to write `default`, but can instead just say `tablelvl2ContextMod.foo` */
  override def _to: Context[js.UndefOr[Tablelvl2ContextProps]] = default
}
