package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAlignItems
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsListItemTypeMapli
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapList
import com.olvind.mui.muiMaterial.listItemClassesMod.ListItemClasses
import com.olvind.mui.react.mod.global.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemMod {
  
  @JSImport("@mui/material/ListItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Uses an additional container component if `ListItemSecondaryAction` is the last child.
    *
    * Demos:
    *
    * - [Lists](https://mui.com/components/lists/)
    * - [Transfer List](https://mui.com/components/transfer-list/)
    *
    * API:
    *
    * - [ListItem API](https://mui.com/api/list-item/)
    */
  @JSImport("@mui/material/ListItem", JSImport.Default)
  @js.native
  val default: (js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapList | DefaultComponentPropsExtendButtonBaseTypAlignItems, 
    ReactElement | Null
  ]) & (js.Function1[/* props */ DefaultComponentPropsListItemTypeMapli, Element]) = js.native
  
  inline def getListItemUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/ListItem", "listItemClasses")
  @js.native
  val listItemClasses: ListItemClasses = js.native
}
