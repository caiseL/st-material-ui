package com.olvind.mui.muiMaterial

import org.scalajs.dom.Node
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ownerWindowMod {
  
  @JSImport("@mui/material/utils/ownerWindow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Window]
  @scala.inline
  def default(node: Node): Window = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[Window]
}
