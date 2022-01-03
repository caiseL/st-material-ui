package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.muiBaseStrings.div
import com.olvind.mui.muiBase.muiBaseStrings.option
import com.olvind.mui.muiBase.muiBaseStrings.p
import com.olvind.mui.muiBase.muiBaseStrings.select
import com.olvind.mui.muiBase.tablePaginationUnstyledPropsMod.TablePaginationUnstyledComponentsPropsOverrides
import com.olvind.mui.react.mod.ComponentPropsWithRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisplayedRows extends StObject {
  
  var actions: js.UndefOr[ComponentPropsWithRef[div] with TablePaginationUnstyledComponentsPropsOverrides] = js.native
  
  var displayedRows: js.UndefOr[ComponentPropsWithRef[p] with TablePaginationUnstyledComponentsPropsOverrides] = js.native
  
  var menuItem: js.UndefOr[
    ComponentPropsWithRef[option] with TablePaginationUnstyledComponentsPropsOverrides
  ] = js.native
  
  var root: js.UndefOr[ComponentPropsWithRef[div] with TablePaginationUnstyledComponentsPropsOverrides] = js.native
  
  var select: js.UndefOr[
    ComponentPropsWithRef[com.olvind.mui.muiBase.muiBaseStrings.select] with TablePaginationUnstyledComponentsPropsOverrides
  ] = js.native
  
  var selectLabel: js.UndefOr[ComponentPropsWithRef[p] with TablePaginationUnstyledComponentsPropsOverrides] = js.native
  
  var spacer: js.UndefOr[ComponentPropsWithRef[div] with TablePaginationUnstyledComponentsPropsOverrides] = js.native
  
  var toolbar: js.UndefOr[ComponentPropsWithRef[div] with TablePaginationUnstyledComponentsPropsOverrides] = js.native
}
object DisplayedRows {
  
  @scala.inline
  def apply(): DisplayedRows = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayedRows]
  }
  
  @scala.inline
  implicit class DisplayedRowsMutableBuilder[Self <: DisplayedRows] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: ComponentPropsWithRef[div] with TablePaginationUnstyledComponentsPropsOverrides): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setDisplayedRows(value: ComponentPropsWithRef[p] with TablePaginationUnstyledComponentsPropsOverrides): Self = StObject.set(x, "displayedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayedRowsUndefined: Self = StObject.set(x, "displayedRows", js.undefined)
    
    @scala.inline
    def setMenuItem(value: ComponentPropsWithRef[option] with TablePaginationUnstyledComponentsPropsOverrides): Self = StObject.set(x, "menuItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItemUndefined: Self = StObject.set(x, "menuItem", js.undefined)
    
    @scala.inline
    def setRoot(value: ComponentPropsWithRef[div] with TablePaginationUnstyledComponentsPropsOverrides): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setSelect(value: ComponentPropsWithRef[select] with TablePaginationUnstyledComponentsPropsOverrides): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectLabel(value: ComponentPropsWithRef[p] with TablePaginationUnstyledComponentsPropsOverrides): Self = StObject.set(x, "selectLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectLabelUndefined: Self = StObject.set(x, "selectLabel", js.undefined)
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSpacer(value: ComponentPropsWithRef[div] with TablePaginationUnstyledComponentsPropsOverrides): Self = StObject.set(x, "spacer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacerUndefined: Self = StObject.set(x, "spacer", js.undefined)
    
    @scala.inline
    def setToolbar(value: ComponentPropsWithRef[div] with TablePaginationUnstyledComponentsPropsOverrides): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
  }
}
