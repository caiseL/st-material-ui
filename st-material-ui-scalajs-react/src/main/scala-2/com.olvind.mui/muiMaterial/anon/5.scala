package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `5`[P, D /* <: ElementType */] extends StObject {
  
  var defaultComponent: D = js.native
  
  var props: P with FocusVisibleClassName = js.native
}
object `5` {
  
  @scala.inline
  def apply[P, D /* <: ElementType */](defaultComponent: D, props: P with FocusVisibleClassName): `5`[P, D] = {
    val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`[P, D]]
  }
  
  @scala.inline
  implicit class `5MutableBuilder`[Self <: `5`[_, _], P, D /* <: ElementType */] (val x: Self with (`5`[P, D])) extends AnyVal {
    
    @scala.inline
    def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: P with FocusVisibleClassName): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
