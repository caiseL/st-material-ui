package com.olvind.mui.muiSystem.components

import com.olvind.mui.StBuildingComponent
import com.olvind.mui.muiStyledEngine.styledEngineProviderStyledEngineProviderMod.StyledEngineProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledEngineProvider {
  
  @JSImport("@mui/system", "StyledEngineProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[Any])
    extends StBuildingComponent[js.Object] {
    
    @scala.inline
    def injectFirst(value: Boolean): this.type = set("injectFirst", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: StyledEngineProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StyledEngineProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
