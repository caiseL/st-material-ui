package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.muiMaterialStrings.first
import com.olvind.mui.muiMaterial.muiMaterialStrings.last
import com.olvind.mui.muiMaterial.muiMaterialStrings.next
import com.olvind.mui.muiMaterial.muiMaterialStrings.previous
import com.olvind.mui.muiMaterial.tablePaginationTablePaginationMod.LabelDisplayedRowsArgs
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.react.mod.ChangeEventHandler
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsComponent extends StObject {
  
  /**
    * The component used for displaying the actions.
    * Either a string to use a HTML element or a component.
    * @default TablePaginationActions
    */
  var ActionsComponent: js.UndefOr[ReactElement] = js.native
  
  /**
    * Props applied to the rows per page [`Select`](/api/select/) element.
    * @default {}
    */
  var SelectProps: js.UndefOr[PartialSelectPropsunknown] = js.native
  
  /**
    * Props applied to the back arrow [`IconButton`](/api/icon-button/) component.
    */
  var backIconButtonProps: js.UndefOr[PartialIconButtonPropsIconButtonTypeMapb] = js.native
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialTablePaginationClasses] = js.native
  
  /**
    * The total number of rows.
    *
    * To enable server side pagination for an unknown number of items, provide -1.
    */
  var count: Double = js.native
  
  /**
    * Accepts a function which returns a string value that provides a user-friendly name for the current page.
    * This is important for screen reader users.
    *
    * For localization purposes, you can use the provided [translations](/guides/localization/).
    * @param {string} type The link or button type to format ('first' | 'last' | 'next' | 'previous').
    * @returns {string}
    * @default function defaultGetAriaLabel(type) {
    *   return `Go to ${type} page`;
    * }
    */
  var getItemAriaLabel: js.UndefOr[js.Function1[/* type */ first | last | next | previous, String]] = js.native
  
  /**
    * Customize the displayed rows label. Invoked with a `{ from, to, count, page }`
    * object.
    *
    * For localization purposes, you can use the provided [translations](/guides/localization/).
    * @default function defaultLabelDisplayedRows({ from, to, count }) {
    *   return `${from}–${to} of ${count !== -1 ? count : `more than ${to}`}`;
    * }
    */
  var labelDisplayedRows: js.UndefOr[js.Function1[/* paginationInfo */ LabelDisplayedRowsArgs, ReactElement]] = js.native
  
  /**
    * Customize the rows per page label.
    *
    * For localization purposes, you can use the provided [translations](/guides/localization/).
    * @default 'Rows per page:'
    */
  var labelRowsPerPage: js.UndefOr[ReactElement] = js.native
  
  /**
    * Props applied to the next arrow [`IconButton`](/api/icon-button/) element.
    */
  var nextIconButtonProps: js.UndefOr[PartialIconButtonPropsIconButtonTypeMapb] = js.native
  
  def onPageChange(event: Null, page: Double): Unit = js.native
  /**
    * Callback fired when the page is changed.
    *
    * @param {React.MouseEvent<HTMLButtonElement> | null} event The event source of the callback.
    * @param {number} page The page selected.
    */
  def onPageChange(event: SyntheticMouseEvent[HTMLButtonElement], page: Double): Unit = js.native
  
  /**
    * Callback fired when the number of rows per page is changed.
    *
    * @param {React.ChangeEvent<HTMLTextAreaElement | HTMLInputElement>} event The event source of the callback.
    */
  var onRowsPerPageChange: js.UndefOr[ChangeEventHandler[HTMLTextAreaElement | HTMLInputElement]] = js.native
  
  /**
    * The zero-based index of the current page.
    */
  var page: Double = js.native
  
  /**
    * The number of rows per page.
    *
    * Set -1 to display all the rows.
    */
  var rowsPerPage: Double = js.native
  
  /**
    * Customizes the options of the rows per page select field. If less than two options are
    * available, no select field will be displayed.
    * Use -1 for the value with a custom label to show all the rows.
    * @default [10, 25, 50, 100]
    */
  var rowsPerPageOptions: js.UndefOr[js.Array[Double | Value]] = js.native
  
  /**
    * If `true`, show the first-page button.
    * @default false
    */
  var showFirstButton: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true`, show the last-page button.
    * @default false
    */
  var showLastButton: js.UndefOr[Boolean] = js.native
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[com.olvind.mui.muiMaterial.createThemeMod.Theme]] = js.native
}
