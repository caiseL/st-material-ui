package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsSkeletonTypeMapspan
import com.olvind.mui.muiMaterial.skeletonClassesMod.SkeletonClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonMod {
  
  @JSImport("@mui/material/Skeleton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Skeleton](https://mui.com/components/skeleton/)
    *
    * API:
    *
    * - [Skeleton API](https://mui.com/api/skeleton/)
    */
  @JSImport("@mui/material/Skeleton", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsSkeletonTypeMapspan, Element] = js.native
  
  @scala.inline
  def getSkeletonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSkeletonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Skeleton", "skeletonClasses")
  @js.native
  val skeletonClasses: SkeletonClasses = js.native
}
