package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.accordionActionsClassesMod.AccordionActionsClassKey
import com.olvind.mui.muiMaterial.accordionClassesMod.AccordionClassKey
import com.olvind.mui.muiMaterial.accordionSummaryClassesMod.AccordionSummaryClassKey
import com.olvind.mui.muiMaterial.adaptV4ThemeMod.Direction
import com.olvind.mui.muiMaterial.alertAlertMod.AlertColor
import com.olvind.mui.muiMaterial.alertClassesMod.AlertClassKey
import com.olvind.mui.muiMaterial.appBarClassesMod.AppBarClassKey
import com.olvind.mui.muiMaterial.autocompleteClassesMod.AutocompleteClassKey
import com.olvind.mui.muiMaterial.avatarClassesMod.AvatarClassKey
import com.olvind.mui.muiMaterial.avatarGroupClassesMod.AvatarGroupClassKey
import com.olvind.mui.muiMaterial.bottomNavigationActionClassesMod.BottomNavigationActionClassKey
import com.olvind.mui.muiMaterial.breadcrumbsClassesMod.BreadcrumbsClassKey
import com.olvind.mui.muiMaterial.buttonBaseClassesMod.ButtonBaseClassKey
import com.olvind.mui.muiMaterial.buttonClassesMod.ButtonClassKey
import com.olvind.mui.muiMaterial.buttonGroupClassesMod.ButtonGroupClassKey
import com.olvind.mui.muiMaterial.cardActionAreaClassesMod.CardActionAreaClassKey
import com.olvind.mui.muiMaterial.cardActionsClassesMod.CardActionsClassKey
import com.olvind.mui.muiMaterial.cardHeaderClassesMod.CardHeaderClassKey
import com.olvind.mui.muiMaterial.cardMediaClassesMod.CardMediaClassKey
import com.olvind.mui.muiMaterial.checkboxClassesMod.CheckboxClassKey
import com.olvind.mui.muiMaterial.chipClassesMod.ChipClassKey
import com.olvind.mui.muiMaterial.circularProgressClassesMod.CircularProgressClassKey
import com.olvind.mui.muiMaterial.collapseClassesMod.CollapseClassKey
import com.olvind.mui.muiMaterial.containerClassesMod.ContainerClassKey
import com.olvind.mui.muiMaterial.createTypographyMod.Variant
import com.olvind.mui.muiMaterial.dialogActionsClassesMod.DialogActionsClassKey
import com.olvind.mui.muiMaterial.dialogClassesMod.DialogClassKey
import com.olvind.mui.muiMaterial.dialogContentClassesMod.DialogContentClassKey
import com.olvind.mui.muiMaterial.dividerClassesMod.DividerClassKey
import com.olvind.mui.muiMaterial.drawerClassesMod.DrawerClassKey
import com.olvind.mui.muiMaterial.fabClassesMod.FabClassKey
import com.olvind.mui.muiMaterial.filledInputClassesMod.FilledInputClassKey
import com.olvind.mui.muiMaterial.formControlClassesMod.FormControlClassKey
import com.olvind.mui.muiMaterial.formControlLabelClassesMod.FormControlLabelClassKey
import com.olvind.mui.muiMaterial.formGroupClassesMod.FormGroupClassKey
import com.olvind.mui.muiMaterial.formHelperTextClassesMod.FormHelperTextClassKey
import com.olvind.mui.muiMaterial.formLabelClassesMod.FormLabelClassKey
import com.olvind.mui.muiMaterial.gridClassesMod.GridClassKey
import com.olvind.mui.muiMaterial.gridGridMod.GridDirection
import com.olvind.mui.muiMaterial.gridGridMod.GridWrap
import com.olvind.mui.muiMaterial.iconButtonClassesMod.IconButtonClassKey
import com.olvind.mui.muiMaterial.iconClassesMod.IconClassKey
import com.olvind.mui.muiMaterial.imageListClassesMod.ImageListClassKey
import com.olvind.mui.muiMaterial.imageListItemBarClassesMod.ImageListItemBarClassKey
import com.olvind.mui.muiMaterial.imageListItemClassesMod.ImageListItemClassKey
import com.olvind.mui.muiMaterial.inputAdornmentClassesMod.InputAdornmentClassKey
import com.olvind.mui.muiMaterial.inputBaseClassesMod.InputBaseClassKey
import com.olvind.mui.muiMaterial.inputClassesMod.InputClassKey
import com.olvind.mui.muiMaterial.inputLabelClassesMod.InputLabelClassKey
import com.olvind.mui.muiMaterial.linearProgressClassesMod.LinearProgressClassKey
import com.olvind.mui.muiMaterial.linkClassesMod.LinkClassKey
import com.olvind.mui.muiMaterial.listClassesMod.ListClassKey
import com.olvind.mui.muiMaterial.listItemAvatarClassesMod.ListItemAvatarClassKey
import com.olvind.mui.muiMaterial.listItemButtonClassesMod.ListItemButtonClassKey
import com.olvind.mui.muiMaterial.listItemClassesMod.ListItemClassKey
import com.olvind.mui.muiMaterial.listItemIconClassesMod.ListItemIconClassKey
import com.olvind.mui.muiMaterial.listItemSecondaryActionClassesMod.ListItemSecondaryActionClassKey
import com.olvind.mui.muiMaterial.listItemTextClassesMod.ListItemTextClassKey
import com.olvind.mui.muiMaterial.listSubheaderClassesMod.ListSubheaderClassKey
import com.olvind.mui.muiMaterial.menuClassesMod.MenuClassKey
import com.olvind.mui.muiMaterial.menuItemClassesMod.MenuItemClassKey
import com.olvind.mui.muiMaterial.mobileStepperClassesMod.MobileStepperClassKey
import com.olvind.mui.muiMaterial.mod.PaletteMode
import com.olvind.mui.muiMaterial.mod.PropTypes.Color
import com.olvind.mui.muiMaterial.nativeSelectClassesMod.NativeSelectClassKey
import com.olvind.mui.muiMaterial.outlinedInputClassesMod.OutlinedInputClassKey
import com.olvind.mui.muiMaterial.paginationClassesMod.PaginationClassKey
import com.olvind.mui.muiMaterial.paginationItemClassesMod.PaginationItemClassKey
import com.olvind.mui.muiMaterial.paperClassesMod.PaperClassKey
import com.olvind.mui.muiMaterial.popoverClassesMod.PopoverClassKey
import com.olvind.mui.muiMaterial.popoverPopoverMod.PopoverReference
import com.olvind.mui.muiMaterial.radioClassesMod.RadioClassKey
import com.olvind.mui.muiMaterial.ratingClassesMod.RatingClassKey
import com.olvind.mui.muiMaterial.selectClassesMod.SelectClassKey
import com.olvind.mui.muiMaterial.skeletonClassesMod.SkeletonClassKey
import com.olvind.mui.muiMaterial.snackbarClassesMod.SnackbarClassKey
import com.olvind.mui.muiMaterial.snackbarContentClassesMod.SnackbarContentClassKey
import com.olvind.mui.muiMaterial.snackbarSnackbarMod.SnackbarCloseReason
import com.olvind.mui.muiMaterial.speedDialActionClassesMod.SpeedDialActionClassKey
import com.olvind.mui.muiMaterial.speedDialClassesMod.SpeedDialClassKey
import com.olvind.mui.muiMaterial.speedDialIconClassesMod.SpeedDialIconClassKey
import com.olvind.mui.muiMaterial.speedDialSpeedDialMod.CloseReason
import com.olvind.mui.muiMaterial.speedDialSpeedDialMod.OpenReason
import com.olvind.mui.muiMaterial.stepButtonClassesMod.StepButtonClassKey
import com.olvind.mui.muiMaterial.stepClassesMod.StepClassKey
import com.olvind.mui.muiMaterial.stepConnectorClassesMod.StepConnectorClassKey
import com.olvind.mui.muiMaterial.stepContentClassesMod.StepContentClassKey
import com.olvind.mui.muiMaterial.stepIconClassesMod.StepIconClassKey
import com.olvind.mui.muiMaterial.stepLabelClassesMod.StepLabelClassKey
import com.olvind.mui.muiMaterial.stepperClassesMod.StepperClassKey
import com.olvind.mui.muiMaterial.stepperStepperMod.Orientation
import com.olvind.mui.muiMaterial.svgIconClassesMod.SvgIconClassKey
import com.olvind.mui.muiMaterial.switchBaseClassesMod.SwitchBaseClassKey
import com.olvind.mui.muiMaterial.switchClassesMod.SwitchClassKey
import com.olvind.mui.muiMaterial.tabClassesMod.TabClassKey
import com.olvind.mui.muiMaterial.tabScrollButtonClassesMod.TabScrollButtonClassKey
import com.olvind.mui.muiMaterial.tableCellClassesMod.TableCellClassKey
import com.olvind.mui.muiMaterial.tableCellTableCellMod.SortDirection
import com.olvind.mui.muiMaterial.tableClassesMod.TableClassKey
import com.olvind.mui.muiMaterial.tablePaginationClassesMod.TablePaginationClassKey
import com.olvind.mui.muiMaterial.tableRowClassesMod.TableRowClassKey
import com.olvind.mui.muiMaterial.tableSortLabelClassesMod.TableSortLabelClassKey
import com.olvind.mui.muiMaterial.tabsClassesMod.TabsClassKey
import com.olvind.mui.muiMaterial.toggleButtonClassesMod.ToggleButtonClassKey
import com.olvind.mui.muiMaterial.toggleButtonGroupClassesMod.ToggleButtonGroupClassKey
import com.olvind.mui.muiMaterial.toolbarClassesMod.ToolbarClassKey
import com.olvind.mui.muiMaterial.tooltipClassesMod.TooltipClassKey
import com.olvind.mui.muiMaterial.touchRippleClassesMod.TouchRippleClassKey
import com.olvind.mui.muiMaterial.transitionMod.TransitionHandlerKeys
import com.olvind.mui.muiMaterial.transitionMod.TransitionKeys
import com.olvind.mui.muiMaterial.typographyClassesMod.TypographyClassKey
import com.olvind.mui.muiMaterial.useFormControlMod.ContextFromPropsKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object muiMaterialStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with Color
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait Numbersign000 extends StObject
  inline def Numbersign000: Numbersign000 = "#000".asInstanceOf[Numbersign000]
  
  @js.native
  sealed trait Numbersign004d40 extends StObject
  inline def Numbersign004d40: Numbersign004d40 = "#004d40".asInstanceOf[Numbersign004d40]
  
  @js.native
  sealed trait Numbersign006064 extends StObject
  inline def Numbersign006064: Numbersign006064 = "#006064".asInstanceOf[Numbersign006064]
  
  @js.native
  sealed trait Numbersign00695c extends StObject
  inline def Numbersign00695c: Numbersign00695c = "#00695c".asInstanceOf[Numbersign00695c]
  
  @js.native
  sealed trait Numbersign00796b extends StObject
  inline def Numbersign00796b: Numbersign00796b = "#00796b".asInstanceOf[Numbersign00796b]
  
  @js.native
  sealed trait Numbersign00838f extends StObject
  inline def Numbersign00838f: Numbersign00838f = "#00838f".asInstanceOf[Numbersign00838f]
  
  @js.native
  sealed trait Numbersign00897b extends StObject
  inline def Numbersign00897b: Numbersign00897b = "#00897b".asInstanceOf[Numbersign00897b]
  
  @js.native
  sealed trait Numbersign0091ea extends StObject
  inline def Numbersign0091ea: Numbersign0091ea = "#0091ea".asInstanceOf[Numbersign0091ea]
  
  @js.native
  sealed trait Numbersign009688 extends StObject
  inline def Numbersign009688: Numbersign009688 = "#009688".asInstanceOf[Numbersign009688]
  
  @js.native
  sealed trait Numbersign0097a7 extends StObject
  inline def Numbersign0097a7: Numbersign0097a7 = "#0097a7".asInstanceOf[Numbersign0097a7]
  
  @js.native
  sealed trait Numbersign00acc1 extends StObject
  inline def Numbersign00acc1: Numbersign00acc1 = "#00acc1".asInstanceOf[Numbersign00acc1]
  
  @js.native
  sealed trait Numbersign00b0ff extends StObject
  inline def Numbersign00b0ff: Numbersign00b0ff = "#00b0ff".asInstanceOf[Numbersign00b0ff]
  
  @js.native
  sealed trait Numbersign00b8d4 extends StObject
  inline def Numbersign00b8d4: Numbersign00b8d4 = "#00b8d4".asInstanceOf[Numbersign00b8d4]
  
  @js.native
  sealed trait Numbersign00bcd4 extends StObject
  inline def Numbersign00bcd4: Numbersign00bcd4 = "#00bcd4".asInstanceOf[Numbersign00bcd4]
  
  @js.native
  sealed trait Numbersign00bfa5 extends StObject
  inline def Numbersign00bfa5: Numbersign00bfa5 = "#00bfa5".asInstanceOf[Numbersign00bfa5]
  
  @js.native
  sealed trait Numbersign00c853 extends StObject
  inline def Numbersign00c853: Numbersign00c853 = "#00c853".asInstanceOf[Numbersign00c853]
  
  @js.native
  sealed trait Numbersign00e5ff extends StObject
  inline def Numbersign00e5ff: Numbersign00e5ff = "#00e5ff".asInstanceOf[Numbersign00e5ff]
  
  @js.native
  sealed trait Numbersign00e676 extends StObject
  inline def Numbersign00e676: Numbersign00e676 = "#00e676".asInstanceOf[Numbersign00e676]
  
  @js.native
  sealed trait Numbersign01579b extends StObject
  inline def Numbersign01579b: Numbersign01579b = "#01579b".asInstanceOf[Numbersign01579b]
  
  @js.native
  sealed trait Numbersign0277bd extends StObject
  inline def Numbersign0277bd: Numbersign0277bd = "#0277bd".asInstanceOf[Numbersign0277bd]
  
  @js.native
  sealed trait Numbersign0288d1 extends StObject
  inline def Numbersign0288d1: Numbersign0288d1 = "#0288d1".asInstanceOf[Numbersign0288d1]
  
  @js.native
  sealed trait Numbersign039be5 extends StObject
  inline def Numbersign039be5: Numbersign039be5 = "#039be5".asInstanceOf[Numbersign039be5]
  
  @js.native
  sealed trait Numbersign03a9f4 extends StObject
  inline def Numbersign03a9f4: Numbersign03a9f4 = "#03a9f4".asInstanceOf[Numbersign03a9f4]
  
  @js.native
  sealed trait Numbersign0d47a1 extends StObject
  inline def Numbersign0d47a1: Numbersign0d47a1 = "#0d47a1".asInstanceOf[Numbersign0d47a1]
  
  @js.native
  sealed trait Numbersign1565c0 extends StObject
  inline def Numbersign1565c0: Numbersign1565c0 = "#1565c0".asInstanceOf[Numbersign1565c0]
  
  @js.native
  sealed trait Numbersign18ffff extends StObject
  inline def Numbersign18ffff: Numbersign18ffff = "#18ffff".asInstanceOf[Numbersign18ffff]
  
  @js.native
  sealed trait Numbersign1976d2 extends StObject
  inline def Numbersign1976d2: Numbersign1976d2 = "#1976d2".asInstanceOf[Numbersign1976d2]
  
  @js.native
  sealed trait Numbersign1a237e extends StObject
  inline def Numbersign1a237e: Numbersign1a237e = "#1a237e".asInstanceOf[Numbersign1a237e]
  
  @js.native
  sealed trait Numbersign1b5e20 extends StObject
  inline def Numbersign1b5e20: Numbersign1b5e20 = "#1b5e20".asInstanceOf[Numbersign1b5e20]
  
  @js.native
  sealed trait Numbersign1de9b6 extends StObject
  inline def Numbersign1de9b6: Numbersign1de9b6 = "#1de9b6".asInstanceOf[Numbersign1de9b6]
  
  @js.native
  sealed trait Numbersign1e88e5 extends StObject
  inline def Numbersign1e88e5: Numbersign1e88e5 = "#1e88e5".asInstanceOf[Numbersign1e88e5]
  
  @js.native
  sealed trait Numbersign212121 extends StObject
  inline def Numbersign212121: Numbersign212121 = "#212121".asInstanceOf[Numbersign212121]
  
  @js.native
  sealed trait Numbersign2196f3 extends StObject
  inline def Numbersign2196f3: Numbersign2196f3 = "#2196f3".asInstanceOf[Numbersign2196f3]
  
  @js.native
  sealed trait Numbersign263238 extends StObject
  inline def Numbersign263238: Numbersign263238 = "#263238".asInstanceOf[Numbersign263238]
  
  @js.native
  sealed trait Numbersign26a69a extends StObject
  inline def Numbersign26a69a: Numbersign26a69a = "#26a69a".asInstanceOf[Numbersign26a69a]
  
  @js.native
  sealed trait Numbersign26c6da extends StObject
  inline def Numbersign26c6da: Numbersign26c6da = "#26c6da".asInstanceOf[Numbersign26c6da]
  
  @js.native
  sealed trait Numbersign283593 extends StObject
  inline def Numbersign283593: Numbersign283593 = "#283593".asInstanceOf[Numbersign283593]
  
  @js.native
  sealed trait Numbersign2962ff extends StObject
  inline def Numbersign2962ff: Numbersign2962ff = "#2962ff".asInstanceOf[Numbersign2962ff]
  
  @js.native
  sealed trait Numbersign2979ff extends StObject
  inline def Numbersign2979ff: Numbersign2979ff = "#2979ff".asInstanceOf[Numbersign2979ff]
  
  @js.native
  sealed trait Numbersign29b6f6 extends StObject
  inline def Numbersign29b6f6: Numbersign29b6f6 = "#29b6f6".asInstanceOf[Numbersign29b6f6]
  
  @js.native
  sealed trait Numbersign2e7d32 extends StObject
  inline def Numbersign2e7d32: Numbersign2e7d32 = "#2e7d32".asInstanceOf[Numbersign2e7d32]
  
  @js.native
  sealed trait Numbersign303f9f extends StObject
  inline def Numbersign303f9f: Numbersign303f9f = "#303f9f".asInstanceOf[Numbersign303f9f]
  
  @js.native
  sealed trait Numbersign304ffe extends StObject
  inline def Numbersign304ffe: Numbersign304ffe = "#304ffe".asInstanceOf[Numbersign304ffe]
  
  @js.native
  sealed trait Numbersign311b92 extends StObject
  inline def Numbersign311b92: Numbersign311b92 = "#311b92".asInstanceOf[Numbersign311b92]
  
  @js.native
  sealed trait Numbersign33691e extends StObject
  inline def Numbersign33691e: Numbersign33691e = "#33691e".asInstanceOf[Numbersign33691e]
  
  @js.native
  sealed trait Numbersign37474f extends StObject
  inline def Numbersign37474f: Numbersign37474f = "#37474f".asInstanceOf[Numbersign37474f]
  
  @js.native
  sealed trait Numbersign388e3c extends StObject
  inline def Numbersign388e3c: Numbersign388e3c = "#388e3c".asInstanceOf[Numbersign388e3c]
  
  @js.native
  sealed trait Numbersign3949ab extends StObject
  inline def Numbersign3949ab: Numbersign3949ab = "#3949ab".asInstanceOf[Numbersign3949ab]
  
  @js.native
  sealed trait Numbersign3d5afe extends StObject
  inline def Numbersign3d5afe: Numbersign3d5afe = "#3d5afe".asInstanceOf[Numbersign3d5afe]
  
  @js.native
  sealed trait Numbersign3e2723 extends StObject
  inline def Numbersign3e2723: Numbersign3e2723 = "#3e2723".asInstanceOf[Numbersign3e2723]
  
  @js.native
  sealed trait Numbersign3f51b5 extends StObject
  inline def Numbersign3f51b5: Numbersign3f51b5 = "#3f51b5".asInstanceOf[Numbersign3f51b5]
  
  @js.native
  sealed trait Numbersign40c4ff extends StObject
  inline def Numbersign40c4ff: Numbersign40c4ff = "#40c4ff".asInstanceOf[Numbersign40c4ff]
  
  @js.native
  sealed trait Numbersign424242 extends StObject
  inline def Numbersign424242: Numbersign424242 = "#424242".asInstanceOf[Numbersign424242]
  
  @js.native
  sealed trait Numbersign42a5f5 extends StObject
  inline def Numbersign42a5f5: Numbersign42a5f5 = "#42a5f5".asInstanceOf[Numbersign42a5f5]
  
  @js.native
  sealed trait Numbersign43a047 extends StObject
  inline def Numbersign43a047: Numbersign43a047 = "#43a047".asInstanceOf[Numbersign43a047]
  
  @js.native
  sealed trait Numbersign448aff extends StObject
  inline def Numbersign448aff: Numbersign448aff = "#448aff".asInstanceOf[Numbersign448aff]
  
  @js.native
  sealed trait Numbersign4527a0 extends StObject
  inline def Numbersign4527a0: Numbersign4527a0 = "#4527a0".asInstanceOf[Numbersign4527a0]
  
  @js.native
  sealed trait Numbersign455a64 extends StObject
  inline def Numbersign455a64: Numbersign455a64 = "#455a64".asInstanceOf[Numbersign455a64]
  
  @js.native
  sealed trait Numbersign4a148c extends StObject
  inline def Numbersign4a148c: Numbersign4a148c = "#4a148c".asInstanceOf[Numbersign4a148c]
  
  @js.native
  sealed trait Numbersign4caf50 extends StObject
  inline def Numbersign4caf50: Numbersign4caf50 = "#4caf50".asInstanceOf[Numbersign4caf50]
  
  @js.native
  sealed trait Numbersign4db6ac extends StObject
  inline def Numbersign4db6ac: Numbersign4db6ac = "#4db6ac".asInstanceOf[Numbersign4db6ac]
  
  @js.native
  sealed trait Numbersign4dd0e1 extends StObject
  inline def Numbersign4dd0e1: Numbersign4dd0e1 = "#4dd0e1".asInstanceOf[Numbersign4dd0e1]
  
  @js.native
  sealed trait Numbersign4e342e extends StObject
  inline def Numbersign4e342e: Numbersign4e342e = "#4e342e".asInstanceOf[Numbersign4e342e]
  
  @js.native
  sealed trait Numbersign4fc3f7 extends StObject
  inline def Numbersign4fc3f7: Numbersign4fc3f7 = "#4fc3f7".asInstanceOf[Numbersign4fc3f7]
  
  @js.native
  sealed trait Numbersign512da8 extends StObject
  inline def Numbersign512da8: Numbersign512da8 = "#512da8".asInstanceOf[Numbersign512da8]
  
  @js.native
  sealed trait Numbersign536dfe extends StObject
  inline def Numbersign536dfe: Numbersign536dfe = "#536dfe".asInstanceOf[Numbersign536dfe]
  
  @js.native
  sealed trait Numbersign546e7a extends StObject
  inline def Numbersign546e7a: Numbersign546e7a = "#546e7a".asInstanceOf[Numbersign546e7a]
  
  @js.native
  sealed trait Numbersign558b2f extends StObject
  inline def Numbersign558b2f: Numbersign558b2f = "#558b2f".asInstanceOf[Numbersign558b2f]
  
  @js.native
  sealed trait Numbersign5c6bc0 extends StObject
  inline def Numbersign5c6bc0: Numbersign5c6bc0 = "#5c6bc0".asInstanceOf[Numbersign5c6bc0]
  
  @js.native
  sealed trait Numbersign5d4037 extends StObject
  inline def Numbersign5d4037: Numbersign5d4037 = "#5d4037".asInstanceOf[Numbersign5d4037]
  
  @js.native
  sealed trait Numbersign5e35b1 extends StObject
  inline def Numbersign5e35b1: Numbersign5e35b1 = "#5e35b1".asInstanceOf[Numbersign5e35b1]
  
  @js.native
  sealed trait Numbersign607d8b extends StObject
  inline def Numbersign607d8b: Numbersign607d8b = "#607d8b".asInstanceOf[Numbersign607d8b]
  
  @js.native
  sealed trait Numbersign616161 extends StObject
  inline def Numbersign616161: Numbersign616161 = "#616161".asInstanceOf[Numbersign616161]
  
  @js.native
  sealed trait Numbersign6200ea extends StObject
  inline def Numbersign6200ea: Numbersign6200ea = "#6200ea".asInstanceOf[Numbersign6200ea]
  
  @js.native
  sealed trait Numbersign64b5f6 extends StObject
  inline def Numbersign64b5f6: Numbersign64b5f6 = "#64b5f6".asInstanceOf[Numbersign64b5f6]
  
  @js.native
  sealed trait Numbersign64dd17 extends StObject
  inline def Numbersign64dd17: Numbersign64dd17 = "#64dd17".asInstanceOf[Numbersign64dd17]
  
  @js.native
  sealed trait Numbersign64ffda extends StObject
  inline def Numbersign64ffda: Numbersign64ffda = "#64ffda".asInstanceOf[Numbersign64ffda]
  
  @js.native
  sealed trait Numbersign651fff extends StObject
  inline def Numbersign651fff: Numbersign651fff = "#651fff".asInstanceOf[Numbersign651fff]
  
  @js.native
  sealed trait Numbersign66bb6a extends StObject
  inline def Numbersign66bb6a: Numbersign66bb6a = "#66bb6a".asInstanceOf[Numbersign66bb6a]
  
  @js.native
  sealed trait Numbersign673ab7 extends StObject
  inline def Numbersign673ab7: Numbersign673ab7 = "#673ab7".asInstanceOf[Numbersign673ab7]
  
  @js.native
  sealed trait Numbersign689f38 extends StObject
  inline def Numbersign689f38: Numbersign689f38 = "#689f38".asInstanceOf[Numbersign689f38]
  
  @js.native
  sealed trait Numbersign69f0ae extends StObject
  inline def Numbersign69f0ae: Numbersign69f0ae = "#69f0ae".asInstanceOf[Numbersign69f0ae]
  
  @js.native
  sealed trait Numbersign6a1b9a extends StObject
  inline def Numbersign6a1b9a: Numbersign6a1b9a = "#6a1b9a".asInstanceOf[Numbersign6a1b9a]
  
  @js.native
  sealed trait Numbersign6d4c41 extends StObject
  inline def Numbersign6d4c41: Numbersign6d4c41 = "#6d4c41".asInstanceOf[Numbersign6d4c41]
  
  @js.native
  sealed trait Numbersign757575 extends StObject
  inline def Numbersign757575: Numbersign757575 = "#757575".asInstanceOf[Numbersign757575]
  
  @js.native
  sealed trait Numbersign76ff03 extends StObject
  inline def Numbersign76ff03: Numbersign76ff03 = "#76ff03".asInstanceOf[Numbersign76ff03]
  
  @js.native
  sealed trait Numbersign78909c extends StObject
  inline def Numbersign78909c: Numbersign78909c = "#78909c".asInstanceOf[Numbersign78909c]
  
  @js.native
  sealed trait Numbersign795548 extends StObject
  inline def Numbersign795548: Numbersign795548 = "#795548".asInstanceOf[Numbersign795548]
  
  @js.native
  sealed trait Numbersign7986cb extends StObject
  inline def Numbersign7986cb: Numbersign7986cb = "#7986cb".asInstanceOf[Numbersign7986cb]
  
  @js.native
  sealed trait Numbersign7b1fa2 extends StObject
  inline def Numbersign7b1fa2: Numbersign7b1fa2 = "#7b1fa2".asInstanceOf[Numbersign7b1fa2]
  
  @js.native
  sealed trait Numbersign7c4dff extends StObject
  inline def Numbersign7c4dff: Numbersign7c4dff = "#7c4dff".asInstanceOf[Numbersign7c4dff]
  
  @js.native
  sealed trait Numbersign7cb342 extends StObject
  inline def Numbersign7cb342: Numbersign7cb342 = "#7cb342".asInstanceOf[Numbersign7cb342]
  
  @js.native
  sealed trait Numbersign7e57c2 extends StObject
  inline def Numbersign7e57c2: Numbersign7e57c2 = "#7e57c2".asInstanceOf[Numbersign7e57c2]
  
  @js.native
  sealed trait Numbersign80cbc4 extends StObject
  inline def Numbersign80cbc4: Numbersign80cbc4 = "#80cbc4".asInstanceOf[Numbersign80cbc4]
  
  @js.native
  sealed trait Numbersign80d8ff extends StObject
  inline def Numbersign80d8ff: Numbersign80d8ff = "#80d8ff".asInstanceOf[Numbersign80d8ff]
  
  @js.native
  sealed trait Numbersign80deea extends StObject
  inline def Numbersign80deea: Numbersign80deea = "#80deea".asInstanceOf[Numbersign80deea]
  
  @js.native
  sealed trait Numbersign81c784 extends StObject
  inline def Numbersign81c784: Numbersign81c784 = "#81c784".asInstanceOf[Numbersign81c784]
  
  @js.native
  sealed trait Numbersign81d4fa extends StObject
  inline def Numbersign81d4fa: Numbersign81d4fa = "#81d4fa".asInstanceOf[Numbersign81d4fa]
  
  @js.native
  sealed trait Numbersign827717 extends StObject
  inline def Numbersign827717: Numbersign827717 = "#827717".asInstanceOf[Numbersign827717]
  
  @js.native
  sealed trait Numbersign82b1ff extends StObject
  inline def Numbersign82b1ff: Numbersign82b1ff = "#82b1ff".asInstanceOf[Numbersign82b1ff]
  
  @js.native
  sealed trait Numbersign84ffff extends StObject
  inline def Numbersign84ffff: Numbersign84ffff = "#84ffff".asInstanceOf[Numbersign84ffff]
  
  @js.native
  sealed trait Numbersign880e4f extends StObject
  inline def Numbersign880e4f: Numbersign880e4f = "#880e4f".asInstanceOf[Numbersign880e4f]
  
  @js.native
  sealed trait Numbersign8bc34a extends StObject
  inline def Numbersign8bc34a: Numbersign8bc34a = "#8bc34a".asInstanceOf[Numbersign8bc34a]
  
  @js.native
  sealed trait Numbersign8c9eff extends StObject
  inline def Numbersign8c9eff: Numbersign8c9eff = "#8c9eff".asInstanceOf[Numbersign8c9eff]
  
  @js.native
  sealed trait Numbersign8d6e63 extends StObject
  inline def Numbersign8d6e63: Numbersign8d6e63 = "#8d6e63".asInstanceOf[Numbersign8d6e63]
  
  @js.native
  sealed trait Numbersign8e24aa extends StObject
  inline def Numbersign8e24aa: Numbersign8e24aa = "#8e24aa".asInstanceOf[Numbersign8e24aa]
  
  @js.native
  sealed trait Numbersign90a4ae extends StObject
  inline def Numbersign90a4ae: Numbersign90a4ae = "#90a4ae".asInstanceOf[Numbersign90a4ae]
  
  @js.native
  sealed trait Numbersign90caf9 extends StObject
  inline def Numbersign90caf9: Numbersign90caf9 = "#90caf9".asInstanceOf[Numbersign90caf9]
  
  @js.native
  sealed trait Numbersign9575cd extends StObject
  inline def Numbersign9575cd: Numbersign9575cd = "#9575cd".asInstanceOf[Numbersign9575cd]
  
  @js.native
  sealed trait Numbersign9c27b0 extends StObject
  inline def Numbersign9c27b0: Numbersign9c27b0 = "#9c27b0".asInstanceOf[Numbersign9c27b0]
  
  @js.native
  sealed trait Numbersign9ccc65 extends StObject
  inline def Numbersign9ccc65: Numbersign9ccc65 = "#9ccc65".asInstanceOf[Numbersign9ccc65]
  
  @js.native
  sealed trait Numbersign9e9d24 extends StObject
  inline def Numbersign9e9d24: Numbersign9e9d24 = "#9e9d24".asInstanceOf[Numbersign9e9d24]
  
  @js.native
  sealed trait Numbersign9e9e9e extends StObject
  inline def Numbersign9e9e9e: Numbersign9e9e9e = "#9e9e9e".asInstanceOf[Numbersign9e9e9e]
  
  @js.native
  sealed trait Numbersign9fa8da extends StObject
  inline def Numbersign9fa8da: Numbersign9fa8da = "#9fa8da".asInstanceOf[Numbersign9fa8da]
  
  @js.native
  sealed trait Numbersigna1887f extends StObject
  inline def Numbersigna1887f: Numbersigna1887f = "#a1887f".asInstanceOf[Numbersigna1887f]
  
  @js.native
  sealed trait Numbersigna5d6a7 extends StObject
  inline def Numbersigna5d6a7: Numbersigna5d6a7 = "#a5d6a7".asInstanceOf[Numbersigna5d6a7]
  
  @js.native
  sealed trait Numbersigna7ffeb extends StObject
  inline def Numbersigna7ffeb: Numbersigna7ffeb = "#a7ffeb".asInstanceOf[Numbersigna7ffeb]
  
  @js.native
  sealed trait Numbersignaa00ff extends StObject
  inline def Numbersignaa00ff: Numbersignaa00ff = "#aa00ff".asInstanceOf[Numbersignaa00ff]
  
  @js.native
  sealed trait Numbersignab47bc extends StObject
  inline def Numbersignab47bc: Numbersignab47bc = "#ab47bc".asInstanceOf[Numbersignab47bc]
  
  @js.native
  sealed trait Numbersignad1457 extends StObject
  inline def Numbersignad1457: Numbersignad1457 = "#ad1457".asInstanceOf[Numbersignad1457]
  
  @js.native
  sealed trait Numbersignaed581 extends StObject
  inline def Numbersignaed581: Numbersignaed581 = "#aed581".asInstanceOf[Numbersignaed581]
  
  @js.native
  sealed trait Numbersignaeea00 extends StObject
  inline def Numbersignaeea00: Numbersignaeea00 = "#aeea00".asInstanceOf[Numbersignaeea00]
  
  @js.native
  sealed trait Numbersignafb42b extends StObject
  inline def Numbersignafb42b: Numbersignafb42b = "#afb42b".asInstanceOf[Numbersignafb42b]
  
  @js.native
  sealed trait Numbersignb0bec5 extends StObject
  inline def Numbersignb0bec5: Numbersignb0bec5 = "#b0bec5".asInstanceOf[Numbersignb0bec5]
  
  @js.native
  sealed trait Numbersignb2dfdb extends StObject
  inline def Numbersignb2dfdb: Numbersignb2dfdb = "#b2dfdb".asInstanceOf[Numbersignb2dfdb]
  
  @js.native
  sealed trait Numbersignb2ebf2 extends StObject
  inline def Numbersignb2ebf2: Numbersignb2ebf2 = "#b2ebf2".asInstanceOf[Numbersignb2ebf2]
  
  @js.native
  sealed trait Numbersignb2ff59 extends StObject
  inline def Numbersignb2ff59: Numbersignb2ff59 = "#b2ff59".asInstanceOf[Numbersignb2ff59]
  
  @js.native
  sealed trait Numbersignb388ff extends StObject
  inline def Numbersignb388ff: Numbersignb388ff = "#b388ff".asInstanceOf[Numbersignb388ff]
  
  @js.native
  sealed trait Numbersignb39ddb extends StObject
  inline def Numbersignb39ddb: Numbersignb39ddb = "#b39ddb".asInstanceOf[Numbersignb39ddb]
  
  @js.native
  sealed trait Numbersignb3e5fc extends StObject
  inline def Numbersignb3e5fc: Numbersignb3e5fc = "#b3e5fc".asInstanceOf[Numbersignb3e5fc]
  
  @js.native
  sealed trait Numbersignb71c1c extends StObject
  inline def Numbersignb71c1c: Numbersignb71c1c = "#b71c1c".asInstanceOf[Numbersignb71c1c]
  
  @js.native
  sealed trait Numbersignb9f6ca extends StObject
  inline def Numbersignb9f6ca: Numbersignb9f6ca = "#b9f6ca".asInstanceOf[Numbersignb9f6ca]
  
  @js.native
  sealed trait Numbersignba68c8 extends StObject
  inline def Numbersignba68c8: Numbersignba68c8 = "#ba68c8".asInstanceOf[Numbersignba68c8]
  
  @js.native
  sealed trait Numbersignbbdefb extends StObject
  inline def Numbersignbbdefb: Numbersignbbdefb = "#bbdefb".asInstanceOf[Numbersignbbdefb]
  
  @js.native
  sealed trait Numbersignbcaaa4 extends StObject
  inline def Numbersignbcaaa4: Numbersignbcaaa4 = "#bcaaa4".asInstanceOf[Numbersignbcaaa4]
  
  @js.native
  sealed trait Numbersignbdbdbd extends StObject
  inline def Numbersignbdbdbd: Numbersignbdbdbd = "#bdbdbd".asInstanceOf[Numbersignbdbdbd]
  
  @js.native
  sealed trait Numbersignbf360c extends StObject
  inline def Numbersignbf360c: Numbersignbf360c = "#bf360c".asInstanceOf[Numbersignbf360c]
  
  @js.native
  sealed trait Numbersignc0ca33 extends StObject
  inline def Numbersignc0ca33: Numbersignc0ca33 = "#c0ca33".asInstanceOf[Numbersignc0ca33]
  
  @js.native
  sealed trait Numbersignc2185b extends StObject
  inline def Numbersignc2185b: Numbersignc2185b = "#c2185b".asInstanceOf[Numbersignc2185b]
  
  @js.native
  sealed trait Numbersignc51162 extends StObject
  inline def Numbersignc51162: Numbersignc51162 = "#c51162".asInstanceOf[Numbersignc51162]
  
  @js.native
  sealed trait Numbersignc5cae9 extends StObject
  inline def Numbersignc5cae9: Numbersignc5cae9 = "#c5cae9".asInstanceOf[Numbersignc5cae9]
  
  @js.native
  sealed trait Numbersignc5e1a5 extends StObject
  inline def Numbersignc5e1a5: Numbersignc5e1a5 = "#c5e1a5".asInstanceOf[Numbersignc5e1a5]
  
  @js.native
  sealed trait Numbersignc62828 extends StObject
  inline def Numbersignc62828: Numbersignc62828 = "#c62828".asInstanceOf[Numbersignc62828]
  
  @js.native
  sealed trait Numbersignc6ff00 extends StObject
  inline def Numbersignc6ff00: Numbersignc6ff00 = "#c6ff00".asInstanceOf[Numbersignc6ff00]
  
  @js.native
  sealed trait Numbersignc8e6c9 extends StObject
  inline def Numbersignc8e6c9: Numbersignc8e6c9 = "#c8e6c9".asInstanceOf[Numbersignc8e6c9]
  
  @js.native
  sealed trait Numbersignccff90 extends StObject
  inline def Numbersignccff90: Numbersignccff90 = "#ccff90".asInstanceOf[Numbersignccff90]
  
  @js.native
  sealed trait Numbersigncddc39 extends StObject
  inline def Numbersigncddc39: Numbersigncddc39 = "#cddc39".asInstanceOf[Numbersigncddc39]
  
  @js.native
  sealed trait Numbersignce93d8 extends StObject
  inline def Numbersignce93d8: Numbersignce93d8 = "#ce93d8".asInstanceOf[Numbersignce93d8]
  
  @js.native
  sealed trait Numbersigncfd8dc extends StObject
  inline def Numbersigncfd8dc: Numbersigncfd8dc = "#cfd8dc".asInstanceOf[Numbersigncfd8dc]
  
  @js.native
  sealed trait Numbersignd1c4e9 extends StObject
  inline def Numbersignd1c4e9: Numbersignd1c4e9 = "#d1c4e9".asInstanceOf[Numbersignd1c4e9]
  
  @js.native
  sealed trait Numbersignd32f2f extends StObject
  inline def Numbersignd32f2f: Numbersignd32f2f = "#d32f2f".asInstanceOf[Numbersignd32f2f]
  
  @js.native
  sealed trait Numbersignd4e157 extends StObject
  inline def Numbersignd4e157: Numbersignd4e157 = "#d4e157".asInstanceOf[Numbersignd4e157]
  
  @js.native
  sealed trait Numbersignd50000 extends StObject
  inline def Numbersignd50000: Numbersignd50000 = "#d50000".asInstanceOf[Numbersignd50000]
  
  @js.native
  sealed trait Numbersignd500f9 extends StObject
  inline def Numbersignd500f9: Numbersignd500f9 = "#d500f9".asInstanceOf[Numbersignd500f9]
  
  @js.native
  sealed trait Numbersignd7ccc8 extends StObject
  inline def Numbersignd7ccc8: Numbersignd7ccc8 = "#d7ccc8".asInstanceOf[Numbersignd7ccc8]
  
  @js.native
  sealed trait Numbersignd81b60 extends StObject
  inline def Numbersignd81b60: Numbersignd81b60 = "#d81b60".asInstanceOf[Numbersignd81b60]
  
  @js.native
  sealed trait Numbersignd84315 extends StObject
  inline def Numbersignd84315: Numbersignd84315 = "#d84315".asInstanceOf[Numbersignd84315]
  
  @js.native
  sealed trait Numbersigndce775 extends StObject
  inline def Numbersigndce775: Numbersigndce775 = "#dce775".asInstanceOf[Numbersigndce775]
  
  @js.native
  sealed trait Numbersigndcedc8 extends StObject
  inline def Numbersigndcedc8: Numbersigndcedc8 = "#dcedc8".asInstanceOf[Numbersigndcedc8]
  
  @js.native
  sealed trait Numbersigndd2c00 extends StObject
  inline def Numbersigndd2c00: Numbersigndd2c00 = "#dd2c00".asInstanceOf[Numbersigndd2c00]
  
  @js.native
  sealed trait Numbersigne040fb extends StObject
  inline def Numbersigne040fb: Numbersigne040fb = "#e040fb".asInstanceOf[Numbersigne040fb]
  
  @js.native
  sealed trait Numbersigne0e0e0 extends StObject
  inline def Numbersigne0e0e0: Numbersigne0e0e0 = "#e0e0e0".asInstanceOf[Numbersigne0e0e0]
  
  @js.native
  sealed trait Numbersigne0f2f1 extends StObject
  inline def Numbersigne0f2f1: Numbersigne0f2f1 = "#e0f2f1".asInstanceOf[Numbersigne0f2f1]
  
  @js.native
  sealed trait Numbersigne0f7fa extends StObject
  inline def Numbersigne0f7fa: Numbersigne0f7fa = "#e0f7fa".asInstanceOf[Numbersigne0f7fa]
  
  @js.native
  sealed trait Numbersigne1bee7 extends StObject
  inline def Numbersigne1bee7: Numbersigne1bee7 = "#e1bee7".asInstanceOf[Numbersigne1bee7]
  
  @js.native
  sealed trait Numbersigne1f5fe extends StObject
  inline def Numbersigne1f5fe: Numbersigne1f5fe = "#e1f5fe".asInstanceOf[Numbersigne1f5fe]
  
  @js.native
  sealed trait Numbersigne3f2fd extends StObject
  inline def Numbersigne3f2fd: Numbersigne3f2fd = "#e3f2fd".asInstanceOf[Numbersigne3f2fd]
  
  @js.native
  sealed trait Numbersigne53935 extends StObject
  inline def Numbersigne53935: Numbersigne53935 = "#e53935".asInstanceOf[Numbersigne53935]
  
  @js.native
  sealed trait Numbersigne57373 extends StObject
  inline def Numbersigne57373: Numbersigne57373 = "#e57373".asInstanceOf[Numbersigne57373]
  
  @js.native
  sealed trait Numbersigne64a19 extends StObject
  inline def Numbersigne64a19: Numbersigne64a19 = "#e64a19".asInstanceOf[Numbersigne64a19]
  
  @js.native
  sealed trait Numbersigne65100 extends StObject
  inline def Numbersigne65100: Numbersigne65100 = "#e65100".asInstanceOf[Numbersigne65100]
  
  @js.native
  sealed trait Numbersigne6ee9c extends StObject
  inline def Numbersigne6ee9c: Numbersigne6ee9c = "#e6ee9c".asInstanceOf[Numbersigne6ee9c]
  
  @js.native
  sealed trait Numbersigne8eaf6 extends StObject
  inline def Numbersigne8eaf6: Numbersigne8eaf6 = "#e8eaf6".asInstanceOf[Numbersigne8eaf6]
  
  @js.native
  sealed trait Numbersigne8f5e9 extends StObject
  inline def Numbersigne8f5e9: Numbersigne8f5e9 = "#e8f5e9".asInstanceOf[Numbersigne8f5e9]
  
  @js.native
  sealed trait Numbersigne91e63 extends StObject
  inline def Numbersigne91e63: Numbersigne91e63 = "#e91e63".asInstanceOf[Numbersigne91e63]
  
  @js.native
  sealed trait Numbersignea80fc extends StObject
  inline def Numbersignea80fc: Numbersignea80fc = "#ea80fc".asInstanceOf[Numbersignea80fc]
  
  @js.native
  sealed trait Numbersignec407a extends StObject
  inline def Numbersignec407a: Numbersignec407a = "#ec407a".asInstanceOf[Numbersignec407a]
  
  @js.native
  sealed trait Numbersigneceff1 extends StObject
  inline def Numbersigneceff1: Numbersigneceff1 = "#eceff1".asInstanceOf[Numbersigneceff1]
  
  @js.native
  sealed trait Numbersignede7f6 extends StObject
  inline def Numbersignede7f6: Numbersignede7f6 = "#ede7f6".asInstanceOf[Numbersignede7f6]
  
  @js.native
  sealed trait Numbersigneeeeee extends StObject
  inline def Numbersigneeeeee: Numbersigneeeeee = "#eeeeee".asInstanceOf[Numbersigneeeeee]
  
  @js.native
  sealed trait Numbersigneeff41 extends StObject
  inline def Numbersigneeff41: Numbersigneeff41 = "#eeff41".asInstanceOf[Numbersigneeff41]
  
  @js.native
  sealed trait Numbersignef5350 extends StObject
  inline def Numbersignef5350: Numbersignef5350 = "#ef5350".asInstanceOf[Numbersignef5350]
  
  @js.native
  sealed trait Numbersignef6c00 extends StObject
  inline def Numbersignef6c00: Numbersignef6c00 = "#ef6c00".asInstanceOf[Numbersignef6c00]
  
  @js.native
  sealed trait Numbersignef9a9a extends StObject
  inline def Numbersignef9a9a: Numbersignef9a9a = "#ef9a9a".asInstanceOf[Numbersignef9a9a]
  
  @js.native
  sealed trait Numbersignefebe9 extends StObject
  inline def Numbersignefebe9: Numbersignefebe9 = "#efebe9".asInstanceOf[Numbersignefebe9]
  
  @js.native
  sealed trait Numbersignf06292 extends StObject
  inline def Numbersignf06292: Numbersignf06292 = "#f06292".asInstanceOf[Numbersignf06292]
  
  @js.native
  sealed trait Numbersignf0f4c3 extends StObject
  inline def Numbersignf0f4c3: Numbersignf0f4c3 = "#f0f4c3".asInstanceOf[Numbersignf0f4c3]
  
  @js.native
  sealed trait Numbersignf1f8e9 extends StObject
  inline def Numbersignf1f8e9: Numbersignf1f8e9 = "#f1f8e9".asInstanceOf[Numbersignf1f8e9]
  
  @js.native
  sealed trait Numbersignf3e5f5 extends StObject
  inline def Numbersignf3e5f5: Numbersignf3e5f5 = "#f3e5f5".asInstanceOf[Numbersignf3e5f5]
  
  @js.native
  sealed trait Numbersignf44336 extends StObject
  inline def Numbersignf44336: Numbersignf44336 = "#f44336".asInstanceOf[Numbersignf44336]
  
  @js.native
  sealed trait Numbersignf4511e extends StObject
  inline def Numbersignf4511e: Numbersignf4511e = "#f4511e".asInstanceOf[Numbersignf4511e]
  
  @js.native
  sealed trait Numbersignf48fb1 extends StObject
  inline def Numbersignf48fb1: Numbersignf48fb1 = "#f48fb1".asInstanceOf[Numbersignf48fb1]
  
  @js.native
  sealed trait Numbersignf4ff81 extends StObject
  inline def Numbersignf4ff81: Numbersignf4ff81 = "#f4ff81".asInstanceOf[Numbersignf4ff81]
  
  @js.native
  sealed trait Numbersignf50057 extends StObject
  inline def Numbersignf50057: Numbersignf50057 = "#f50057".asInstanceOf[Numbersignf50057]
  
  @js.native
  sealed trait Numbersignf57c00 extends StObject
  inline def Numbersignf57c00: Numbersignf57c00 = "#f57c00".asInstanceOf[Numbersignf57c00]
  
  @js.native
  sealed trait Numbersignf57f17 extends StObject
  inline def Numbersignf57f17: Numbersignf57f17 = "#f57f17".asInstanceOf[Numbersignf57f17]
  
  @js.native
  sealed trait Numbersignf5f5f5 extends StObject
  inline def Numbersignf5f5f5: Numbersignf5f5f5 = "#f5f5f5".asInstanceOf[Numbersignf5f5f5]
  
  @js.native
  sealed trait Numbersignf8bbd0 extends StObject
  inline def Numbersignf8bbd0: Numbersignf8bbd0 = "#f8bbd0".asInstanceOf[Numbersignf8bbd0]
  
  @js.native
  sealed trait Numbersignf9a825 extends StObject
  inline def Numbersignf9a825: Numbersignf9a825 = "#f9a825".asInstanceOf[Numbersignf9a825]
  
  @js.native
  sealed trait Numbersignf9fbe7 extends StObject
  inline def Numbersignf9fbe7: Numbersignf9fbe7 = "#f9fbe7".asInstanceOf[Numbersignf9fbe7]
  
  @js.native
  sealed trait Numbersignfafafa extends StObject
  inline def Numbersignfafafa: Numbersignfafafa = "#fafafa".asInstanceOf[Numbersignfafafa]
  
  @js.native
  sealed trait Numbersignfb8c00 extends StObject
  inline def Numbersignfb8c00: Numbersignfb8c00 = "#fb8c00".asInstanceOf[Numbersignfb8c00]
  
  @js.native
  sealed trait Numbersignfbc02d extends StObject
  inline def Numbersignfbc02d: Numbersignfbc02d = "#fbc02d".asInstanceOf[Numbersignfbc02d]
  
  @js.native
  sealed trait Numbersignfbe9e7 extends StObject
  inline def Numbersignfbe9e7: Numbersignfbe9e7 = "#fbe9e7".asInstanceOf[Numbersignfbe9e7]
  
  @js.native
  sealed trait Numbersignfce4ec extends StObject
  inline def Numbersignfce4ec: Numbersignfce4ec = "#fce4ec".asInstanceOf[Numbersignfce4ec]
  
  @js.native
  sealed trait Numbersignfdd835 extends StObject
  inline def Numbersignfdd835: Numbersignfdd835 = "#fdd835".asInstanceOf[Numbersignfdd835]
  
  @js.native
  sealed trait Numbersignff1744 extends StObject
  inline def Numbersignff1744: Numbersignff1744 = "#ff1744".asInstanceOf[Numbersignff1744]
  
  @js.native
  sealed trait Numbersignff3d00 extends StObject
  inline def Numbersignff3d00: Numbersignff3d00 = "#ff3d00".asInstanceOf[Numbersignff3d00]
  
  @js.native
  sealed trait Numbersignff4081 extends StObject
  inline def Numbersignff4081: Numbersignff4081 = "#ff4081".asInstanceOf[Numbersignff4081]
  
  @js.native
  sealed trait Numbersignff5252 extends StObject
  inline def Numbersignff5252: Numbersignff5252 = "#ff5252".asInstanceOf[Numbersignff5252]
  
  @js.native
  sealed trait Numbersignff5722 extends StObject
  inline def Numbersignff5722: Numbersignff5722 = "#ff5722".asInstanceOf[Numbersignff5722]
  
  @js.native
  sealed trait Numbersignff6d00 extends StObject
  inline def Numbersignff6d00: Numbersignff6d00 = "#ff6d00".asInstanceOf[Numbersignff6d00]
  
  @js.native
  sealed trait Numbersignff6e40 extends StObject
  inline def Numbersignff6e40: Numbersignff6e40 = "#ff6e40".asInstanceOf[Numbersignff6e40]
  
  @js.native
  sealed trait Numbersignff6f00 extends StObject
  inline def Numbersignff6f00: Numbersignff6f00 = "#ff6f00".asInstanceOf[Numbersignff6f00]
  
  @js.native
  sealed trait Numbersignff7043 extends StObject
  inline def Numbersignff7043: Numbersignff7043 = "#ff7043".asInstanceOf[Numbersignff7043]
  
  @js.native
  sealed trait Numbersignff80ab extends StObject
  inline def Numbersignff80ab: Numbersignff80ab = "#ff80ab".asInstanceOf[Numbersignff80ab]
  
  @js.native
  sealed trait Numbersignff8a65 extends StObject
  inline def Numbersignff8a65: Numbersignff8a65 = "#ff8a65".asInstanceOf[Numbersignff8a65]
  
  @js.native
  sealed trait Numbersignff8a80 extends StObject
  inline def Numbersignff8a80: Numbersignff8a80 = "#ff8a80".asInstanceOf[Numbersignff8a80]
  
  @js.native
  sealed trait Numbersignff8f00 extends StObject
  inline def Numbersignff8f00: Numbersignff8f00 = "#ff8f00".asInstanceOf[Numbersignff8f00]
  
  @js.native
  sealed trait Numbersignff9100 extends StObject
  inline def Numbersignff9100: Numbersignff9100 = "#ff9100".asInstanceOf[Numbersignff9100]
  
  @js.native
  sealed trait Numbersignff9800 extends StObject
  inline def Numbersignff9800: Numbersignff9800 = "#ff9800".asInstanceOf[Numbersignff9800]
  
  @js.native
  sealed trait Numbersignff9e80 extends StObject
  inline def Numbersignff9e80: Numbersignff9e80 = "#ff9e80".asInstanceOf[Numbersignff9e80]
  
  @js.native
  sealed trait Numbersignffa000 extends StObject
  inline def Numbersignffa000: Numbersignffa000 = "#ffa000".asInstanceOf[Numbersignffa000]
  
  @js.native
  sealed trait Numbersignffa726 extends StObject
  inline def Numbersignffa726: Numbersignffa726 = "#ffa726".asInstanceOf[Numbersignffa726]
  
  @js.native
  sealed trait Numbersignffab00 extends StObject
  inline def Numbersignffab00: Numbersignffab00 = "#ffab00".asInstanceOf[Numbersignffab00]
  
  @js.native
  sealed trait Numbersignffab40 extends StObject
  inline def Numbersignffab40: Numbersignffab40 = "#ffab40".asInstanceOf[Numbersignffab40]
  
  @js.native
  sealed trait Numbersignffab91 extends StObject
  inline def Numbersignffab91: Numbersignffab91 = "#ffab91".asInstanceOf[Numbersignffab91]
  
  @js.native
  sealed trait Numbersignffb300 extends StObject
  inline def Numbersignffb300: Numbersignffb300 = "#ffb300".asInstanceOf[Numbersignffb300]
  
  @js.native
  sealed trait Numbersignffb74d extends StObject
  inline def Numbersignffb74d: Numbersignffb74d = "#ffb74d".asInstanceOf[Numbersignffb74d]
  
  @js.native
  sealed trait Numbersignffc107 extends StObject
  inline def Numbersignffc107: Numbersignffc107 = "#ffc107".asInstanceOf[Numbersignffc107]
  
  @js.native
  sealed trait Numbersignffc400 extends StObject
  inline def Numbersignffc400: Numbersignffc400 = "#ffc400".asInstanceOf[Numbersignffc400]
  
  @js.native
  sealed trait Numbersignffca28 extends StObject
  inline def Numbersignffca28: Numbersignffca28 = "#ffca28".asInstanceOf[Numbersignffca28]
  
  @js.native
  sealed trait Numbersignffcc80 extends StObject
  inline def Numbersignffcc80: Numbersignffcc80 = "#ffcc80".asInstanceOf[Numbersignffcc80]
  
  @js.native
  sealed trait Numbersignffccbc extends StObject
  inline def Numbersignffccbc: Numbersignffccbc = "#ffccbc".asInstanceOf[Numbersignffccbc]
  
  @js.native
  sealed trait Numbersignffcdd2 extends StObject
  inline def Numbersignffcdd2: Numbersignffcdd2 = "#ffcdd2".asInstanceOf[Numbersignffcdd2]
  
  @js.native
  sealed trait Numbersignffd180 extends StObject
  inline def Numbersignffd180: Numbersignffd180 = "#ffd180".asInstanceOf[Numbersignffd180]
  
  @js.native
  sealed trait Numbersignffd54f extends StObject
  inline def Numbersignffd54f: Numbersignffd54f = "#ffd54f".asInstanceOf[Numbersignffd54f]
  
  @js.native
  sealed trait Numbersignffd600 extends StObject
  inline def Numbersignffd600: Numbersignffd600 = "#ffd600".asInstanceOf[Numbersignffd600]
  
  @js.native
  sealed trait Numbersignffd740 extends StObject
  inline def Numbersignffd740: Numbersignffd740 = "#ffd740".asInstanceOf[Numbersignffd740]
  
  @js.native
  sealed trait Numbersignffe082 extends StObject
  inline def Numbersignffe082: Numbersignffe082 = "#ffe082".asInstanceOf[Numbersignffe082]
  
  @js.native
  sealed trait Numbersignffe0b2 extends StObject
  inline def Numbersignffe0b2: Numbersignffe0b2 = "#ffe0b2".asInstanceOf[Numbersignffe0b2]
  
  @js.native
  sealed trait Numbersignffe57f extends StObject
  inline def Numbersignffe57f: Numbersignffe57f = "#ffe57f".asInstanceOf[Numbersignffe57f]
  
  @js.native
  sealed trait Numbersignffea00 extends StObject
  inline def Numbersignffea00: Numbersignffea00 = "#ffea00".asInstanceOf[Numbersignffea00]
  
  @js.native
  sealed trait Numbersignffeb3b extends StObject
  inline def Numbersignffeb3b: Numbersignffeb3b = "#ffeb3b".asInstanceOf[Numbersignffeb3b]
  
  @js.native
  sealed trait Numbersignffebee extends StObject
  inline def Numbersignffebee: Numbersignffebee = "#ffebee".asInstanceOf[Numbersignffebee]
  
  @js.native
  sealed trait Numbersignffecb3 extends StObject
  inline def Numbersignffecb3: Numbersignffecb3 = "#ffecb3".asInstanceOf[Numbersignffecb3]
  
  @js.native
  sealed trait Numbersignffee58 extends StObject
  inline def Numbersignffee58: Numbersignffee58 = "#ffee58".asInstanceOf[Numbersignffee58]
  
  @js.native
  sealed trait Numbersignfff extends StObject
  inline def Numbersignfff: Numbersignfff = "#fff".asInstanceOf[Numbersignfff]
  
  @js.native
  sealed trait Numbersignfff176 extends StObject
  inline def Numbersignfff176: Numbersignfff176 = "#fff176".asInstanceOf[Numbersignfff176]
  
  @js.native
  sealed trait Numbersignfff3e0 extends StObject
  inline def Numbersignfff3e0: Numbersignfff3e0 = "#fff3e0".asInstanceOf[Numbersignfff3e0]
  
  @js.native
  sealed trait Numbersignfff59d extends StObject
  inline def Numbersignfff59d: Numbersignfff59d = "#fff59d".asInstanceOf[Numbersignfff59d]
  
  @js.native
  sealed trait Numbersignfff8e1 extends StObject
  inline def Numbersignfff8e1: Numbersignfff8e1 = "#fff8e1".asInstanceOf[Numbersignfff8e1]
  
  @js.native
  sealed trait Numbersignfff9c4 extends StObject
  inline def Numbersignfff9c4: Numbersignfff9c4 = "#fff9c4".asInstanceOf[Numbersignfff9c4]
  
  @js.native
  sealed trait Numbersignfffde7 extends StObject
  inline def Numbersignfffde7: Numbersignfffde7 = "#fffde7".asInstanceOf[Numbersignfffde7]
  
  @js.native
  sealed trait Numbersignffff00 extends StObject
  inline def Numbersignffff00: Numbersignffff00 = "#ffff00".asInstanceOf[Numbersignffff00]
  
  @js.native
  sealed trait Numbersignffff8d extends StObject
  inline def Numbersignffff8d: Numbersignffff8d = "#ffff8d".asInstanceOf[Numbersignffff8d]
  
  @js.native
  sealed trait _empty extends StObject
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait a extends StObject
  inline def a: a = "a".asInstanceOf[a]
  
  @js.native
  sealed trait absolute
    extends StObject
       with DividerClassKey
  inline def absolute: absolute = "absolute".asInstanceOf[absolute]
  
  @js.native
  sealed trait action
    extends StObject
       with AlertClassKey
       with CardHeaderClassKey
       with SnackbarContentClassKey
  inline def action: action = "action".asInstanceOf[action]
  
  @js.native
  sealed trait actionIcon
    extends StObject
       with ImageListItemBarClassKey
  inline def actionIcon: actionIcon = "actionIcon".asInstanceOf[actionIcon]
  
  @js.native
  sealed trait actionIconActionPosLeft
    extends StObject
       with ImageListItemBarClassKey
  inline def actionIconActionPosLeft: actionIconActionPosLeft = "actionIconActionPosLeft".asInstanceOf[actionIconActionPosLeft]
  
  @js.native
  sealed trait actions
    extends StObject
       with SpeedDialClassKey
       with TablePaginationClassKey
  inline def actions: actions = "actions".asInstanceOf[actions]
  
  @js.native
  sealed trait actionsClosed
    extends StObject
       with SpeedDialClassKey
  inline def actionsClosed: actionsClosed = "actionsClosed".asInstanceOf[actionsClosed]
  
  @js.native
  sealed trait active
    extends StObject
       with StepConnectorClassKey
       with StepIconClassKey
       with StepLabelClassKey
       with TableSortLabelClassKey
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait addEndListener
    extends StObject
       with TransitionKeys
  inline def addEndListener: addEndListener = "addEndListener".asInstanceOf[addEndListener]
  
  @js.native
  sealed trait additions extends StObject
  inline def additions: additions = "additions".asInstanceOf[additions]
  
  @js.native
  sealed trait `additions removals` extends StObject
  inline def `additions removals`: `additions removals` = ("additions removals").asInstanceOf[`additions removals`]
  
  @js.native
  sealed trait `additions text` extends StObject
  inline def `additions text`: `additions text` = ("additions text").asInstanceOf[`additions text`]
  
  @js.native
  sealed trait adornedEnd
    extends StObject
       with FilledInputClassKey
       with InputBaseClassKey
       with OutlinedInputClassKey
  inline def adornedEnd: adornedEnd = "adornedEnd".asInstanceOf[adornedEnd]
  
  @js.native
  sealed trait adornedStart
    extends StObject
       with FilledInputClassKey
       with InputBaseClassKey
       with OutlinedInputClassKey
  inline def adornedStart: adornedStart = "adornedStart".asInstanceOf[adornedStart]
  
  @js.native
  sealed trait `after-edge` extends StObject
  inline def `after-edge`: `after-edge` = "after-edge".asInstanceOf[`after-edge`]
  
  @js.native
  sealed trait alignCenter
    extends StObject
       with TableCellClassKey
       with TypographyClassKey
  inline def alignCenter: alignCenter = "alignCenter".asInstanceOf[alignCenter]
  
  @js.native
  sealed trait alignItemsFlexStart
    extends StObject
       with ListItemAvatarClassKey
       with ListItemButtonClassKey
       with ListItemClassKey
       with ListItemIconClassKey
  inline def alignItemsFlexStart: alignItemsFlexStart = "alignItemsFlexStart".asInstanceOf[alignItemsFlexStart]
  
  @js.native
  sealed trait alignJustify
    extends StObject
       with TableCellClassKey
       with TypographyClassKey
  inline def alignJustify: alignJustify = "alignJustify".asInstanceOf[alignJustify]
  
  @js.native
  sealed trait alignLeft
    extends StObject
       with TableCellClassKey
       with TypographyClassKey
  inline def alignLeft: alignLeft = "alignLeft".asInstanceOf[alignLeft]
  
  @js.native
  sealed trait alignRight
    extends StObject
       with TableCellClassKey
       with TypographyClassKey
  inline def alignRight: alignRight = "alignRight".asInstanceOf[alignRight]
  
  @js.native
  sealed trait all extends StObject
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait alphabetic extends StObject
  inline def alphabetic: alphabetic = "alphabetic".asInstanceOf[alphabetic]
  
  @js.native
  sealed trait alternativeLabel
    extends StObject
       with StepClassKey
       with StepConnectorClassKey
       with StepLabelClassKey
       with StepperClassKey
  inline def alternativeLabel: alternativeLabel = "alternativeLabel".asInstanceOf[alternativeLabel]
  
  @js.native
  sealed trait always extends StObject
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait anchorEl
    extends StObject
       with PopoverReference
  inline def anchorEl: anchorEl = "anchorEl".asInstanceOf[anchorEl]
  
  @js.native
  sealed trait anchorOriginBottomCenter
    extends StObject
       with SnackbarClassKey
  inline def anchorOriginBottomCenter: anchorOriginBottomCenter = "anchorOriginBottomCenter".asInstanceOf[anchorOriginBottomCenter]
  
  @js.native
  sealed trait anchorOriginBottomLeft
    extends StObject
       with SnackbarClassKey
  inline def anchorOriginBottomLeft: anchorOriginBottomLeft = "anchorOriginBottomLeft".asInstanceOf[anchorOriginBottomLeft]
  
  @js.native
  sealed trait anchorOriginBottomRight
    extends StObject
       with SnackbarClassKey
  inline def anchorOriginBottomRight: anchorOriginBottomRight = "anchorOriginBottomRight".asInstanceOf[anchorOriginBottomRight]
  
  @js.native
  sealed trait anchorOriginTopCenter
    extends StObject
       with SnackbarClassKey
  inline def anchorOriginTopCenter: anchorOriginTopCenter = "anchorOriginTopCenter".asInstanceOf[anchorOriginTopCenter]
  
  @js.native
  sealed trait anchorOriginTopLeft
    extends StObject
       with SnackbarClassKey
  inline def anchorOriginTopLeft: anchorOriginTopLeft = "anchorOriginTopLeft".asInstanceOf[anchorOriginTopLeft]
  
  @js.native
  sealed trait anchorOriginTopRight
    extends StObject
       with SnackbarClassKey
  inline def anchorOriginTopRight: anchorOriginTopRight = "anchorOriginTopRight".asInstanceOf[anchorOriginTopRight]
  
  @js.native
  sealed trait anchorPosition
    extends StObject
       with PopoverReference
  inline def anchorPosition: anchorPosition = "anchorPosition".asInstanceOf[anchorPosition]
  
  @js.native
  sealed trait animated
    extends StObject
       with InputLabelClassKey
  inline def animated: animated = "animated".asInstanceOf[animated]
  
  @js.native
  sealed trait anonymous extends StObject
  inline def anonymous: anonymous = "anonymous".asInstanceOf[anonymous]
  
  @js.native
  sealed trait arrow
    extends StObject
       with TooltipClassKey
  inline def arrow: arrow = "arrow".asInstanceOf[arrow]
  
  @js.native
  sealed trait asc
    extends StObject
       with SortDirection
  inline def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait ascending extends StObject
  inline def ascending: ascending = "ascending".asInstanceOf[ascending]
  
  @js.native
  sealed trait assertive extends StObject
  inline def assertive: assertive = "assertive".asInstanceOf[assertive]
  
  @js.native
  sealed trait asterisk
    extends StObject
       with FormLabelClassKey
       with InputLabelClassKey
  inline def asterisk: asterisk = "asterisk".asInstanceOf[asterisk]
  
  @js.native
  sealed trait auto extends StObject
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait avatar
    extends StObject
       with AvatarGroupClassKey
       with CardHeaderClassKey
       with ChipClassKey
  inline def avatar: avatar = "avatar".asInstanceOf[avatar]
  
  @js.native
  sealed trait avatarColorPrimary
    extends StObject
       with ChipClassKey
  inline def avatarColorPrimary: avatarColorPrimary = "avatarColorPrimary".asInstanceOf[avatarColorPrimary]
  
  @js.native
  sealed trait avatarColorSecondary
    extends StObject
       with ChipClassKey
  inline def avatarColorSecondary: avatarColorSecondary = "avatarColorSecondary".asInstanceOf[avatarColorSecondary]
  
  @js.native
  sealed trait avatarMedium
    extends StObject
       with ChipClassKey
  inline def avatarMedium: avatarMedium = "avatarMedium".asInstanceOf[avatarMedium]
  
  @js.native
  sealed trait avatarSmall
    extends StObject
       with ChipClassKey
  inline def avatarSmall: avatarSmall = "avatarSmall".asInstanceOf[avatarSmall]
  
  @js.native
  sealed trait backdropClick extends StObject
  inline def backdropClick: backdropClick = "backdropClick".asInstanceOf[backdropClick]
  
  @js.native
  sealed trait bar
    extends StObject
       with LinearProgressClassKey
  inline def bar: bar = "bar".asInstanceOf[bar]
  
  @js.native
  sealed trait bar1Buffer
    extends StObject
       with LinearProgressClassKey
  inline def bar1Buffer: bar1Buffer = "bar1Buffer".asInstanceOf[bar1Buffer]
  
  @js.native
  sealed trait bar1Determinate
    extends StObject
       with LinearProgressClassKey
  inline def bar1Determinate: bar1Determinate = "bar1Determinate".asInstanceOf[bar1Determinate]
  
  @js.native
  sealed trait bar1Indeterminate
    extends StObject
       with LinearProgressClassKey
  inline def bar1Indeterminate: bar1Indeterminate = "bar1Indeterminate".asInstanceOf[bar1Indeterminate]
  
  @js.native
  sealed trait bar2Buffer
    extends StObject
       with LinearProgressClassKey
  inline def bar2Buffer: bar2Buffer = "bar2Buffer".asInstanceOf[bar2Buffer]
  
  @js.native
  sealed trait bar2Indeterminate
    extends StObject
       with LinearProgressClassKey
  inline def bar2Indeterminate: bar2Indeterminate = "bar2Indeterminate".asInstanceOf[bar2Indeterminate]
  
  @js.native
  sealed trait barColorPrimary
    extends StObject
       with LinearProgressClassKey
  inline def barColorPrimary: barColorPrimary = "barColorPrimary".asInstanceOf[barColorPrimary]
  
  @js.native
  sealed trait barColorSecondary
    extends StObject
       with LinearProgressClassKey
  inline def barColorSecondary: barColorSecondary = "barColorSecondary".asInstanceOf[barColorSecondary]
  
  @js.native
  sealed trait baseline extends StObject
  inline def baseline: baseline = "baseline".asInstanceOf[baseline]
  
  @js.native
  sealed trait `before-edge` extends StObject
  inline def `before-edge`: `before-edge` = "before-edge".asInstanceOf[`before-edge`]
  
  @js.native
  sealed trait below extends StObject
  inline def below: below = "below".asInstanceOf[below]
  
  @js.native
  sealed trait bevel extends StObject
  inline def bevel: bevel = "bevel".asInstanceOf[bevel]
  
  @js.native
  sealed trait blur
    extends StObject
       with CloseReason
  inline def blur: blur = "blur".asInstanceOf[blur]
  
  @js.native
  sealed trait body
    extends StObject
       with TableCellClassKey
  inline def body: body = "body".asInstanceOf[body]
  
  @js.native
  sealed trait body1
    extends StObject
       with TypographyClassKey
       with Variant
  inline def body1: body1 = "body1".asInstanceOf[body1]
  
  @js.native
  sealed trait body2
    extends StObject
       with TypographyClassKey
       with Variant
  inline def body2: body2 = "body2".asInstanceOf[body2]
  
  @js.native
  sealed trait both extends StObject
  inline def both: both = "both".asInstanceOf[both]
  
  @js.native
  sealed trait bottom extends StObject
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait `bottom-end` extends StObject
  inline def `bottom-end`: `bottom-end` = "bottom-end".asInstanceOf[`bottom-end`]
  
  @js.native
  sealed trait `bottom-start` extends StObject
  inline def `bottom-start`: `bottom-start` = "bottom-start".asInstanceOf[`bottom-start`]
  
  @js.native
  sealed trait buffer
    extends StObject
       with LinearProgressClassKey
  inline def buffer: buffer = "buffer".asInstanceOf[buffer]
  
  @js.native
  sealed trait butt extends StObject
  inline def butt: butt = "butt".asInstanceOf[butt]
  
  @js.native
  sealed trait button
    extends StObject
       with LinkClassKey
       with ListItemClassKey
       with TypographyClassKey
       with Variant
  inline def button: button = "button".asInstanceOf[button]
  
  @js.native
  sealed trait caption
    extends StObject
       with TypographyClassKey
       with Variant
  inline def caption: caption = "caption".asInstanceOf[caption]
  
  @js.native
  sealed trait center extends StObject
  inline def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait centered
    extends StObject
       with TabsClassKey
  inline def centered: centered = "centered".asInstanceOf[centered]
  
  @js.native
  sealed trait central extends StObject
  inline def central: central = "central".asInstanceOf[central]
  
  @js.native
  sealed trait checkbox extends StObject
  inline def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  
  @js.native
  sealed trait checked
    extends StObject
       with CheckboxClassKey
       with RadioClassKey
       with SwitchBaseClassKey
       with SwitchClassKey
  inline def checked: checked = "checked".asInstanceOf[checked]
  
  @js.native
  sealed trait child
    extends StObject
       with TouchRippleClassKey
  inline def child: child = "child".asInstanceOf[child]
  
  @js.native
  sealed trait childLeaving
    extends StObject
       with TouchRippleClassKey
  inline def childLeaving: childLeaving = "childLeaving".asInstanceOf[childLeaving]
  
  @js.native
  sealed trait childPulsate
    extends StObject
       with TouchRippleClassKey
  inline def childPulsate: childPulsate = "childPulsate".asInstanceOf[childPulsate]
  
  @js.native
  sealed trait circle
    extends StObject
       with CircularProgressClassKey
  inline def circle: circle = "circle".asInstanceOf[circle]
  
  @js.native
  sealed trait circleDeterminate
    extends StObject
       with CircularProgressClassKey
  inline def circleDeterminate: circleDeterminate = "circleDeterminate".asInstanceOf[circleDeterminate]
  
  @js.native
  sealed trait circleDisableShrink
    extends StObject
       with CircularProgressClassKey
  inline def circleDisableShrink: circleDisableShrink = "circleDisableShrink".asInstanceOf[circleDisableShrink]
  
  @js.native
  sealed trait circleIndeterminate
    extends StObject
       with CircularProgressClassKey
  inline def circleIndeterminate: circleIndeterminate = "circleIndeterminate".asInstanceOf[circleIndeterminate]
  
  @js.native
  sealed trait circular
    extends StObject
       with AvatarClassKey
       with FabClassKey
       with SkeletonClassKey
  inline def circular: circular = "circular".asInstanceOf[circular]
  
  @js.native
  sealed trait className extends StObject
  inline def className: className = "className".asInstanceOf[className]
  
  @js.native
  sealed trait classes extends StObject
  inline def classes: classes = "classes".asInstanceOf[classes]
  
  @js.native
  sealed trait clearIndicator
    extends StObject
       with AutocompleteClassKey
  inline def clearIndicator: clearIndicator = "clearIndicator".asInstanceOf[clearIndicator]
  
  @js.native
  sealed trait clickable
    extends StObject
       with ChipClassKey
  inline def clickable: clickable = "clickable".asInstanceOf[clickable]
  
  @js.native
  sealed trait clickableColorPrimary
    extends StObject
       with ChipClassKey
  inline def clickableColorPrimary: clickableColorPrimary = "clickableColorPrimary".asInstanceOf[clickableColorPrimary]
  
  @js.native
  sealed trait clickableColorSecondary
    extends StObject
       with ChipClassKey
  inline def clickableColorSecondary: clickableColorSecondary = "clickableColorSecondary".asInstanceOf[clickableColorSecondary]
  
  @js.native
  sealed trait clickaway
    extends StObject
       with SnackbarCloseReason
  inline def clickaway: clickaway = "clickaway".asInstanceOf[clickaway]
  
  @js.native
  sealed trait colorAction
    extends StObject
       with IconClassKey
       with SvgIconClassKey
  inline def colorAction: colorAction = "colorAction".asInstanceOf[colorAction]
  
  @js.native
  sealed trait colorDefault
    extends StObject
       with AppBarClassKey
       with AvatarClassKey
  inline def colorDefault: colorDefault = "colorDefault".asInstanceOf[colorDefault]
  
  @js.native
  sealed trait colorDisabled
    extends StObject
       with IconClassKey
       with SvgIconClassKey
  inline def colorDisabled: colorDisabled = "colorDisabled".asInstanceOf[colorDisabled]
  
  @js.native
  sealed trait colorError
    extends StObject
       with IconClassKey
       with SvgIconClassKey
  inline def colorError: colorError = "colorError".asInstanceOf[colorError]
  
  @js.native
  sealed trait colorInherit
    extends StObject
       with AppBarClassKey
       with ButtonClassKey
       with FabClassKey
       with IconButtonClassKey
       with ListSubheaderClassKey
  inline def colorInherit: colorInherit = "colorInherit".asInstanceOf[colorInherit]
  
  @js.native
  sealed trait colorPrimary
    extends StObject
       with AppBarClassKey
       with CheckboxClassKey
       with ChipClassKey
       with CircularProgressClassKey
       with IconButtonClassKey
       with IconClassKey
       with LinearProgressClassKey
       with ListSubheaderClassKey
       with RadioClassKey
       with SvgIconClassKey
       with SwitchClassKey
  inline def colorPrimary: colorPrimary = "colorPrimary".asInstanceOf[colorPrimary]
  
  @js.native
  sealed trait colorSecondary
    extends StObject
       with AppBarClassKey
       with CheckboxClassKey
       with ChipClassKey
       with CircularProgressClassKey
       with FilledInputClassKey
       with FormLabelClassKey
       with IconButtonClassKey
       with IconClassKey
       with InputBaseClassKey
       with InputClassKey
       with LinearProgressClassKey
       with OutlinedInputClassKey
       with RadioClassKey
       with SvgIconClassKey
       with SwitchClassKey
  inline def colorSecondary: colorSecondary = "colorSecondary".asInstanceOf[colorSecondary]
  
  @js.native
  sealed trait colorTransparent
    extends StObject
       with AppBarClassKey
  inline def colorTransparent: colorTransparent = "colorTransparent".asInstanceOf[colorTransparent]
  
  @js.native
  sealed trait column
    extends StObject
       with GridDirection
  inline def column: column = "column".asInstanceOf[column]
  
  @js.native
  sealed trait `column-reverse`
    extends StObject
       with GridDirection
  inline def `column-reverse`: `column-reverse` = "column-reverse".asInstanceOf[`column-reverse`]
  
  @js.native
  sealed trait completed
    extends StObject
       with StepClassKey
       with StepConnectorClassKey
       with StepIconClassKey
       with StepLabelClassKey
  inline def completed: completed = "completed".asInstanceOf[completed]
  
  @js.native
  sealed trait contained
    extends StObject
       with ButtonClassKey
       with ButtonGroupClassKey
       with FormHelperTextClassKey
  inline def contained: contained = "contained".asInstanceOf[contained]
  
  @js.native
  sealed trait containedInherit
    extends StObject
       with ButtonClassKey
  inline def containedInherit: containedInherit = "containedInherit".asInstanceOf[containedInherit]
  
  @js.native
  sealed trait containedPrimary
    extends StObject
       with ButtonClassKey
  inline def containedPrimary: containedPrimary = "containedPrimary".asInstanceOf[containedPrimary]
  
  @js.native
  sealed trait containedSecondary
    extends StObject
       with ButtonClassKey
  inline def containedSecondary: containedSecondary = "containedSecondary".asInstanceOf[containedSecondary]
  
  @js.native
  sealed trait containedSizeLarge
    extends StObject
       with ButtonClassKey
  inline def containedSizeLarge: containedSizeLarge = "containedSizeLarge".asInstanceOf[containedSizeLarge]
  
  @js.native
  sealed trait containedSizeMedium
    extends StObject
       with ButtonClassKey
  inline def containedSizeMedium: containedSizeMedium = "containedSizeMedium".asInstanceOf[containedSizeMedium]
  
  @js.native
  sealed trait containedSizeSmall
    extends StObject
       with ButtonClassKey
  inline def containedSizeSmall: containedSizeSmall = "containedSizeSmall".asInstanceOf[containedSizeSmall]
  
  @js.native
  sealed trait container
    extends StObject
       with DialogClassKey
       with GridClassKey
       with ListItemClassKey
  inline def container: container = "container".asInstanceOf[container]
  
  @js.native
  sealed trait content
    extends StObject
       with AccordionSummaryClassKey
       with CardHeaderClassKey
  inline def content: content = "content".asInstanceOf[content]
  
  @js.native
  sealed trait contentGutters
    extends StObject
       with AccordionSummaryClassKey
  inline def contentGutters: contentGutters = "contentGutters".asInstanceOf[contentGutters]
  
  @js.native
  sealed trait copy extends StObject
  inline def copy: copy = "copy".asInstanceOf[copy]
  
  @js.native
  sealed trait css extends StObject
  inline def css: css = "css".asInstanceOf[css]
  
  @js.native
  sealed trait dark
    extends StObject
       with PaletteMode
  inline def dark: dark = "dark".asInstanceOf[dark]
  
  @js.native
  sealed trait dashed
    extends StObject
       with LinearProgressClassKey
  inline def dashed: dashed = "dashed".asInstanceOf[dashed]
  
  @js.native
  sealed trait dashedColorPrimary
    extends StObject
       with LinearProgressClassKey
  inline def dashedColorPrimary: dashedColorPrimary = "dashedColorPrimary".asInstanceOf[dashedColorPrimary]
  
  @js.native
  sealed trait dashedColorSecondary
    extends StObject
       with LinearProgressClassKey
  inline def dashedColorSecondary: dashedColorSecondary = "dashedColorSecondary".asInstanceOf[dashedColorSecondary]
  
  @js.native
  sealed trait date extends StObject
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait decimal
    extends StObject
       with RatingClassKey
  inline def decimal: decimal = "decimal".asInstanceOf[decimal]
  
  @js.native
  sealed trait deletable
    extends StObject
       with ChipClassKey
  inline def deletable: deletable = "deletable".asInstanceOf[deletable]
  
  @js.native
  sealed trait deletableColorPrimary
    extends StObject
       with ChipClassKey
  inline def deletableColorPrimary: deletableColorPrimary = "deletableColorPrimary".asInstanceOf[deletableColorPrimary]
  
  @js.native
  sealed trait deletableColorSecondary
    extends StObject
       with ChipClassKey
  inline def deletableColorSecondary: deletableColorSecondary = "deletableColorSecondary".asInstanceOf[deletableColorSecondary]
  
  @js.native
  sealed trait deleteIcon
    extends StObject
       with ChipClassKey
  inline def deleteIcon: deleteIcon = "deleteIcon".asInstanceOf[deleteIcon]
  
  @js.native
  sealed trait deleteIconColorPrimary
    extends StObject
       with ChipClassKey
  inline def deleteIconColorPrimary: deleteIconColorPrimary = "deleteIconColorPrimary".asInstanceOf[deleteIconColorPrimary]
  
  @js.native
  sealed trait deleteIconColorSecondary
    extends StObject
       with ChipClassKey
  inline def deleteIconColorSecondary: deleteIconColorSecondary = "deleteIconColorSecondary".asInstanceOf[deleteIconColorSecondary]
  
  @js.native
  sealed trait deleteIconMedium
    extends StObject
       with ChipClassKey
  inline def deleteIconMedium: deleteIconMedium = "deleteIconMedium".asInstanceOf[deleteIconMedium]
  
  @js.native
  sealed trait deleteIconOutlinedColorPrimary
    extends StObject
       with ChipClassKey
  inline def deleteIconOutlinedColorPrimary: deleteIconOutlinedColorPrimary = "deleteIconOutlinedColorPrimary".asInstanceOf[deleteIconOutlinedColorPrimary]
  
  @js.native
  sealed trait deleteIconOutlinedColorSecondary
    extends StObject
       with ChipClassKey
  inline def deleteIconOutlinedColorSecondary: deleteIconOutlinedColorSecondary = "deleteIconOutlinedColorSecondary".asInstanceOf[deleteIconOutlinedColorSecondary]
  
  @js.native
  sealed trait deleteIconSmall
    extends StObject
       with ChipClassKey
  inline def deleteIconSmall: deleteIconSmall = "deleteIconSmall".asInstanceOf[deleteIconSmall]
  
  @js.native
  sealed trait dense
    extends StObject
       with ListClassKey
       with ListItemButtonClassKey
       with ListItemClassKey
       with ListItemTextClassKey
       with MenuItemClassKey
       with ToolbarClassKey
  inline def dense: dense = "dense".asInstanceOf[dense]
  
  @js.native
  sealed trait desc
    extends StObject
       with SortDirection
  inline def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait descending extends StObject
  inline def descending: descending = "descending".asInstanceOf[descending]
  
  @js.native
  sealed trait determinate
    extends StObject
       with CircularProgressClassKey
       with LinearProgressClassKey
  inline def determinate: determinate = "determinate".asInstanceOf[determinate]
  
  @js.native
  sealed trait dialog extends StObject
  inline def dialog: dialog = "dialog".asInstanceOf[dialog]
  
  @js.native
  sealed trait `direction-xs-column`
    extends StObject
       with GridClassKey
  inline def `direction-xs-column`: `direction-xs-column` = "direction-xs-column".asInstanceOf[`direction-xs-column`]
  
  @js.native
  sealed trait `direction-xs-column-reverse`
    extends StObject
       with GridClassKey
  inline def `direction-xs-column-reverse`: `direction-xs-column-reverse` = "direction-xs-column-reverse".asInstanceOf[`direction-xs-column-reverse`]
  
  @js.native
  sealed trait `direction-xs-row-reverse`
    extends StObject
       with GridClassKey
  inline def `direction-xs-row-reverse`: `direction-xs-row-reverse` = "direction-xs-row-reverse".asInstanceOf[`direction-xs-row-reverse`]
  
  @js.native
  sealed trait directionDown
    extends StObject
       with SpeedDialClassKey
  inline def directionDown: directionDown = "directionDown".asInstanceOf[directionDown]
  
  @js.native
  sealed trait directionLeft
    extends StObject
       with SpeedDialClassKey
  inline def directionLeft: directionLeft = "directionLeft".asInstanceOf[directionLeft]
  
  @js.native
  sealed trait directionRight
    extends StObject
       with SpeedDialClassKey
  inline def directionRight: directionRight = "directionRight".asInstanceOf[directionRight]
  
  @js.native
  sealed trait directionUp
    extends StObject
       with SpeedDialClassKey
  inline def directionUp: directionUp = "directionUp".asInstanceOf[directionUp]
  
  @js.native
  sealed trait disableElevation
    extends StObject
       with ButtonClassKey
       with ButtonGroupClassKey
  inline def disableElevation: disableElevation = "disableElevation".asInstanceOf[disableElevation]
  
  @js.native
  sealed trait disableGutters
    extends StObject
       with ContainerClassKey
       with ListItemSecondaryActionClassKey
  inline def disableGutters: disableGutters = "disableGutters".asInstanceOf[disableGutters]
  
  @js.native
  sealed trait disablePointerEvents
    extends StObject
       with InputAdornmentClassKey
  inline def disablePointerEvents: disablePointerEvents = "disablePointerEvents".asInstanceOf[disablePointerEvents]
  
  @js.native
  sealed trait disabled
    extends StObject
       with AccordionClassKey
       with AccordionSummaryClassKey
       with ButtonBaseClassKey
       with ButtonClassKey
       with ButtonGroupClassKey
       with CheckboxClassKey
       with ChipClassKey
       with ContextFromPropsKey
       with FabClassKey
       with FilledInputClassKey
       with FormControlLabelClassKey
       with FormHelperTextClassKey
       with FormLabelClassKey
       with IconButtonClassKey
       with InputBaseClassKey
       with InputClassKey
       with InputLabelClassKey
       with ListItemButtonClassKey
       with ListItemClassKey
       with MenuItemClassKey
       with NativeSelectClassKey
       with OutlinedInputClassKey
       with PaginationItemClassKey
       with RadioClassKey
       with RatingClassKey
       with SelectClassKey
       with StepConnectorClassKey
       with StepLabelClassKey
       with SwitchBaseClassKey
       with SwitchClassKey
       with TabClassKey
       with TabScrollButtonClassKey
       with ToggleButtonClassKey
       with ToggleButtonGroupClassKey
  inline def disabled: disabled = "disabled".asInstanceOf[disabled]
  
  @js.native
  sealed trait displayedRows
    extends StObject
       with TablePaginationClassKey
  inline def displayedRows: displayedRows = "displayedRows".asInstanceOf[displayedRows]
  
  @js.native
  sealed trait div extends StObject
  inline def div: div = "div".asInstanceOf[div]
  
  @js.native
  sealed trait divider
    extends StObject
       with ListItemButtonClassKey
       with ListItemClassKey
       with MenuItemClassKey
  inline def divider: divider = "divider".asInstanceOf[divider]
  
  @js.native
  sealed trait dividers
    extends StObject
       with DialogContentClassKey
  inline def dividers: dividers = "dividers".asInstanceOf[dividers]
  
  @js.native
  sealed trait docked
    extends StObject
       with DrawerClassKey
  inline def docked: docked = "docked".asInstanceOf[docked]
  
  @js.native
  sealed trait dot
    extends StObject
       with MobileStepperClassKey
  inline def dot: dot = "dot".asInstanceOf[dot]
  
  @js.native
  sealed trait dotActive
    extends StObject
       with MobileStepperClassKey
  inline def dotActive: dotActive = "dotActive".asInstanceOf[dotActive]
  
  @js.native
  sealed trait dots
    extends StObject
       with MobileStepperClassKey
  inline def dots: dots = "dots".asInstanceOf[dots]
  
  @js.native
  sealed trait down extends StObject
  inline def down: down = "down".asInstanceOf[down]
  
  @js.native
  sealed trait easing
    extends StObject
       with TransitionKeys
  inline def easing: easing = "easing".asInstanceOf[easing]
  
  @js.native
  sealed trait edgeEnd
    extends StObject
       with IconButtonClassKey
       with SwitchBaseClassKey
       with SwitchClassKey
  inline def edgeEnd: edgeEnd = "edgeEnd".asInstanceOf[edgeEnd]
  
  @js.native
  sealed trait edgeStart
    extends StObject
       with IconButtonClassKey
       with SwitchBaseClassKey
       with SwitchClassKey
  inline def edgeStart: edgeStart = "edgeStart".asInstanceOf[edgeStart]
  
  @js.native
  sealed trait elevation
    extends StObject
       with PaperClassKey
  inline def elevation: elevation = "elevation".asInstanceOf[elevation]
  
  @js.native
  sealed trait elevation0
    extends StObject
       with PaperClassKey
  inline def elevation0: elevation0 = "elevation0".asInstanceOf[elevation0]
  
  @js.native
  sealed trait elevation1
    extends StObject
       with PaperClassKey
  inline def elevation1: elevation1 = "elevation1".asInstanceOf[elevation1]
  
  @js.native
  sealed trait elevation10
    extends StObject
       with PaperClassKey
  inline def elevation10: elevation10 = "elevation10".asInstanceOf[elevation10]
  
  @js.native
  sealed trait elevation11
    extends StObject
       with PaperClassKey
  inline def elevation11: elevation11 = "elevation11".asInstanceOf[elevation11]
  
  @js.native
  sealed trait elevation12
    extends StObject
       with PaperClassKey
  inline def elevation12: elevation12 = "elevation12".asInstanceOf[elevation12]
  
  @js.native
  sealed trait elevation13
    extends StObject
       with PaperClassKey
  inline def elevation13: elevation13 = "elevation13".asInstanceOf[elevation13]
  
  @js.native
  sealed trait elevation14
    extends StObject
       with PaperClassKey
  inline def elevation14: elevation14 = "elevation14".asInstanceOf[elevation14]
  
  @js.native
  sealed trait elevation15
    extends StObject
       with PaperClassKey
  inline def elevation15: elevation15 = "elevation15".asInstanceOf[elevation15]
  
  @js.native
  sealed trait elevation16
    extends StObject
       with PaperClassKey
  inline def elevation16: elevation16 = "elevation16".asInstanceOf[elevation16]
  
  @js.native
  sealed trait elevation17
    extends StObject
       with PaperClassKey
  inline def elevation17: elevation17 = "elevation17".asInstanceOf[elevation17]
  
  @js.native
  sealed trait elevation18
    extends StObject
       with PaperClassKey
  inline def elevation18: elevation18 = "elevation18".asInstanceOf[elevation18]
  
  @js.native
  sealed trait elevation19
    extends StObject
       with PaperClassKey
  inline def elevation19: elevation19 = "elevation19".asInstanceOf[elevation19]
  
  @js.native
  sealed trait elevation2
    extends StObject
       with PaperClassKey
  inline def elevation2: elevation2 = "elevation2".asInstanceOf[elevation2]
  
  @js.native
  sealed trait elevation20
    extends StObject
       with PaperClassKey
  inline def elevation20: elevation20 = "elevation20".asInstanceOf[elevation20]
  
  @js.native
  sealed trait elevation21
    extends StObject
       with PaperClassKey
  inline def elevation21: elevation21 = "elevation21".asInstanceOf[elevation21]
  
  @js.native
  sealed trait elevation22
    extends StObject
       with PaperClassKey
  inline def elevation22: elevation22 = "elevation22".asInstanceOf[elevation22]
  
  @js.native
  sealed trait elevation23
    extends StObject
       with PaperClassKey
  inline def elevation23: elevation23 = "elevation23".asInstanceOf[elevation23]
  
  @js.native
  sealed trait elevation24
    extends StObject
       with PaperClassKey
  inline def elevation24: elevation24 = "elevation24".asInstanceOf[elevation24]
  
  @js.native
  sealed trait elevation3
    extends StObject
       with PaperClassKey
  inline def elevation3: elevation3 = "elevation3".asInstanceOf[elevation3]
  
  @js.native
  sealed trait elevation4
    extends StObject
       with PaperClassKey
  inline def elevation4: elevation4 = "elevation4".asInstanceOf[elevation4]
  
  @js.native
  sealed trait elevation5
    extends StObject
       with PaperClassKey
  inline def elevation5: elevation5 = "elevation5".asInstanceOf[elevation5]
  
  @js.native
  sealed trait elevation6
    extends StObject
       with PaperClassKey
  inline def elevation6: elevation6 = "elevation6".asInstanceOf[elevation6]
  
  @js.native
  sealed trait elevation7
    extends StObject
       with PaperClassKey
  inline def elevation7: elevation7 = "elevation7".asInstanceOf[elevation7]
  
  @js.native
  sealed trait elevation8
    extends StObject
       with PaperClassKey
  inline def elevation8: elevation8 = "elevation8".asInstanceOf[elevation8]
  
  @js.native
  sealed trait elevation9
    extends StObject
       with PaperClassKey
  inline def elevation9: elevation9 = "elevation9".asInstanceOf[elevation9]
  
  @js.native
  sealed trait ellipsis
    extends StObject
       with PaginationItemClassKey
  inline def ellipsis: ellipsis = "ellipsis".asInstanceOf[ellipsis]
  
  @js.native
  sealed trait email extends StObject
  inline def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait end extends StObject
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait `end-ellipsis` extends StObject
  inline def `end-ellipsis`: `end-ellipsis` = "end-ellipsis".asInstanceOf[`end-ellipsis`]
  
  @js.native
  sealed trait endAdornment
    extends StObject
       with AutocompleteClassKey
  inline def endAdornment: endAdornment = "endAdornment".asInstanceOf[endAdornment]
  
  @js.native
  sealed trait endIcon
    extends StObject
       with ButtonClassKey
  inline def endIcon: endIcon = "endIcon".asInstanceOf[endIcon]
  
  @js.native
  sealed trait enter extends StObject
  inline def enter: enter = "enter".asInstanceOf[enter]
  
  @js.native
  sealed trait entered
    extends StObject
       with CollapseClassKey
  inline def entered: entered = "entered".asInstanceOf[entered]
  
  @js.native
  sealed trait error
    extends StObject
       with AlertColor
       with ContextFromPropsKey
       with FilledInputClassKey
       with FormHelperTextClassKey
       with FormLabelClassKey
       with InputBaseClassKey
       with InputClassKey
       with InputLabelClassKey
       with OutlinedInputClassKey
       with StepIconClassKey
       with StepLabelClassKey
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait escapeKeyDown
    extends StObject
       with CloseReason
       with SnackbarCloseReason
  inline def escapeKeyDown: escapeKeyDown = "escapeKeyDown".asInstanceOf[escapeKeyDown]
  
  @js.native
  sealed trait evenodd extends StObject
  inline def evenodd: evenodd = "evenodd".asInstanceOf[evenodd]
  
  @js.native
  sealed trait execute extends StObject
  inline def execute: execute = "execute".asInstanceOf[execute]
  
  @js.native
  sealed trait exit extends StObject
  inline def exit: exit = "exit".asInstanceOf[exit]
  
  @js.native
  sealed trait expandIconWrapper
    extends StObject
       with AccordionSummaryClassKey
  inline def expandIconWrapper: expandIconWrapper = "expandIconWrapper".asInstanceOf[expandIconWrapper]
  
  @js.native
  sealed trait expanded
    extends StObject
       with AccordionClassKey
       with AccordionSummaryClassKey
  inline def expanded: expanded = "expanded".asInstanceOf[expanded]
  
  @js.native
  sealed trait extended
    extends StObject
       with FabClassKey
  inline def extended: extended = "extended".asInstanceOf[extended]
  
  @js.native
  sealed trait fab
    extends StObject
       with SpeedDialActionClassKey
       with SpeedDialClassKey
  inline def fab: fab = "fab".asInstanceOf[fab]
  
  @js.native
  sealed trait fabClosed
    extends StObject
       with SpeedDialActionClassKey
  inline def fabClosed: fabClosed = "fabClosed".asInstanceOf[fabClosed]
  
  @js.native
  sealed trait fallback
    extends StObject
       with AvatarClassKey
  inline def fallback: fallback = "fallback".asInstanceOf[fallback]
  
  @js.native
  sealed trait filled
    extends StObject
       with AlertClassKey
       with ChipClassKey
       with FormHelperTextClassKey
       with FormLabelClassKey
       with InputAdornmentClassKey
       with InputLabelClassKey
       with NativeSelectClassKey
       with SelectClassKey
  inline def filled: filled = "filled".asInstanceOf[filled]
  
  @js.native
  sealed trait filledError
    extends StObject
       with AlertClassKey
  inline def filledError: filledError = "filledError".asInstanceOf[filledError]
  
  @js.native
  sealed trait filledInfo
    extends StObject
       with AlertClassKey
  inline def filledInfo: filledInfo = "filledInfo".asInstanceOf[filledInfo]
  
  @js.native
  sealed trait filledSuccess
    extends StObject
       with AlertClassKey
  inline def filledSuccess: filledSuccess = "filledSuccess".asInstanceOf[filledSuccess]
  
  @js.native
  sealed trait filledWarning
    extends StObject
       with AlertClassKey
  inline def filledWarning: filledWarning = "filledWarning".asInstanceOf[filledWarning]
  
  @js.native
  sealed trait first extends StObject
  inline def first: first = "first".asInstanceOf[first]
  
  @js.native
  sealed trait firstLast
    extends StObject
       with PaginationItemClassKey
  inline def firstLast: firstLast = "firstLast".asInstanceOf[firstLast]
  
  @js.native
  sealed trait fitContent
    extends StObject
       with SkeletonClassKey
  inline def fitContent: fitContent = "fitContent".asInstanceOf[fitContent]
  
  @js.native
  sealed trait fixed
    extends StObject
       with ContainerClassKey
       with TabsClassKey
  inline def fixed: fixed = "fixed".asInstanceOf[fixed]
  
  @js.native
  sealed trait `flex-start` extends StObject
  inline def `flex-start`: `flex-start` = "flex-start".asInstanceOf[`flex-start`]
  
  @js.native
  sealed trait flexContainer
    extends StObject
       with TabsClassKey
  inline def flexContainer: flexContainer = "flexContainer".asInstanceOf[flexContainer]
  
  @js.native
  sealed trait flexContainerVertical
    extends StObject
       with TabsClassKey
  inline def flexContainerVertical: flexContainerVertical = "flexContainerVertical".asInstanceOf[flexContainerVertical]
  
  @js.native
  sealed trait flexItem
    extends StObject
       with DividerClassKey
  inline def flexItem: flexItem = "flexItem".asInstanceOf[flexItem]
  
  @js.native
  sealed trait focus
    extends StObject
       with OpenReason
  inline def focus: focus = "focus".asInstanceOf[focus]
  
  @js.native
  sealed trait focusHighlight
    extends StObject
       with CardActionAreaClassKey
  inline def focusHighlight: focusHighlight = "focusHighlight".asInstanceOf[focusHighlight]
  
  @js.native
  sealed trait focusVisible
    extends StObject
       with AccordionSummaryClassKey
       with ButtonBaseClassKey
       with ButtonClassKey
       with CardActionAreaClassKey
       with ChipClassKey
       with FabClassKey
       with LinkClassKey
       with ListItemButtonClassKey
       with ListItemClassKey
       with MenuItemClassKey
       with PaginationItemClassKey
       with RatingClassKey
  inline def focusVisible: focusVisible = "focusVisible".asInstanceOf[focusVisible]
  
  @js.native
  sealed trait focused
    extends StObject
       with AutocompleteClassKey
       with FilledInputClassKey
       with FormHelperTextClassKey
       with FormLabelClassKey
       with InputBaseClassKey
       with InputClassKey
       with InputLabelClassKey
       with OutlinedInputClassKey
  inline def focused: focused = "focused".asInstanceOf[focused]
  
  @js.native
  sealed trait fontSizeInherit
    extends StObject
       with IconClassKey
       with SvgIconClassKey
  inline def fontSizeInherit: fontSizeInherit = "fontSizeInherit".asInstanceOf[fontSizeInherit]
  
  @js.native
  sealed trait fontSizeLarge
    extends StObject
       with IconClassKey
       with SvgIconClassKey
  inline def fontSizeLarge: fontSizeLarge = "fontSizeLarge".asInstanceOf[fontSizeLarge]
  
  @js.native
  sealed trait fontSizeSmall
    extends StObject
       with IconClassKey
       with SvgIconClassKey
  inline def fontSizeSmall: fontSizeSmall = "fontSizeSmall".asInstanceOf[fontSizeSmall]
  
  @js.native
  sealed trait footer
    extends StObject
       with TableCellClassKey
       with TableRowClassKey
  inline def footer: footer = "footer".asInstanceOf[footer]
  
  @js.native
  sealed trait formControl
    extends StObject
       with InputBaseClassKey
       with InputClassKey
       with InputLabelClassKey
  inline def formControl: formControl = "formControl".asInstanceOf[formControl]
  
  @js.native
  sealed trait fullWidth
    extends StObject
       with AutocompleteClassKey
       with ButtonClassKey
       with ButtonGroupClassKey
       with ContextFromPropsKey
       with DividerClassKey
       with FormControlClassKey
       with InputBaseClassKey
       with InputClassKey
       with TabClassKey
  inline def fullWidth: fullWidth = "fullWidth".asInstanceOf[fullWidth]
  
  @js.native
  sealed trait grammar extends StObject
  inline def grammar: grammar = "grammar".asInstanceOf[grammar]
  
  @js.native
  sealed trait grid extends StObject
  inline def grid: grid = "grid".asInstanceOf[grid]
  
  @js.native
  sealed trait `grid-xs-1`
    extends StObject
       with GridClassKey
  inline def `grid-xs-1`: `grid-xs-1` = "grid-xs-1".asInstanceOf[`grid-xs-1`]
  
  @js.native
  sealed trait `grid-xs-10`
    extends StObject
       with GridClassKey
  inline def `grid-xs-10`: `grid-xs-10` = "grid-xs-10".asInstanceOf[`grid-xs-10`]
  
  @js.native
  sealed trait `grid-xs-11`
    extends StObject
       with GridClassKey
  inline def `grid-xs-11`: `grid-xs-11` = "grid-xs-11".asInstanceOf[`grid-xs-11`]
  
  @js.native
  sealed trait `grid-xs-12`
    extends StObject
       with GridClassKey
  inline def `grid-xs-12`: `grid-xs-12` = "grid-xs-12".asInstanceOf[`grid-xs-12`]
  
  @js.native
  sealed trait `grid-xs-2`
    extends StObject
       with GridClassKey
  inline def `grid-xs-2`: `grid-xs-2` = "grid-xs-2".asInstanceOf[`grid-xs-2`]
  
  @js.native
  sealed trait `grid-xs-3`
    extends StObject
       with GridClassKey
  inline def `grid-xs-3`: `grid-xs-3` = "grid-xs-3".asInstanceOf[`grid-xs-3`]
  
  @js.native
  sealed trait `grid-xs-4`
    extends StObject
       with GridClassKey
  inline def `grid-xs-4`: `grid-xs-4` = "grid-xs-4".asInstanceOf[`grid-xs-4`]
  
  @js.native
  sealed trait `grid-xs-5`
    extends StObject
       with GridClassKey
  inline def `grid-xs-5`: `grid-xs-5` = "grid-xs-5".asInstanceOf[`grid-xs-5`]
  
  @js.native
  sealed trait `grid-xs-6`
    extends StObject
       with GridClassKey
  inline def `grid-xs-6`: `grid-xs-6` = "grid-xs-6".asInstanceOf[`grid-xs-6`]
  
  @js.native
  sealed trait `grid-xs-7`
    extends StObject
       with GridClassKey
  inline def `grid-xs-7`: `grid-xs-7` = "grid-xs-7".asInstanceOf[`grid-xs-7`]
  
  @js.native
  sealed trait `grid-xs-8`
    extends StObject
       with GridClassKey
  inline def `grid-xs-8`: `grid-xs-8` = "grid-xs-8".asInstanceOf[`grid-xs-8`]
  
  @js.native
  sealed trait `grid-xs-9`
    extends StObject
       with GridClassKey
  inline def `grid-xs-9`: `grid-xs-9` = "grid-xs-9".asInstanceOf[`grid-xs-9`]
  
  @js.native
  sealed trait `grid-xs-auto`
    extends StObject
       with GridClassKey
  inline def `grid-xs-auto`: `grid-xs-auto` = "grid-xs-auto".asInstanceOf[`grid-xs-auto`]
  
  @js.native
  sealed trait `grid-xs-true`
    extends StObject
       with GridClassKey
  inline def `grid-xs-true`: `grid-xs-true` = "grid-xs-true".asInstanceOf[`grid-xs-true`]
  
  @js.native
  sealed trait groupLabel
    extends StObject
       with AutocompleteClassKey
  inline def groupLabel: groupLabel = "groupLabel".asInstanceOf[groupLabel]
  
  @js.native
  sealed trait groupUl
    extends StObject
       with AutocompleteClassKey
  inline def groupUl: groupUl = "groupUl".asInstanceOf[groupUl]
  
  @js.native
  sealed trait grouped
    extends StObject
       with ButtonGroupClassKey
       with ToggleButtonGroupClassKey
  inline def grouped: grouped = "grouped".asInstanceOf[grouped]
  
  @js.native
  sealed trait groupedContained
    extends StObject
       with ButtonGroupClassKey
  inline def groupedContained: groupedContained = "groupedContained".asInstanceOf[groupedContained]
  
  @js.native
  sealed trait groupedContainedHorizontal
    extends StObject
       with ButtonGroupClassKey
  inline def groupedContainedHorizontal: groupedContainedHorizontal = "groupedContainedHorizontal".asInstanceOf[groupedContainedHorizontal]
  
  @js.native
  sealed trait groupedContainedPrimary
    extends StObject
       with ButtonGroupClassKey
  inline def groupedContainedPrimary: groupedContainedPrimary = "groupedContainedPrimary".asInstanceOf[groupedContainedPrimary]
  
  @js.native
  sealed trait groupedContainedSecondary
    extends StObject
       with ButtonGroupClassKey
  inline def groupedContainedSecondary: groupedContainedSecondary = "groupedContainedSecondary".asInstanceOf[groupedContainedSecondary]
  
  @js.native
  sealed trait groupedContainedVertical
    extends StObject
       with ButtonGroupClassKey
  inline def groupedContainedVertical: groupedContainedVertical = "groupedContainedVertical".asInstanceOf[groupedContainedVertical]
  
  @js.native
  sealed trait groupedHorizontal
    extends StObject
       with ButtonGroupClassKey
       with ToggleButtonGroupClassKey
  inline def groupedHorizontal: groupedHorizontal = "groupedHorizontal".asInstanceOf[groupedHorizontal]
  
  @js.native
  sealed trait groupedOutlined
    extends StObject
       with ButtonGroupClassKey
  inline def groupedOutlined: groupedOutlined = "groupedOutlined".asInstanceOf[groupedOutlined]
  
  @js.native
  sealed trait groupedOutlinedHorizontal
    extends StObject
       with ButtonGroupClassKey
  inline def groupedOutlinedHorizontal: groupedOutlinedHorizontal = "groupedOutlinedHorizontal".asInstanceOf[groupedOutlinedHorizontal]
  
  @js.native
  sealed trait groupedOutlinedPrimary
    extends StObject
       with ButtonGroupClassKey
  inline def groupedOutlinedPrimary: groupedOutlinedPrimary = "groupedOutlinedPrimary".asInstanceOf[groupedOutlinedPrimary]
  
  @js.native
  sealed trait groupedOutlinedSecondary
    extends StObject
       with ButtonGroupClassKey
  inline def groupedOutlinedSecondary: groupedOutlinedSecondary = "groupedOutlinedSecondary".asInstanceOf[groupedOutlinedSecondary]
  
  @js.native
  sealed trait groupedOutlinedVertical
    extends StObject
       with ButtonGroupClassKey
  inline def groupedOutlinedVertical: groupedOutlinedVertical = "groupedOutlinedVertical".asInstanceOf[groupedOutlinedVertical]
  
  @js.native
  sealed trait groupedText
    extends StObject
       with ButtonGroupClassKey
  inline def groupedText: groupedText = "groupedText".asInstanceOf[groupedText]
  
  @js.native
  sealed trait groupedTextHorizontal
    extends StObject
       with ButtonGroupClassKey
  inline def groupedTextHorizontal: groupedTextHorizontal = "groupedTextHorizontal".asInstanceOf[groupedTextHorizontal]
  
  @js.native
  sealed trait groupedTextPrimary
    extends StObject
       with ButtonGroupClassKey
  inline def groupedTextPrimary: groupedTextPrimary = "groupedTextPrimary".asInstanceOf[groupedTextPrimary]
  
  @js.native
  sealed trait groupedTextSecondary
    extends StObject
       with ButtonGroupClassKey
  inline def groupedTextSecondary: groupedTextSecondary = "groupedTextSecondary".asInstanceOf[groupedTextSecondary]
  
  @js.native
  sealed trait groupedTextVertical
    extends StObject
       with ButtonGroupClassKey
  inline def groupedTextVertical: groupedTextVertical = "groupedTextVertical".asInstanceOf[groupedTextVertical]
  
  @js.native
  sealed trait groupedVertical
    extends StObject
       with ButtonGroupClassKey
       with ToggleButtonGroupClassKey
  inline def groupedVertical: groupedVertical = "groupedVertical".asInstanceOf[groupedVertical]
  
  @js.native
  sealed trait gutterBottom
    extends StObject
       with TypographyClassKey
  inline def gutterBottom: gutterBottom = "gutterBottom".asInstanceOf[gutterBottom]
  
  @js.native
  sealed trait gutters
    extends StObject
       with AccordionClassKey
       with AccordionSummaryClassKey
       with ListItemButtonClassKey
       with ListItemClassKey
       with ListSubheaderClassKey
       with MenuItemClassKey
       with ToolbarClassKey
  inline def gutters: gutters = "gutters".asInstanceOf[gutters]
  
  @js.native
  sealed trait h1
    extends StObject
       with TypographyClassKey
       with Variant
  inline def h1: h1 = "h1".asInstanceOf[h1]
  
  @js.native
  sealed trait h2
    extends StObject
       with TypographyClassKey
       with Variant
  inline def h2: h2 = "h2".asInstanceOf[h2]
  
  @js.native
  sealed trait h3
    extends StObject
       with TypographyClassKey
       with Variant
  inline def h3: h3 = "h3".asInstanceOf[h3]
  
  @js.native
  sealed trait h4
    extends StObject
       with TypographyClassKey
       with Variant
  inline def h4: h4 = "h4".asInstanceOf[h4]
  
  @js.native
  sealed trait h5
    extends StObject
       with TypographyClassKey
       with Variant
  inline def h5: h5 = "h5".asInstanceOf[h5]
  
  @js.native
  sealed trait h6
    extends StObject
       with TypographyClassKey
       with Variant
  inline def h6: h6 = "h6".asInstanceOf[h6]
  
  @js.native
  sealed trait hanging extends StObject
  inline def hanging: hanging = "hanging".asInstanceOf[hanging]
  
  @js.native
  sealed trait hasClearIcon
    extends StObject
       with AutocompleteClassKey
  inline def hasClearIcon: hasClearIcon = "hasClearIcon".asInstanceOf[hasClearIcon]
  
  @js.native
  sealed trait hasPopupIcon
    extends StObject
       with AutocompleteClassKey
  inline def hasPopupIcon: hasPopupIcon = "hasPopupIcon".asInstanceOf[hasPopupIcon]
  
  @js.native
  sealed trait head
    extends StObject
       with TableCellClassKey
       with TableRowClassKey
  inline def head: head = "head".asInstanceOf[head]
  
  @js.native
  sealed trait heightAuto
    extends StObject
       with SkeletonClassKey
  inline def heightAuto: heightAuto = "heightAuto".asInstanceOf[heightAuto]
  
  @js.native
  sealed trait hidden
    extends StObject
       with CollapseClassKey
  inline def hidden: hidden = "hidden".asInstanceOf[hidden]
  
  @js.native
  sealed trait hiddenLabel
    extends StObject
       with ContextFromPropsKey
       with FilledInputClassKey
       with InputAdornmentClassKey
       with InputBaseClassKey
  inline def hiddenLabel: hiddenLabel = "hiddenLabel".asInstanceOf[hiddenLabel]
  
  @js.native
  sealed trait hideScrollbar
    extends StObject
       with TabsClassKey
  inline def hideScrollbar: hideScrollbar = "hideScrollbar".asInstanceOf[hideScrollbar]
  
  @js.native
  sealed trait horizontal
    extends StObject
       with CollapseClassKey
       with Orientation
       with StepButtonClassKey
       with StepClassKey
       with StepConnectorClassKey
       with StepLabelClassKey
       with StepperClassKey
  inline def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait hover
    extends StObject
       with TableRowClassKey
  inline def hover: hover = "hover".asInstanceOf[hover]
  
  @js.native
  sealed trait icon
    extends StObject
       with AlertClassKey
       with ChipClassKey
       with NativeSelectClassKey
       with PaginationItemClassKey
       with RatingClassKey
       with SelectClassKey
       with SpeedDialIconClassKey
       with TableSortLabelClassKey
  inline def icon: icon = "icon".asInstanceOf[icon]
  
  @js.native
  sealed trait iconActive
    extends StObject
       with RatingClassKey
  inline def iconActive: iconActive = "iconActive".asInstanceOf[iconActive]
  
  @js.native
  sealed trait iconColorPrimary
    extends StObject
       with ChipClassKey
  inline def iconColorPrimary: iconColorPrimary = "iconColorPrimary".asInstanceOf[iconColorPrimary]
  
  @js.native
  sealed trait iconColorSecondary
    extends StObject
       with ChipClassKey
  inline def iconColorSecondary: iconColorSecondary = "iconColorSecondary".asInstanceOf[iconColorSecondary]
  
  @js.native
  sealed trait iconContainer
    extends StObject
       with StepLabelClassKey
  inline def iconContainer: iconContainer = "iconContainer".asInstanceOf[iconContainer]
  
  @js.native
  sealed trait iconDirectionAsc
    extends StObject
       with TableSortLabelClassKey
  inline def iconDirectionAsc: iconDirectionAsc = "iconDirectionAsc".asInstanceOf[iconDirectionAsc]
  
  @js.native
  sealed trait iconDirectionDesc
    extends StObject
       with TableSortLabelClassKey
  inline def iconDirectionDesc: iconDirectionDesc = "iconDirectionDesc".asInstanceOf[iconDirectionDesc]
  
  @js.native
  sealed trait iconEmpty
    extends StObject
       with RatingClassKey
  inline def iconEmpty: iconEmpty = "iconEmpty".asInstanceOf[iconEmpty]
  
  @js.native
  sealed trait iconFilled
    extends StObject
       with NativeSelectClassKey
       with RatingClassKey
       with SelectClassKey
  inline def iconFilled: iconFilled = "iconFilled".asInstanceOf[iconFilled]
  
  @js.native
  sealed trait iconFocus
    extends StObject
       with RatingClassKey
  inline def iconFocus: iconFocus = "iconFocus".asInstanceOf[iconFocus]
  
  @js.native
  sealed trait iconHover
    extends StObject
       with RatingClassKey
  inline def iconHover: iconHover = "iconHover".asInstanceOf[iconHover]
  
  @js.native
  sealed trait iconMedium
    extends StObject
       with ChipClassKey
  inline def iconMedium: iconMedium = "iconMedium".asInstanceOf[iconMedium]
  
  @js.native
  sealed trait iconOnly
    extends StObject
       with BottomNavigationActionClassKey
  inline def iconOnly: iconOnly = "iconOnly".asInstanceOf[iconOnly]
  
  @js.native
  sealed trait iconOpen
    extends StObject
       with NativeSelectClassKey
       with SelectClassKey
       with SpeedDialIconClassKey
  inline def iconOpen: iconOpen = "iconOpen".asInstanceOf[iconOpen]
  
  @js.native
  sealed trait iconOutlined
    extends StObject
       with NativeSelectClassKey
       with SelectClassKey
  inline def iconOutlined: iconOutlined = "iconOutlined".asInstanceOf[iconOutlined]
  
  @js.native
  sealed trait iconSizeLarge
    extends StObject
       with ButtonClassKey
  inline def iconSizeLarge: iconSizeLarge = "iconSizeLarge".asInstanceOf[iconSizeLarge]
  
  @js.native
  sealed trait iconSizeMedium
    extends StObject
       with ButtonClassKey
  inline def iconSizeMedium: iconSizeMedium = "iconSizeMedium".asInstanceOf[iconSizeMedium]
  
  @js.native
  sealed trait iconSizeSmall
    extends StObject
       with ButtonClassKey
  inline def iconSizeSmall: iconSizeSmall = "iconSizeSmall".asInstanceOf[iconSizeSmall]
  
  @js.native
  sealed trait iconSmall
    extends StObject
       with ChipClassKey
  inline def iconSmall: iconSmall = "iconSmall".asInstanceOf[iconSmall]
  
  @js.native
  sealed trait iconStandard
    extends StObject
       with NativeSelectClassKey
       with SelectClassKey
  inline def iconStandard: iconStandard = "iconStandard".asInstanceOf[iconStandard]
  
  @js.native
  sealed trait iconWithOpenIconOpen
    extends StObject
       with SpeedDialIconClassKey
  inline def iconWithOpenIconOpen: iconWithOpenIconOpen = "iconWithOpenIconOpen".asInstanceOf[iconWithOpenIconOpen]
  
  @js.native
  sealed trait iconWrapper
    extends StObject
       with TabClassKey
  inline def iconWrapper: iconWrapper = "iconWrapper".asInstanceOf[iconWrapper]
  
  @js.native
  sealed trait ideographic extends StObject
  inline def ideographic: ideographic = "ideographic".asInstanceOf[ideographic]
  
  @js.native
  sealed trait img
    extends StObject
       with AvatarClassKey
       with CardMediaClassKey
       with ImageListItemClassKey
  inline def img: img = "img".asInstanceOf[img]
  
  @js.native
  sealed trait in
    extends StObject
       with TransitionKeys
  inline def in: in = "in".asInstanceOf[in]
  
  @js.native
  sealed trait indeterminate
    extends StObject
       with CheckboxClassKey
       with CircularProgressClassKey
       with LinearProgressClassKey
  inline def indeterminate: indeterminate = "indeterminate".asInstanceOf[indeterminate]
  
  @js.native
  sealed trait indicator
    extends StObject
       with TabsClassKey
  inline def indicator: indicator = "indicator".asInstanceOf[indicator]
  
  @js.native
  sealed trait info
    extends StObject
       with AlertColor
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait inherit
    extends StObject
       with Color
       with TypographyClassKey
  inline def inherit: inherit = "inherit".asInstanceOf[inherit]
  
  @js.native
  sealed trait initial extends StObject
  inline def initial: initial = "initial".asInstanceOf[initial]
  
  @js.native
  sealed trait `inline` extends StObject
  inline def `inline`: `inline` = "inline".asInstanceOf[`inline`]
  
  @js.native
  sealed trait input
    extends StObject
       with AutocompleteClassKey
       with FilledInputClassKey
       with InputBaseClassKey
       with InputClassKey
       with OutlinedInputClassKey
       with SwitchBaseClassKey
       with SwitchClassKey
       with TablePaginationClassKey
  inline def input: input = "input".asInstanceOf[input]
  
  @js.native
  sealed trait inputAdornedEnd
    extends StObject
       with FilledInputClassKey
       with InputBaseClassKey
       with OutlinedInputClassKey
  inline def inputAdornedEnd: inputAdornedEnd = "inputAdornedEnd".asInstanceOf[inputAdornedEnd]
  
  @js.native
  sealed trait inputAdornedStart
    extends StObject
       with FilledInputClassKey
       with InputBaseClassKey
       with OutlinedInputClassKey
  inline def inputAdornedStart: inputAdornedStart = "inputAdornedStart".asInstanceOf[inputAdornedStart]
  
  @js.native
  sealed trait inputFocused
    extends StObject
       with AutocompleteClassKey
  inline def inputFocused: inputFocused = "inputFocused".asInstanceOf[inputFocused]
  
  @js.native
  sealed trait inputHiddenLabel
    extends StObject
       with FilledInputClassKey
       with InputBaseClassKey
  inline def inputHiddenLabel: inputHiddenLabel = "inputHiddenLabel".asInstanceOf[inputHiddenLabel]
  
  @js.native
  sealed trait inputMultiline
    extends StObject
       with FilledInputClassKey
       with InputBaseClassKey
       with InputClassKey
       with OutlinedInputClassKey
  inline def inputMultiline: inputMultiline = "inputMultiline".asInstanceOf[inputMultiline]
  
  @js.native
  sealed trait inputRoot
    extends StObject
       with AutocompleteClassKey
  inline def inputRoot: inputRoot = "inputRoot".asInstanceOf[inputRoot]
  
  @js.native
  sealed trait inputSizeSmall
    extends StObject
       with FilledInputClassKey
       with InputBaseClassKey
       with InputClassKey
       with OutlinedInputClassKey
  inline def inputSizeSmall: inputSizeSmall = "inputSizeSmall".asInstanceOf[inputSizeSmall]
  
  @js.native
  sealed trait inputTypeSearch
    extends StObject
       with InputBaseClassKey
       with InputClassKey
  inline def inputTypeSearch: inputTypeSearch = "inputTypeSearch".asInstanceOf[inputTypeSearch]
  
  @js.native
  sealed trait inset
    extends StObject
       with DividerClassKey
       with ListItemTextClassKey
       with ListSubheaderClassKey
  inline def inset: inset = "inset".asInstanceOf[inset]
  
  @js.native
  sealed trait inverted extends StObject
  inline def inverted: inverted = "inverted".asInstanceOf[inverted]
  
  @js.native
  sealed trait isolated extends StObject
  inline def isolated: isolated = "isolated".asInstanceOf[isolated]
  
  @js.native
  sealed trait item
    extends StObject
       with GridClassKey
  inline def item: item = "item".asInstanceOf[item]
  
  @js.native
  sealed trait js_ extends StObject
  inline def js_ : js_ = "js".asInstanceOf[js_]
  
  @js.native
  sealed trait justify extends StObject
  inline def justify: justify = "justify".asInstanceOf[justify]
  
  @js.native
  sealed trait label
    extends StObject
       with BottomNavigationActionClassKey
       with ChipClassKey
       with FormControlLabelClassKey
       with RatingClassKey
       with StepLabelClassKey
  inline def label: label = "label".asInstanceOf[label]
  
  @js.native
  sealed trait labelContainer
    extends StObject
       with StepLabelClassKey
  inline def labelContainer: labelContainer = "labelContainer".asInstanceOf[labelContainer]
  
  @js.native
  sealed trait labelEmptyValueActive
    extends StObject
       with RatingClassKey
  inline def labelEmptyValueActive: labelEmptyValueActive = "labelEmptyValueActive".asInstanceOf[labelEmptyValueActive]
  
  @js.native
  sealed trait labelIcon
    extends StObject
       with TabClassKey
  inline def labelIcon: labelIcon = "labelIcon".asInstanceOf[labelIcon]
  
  @js.native
  sealed trait labelMedium
    extends StObject
       with ChipClassKey
  inline def labelMedium: labelMedium = "labelMedium".asInstanceOf[labelMedium]
  
  @js.native
  sealed trait labelPlacementBottom
    extends StObject
       with FormControlLabelClassKey
  inline def labelPlacementBottom: labelPlacementBottom = "labelPlacementBottom".asInstanceOf[labelPlacementBottom]
  
  @js.native
  sealed trait labelPlacementStart
    extends StObject
       with FormControlLabelClassKey
  inline def labelPlacementStart: labelPlacementStart = "labelPlacementStart".asInstanceOf[labelPlacementStart]
  
  @js.native
  sealed trait labelPlacementTop
    extends StObject
       with FormControlLabelClassKey
  inline def labelPlacementTop: labelPlacementTop = "labelPlacementTop".asInstanceOf[labelPlacementTop]
  
  @js.native
  sealed trait labelSmall
    extends StObject
       with ChipClassKey
  inline def labelSmall: labelSmall = "labelSmall".asInstanceOf[labelSmall]
  
  @js.native
  sealed trait large extends StObject
  inline def large: large = "large".asInstanceOf[large]
  
  @js.native
  sealed trait last
    extends StObject
       with StepContentClassKey
  inline def last: last = "last".asInstanceOf[last]
  
  @js.native
  sealed trait left extends StObject
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait `left-end` extends StObject
  inline def `left-end`: `left-end` = "left-end".asInstanceOf[`left-end`]
  
  @js.native
  sealed trait `left-start` extends StObject
  inline def `left-start`: `left-start` = "left-start".asInstanceOf[`left-start`]
  
  @js.native
  sealed trait li
    extends StObject
       with BreadcrumbsClassKey
  inline def li: li = "li".asInstanceOf[li]
  
  @js.native
  sealed trait light
    extends StObject
       with DividerClassKey
       with PaletteMode
  inline def light: light = "light".asInstanceOf[light]
  
  @js.native
  sealed trait line
    extends StObject
       with StepConnectorClassKey
  inline def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait lineHorizontal
    extends StObject
       with StepConnectorClassKey
  inline def lineHorizontal: lineHorizontal = "lineHorizontal".asInstanceOf[lineHorizontal]
  
  @js.native
  sealed trait lineVertical
    extends StObject
       with StepConnectorClassKey
  inline def lineVertical: lineVertical = "lineVertical".asInstanceOf[lineVertical]
  
  @js.native
  sealed trait linearRGB extends StObject
  inline def linearRGB: linearRGB = "linearRGB".asInstanceOf[linearRGB]
  
  @js.native
  sealed trait link extends StObject
  inline def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait list
    extends StObject
       with MenuClassKey
  inline def list: list = "list".asInstanceOf[list]
  
  @js.native
  sealed trait listbox
    extends StObject
       with AutocompleteClassKey
  inline def listbox: listbox = "listbox".asInstanceOf[listbox]
  
  @js.native
  sealed trait loading
    extends StObject
       with AutocompleteClassKey
  inline def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait location extends StObject
  inline def location: location = "location".asInstanceOf[location]
  
  @js.native
  sealed trait ltr
    extends StObject
       with Direction
  inline def ltr: ltr = "ltr".asInstanceOf[ltr]
  
  @js.native
  sealed trait margin
    extends StObject
       with ContextFromPropsKey
  inline def margin: margin = "margin".asInstanceOf[margin]
  
  @js.native
  sealed trait marginDense
    extends StObject
       with FormControlClassKey
  inline def marginDense: marginDense = "marginDense".asInstanceOf[marginDense]
  
  @js.native
  sealed trait marginNormal
    extends StObject
       with FormControlClassKey
  inline def marginNormal: marginNormal = "marginNormal".asInstanceOf[marginNormal]
  
  @js.native
  sealed trait masonry
    extends StObject
       with ImageListClassKey
       with ImageListItemClassKey
  inline def masonry: masonry = "masonry".asInstanceOf[masonry]
  
  @js.native
  sealed trait mathematical extends StObject
  inline def mathematical: mathematical = "mathematical".asInstanceOf[mathematical]
  
  @js.native
  sealed trait maxWidthLg
    extends StObject
       with ContainerClassKey
  inline def maxWidthLg: maxWidthLg = "maxWidthLg".asInstanceOf[maxWidthLg]
  
  @js.native
  sealed trait maxWidthMd
    extends StObject
       with ContainerClassKey
  inline def maxWidthMd: maxWidthMd = "maxWidthMd".asInstanceOf[maxWidthMd]
  
  @js.native
  sealed trait maxWidthSm
    extends StObject
       with ContainerClassKey
  inline def maxWidthSm: maxWidthSm = "maxWidthSm".asInstanceOf[maxWidthSm]
  
  @js.native
  sealed trait maxWidthXl
    extends StObject
       with ContainerClassKey
  inline def maxWidthXl: maxWidthXl = "maxWidthXl".asInstanceOf[maxWidthXl]
  
  @js.native
  sealed trait maxWidthXs
    extends StObject
       with ContainerClassKey
  inline def maxWidthXs: maxWidthXs = "maxWidthXs".asInstanceOf[maxWidthXs]
  
  @js.native
  sealed trait media
    extends StObject
       with CardMediaClassKey
  inline def media: media = "media".asInstanceOf[media]
  
  @js.native
  sealed trait medial extends StObject
  inline def medial: medial = "medial".asInstanceOf[medial]
  
  @js.native
  sealed trait medium extends StObject
  inline def medium: medium = "medium".asInstanceOf[medium]
  
  @js.native
  sealed trait menu extends StObject
  inline def menu: menu = "menu".asInstanceOf[menu]
  
  @js.native
  sealed trait menuItem
    extends StObject
       with TablePaginationClassKey
  inline def menuItem: menuItem = "menuItem".asInstanceOf[menuItem]
  
  @js.native
  sealed trait message
    extends StObject
       with AlertClassKey
       with SnackbarContentClassKey
  inline def message: message = "message".asInstanceOf[message]
  
  @js.native
  sealed trait middle
    extends StObject
       with DividerClassKey
  inline def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait miter extends StObject
  inline def miter: miter = "miter".asInstanceOf[miter]
  
  @js.native
  sealed trait mixed extends StObject
  inline def mixed: mixed = "mixed".asInstanceOf[mixed]
  
  @js.native
  sealed trait modal
    extends StObject
       with DrawerClassKey
  inline def modal: modal = "modal".asInstanceOf[modal]
  
  @js.native
  sealed trait mountOnEnter
    extends StObject
       with TransitionKeys
  inline def mountOnEnter: mountOnEnter = "mountOnEnter".asInstanceOf[mountOnEnter]
  
  @js.native
  sealed trait mouse extends StObject
  inline def mouse: mouse = "mouse".asInstanceOf[mouse]
  
  @js.native
  sealed trait mouseEnter
    extends StObject
       with OpenReason
  inline def mouseEnter: mouseEnter = "mouseEnter".asInstanceOf[mouseEnter]
  
  @js.native
  sealed trait mouseLeave
    extends StObject
       with CloseReason
  inline def mouseLeave: mouseLeave = "mouseLeave".asInstanceOf[mouseLeave]
  
  @js.native
  sealed trait move extends StObject
  inline def move: move = "move".asInstanceOf[move]
  
  @js.native
  sealed trait multiline
    extends StObject
       with FilledInputClassKey
       with InputBaseClassKey
       with InputClassKey
       with ListItemTextClassKey
       with OutlinedInputClassKey
  inline def multiline: multiline = "multiline".asInstanceOf[multiline]
  
  @js.native
  sealed trait multiple
    extends StObject
       with NativeSelectClassKey
       with SelectClassKey
  inline def multiple: multiple = "multiple".asInstanceOf[multiple]
  
  @js.native
  sealed trait nativeInput
    extends StObject
       with NativeSelectClassKey
       with SelectClassKey
  inline def nativeInput: nativeInput = "nativeInput".asInstanceOf[nativeInput]
  
  @js.native
  sealed trait next extends StObject
  inline def next: next = "next".asInstanceOf[next]
  
  @js.native
  sealed trait no extends StObject
  inline def no: no = "no".asInstanceOf[no]
  
  @js.native
  sealed trait noOptions
    extends StObject
       with AutocompleteClassKey
  inline def noOptions: noOptions = "noOptions".asInstanceOf[noOptions]
  
  @js.native
  sealed trait noWrap
    extends StObject
       with TypographyClassKey
  inline def noWrap: noWrap = "noWrap".asInstanceOf[noWrap]
  
  @js.native
  sealed trait none
    extends StObject
       with PopoverReference
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait nonzero extends StObject
  inline def nonzero: nonzero = "nonzero".asInstanceOf[nonzero]
  
  @js.native
  sealed trait normal extends StObject
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait notchedOutline
    extends StObject
       with OutlinedInputClassKey
  inline def notchedOutline: notchedOutline = "notchedOutline".asInstanceOf[notchedOutline]
  
  @js.native
  sealed trait nowrap_
    extends StObject
       with GridWrap
  inline def nowrap_ : nowrap_ = "nowrap".asInstanceOf[nowrap_]
  
  @js.native
  sealed trait numeric extends StObject
  inline def numeric: numeric = "numeric".asInstanceOf[numeric]
  
  @js.native
  sealed trait off extends StObject
  inline def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait ol
    extends StObject
       with BreadcrumbsClassKey
  inline def ol: ol = "ol".asInstanceOf[ol]
  
  @js.native
  sealed trait on extends StObject
  inline def on: on = "on".asInstanceOf[on]
  
  @js.native
  sealed trait onEnter
    extends StObject
       with TransitionHandlerKeys
       with TransitionKeys
  inline def onEnter: onEnter = "onEnter".asInstanceOf[onEnter]
  
  @js.native
  sealed trait onEntered
    extends StObject
       with TransitionHandlerKeys
       with TransitionKeys
  inline def onEntered: onEntered = "onEntered".asInstanceOf[onEntered]
  
  @js.native
  sealed trait onEntering
    extends StObject
       with TransitionHandlerKeys
       with TransitionKeys
  inline def onEntering: onEntering = "onEntering".asInstanceOf[onEntering]
  
  @js.native
  sealed trait onExit
    extends StObject
       with TransitionHandlerKeys
       with TransitionKeys
  inline def onExit: onExit = "onExit".asInstanceOf[onExit]
  
  @js.native
  sealed trait onExited
    extends StObject
       with TransitionHandlerKeys
       with TransitionKeys
  inline def onExited: onExited = "onExited".asInstanceOf[onExited]
  
  @js.native
  sealed trait onExiting
    extends StObject
       with TransitionHandlerKeys
       with TransitionKeys
  inline def onExiting: onExiting = "onExiting".asInstanceOf[onExiting]
  
  @js.native
  sealed trait openIcon
    extends StObject
       with SpeedDialIconClassKey
  inline def openIcon: openIcon = "openIcon".asInstanceOf[openIcon]
  
  @js.native
  sealed trait openIconOpen
    extends StObject
       with SpeedDialIconClassKey
  inline def openIconOpen: openIconOpen = "openIconOpen".asInstanceOf[openIconOpen]
  
  @js.native
  sealed trait option
    extends StObject
       with AutocompleteClassKey
  inline def option: option = "option".asInstanceOf[option]
  
  @js.native
  sealed trait other extends StObject
  inline def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait outlined
    extends StObject
       with AlertClassKey
       with ButtonClassKey
       with ButtonGroupClassKey
       with ChipClassKey
       with InputAdornmentClassKey
       with InputLabelClassKey
       with NativeSelectClassKey
       with PaginationClassKey
       with PaginationItemClassKey
       with PaperClassKey
       with SelectClassKey
  inline def outlined: outlined = "outlined".asInstanceOf[outlined]
  
  @js.native
  sealed trait outlinedError
    extends StObject
       with AlertClassKey
  inline def outlinedError: outlinedError = "outlinedError".asInstanceOf[outlinedError]
  
  @js.native
  sealed trait outlinedInfo
    extends StObject
       with AlertClassKey
  inline def outlinedInfo: outlinedInfo = "outlinedInfo".asInstanceOf[outlinedInfo]
  
  @js.native
  sealed trait outlinedInherit
    extends StObject
       with ButtonClassKey
  inline def outlinedInherit: outlinedInherit = "outlinedInherit".asInstanceOf[outlinedInherit]
  
  @js.native
  sealed trait outlinedPrimary
    extends StObject
       with ButtonClassKey
       with ChipClassKey
       with PaginationItemClassKey
  inline def outlinedPrimary: outlinedPrimary = "outlinedPrimary".asInstanceOf[outlinedPrimary]
  
  @js.native
  sealed trait outlinedSecondary
    extends StObject
       with ButtonClassKey
       with ChipClassKey
       with PaginationItemClassKey
  inline def outlinedSecondary: outlinedSecondary = "outlinedSecondary".asInstanceOf[outlinedSecondary]
  
  @js.native
  sealed trait outlinedSizeLarge
    extends StObject
       with ButtonClassKey
  inline def outlinedSizeLarge: outlinedSizeLarge = "outlinedSizeLarge".asInstanceOf[outlinedSizeLarge]
  
  @js.native
  sealed trait outlinedSizeMedium
    extends StObject
       with ButtonClassKey
  inline def outlinedSizeMedium: outlinedSizeMedium = "outlinedSizeMedium".asInstanceOf[outlinedSizeMedium]
  
  @js.native
  sealed trait outlinedSizeSmall
    extends StObject
       with ButtonClassKey
  inline def outlinedSizeSmall: outlinedSizeSmall = "outlinedSizeSmall".asInstanceOf[outlinedSizeSmall]
  
  @js.native
  sealed trait outlinedSuccess
    extends StObject
       with AlertClassKey
  inline def outlinedSuccess: outlinedSuccess = "outlinedSuccess".asInstanceOf[outlinedSuccess]
  
  @js.native
  sealed trait outlinedWarning
    extends StObject
       with AlertClassKey
  inline def outlinedWarning: outlinedWarning = "outlinedWarning".asInstanceOf[outlinedWarning]
  
  @js.native
  sealed trait overline
    extends StObject
       with TypographyClassKey
       with Variant
  inline def overline: overline = "overline".asInstanceOf[overline]
  
  @js.native
  sealed trait p extends StObject
  inline def p: p = "p".asInstanceOf[p]
  
  @js.native
  sealed trait padding
    extends StObject
       with ListClassKey
       with ListItemClassKey
  inline def padding: padding = "padding".asInstanceOf[padding]
  
  @js.native
  sealed trait paddingCheckbox
    extends StObject
       with TableCellClassKey
  inline def paddingCheckbox: paddingCheckbox = "paddingCheckbox".asInstanceOf[paddingCheckbox]
  
  @js.native
  sealed trait paddingNone
    extends StObject
       with TableCellClassKey
  inline def paddingNone: paddingNone = "paddingNone".asInstanceOf[paddingNone]
  
  @js.native
  sealed trait page
    extends StObject
       with PaginationItemClassKey
  inline def page: page = "page".asInstanceOf[page]
  
  @js.native
  sealed trait paper
    extends StObject
       with AutocompleteClassKey
       with DialogClassKey
       with DrawerClassKey
       with MenuClassKey
       with PopoverClassKey
  inline def paper: paper = "paper".asInstanceOf[paper]
  
  @js.native
  sealed trait paperAnchorBottom
    extends StObject
       with DrawerClassKey
  inline def paperAnchorBottom: paperAnchorBottom = "paperAnchorBottom".asInstanceOf[paperAnchorBottom]
  
  @js.native
  sealed trait paperAnchorDockedBottom
    extends StObject
       with DrawerClassKey
  inline def paperAnchorDockedBottom: paperAnchorDockedBottom = "paperAnchorDockedBottom".asInstanceOf[paperAnchorDockedBottom]
  
  @js.native
  sealed trait paperAnchorDockedLeft
    extends StObject
       with DrawerClassKey
  inline def paperAnchorDockedLeft: paperAnchorDockedLeft = "paperAnchorDockedLeft".asInstanceOf[paperAnchorDockedLeft]
  
  @js.native
  sealed trait paperAnchorDockedRight
    extends StObject
       with DrawerClassKey
  inline def paperAnchorDockedRight: paperAnchorDockedRight = "paperAnchorDockedRight".asInstanceOf[paperAnchorDockedRight]
  
  @js.native
  sealed trait paperAnchorDockedTop
    extends StObject
       with DrawerClassKey
  inline def paperAnchorDockedTop: paperAnchorDockedTop = "paperAnchorDockedTop".asInstanceOf[paperAnchorDockedTop]
  
  @js.native
  sealed trait paperAnchorLeft
    extends StObject
       with DrawerClassKey
  inline def paperAnchorLeft: paperAnchorLeft = "paperAnchorLeft".asInstanceOf[paperAnchorLeft]
  
  @js.native
  sealed trait paperAnchorRight
    extends StObject
       with DrawerClassKey
  inline def paperAnchorRight: paperAnchorRight = "paperAnchorRight".asInstanceOf[paperAnchorRight]
  
  @js.native
  sealed trait paperAnchorTop
    extends StObject
       with DrawerClassKey
  inline def paperAnchorTop: paperAnchorTop = "paperAnchorTop".asInstanceOf[paperAnchorTop]
  
  @js.native
  sealed trait paperFullScreen
    extends StObject
       with DialogClassKey
  inline def paperFullScreen: paperFullScreen = "paperFullScreen".asInstanceOf[paperFullScreen]
  
  @js.native
  sealed trait paperFullWidth
    extends StObject
       with DialogClassKey
  inline def paperFullWidth: paperFullWidth = "paperFullWidth".asInstanceOf[paperFullWidth]
  
  @js.native
  sealed trait paperScrollBody
    extends StObject
       with DialogClassKey
  inline def paperScrollBody: paperScrollBody = "paperScrollBody".asInstanceOf[paperScrollBody]
  
  @js.native
  sealed trait paperScrollPaper
    extends StObject
       with DialogClassKey
  inline def paperScrollPaper: paperScrollPaper = "paperScrollPaper".asInstanceOf[paperScrollPaper]
  
  @js.native
  sealed trait paperWidthFalse
    extends StObject
       with DialogClassKey
  inline def paperWidthFalse: paperWidthFalse = "paperWidthFalse".asInstanceOf[paperWidthFalse]
  
  @js.native
  sealed trait paperWidthLg
    extends StObject
       with DialogClassKey
  inline def paperWidthLg: paperWidthLg = "paperWidthLg".asInstanceOf[paperWidthLg]
  
  @js.native
  sealed trait paperWidthMd
    extends StObject
       with DialogClassKey
  inline def paperWidthMd: paperWidthMd = "paperWidthMd".asInstanceOf[paperWidthMd]
  
  @js.native
  sealed trait paperWidthSm
    extends StObject
       with DialogClassKey
  inline def paperWidthSm: paperWidthSm = "paperWidthSm".asInstanceOf[paperWidthSm]
  
  @js.native
  sealed trait paperWidthXl
    extends StObject
       with DialogClassKey
  inline def paperWidthXl: paperWidthXl = "paperWidthXl".asInstanceOf[paperWidthXl]
  
  @js.native
  sealed trait paperWidthXs
    extends StObject
       with DialogClassKey
  inline def paperWidthXs: paperWidthXs = "paperWidthXs".asInstanceOf[paperWidthXs]
  
  @js.native
  sealed trait paragraph
    extends StObject
       with TypographyClassKey
  inline def paragraph: paragraph = "paragraph".asInstanceOf[paragraph]
  
  @js.native
  sealed trait permanent extends StObject
  inline def permanent: permanent = "permanent".asInstanceOf[permanent]
  
  @js.native
  sealed trait persistent extends StObject
  inline def persistent: persistent = "persistent".asInstanceOf[persistent]
  
  @js.native
  sealed trait polite extends StObject
  inline def polite: polite = "polite".asInstanceOf[polite]
  
  @js.native
  sealed trait popper
    extends StObject
       with AutocompleteClassKey
       with TooltipClassKey
  inline def popper: popper = "popper".asInstanceOf[popper]
  
  @js.native
  sealed trait popperArrow
    extends StObject
       with TooltipClassKey
  inline def popperArrow: popperArrow = "popperArrow".asInstanceOf[popperArrow]
  
  @js.native
  sealed trait popperClose
    extends StObject
       with TooltipClassKey
  inline def popperClose: popperClose = "popperClose".asInstanceOf[popperClose]
  
  @js.native
  sealed trait popperDisablePortal
    extends StObject
       with AutocompleteClassKey
  inline def popperDisablePortal: popperDisablePortal = "popperDisablePortal".asInstanceOf[popperDisablePortal]
  
  @js.native
  sealed trait popperInteractive
    extends StObject
       with TooltipClassKey
  inline def popperInteractive: popperInteractive = "popperInteractive".asInstanceOf[popperInteractive]
  
  @js.native
  sealed trait popup extends StObject
  inline def popup: popup = "popup".asInstanceOf[popup]
  
  @js.native
  sealed trait popupIndicator
    extends StObject
       with AutocompleteClassKey
  inline def popupIndicator: popupIndicator = "popupIndicator".asInstanceOf[popupIndicator]
  
  @js.native
  sealed trait popupIndicatorOpen
    extends StObject
       with AutocompleteClassKey
  inline def popupIndicatorOpen: popupIndicatorOpen = "popupIndicatorOpen".asInstanceOf[popupIndicatorOpen]
  
  @js.native
  sealed trait positionAbsolute
    extends StObject
       with AppBarClassKey
  inline def positionAbsolute: positionAbsolute = "positionAbsolute".asInstanceOf[positionAbsolute]
  
  @js.native
  sealed trait positionBelow
    extends StObject
       with ImageListItemBarClassKey
  inline def positionBelow: positionBelow = "positionBelow".asInstanceOf[positionBelow]
  
  @js.native
  sealed trait positionBottom
    extends StObject
       with ImageListItemBarClassKey
       with MobileStepperClassKey
  inline def positionBottom: positionBottom = "positionBottom".asInstanceOf[positionBottom]
  
  @js.native
  sealed trait positionEnd
    extends StObject
       with InputAdornmentClassKey
  inline def positionEnd: positionEnd = "positionEnd".asInstanceOf[positionEnd]
  
  @js.native
  sealed trait positionFixed
    extends StObject
       with AppBarClassKey
  inline def positionFixed: positionFixed = "positionFixed".asInstanceOf[positionFixed]
  
  @js.native
  sealed trait positionRelative
    extends StObject
       with AppBarClassKey
  inline def positionRelative: positionRelative = "positionRelative".asInstanceOf[positionRelative]
  
  @js.native
  sealed trait positionStart
    extends StObject
       with InputAdornmentClassKey
  inline def positionStart: positionStart = "positionStart".asInstanceOf[positionStart]
  
  @js.native
  sealed trait positionStatic
    extends StObject
       with AppBarClassKey
       with MobileStepperClassKey
  inline def positionStatic: positionStatic = "positionStatic".asInstanceOf[positionStatic]
  
  @js.native
  sealed trait positionSticky
    extends StObject
       with AppBarClassKey
  inline def positionSticky: positionSticky = "positionSticky".asInstanceOf[positionSticky]
  
  @js.native
  sealed trait positionTop
    extends StObject
       with ImageListItemBarClassKey
       with MobileStepperClassKey
  inline def positionTop: positionTop = "positionTop".asInstanceOf[positionTop]
  
  @js.native
  sealed trait previous extends StObject
  inline def previous: previous = "previous".asInstanceOf[previous]
  
  @js.native
  sealed trait previousNext
    extends StObject
       with PaginationItemClassKey
  inline def previousNext: previousNext = "previousNext".asInstanceOf[previousNext]
  
  @js.native
  sealed trait primary
    extends StObject
       with Color
       with FabClassKey
       with ListItemTextClassKey
       with ToggleButtonClassKey
  inline def primary: primary = "primary".asInstanceOf[primary]
  
  @js.native
  sealed trait progress
    extends StObject
       with MobileStepperClassKey
  inline def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait pulse
    extends StObject
       with SkeletonClassKey
  inline def pulse: pulse = "pulse".asInstanceOf[pulse]
  
  @js.native
  sealed trait query
    extends StObject
       with LinearProgressClassKey
  inline def query: query = "query".asInstanceOf[query]
  
  @js.native
  sealed trait quilted
    extends StObject
       with ImageListClassKey
       with ImageListItemClassKey
  inline def quilted: quilted = "quilted".asInstanceOf[quilted]
  
  @js.native
  sealed trait readOnly
    extends StObject
       with RatingClassKey
  inline def readOnly: readOnly = "readOnly".asInstanceOf[readOnly]
  
  @js.native
  sealed trait rectangular
    extends StObject
       with SkeletonClassKey
  inline def rectangular: rectangular = "rectangular".asInstanceOf[rectangular]
  
  @js.native
  sealed trait region
    extends StObject
       with AccordionClassKey
  inline def region: region = "region".asInstanceOf[region]
  
  @js.native
  sealed trait regular
    extends StObject
       with ToolbarClassKey
  inline def regular: regular = "regular".asInstanceOf[regular]
  
  @js.native
  sealed trait relative extends StObject
  inline def relative: relative = "relative".asInstanceOf[relative]
  
  @js.native
  sealed trait removals extends StObject
  inline def removals: removals = "removals".asInstanceOf[removals]
  
  @js.native
  sealed trait `removals additions` extends StObject
  inline def `removals additions`: `removals additions` = ("removals additions").asInstanceOf[`removals additions`]
  
  @js.native
  sealed trait `removals text` extends StObject
  inline def `removals text`: `removals text` = ("removals text").asInstanceOf[`removals text`]
  
  @js.native
  sealed trait replace extends StObject
  inline def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait required
    extends StObject
       with ContextFromPropsKey
       with FormHelperTextClassKey
       with FormLabelClassKey
       with InputLabelClassKey
  inline def required: required = "required".asInstanceOf[required]
  
  @js.native
  sealed trait reset extends StObject
  inline def reset: reset = "reset".asInstanceOf[reset]
  
  @js.native
  sealed trait right extends StObject
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait `right-end` extends StObject
  inline def `right-end`: `right-end` = "right-end".asInstanceOf[`right-end`]
  
  @js.native
  sealed trait `right-start` extends StObject
  inline def `right-start`: `right-start` = "right-start".asInstanceOf[`right-start`]
  
  @js.native
  sealed trait ripple
    extends StObject
       with TouchRippleClassKey
  inline def ripple: ripple = "ripple".asInstanceOf[ripple]
  
  @js.native
  sealed trait ripplePulsate
    extends StObject
       with TouchRippleClassKey
  inline def ripplePulsate: ripplePulsate = "ripplePulsate".asInstanceOf[ripplePulsate]
  
  @js.native
  sealed trait rippleVisible
    extends StObject
       with TouchRippleClassKey
  inline def rippleVisible: rippleVisible = "rippleVisible".asInstanceOf[rippleVisible]
  
  @js.native
  sealed trait root
    extends StObject
       with AccordionActionsClassKey
       with AccordionClassKey
       with AccordionSummaryClassKey
       with AlertClassKey
       with AppBarClassKey
       with AutocompleteClassKey
       with AvatarClassKey
       with AvatarGroupClassKey
       with BottomNavigationActionClassKey
       with BreadcrumbsClassKey
       with ButtonBaseClassKey
       with ButtonClassKey
       with ButtonGroupClassKey
       with CardActionAreaClassKey
       with CardActionsClassKey
       with CardHeaderClassKey
       with CardMediaClassKey
       with CheckboxClassKey
       with ChipClassKey
       with CircularProgressClassKey
       with CollapseClassKey
       with ContainerClassKey
       with DialogActionsClassKey
       with DialogClassKey
       with DialogContentClassKey
       with DividerClassKey
       with DrawerClassKey
       with FabClassKey
       with FilledInputClassKey
       with FormControlClassKey
       with FormControlLabelClassKey
       with FormGroupClassKey
       with FormHelperTextClassKey
       with FormLabelClassKey
       with GridClassKey
       with IconButtonClassKey
       with IconClassKey
       with ImageListClassKey
       with ImageListItemBarClassKey
       with ImageListItemClassKey
       with InputAdornmentClassKey
       with InputBaseClassKey
       with InputClassKey
       with InputLabelClassKey
       with LinearProgressClassKey
       with LinkClassKey
       with ListClassKey
       with ListItemAvatarClassKey
       with ListItemButtonClassKey
       with ListItemClassKey
       with ListItemIconClassKey
       with ListItemSecondaryActionClassKey
       with ListItemTextClassKey
       with ListSubheaderClassKey
       with MenuClassKey
       with MenuItemClassKey
       with MobileStepperClassKey
       with NativeSelectClassKey
       with OutlinedInputClassKey
       with PaginationClassKey
       with PaginationItemClassKey
       with PaperClassKey
       with PopoverClassKey
       with RadioClassKey
       with RatingClassKey
       with SkeletonClassKey
       with SnackbarClassKey
       with SnackbarContentClassKey
       with SpeedDialClassKey
       with SpeedDialIconClassKey
       with StepButtonClassKey
       with StepClassKey
       with StepConnectorClassKey
       with StepContentClassKey
       with StepIconClassKey
       with StepLabelClassKey
       with StepperClassKey
       with SvgIconClassKey
       with SwitchBaseClassKey
       with SwitchClassKey
       with TabClassKey
       with TabScrollButtonClassKey
       with TableCellClassKey
       with TableClassKey
       with TablePaginationClassKey
       with TableRowClassKey
       with TableSortLabelClassKey
       with TabsClassKey
       with ToggleButtonClassKey
       with ToggleButtonGroupClassKey
       with ToolbarClassKey
       with TouchRippleClassKey
       with TypographyClassKey
  inline def root: root = "root".asInstanceOf[root]
  
  @js.native
  sealed trait round extends StObject
  inline def round: round = "round".asInstanceOf[round]
  
  @js.native
  sealed trait rounded
    extends StObject
       with AccordionClassKey
       with AvatarClassKey
       with PaginationItemClassKey
       with PaperClassKey
  inline def rounded: rounded = "rounded".asInstanceOf[rounded]
  
  @js.native
  sealed trait row
    extends StObject
       with FormGroupClassKey
       with GridDirection
  inline def row: row = "row".asInstanceOf[row]
  
  @js.native
  sealed trait `row-reverse`
    extends StObject
       with GridDirection
  inline def `row-reverse`: `row-reverse` = "row-reverse".asInstanceOf[`row-reverse`]
  
  @js.native
  sealed trait rtl
    extends StObject
       with Direction
  inline def rtl: rtl = "rtl".asInstanceOf[rtl]
  
  @js.native
  sealed trait sRGB extends StObject
  inline def sRGB: sRGB = "sRGB".asInstanceOf[sRGB]
  
  @js.native
  sealed trait scrollBody
    extends StObject
       with DialogClassKey
  inline def scrollBody: scrollBody = "scrollBody".asInstanceOf[scrollBody]
  
  @js.native
  sealed trait scrollButtons
    extends StObject
       with TabsClassKey
  inline def scrollButtons: scrollButtons = "scrollButtons".asInstanceOf[scrollButtons]
  
  @js.native
  sealed trait scrollButtonsHideMobile
    extends StObject
       with TabsClassKey
  inline def scrollButtonsHideMobile: scrollButtonsHideMobile = "scrollButtonsHideMobile".asInstanceOf[scrollButtonsHideMobile]
  
  @js.native
  sealed trait scrollPaper
    extends StObject
       with DialogClassKey
  inline def scrollPaper: scrollPaper = "scrollPaper".asInstanceOf[scrollPaper]
  
  @js.native
  sealed trait scrollable extends StObject
  inline def scrollable: scrollable = "scrollable".asInstanceOf[scrollable]
  
  @js.native
  sealed trait scrollableX
    extends StObject
       with TabsClassKey
  inline def scrollableX: scrollableX = "scrollableX".asInstanceOf[scrollableX]
  
  @js.native
  sealed trait scrollableY
    extends StObject
       with TabsClassKey
  inline def scrollableY: scrollableY = "scrollableY".asInstanceOf[scrollableY]
  
  @js.native
  sealed trait scroller
    extends StObject
       with TabsClassKey
  inline def scroller: scroller = "scroller".asInstanceOf[scroller]
  
  @js.native
  sealed trait search extends StObject
  inline def search: search = "search".asInstanceOf[search]
  
  @js.native
  sealed trait secondary
    extends StObject
       with Color
       with FabClassKey
       with ListItemTextClassKey
       with ToggleButtonClassKey
  inline def secondary: secondary = "secondary".asInstanceOf[secondary]
  
  @js.native
  sealed trait secondaryAction
    extends StObject
       with ListItemClassKey
  inline def secondaryAction: secondaryAction = "secondaryAction".asInstanceOf[secondaryAction]
  
  @js.native
  sealed trait select
    extends StObject
       with NativeSelectClassKey
       with SelectClassKey
       with TablePaginationClassKey
  inline def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait selectIcon
    extends StObject
       with TablePaginationClassKey
  inline def selectIcon: selectIcon = "selectIcon".asInstanceOf[selectIcon]
  
  @js.native
  sealed trait selectLabel
    extends StObject
       with TablePaginationClassKey
  inline def selectLabel: selectLabel = "selectLabel".asInstanceOf[selectLabel]
  
  @js.native
  sealed trait selectRoot
    extends StObject
       with TablePaginationClassKey
  inline def selectRoot: selectRoot = "selectRoot".asInstanceOf[selectRoot]
  
  @js.native
  sealed trait selected
    extends StObject
       with BottomNavigationActionClassKey
       with ListItemButtonClassKey
       with ListItemClassKey
       with MenuItemClassKey
       with PaginationItemClassKey
       with TabClassKey
       with TableRowClassKey
       with ToggleButtonClassKey
  inline def selected: selected = "selected".asInstanceOf[selected]
  
  @js.native
  sealed trait selectedMenu extends StObject
  inline def selectedMenu: selectedMenu = "selectedMenu".asInstanceOf[selectedMenu]
  
  @js.native
  sealed trait separator
    extends StObject
       with BreadcrumbsClassKey
  inline def separator: separator = "separator".asInstanceOf[separator]
  
  @js.native
  sealed trait shrink
    extends StObject
       with InputLabelClassKey
  inline def shrink: shrink = "shrink".asInstanceOf[shrink]
  
  @js.native
  sealed trait sizeLarge
    extends StObject
       with ButtonClassKey
       with IconButtonClassKey
       with PaginationItemClassKey
       with RatingClassKey
       with ToggleButtonClassKey
  inline def sizeLarge: sizeLarge = "sizeLarge".asInstanceOf[sizeLarge]
  
  @js.native
  sealed trait sizeMedium
    extends StObject
       with ButtonClassKey
       with ChipClassKey
       with FabClassKey
       with IconButtonClassKey
       with RatingClassKey
       with SwitchClassKey
       with TableCellClassKey
       with ToggleButtonClassKey
  inline def sizeMedium: sizeMedium = "sizeMedium".asInstanceOf[sizeMedium]
  
  @js.native
  sealed trait sizeSmall
    extends StObject
       with ButtonClassKey
       with ChipClassKey
       with FabClassKey
       with FilledInputClassKey
       with FormHelperTextClassKey
       with IconButtonClassKey
       with InputAdornmentClassKey
       with InputBaseClassKey
       with InputClassKey
       with InputLabelClassKey
       with OutlinedInputClassKey
       with PaginationItemClassKey
       with RatingClassKey
       with SwitchClassKey
       with TableCellClassKey
       with ToggleButtonClassKey
  inline def sizeSmall: sizeSmall = "sizeSmall".asInstanceOf[sizeSmall]
  
  @js.native
  sealed trait small extends StObject
  inline def small: small = "small".asInstanceOf[small]
  
  @js.native
  sealed trait spacer
    extends StObject
       with TablePaginationClassKey
  inline def spacer: spacer = "spacer".asInstanceOf[spacer]
  
  @js.native
  sealed trait spacing
    extends StObject
       with AccordionActionsClassKey
       with CardActionsClassKey
       with DialogActionsClassKey
  inline def spacing: spacing = "spacing".asInstanceOf[spacing]
  
  @js.native
  sealed trait `spacing-xs-1`
    extends StObject
       with GridClassKey
  inline def `spacing-xs-1`: `spacing-xs-1` = "spacing-xs-1".asInstanceOf[`spacing-xs-1`]
  
  @js.native
  sealed trait `spacing-xs-10`
    extends StObject
       with GridClassKey
  inline def `spacing-xs-10`: `spacing-xs-10` = "spacing-xs-10".asInstanceOf[`spacing-xs-10`]
  
  @js.native
  sealed trait `spacing-xs-2`
    extends StObject
       with GridClassKey
  inline def `spacing-xs-2`: `spacing-xs-2` = "spacing-xs-2".asInstanceOf[`spacing-xs-2`]
  
  @js.native
  sealed trait `spacing-xs-3`
    extends StObject
       with GridClassKey
  inline def `spacing-xs-3`: `spacing-xs-3` = "spacing-xs-3".asInstanceOf[`spacing-xs-3`]
  
  @js.native
  sealed trait `spacing-xs-4`
    extends StObject
       with GridClassKey
  inline def `spacing-xs-4`: `spacing-xs-4` = "spacing-xs-4".asInstanceOf[`spacing-xs-4`]
  
  @js.native
  sealed trait `spacing-xs-5`
    extends StObject
       with GridClassKey
  inline def `spacing-xs-5`: `spacing-xs-5` = "spacing-xs-5".asInstanceOf[`spacing-xs-5`]
  
  @js.native
  sealed trait `spacing-xs-6`
    extends StObject
       with GridClassKey
  inline def `spacing-xs-6`: `spacing-xs-6` = "spacing-xs-6".asInstanceOf[`spacing-xs-6`]
  
  @js.native
  sealed trait `spacing-xs-7`
    extends StObject
       with GridClassKey
  inline def `spacing-xs-7`: `spacing-xs-7` = "spacing-xs-7".asInstanceOf[`spacing-xs-7`]
  
  @js.native
  sealed trait `spacing-xs-8`
    extends StObject
       with GridClassKey
  inline def `spacing-xs-8`: `spacing-xs-8` = "spacing-xs-8".asInstanceOf[`spacing-xs-8`]
  
  @js.native
  sealed trait `spacing-xs-9`
    extends StObject
       with GridClassKey
  inline def `spacing-xs-9`: `spacing-xs-9` = "spacing-xs-9".asInstanceOf[`spacing-xs-9`]
  
  @js.native
  sealed trait span extends StObject
  inline def span: span = "span".asInstanceOf[span]
  
  @js.native
  sealed trait spelling extends StObject
  inline def spelling: spelling = "spelling".asInstanceOf[spelling]
  
  @js.native
  sealed trait square
    extends StObject
       with AvatarClassKey
  inline def square: square = "square".asInstanceOf[square]
  
  @js.native
  sealed trait standard
    extends StObject
       with AlertClassKey
       with ImageListClassKey
       with ImageListItemClassKey
       with InputAdornmentClassKey
       with InputLabelClassKey
       with NativeSelectClassKey
       with SelectClassKey
       with ToggleButtonClassKey
  inline def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait standardError
    extends StObject
       with AlertClassKey
  inline def standardError: standardError = "standardError".asInstanceOf[standardError]
  
  @js.native
  sealed trait standardInfo
    extends StObject
       with AlertClassKey
  inline def standardInfo: standardInfo = "standardInfo".asInstanceOf[standardInfo]
  
  @js.native
  sealed trait standardSuccess
    extends StObject
       with AlertClassKey
  inline def standardSuccess: standardSuccess = "standardSuccess".asInstanceOf[standardSuccess]
  
  @js.native
  sealed trait standardWarning
    extends StObject
       with AlertClassKey
  inline def standardWarning: standardWarning = "standardWarning".asInstanceOf[standardWarning]
  
  @js.native
  sealed trait start extends StObject
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait `start-ellipsis` extends StObject
  inline def `start-ellipsis`: `start-ellipsis` = "start-ellipsis".asInstanceOf[`start-ellipsis`]
  
  @js.native
  sealed trait startIcon
    extends StObject
       with ButtonClassKey
  inline def startIcon: startIcon = "startIcon".asInstanceOf[startIcon]
  
  @js.native
  sealed trait static extends StObject
  inline def static: static = "static".asInstanceOf[static]
  
  @js.native
  sealed trait staticTooltip
    extends StObject
       with SpeedDialActionClassKey
  inline def staticTooltip: staticTooltip = "staticTooltip".asInstanceOf[staticTooltip]
  
  @js.native
  sealed trait staticTooltipClosed
    extends StObject
       with SpeedDialActionClassKey
  inline def staticTooltipClosed: staticTooltipClosed = "staticTooltipClosed".asInstanceOf[staticTooltipClosed]
  
  @js.native
  sealed trait staticTooltipLabel
    extends StObject
       with SpeedDialActionClassKey
  inline def staticTooltipLabel: staticTooltipLabel = "staticTooltipLabel".asInstanceOf[staticTooltipLabel]
  
  @js.native
  sealed trait step extends StObject
  inline def step: step = "step".asInstanceOf[step]
  
  @js.native
  sealed trait sticky
    extends StObject
       with ListSubheaderClassKey
  inline def sticky: sticky = "sticky".asInstanceOf[sticky]
  
  @js.native
  sealed trait stickyHeader
    extends StObject
       with TableCellClassKey
       with TableClassKey
  inline def stickyHeader: stickyHeader = "stickyHeader".asInstanceOf[stickyHeader]
  
  @js.native
  sealed trait style extends StObject
  inline def style: style = "style".asInstanceOf[style]
  
  @js.native
  sealed trait subheader
    extends StObject
       with CardHeaderClassKey
       with ListClassKey
  inline def subheader: subheader = "subheader".asInstanceOf[subheader]
  
  @js.native
  sealed trait submit extends StObject
  inline def submit: submit = "submit".asInstanceOf[submit]
  
  @js.native
  sealed trait subtitle
    extends StObject
       with ImageListItemBarClassKey
  inline def subtitle: subtitle = "subtitle".asInstanceOf[subtitle]
  
  @js.native
  sealed trait subtitle1
    extends StObject
       with TypographyClassKey
       with Variant
  inline def subtitle1: subtitle1 = "subtitle1".asInstanceOf[subtitle1]
  
  @js.native
  sealed trait subtitle2
    extends StObject
       with TypographyClassKey
       with Variant
  inline def subtitle2: subtitle2 = "subtitle2".asInstanceOf[subtitle2]
  
  @js.native
  sealed trait success
    extends StObject
       with AlertColor
  inline def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait sum extends StObject
  inline def sum: sum = "sum".asInstanceOf[sum]
  
  @js.native
  sealed trait svg
    extends StObject
       with CircularProgressClassKey
  inline def svg: svg = "svg".asInstanceOf[svg]
  
  @js.native
  sealed trait switchBase
    extends StObject
       with SwitchClassKey
  inline def switchBase: switchBase = "switchBase".asInstanceOf[switchBase]
  
  @js.native
  sealed trait tag
    extends StObject
       with AutocompleteClassKey
  inline def tag: tag = "tag".asInstanceOf[tag]
  
  @js.native
  sealed trait tagSizeMedium
    extends StObject
       with AutocompleteClassKey
  inline def tagSizeMedium: tagSizeMedium = "tagSizeMedium".asInstanceOf[tagSizeMedium]
  
  @js.native
  sealed trait tagSizeSmall
    extends StObject
       with AutocompleteClassKey
  inline def tagSizeSmall: tagSizeSmall = "tagSizeSmall".asInstanceOf[tagSizeSmall]
  
  @js.native
  sealed trait tel extends StObject
  inline def tel: tel = "tel".asInstanceOf[tel]
  
  @js.native
  sealed trait temporary extends StObject
  inline def temporary: temporary = "temporary".asInstanceOf[temporary]
  
  @js.native
  sealed trait terminal extends StObject
  inline def terminal: terminal = "terminal".asInstanceOf[terminal]
  
  @js.native
  sealed trait text
    extends StObject
       with ButtonClassKey
       with ButtonGroupClassKey
       with PaginationClassKey
       with PaginationItemClassKey
       with SkeletonClassKey
       with StepIconClassKey
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait `text additions` extends StObject
  inline def `text additions`: `text additions` = ("text additions").asInstanceOf[`text additions`]
  
  @js.native
  sealed trait `text removals` extends StObject
  inline def `text removals`: `text removals` = ("text removals").asInstanceOf[`text removals`]
  
  @js.native
  sealed trait `text-after-edge` extends StObject
  inline def `text-after-edge`: `text-after-edge` = "text-after-edge".asInstanceOf[`text-after-edge`]
  
  @js.native
  sealed trait `text-before-edge` extends StObject
  inline def `text-before-edge`: `text-before-edge` = "text-before-edge".asInstanceOf[`text-before-edge`]
  
  @js.native
  sealed trait textAlignLeft
    extends StObject
       with DividerClassKey
  inline def textAlignLeft: textAlignLeft = "textAlignLeft".asInstanceOf[textAlignLeft]
  
  @js.native
  sealed trait textAlignRight
    extends StObject
       with DividerClassKey
  inline def textAlignRight: textAlignRight = "textAlignRight".asInstanceOf[textAlignRight]
  
  @js.native
  sealed trait textColorInherit
    extends StObject
       with TabClassKey
  inline def textColorInherit: textColorInherit = "textColorInherit".asInstanceOf[textColorInherit]
  
  @js.native
  sealed trait textColorPrimary
    extends StObject
       with TabClassKey
  inline def textColorPrimary: textColorPrimary = "textColorPrimary".asInstanceOf[textColorPrimary]
  
  @js.native
  sealed trait textColorSecondary
    extends StObject
       with TabClassKey
  inline def textColorSecondary: textColorSecondary = "textColorSecondary".asInstanceOf[textColorSecondary]
  
  @js.native
  sealed trait textInherit
    extends StObject
       with ButtonClassKey
  inline def textInherit: textInherit = "textInherit".asInstanceOf[textInherit]
  
  @js.native
  sealed trait textPrimary
    extends StObject
       with ButtonClassKey
       with PaginationItemClassKey
  inline def textPrimary: textPrimary = "textPrimary".asInstanceOf[textPrimary]
  
  @js.native
  sealed trait textSecondary
    extends StObject
       with ButtonClassKey
       with PaginationItemClassKey
  inline def textSecondary: textSecondary = "textSecondary".asInstanceOf[textSecondary]
  
  @js.native
  sealed trait textSizeLarge
    extends StObject
       with ButtonClassKey
  inline def textSizeLarge: textSizeLarge = "textSizeLarge".asInstanceOf[textSizeLarge]
  
  @js.native
  sealed trait textSizeMedium
    extends StObject
       with ButtonClassKey
  inline def textSizeMedium: textSizeMedium = "textSizeMedium".asInstanceOf[textSizeMedium]
  
  @js.native
  sealed trait textSizeSmall
    extends StObject
       with ButtonClassKey
  inline def textSizeSmall: textSizeSmall = "textSizeSmall".asInstanceOf[textSizeSmall]
  
  @js.native
  sealed trait thumb
    extends StObject
       with SwitchClassKey
  inline def thumb: thumb = "thumb".asInstanceOf[thumb]
  
  @js.native
  sealed trait time extends StObject
  inline def time: time = "time".asInstanceOf[time]
  
  @js.native
  sealed trait timeout
    extends StObject
       with SnackbarCloseReason
       with TransitionKeys
  inline def timeout: timeout = "timeout".asInstanceOf[timeout]
  
  @js.native
  sealed trait title
    extends StObject
       with CardHeaderClassKey
       with ImageListItemBarClassKey
  inline def title: title = "title".asInstanceOf[title]
  
  @js.native
  sealed trait titleWrap
    extends StObject
       with ImageListItemBarClassKey
  inline def titleWrap: titleWrap = "titleWrap".asInstanceOf[titleWrap]
  
  @js.native
  sealed trait titleWrapActionPosLeft
    extends StObject
       with ImageListItemBarClassKey
  inline def titleWrapActionPosLeft: titleWrapActionPosLeft = "titleWrapActionPosLeft".asInstanceOf[titleWrapActionPosLeft]
  
  @js.native
  sealed trait titleWrapActionPosRight
    extends StObject
       with ImageListItemBarClassKey
  inline def titleWrapActionPosRight: titleWrapActionPosRight = "titleWrapActionPosRight".asInstanceOf[titleWrapActionPosRight]
  
  @js.native
  sealed trait titleWrapBelow
    extends StObject
       with ImageListItemBarClassKey
  inline def titleWrapBelow: titleWrapBelow = "titleWrapBelow".asInstanceOf[titleWrapBelow]
  
  @js.native
  sealed trait toggle
    extends StObject
       with CloseReason
       with OpenReason
  inline def toggle: toggle = "toggle".asInstanceOf[toggle]
  
  @js.native
  sealed trait toolbar
    extends StObject
       with TablePaginationClassKey
  inline def toolbar: toolbar = "toolbar".asInstanceOf[toolbar]
  
  @js.native
  sealed trait tooltip
    extends StObject
       with TooltipClassKey
  inline def tooltip: tooltip = "tooltip".asInstanceOf[tooltip]
  
  @js.native
  sealed trait tooltipArrow
    extends StObject
       with TooltipClassKey
  inline def tooltipArrow: tooltipArrow = "tooltipArrow".asInstanceOf[tooltipArrow]
  
  @js.native
  sealed trait tooltipPlacementBottom
    extends StObject
       with TooltipClassKey
  inline def tooltipPlacementBottom: tooltipPlacementBottom = "tooltipPlacementBottom".asInstanceOf[tooltipPlacementBottom]
  
  @js.native
  sealed trait tooltipPlacementLeft
    extends StObject
       with SpeedDialActionClassKey
       with TooltipClassKey
  inline def tooltipPlacementLeft: tooltipPlacementLeft = "tooltipPlacementLeft".asInstanceOf[tooltipPlacementLeft]
  
  @js.native
  sealed trait tooltipPlacementRight
    extends StObject
       with SpeedDialActionClassKey
       with TooltipClassKey
  inline def tooltipPlacementRight: tooltipPlacementRight = "tooltipPlacementRight".asInstanceOf[tooltipPlacementRight]
  
  @js.native
  sealed trait tooltipPlacementTop
    extends StObject
       with TooltipClassKey
  inline def tooltipPlacementTop: tooltipPlacementTop = "tooltipPlacementTop".asInstanceOf[tooltipPlacementTop]
  
  @js.native
  sealed trait top extends StObject
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait `top-end` extends StObject
  inline def `top-end`: `top-end` = "top-end".asInstanceOf[`top-end`]
  
  @js.native
  sealed trait `top-start` extends StObject
  inline def `top-start`: `top-start` = "top-start".asInstanceOf[`top-start`]
  
  @js.native
  sealed trait touch
    extends StObject
       with TooltipClassKey
  inline def touch: touch = "touch".asInstanceOf[touch]
  
  @js.native
  sealed trait touchRipple
    extends StObject
       with StepButtonClassKey
  inline def touchRipple: touchRipple = "touchRipple".asInstanceOf[touchRipple]
  
  @js.native
  sealed trait track
    extends StObject
       with SwitchClassKey
  inline def track: track = "track".asInstanceOf[track]
  
  @js.native
  sealed trait transition
    extends StObject
       with StepContentClassKey
  inline def transition: transition = "transition".asInstanceOf[transition]
  
  @js.native
  sealed trait transparent extends StObject
  inline def transparent: transparent = "transparent".asInstanceOf[transparent]
  
  @js.native
  sealed trait tree extends StObject
  inline def tree: tree = "tree".asInstanceOf[tree]
  
  @js.native
  sealed trait ul
    extends StObject
       with PaginationClassKey
  inline def ul: ul = "ul".asInstanceOf[ul]
  
  @js.native
  sealed trait underline
    extends StObject
       with FilledInputClassKey
       with InputClassKey
  inline def underline: underline = "underline".asInstanceOf[underline]
  
  @js.native
  sealed trait underlineAlways
    extends StObject
       with LinkClassKey
  inline def underlineAlways: underlineAlways = "underlineAlways".asInstanceOf[underlineAlways]
  
  @js.native
  sealed trait underlineHover
    extends StObject
       with LinkClassKey
  inline def underlineHover: underlineHover = "underlineHover".asInstanceOf[underlineHover]
  
  @js.native
  sealed trait underlineNone
    extends StObject
       with LinkClassKey
  inline def underlineNone: underlineNone = "underlineNone".asInstanceOf[underlineNone]
  
  @js.native
  sealed trait unmountOnExit
    extends StObject
       with TransitionKeys
  inline def unmountOnExit: unmountOnExit = "unmountOnExit".asInstanceOf[unmountOnExit]
  
  @js.native
  sealed trait up extends StObject
  inline def up: up = "up".asInstanceOf[up]
  
  @js.native
  sealed trait url extends StObject
  inline def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait `use-credentials` extends StObject
  inline def `use-credentials`: `use-credentials` = "use-credentials".asInstanceOf[`use-credentials`]
  
  @js.native
  sealed trait variant
    extends StObject
       with ContextFromPropsKey
  inline def variant: variant = "variant".asInstanceOf[variant]
  
  @js.native
  sealed trait vertical
    extends StObject
       with ButtonGroupClassKey
       with DividerClassKey
       with Orientation
       with StepButtonClassKey
       with StepClassKey
       with StepConnectorClassKey
       with StepLabelClassKey
       with StepperClassKey
       with TabScrollButtonClassKey
       with TabsClassKey
       with ToggleButtonGroupClassKey
  inline def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait visuallyHidden
    extends StObject
       with RatingClassKey
  inline def visuallyHidden: visuallyHidden = "visuallyHidden".asInstanceOf[visuallyHidden]
  
  @js.native
  sealed trait warning
    extends StObject
       with AlertColor
  inline def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait wave
    extends StObject
       with SkeletonClassKey
  inline def wave: wave = "wave".asInstanceOf[wave]
  
  @js.native
  sealed trait withChildren
    extends StObject
       with DividerClassKey
       with SkeletonClassKey
  inline def withChildren: withChildren = "withChildren".asInstanceOf[withChildren]
  
  @js.native
  sealed trait withChildrenVertical
    extends StObject
       with DividerClassKey
  inline def withChildrenVertical: withChildrenVertical = "withChildrenVertical".asInstanceOf[withChildrenVertical]
  
  @js.native
  sealed trait woven
    extends StObject
       with ImageListClassKey
       with ImageListItemClassKey
  inline def woven: woven = "woven".asInstanceOf[woven]
  
  @js.native
  sealed trait wrap
    extends StObject
       with GridWrap
  inline def wrap: wrap = "wrap".asInstanceOf[wrap]
  
  @js.native
  sealed trait `wrap-reverse`
    extends StObject
       with GridWrap
  inline def `wrap-reverse`: `wrap-reverse` = "wrap-reverse".asInstanceOf[`wrap-reverse`]
  
  @js.native
  sealed trait `wrap-xs-nowrap`
    extends StObject
       with GridClassKey
  inline def `wrap-xs-nowrap`: `wrap-xs-nowrap` = "wrap-xs-nowrap".asInstanceOf[`wrap-xs-nowrap`]
  
  @js.native
  sealed trait `wrap-xs-wrap-reverse`
    extends StObject
       with GridClassKey
  inline def `wrap-xs-wrap-reverse`: `wrap-xs-wrap-reverse` = "wrap-xs-wrap-reverse".asInstanceOf[`wrap-xs-wrap-reverse`]
  
  @js.native
  sealed trait wrapped
    extends StObject
       with TabClassKey
  inline def wrapped: wrapped = "wrapped".asInstanceOf[wrapped]
  
  @js.native
  sealed trait wrapper
    extends StObject
       with CollapseClassKey
       with DividerClassKey
  inline def wrapper: wrapper = "wrapper".asInstanceOf[wrapper]
  
  @js.native
  sealed trait wrapperInner
    extends StObject
       with CollapseClassKey
  inline def wrapperInner: wrapperInner = "wrapperInner".asInstanceOf[wrapperInner]
  
  @js.native
  sealed trait wrapperVertical
    extends StObject
       with DividerClassKey
  inline def wrapperVertical: wrapperVertical = "wrapperVertical".asInstanceOf[wrapperVertical]
  
  @js.native
  sealed trait yes extends StObject
  inline def yes: yes = "yes".asInstanceOf[yes]
  
  @js.native
  sealed trait zeroMinWidth
    extends StObject
       with GridClassKey
  inline def zeroMinWidth: zeroMinWidth = "zeroMinWidth".asInstanceOf[zeroMinWidth]
}
