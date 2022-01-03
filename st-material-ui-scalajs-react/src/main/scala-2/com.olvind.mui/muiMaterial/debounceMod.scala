package com.olvind.mui.muiMaterial

import com.olvind.mui.muiUtils.debounceMod.Cancelable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debounceMod {
  
  @JSImport("@mui/material/utils/debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T): T with Cancelable = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any]).asInstanceOf[T with Cancelable]
  @scala.inline
  def default[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T, wait: Double): T with Cancelable = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[T with Cancelable]
}
