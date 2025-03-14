package com.olvind.mui.muiMaterial

import com.olvind.mui.muiBase.useAutocompleteMod.AutocompleteChangeDetails
import com.olvind.mui.muiBase.useAutocompleteMod.AutocompleteChangeReason
import com.olvind.mui.muiBase.useAutocompleteMod.AutocompleteCloseReason
import com.olvind.mui.muiBase.useAutocompleteMod.AutocompleteFreeSoloValueMapping
import com.olvind.mui.muiBase.useAutocompleteMod.AutocompleteHighlightChangeReason
import com.olvind.mui.muiBase.useAutocompleteMod.AutocompleteInputChangeReason
import com.olvind.mui.muiBase.useAutocompleteMod.AutocompleteValue
import com.olvind.mui.muiBase.useAutocompleteMod.CreateFilterOptionsConfig
import com.olvind.mui.muiBase.useAutocompleteMod.FilterOptionsState
import com.olvind.mui.muiMaterial.anon.ClassName
import com.olvind.mui.muiMaterial.anon.ClearIndicator
import com.olvind.mui.muiMaterial.anon.EndAdornment
import com.olvind.mui.muiMaterial.anon.Index
import com.olvind.mui.muiMaterial.anon.PartialAutocompleteClasses
import com.olvind.mui.muiMaterial.chipChipMod.ChipProps
import com.olvind.mui.muiMaterial.createThemeMod.Theme
import com.olvind.mui.muiMaterial.muiMaterialBooleans.`false`
import com.olvind.mui.muiMaterial.muiMaterialBooleans.`true`
import com.olvind.mui.muiMaterial.muiMaterialStrings.`additions removals`
import com.olvind.mui.muiMaterial.muiMaterialStrings.`additions text`
import com.olvind.mui.muiMaterial.muiMaterialStrings.`inline`
import com.olvind.mui.muiMaterial.muiMaterialStrings.`removals additions`
import com.olvind.mui.muiMaterial.muiMaterialStrings.`removals text`
import com.olvind.mui.muiMaterial.muiMaterialStrings.`text additions`
import com.olvind.mui.muiMaterial.muiMaterialStrings.`text removals`
import com.olvind.mui.muiMaterial.muiMaterialStrings.additions
import com.olvind.mui.muiMaterial.muiMaterialStrings.all
import com.olvind.mui.muiMaterial.muiMaterialStrings.ascending
import com.olvind.mui.muiMaterial.muiMaterialStrings.assertive
import com.olvind.mui.muiMaterial.muiMaterialStrings.auto
import com.olvind.mui.muiMaterial.muiMaterialStrings.both
import com.olvind.mui.muiMaterial.muiMaterialStrings.copy
import com.olvind.mui.muiMaterial.muiMaterialStrings.date
import com.olvind.mui.muiMaterial.muiMaterialStrings.decimal
import com.olvind.mui.muiMaterial.muiMaterialStrings.descending
import com.olvind.mui.muiMaterial.muiMaterialStrings.dialog
import com.olvind.mui.muiMaterial.muiMaterialStrings.div
import com.olvind.mui.muiMaterial.muiMaterialStrings.email
import com.olvind.mui.muiMaterial.muiMaterialStrings.execute
import com.olvind.mui.muiMaterial.muiMaterialStrings.grammar
import com.olvind.mui.muiMaterial.muiMaterialStrings.grid
import com.olvind.mui.muiMaterial.muiMaterialStrings.horizontal
import com.olvind.mui.muiMaterial.muiMaterialStrings.inherit
import com.olvind.mui.muiMaterial.muiMaterialStrings.link
import com.olvind.mui.muiMaterial.muiMaterialStrings.list
import com.olvind.mui.muiMaterial.muiMaterialStrings.listbox
import com.olvind.mui.muiMaterial.muiMaterialStrings.location
import com.olvind.mui.muiMaterial.muiMaterialStrings.medium
import com.olvind.mui.muiMaterial.muiMaterialStrings.menu
import com.olvind.mui.muiMaterial.muiMaterialStrings.mixed
import com.olvind.mui.muiMaterial.muiMaterialStrings.mouse
import com.olvind.mui.muiMaterial.muiMaterialStrings.move
import com.olvind.mui.muiMaterial.muiMaterialStrings.no
import com.olvind.mui.muiMaterial.muiMaterialStrings.none
import com.olvind.mui.muiMaterial.muiMaterialStrings.numeric
import com.olvind.mui.muiMaterial.muiMaterialStrings.off
import com.olvind.mui.muiMaterial.muiMaterialStrings.on
import com.olvind.mui.muiMaterial.muiMaterialStrings.other
import com.olvind.mui.muiMaterial.muiMaterialStrings.page
import com.olvind.mui.muiMaterial.muiMaterialStrings.polite
import com.olvind.mui.muiMaterial.muiMaterialStrings.popup
import com.olvind.mui.muiMaterial.muiMaterialStrings.removals
import com.olvind.mui.muiMaterial.muiMaterialStrings.search
import com.olvind.mui.muiMaterial.muiMaterialStrings.small
import com.olvind.mui.muiMaterial.muiMaterialStrings.spelling
import com.olvind.mui.muiMaterial.muiMaterialStrings.step
import com.olvind.mui.muiMaterial.muiMaterialStrings.tel
import com.olvind.mui.muiMaterial.muiMaterialStrings.text
import com.olvind.mui.muiMaterial.muiMaterialStrings.time
import com.olvind.mui.muiMaterial.muiMaterialStrings.touch
import com.olvind.mui.muiMaterial.muiMaterialStrings.tree
import com.olvind.mui.muiMaterial.muiMaterialStrings.url
import com.olvind.mui.muiMaterial.muiMaterialStrings.vertical
import com.olvind.mui.muiMaterial.muiMaterialStrings.yes
import com.olvind.mui.muiMaterial.popperPopperMod.PopperProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import com.olvind.mui.react.anon.Html
import com.olvind.mui.react.mod.AnimationEventHandler
import com.olvind.mui.react.mod.AriaRole
import com.olvind.mui.react.mod.Booleanish
import com.olvind.mui.react.mod.CSSProperties
import com.olvind.mui.react.mod.ClipboardEventHandler
import com.olvind.mui.react.mod.CompositionEventHandler
import com.olvind.mui.react.mod.DragEventHandler
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.react.mod.FormEventHandler
import com.olvind.mui.react.mod.HTMLAttributes
import com.olvind.mui.react.mod.JSXElementConstructor
import com.olvind.mui.react.mod.KeyboardEventHandler
import com.olvind.mui.react.mod.MouseEventHandler
import com.olvind.mui.react.mod.PointerEventHandler
import com.olvind.mui.react.mod.ReactEventHandler
import com.olvind.mui.react.mod.Ref
import com.olvind.mui.react.mod.TouchEventHandler
import com.olvind.mui.react.mod.TransitionEventHandler
import com.olvind.mui.react.mod.UIEventHandler
import com.olvind.mui.react.mod.WheelEventHandler
import com.olvind.mui.react.mod.global.JSX.Element
import com.olvind.mui.std.ReturnType
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactAnimationEventFrom
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactPointerEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.ReactTransitionEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.ReactWheelEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompleteAutocompleteMod {
  
  @JSImport("@mui/material/Autocomplete/Autocomplete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createFilterOptions[T](): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilterOptions")().asInstanceOf[js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]]]
  @scala.inline
  def createFilterOptions[T](config: CreateFilterOptionsConfig[T]): js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFilterOptions")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]]]
  
  @scala.inline
  def default_div[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */](props: AutocompleteProps[T, Multiple, DisableClearable, FreeSolo, div]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined parent @mui/base.@mui/base.UseAutocompleteProps<T, Multiple, DisableClearable, FreeSolo> */
  /* Inlined parent @mui/material.@mui/material.InternalStandardProps<react.react.HTMLAttributes<std.HTMLDivElement>, 'defaultValue' | 'onChange' | 'children'> */
  @js.native
  trait AutocompleteProps[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */, ChipComponent /* <: ElementType */] extends StObject {
    
    /**
      * Props applied to the [`Chip`](/api/chip/) element.
      */
    var ChipProps: js.UndefOr[com.olvind.mui.muiMaterial.chipChipMod.ChipProps[ChipComponent, js.Object]] = js.native
    
    /**
      * The component used to render the listbox.
      * @default 'ul'
      */
    var ListboxComponent: js.UndefOr[JSXElementConstructor[HTMLAttributes[HTMLElement]]] = js.native
    
    /**
      * Props applied to the Listbox element.
      */
    var ListboxProps: js.UndefOr[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<@mui/material.anon.FnCall>['getListboxProps'] */ js.Any
        ]
      ] = js.native
    
    /**
      * The component used to render the body of the popup.
      * @default Paper
      */
    var PaperComponent: js.UndefOr[JSXElementConstructor[HTMLAttributes[HTMLElement]]] = js.native
    
    /**
      * The component used to position the popup.
      * @default Popper
      */
    var PopperComponent: js.UndefOr[JSXElementConstructor[PopperProps]] = js.native
    
    var about: js.UndefOr[String] = js.native
    
    var accessKey: js.UndefOr[String] = js.native
    
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    var `aria-atomic`: js.UndefOr[Booleanish] = js.native
    
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
    
    var `aria-busy`: js.UndefOr[Booleanish] = js.native
    
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-colcount`: js.UndefOr[Double] = js.native
    
    var `aria-colindex`: js.UndefOr[Double] = js.native
    
    var `aria-colspan`: js.UndefOr[Double] = js.native
    
    var `aria-controls`: js.UndefOr[String] = js.native
    
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
    
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    var `aria-details`: js.UndefOr[String] = js.native
    
    var `aria-disabled`: js.UndefOr[Booleanish] = js.native
    
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
    
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    var `aria-expanded`: js.UndefOr[Booleanish] = js.native
    
    var `aria-flowto`: js.UndefOr[String] = js.native
    
    var `aria-grabbed`: js.UndefOr[Booleanish] = js.native
    
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
    
    var `aria-hidden`: js.UndefOr[Booleanish] = js.native
    
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
    
    var `aria-keyshortcuts`: js.UndefOr[String] = js.native
    
    var `aria-label`: js.UndefOr[String] = js.native
    
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    var `aria-level`: js.UndefOr[Double] = js.native
    
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
    
    var `aria-modal`: js.UndefOr[Booleanish] = js.native
    
    var `aria-multiline`: js.UndefOr[Booleanish] = js.native
    
    var `aria-multiselectable`: js.UndefOr[Booleanish] = js.native
    
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
    
    var `aria-owns`: js.UndefOr[String] = js.native
    
    var `aria-placeholder`: js.UndefOr[String] = js.native
    
    var `aria-posinset`: js.UndefOr[Double] = js.native
    
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
    
    var `aria-readonly`: js.UndefOr[Booleanish] = js.native
    
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.native
    
    var `aria-required`: js.UndefOr[Booleanish] = js.native
    
    var `aria-roledescription`: js.UndefOr[String] = js.native
    
    var `aria-rowcount`: js.UndefOr[Double] = js.native
    
    var `aria-rowindex`: js.UndefOr[Double] = js.native
    
    var `aria-rowspan`: js.UndefOr[Double] = js.native
    
    var `aria-selected`: js.UndefOr[Booleanish] = js.native
    
    var `aria-setsize`: js.UndefOr[Double] = js.native
    
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
    
    var `aria-valuemax`: js.UndefOr[Double] = js.native
    
    var `aria-valuemin`: js.UndefOr[Double] = js.native
    
    var `aria-valuenow`: js.UndefOr[Double] = js.native
    
    var `aria-valuetext`: js.UndefOr[String] = js.native
    
    var autoCapitalize: js.UndefOr[String] = js.native
    
    /**
      * If `true`, the portion of the selected suggestion that has not been typed by the user,
      * known as the completion string, appears inline after the input cursor in the textbox.
      * The inline completion string is visually highlighted and has a selected state.
      * @default false
      */
    var autoComplete: js.UndefOr[Boolean] = js.native
    
    var autoCorrect: js.UndefOr[String] = js.native
    
    /**
      * If `true`, the first option is automatically highlighted.
      * @default false
      */
    var autoHighlight: js.UndefOr[Boolean] = js.native
    
    var autoSave: js.UndefOr[String] = js.native
    
    /**
      * If `true`, the selected option becomes the value of the input
      * when the Autocomplete loses focus unless the user chooses
      * a different option or changes the character string in the input.
      * @default false
      */
    var autoSelect: js.UndefOr[Boolean] = js.native
    
    /**
      * Control if the input should be blurred when an option is selected:
      *
      * - `false` the input is not blurred.
      * - `true` the input is always blurred.
      * - `touch` the input is blurred after a touch event.
      * - `mouse` the input is blurred after a mouse event.
      * @default false
      */
    var blurOnSelect: js.UndefOr[touch | mouse | `true` | `false`] = js.native
    
    // TODO: Remove implicit props. Up to each component.
    var className: js.UndefOr[String] = js.native
    
    /**
      * Override or extend the styles applied to the component.
      */
    var classes: js.UndefOr[PartialAutocompleteClasses] = js.native
    
    /**
      * The icon to display in place of the default clear icon.
      * @default <ClearIcon fontSize="small" />
      */
    var clearIcon: js.UndefOr[Node] = js.native
    
    /**
      * If `true`, the input's text is cleared on blur if no value is selected.
      *
      * Set to `true` if you want to help the user enter a new value.
      * Set to `false` if you want to help the user resume his search.
      * @default !props.freeSolo
      */
    var clearOnBlur: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, clear all values when the user presses escape and the popup is closed.
      * @default false
      */
    var clearOnEscape: js.UndefOr[Boolean] = js.native
    
    /**
      * Override the default text for the *clear* icon button.
      *
      * For localization purposes, you can use the provided [translations](/guides/localization/).
      * @default 'Clear'
      */
    var clearText: js.UndefOr[String] = js.native
    
    /**
      * Override the default text for the *close popup* icon button.
      *
      * For localization purposes, you can use the provided [translations](/guides/localization/).
      * @default 'Close'
      */
    var closeText: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    /**
      * The component name that is using this hook. Used for warnings.
      */
    var componentName: js.UndefOr[String] = js.native
    
    /**
      * The props used for each slot inside.
      * @default {}
      */
    var componentsProps: js.UndefOr[ClearIndicator] = js.native
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
    
    var contextMenu: js.UndefOr[String] = js.native
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
    
    var datatype: js.UndefOr[String] = js.native
    
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    /**
      * The default value. Use when the component is not controlled.
      * @default props.multiple ? [] : null
      */
    var defaultValue: js.UndefOr[AutocompleteValue[T, Multiple, DisableClearable, FreeSolo]] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    /**
      * If `true`, the input can't be cleared.
      * @default false
      */
    var disableClearable: js.UndefOr[DisableClearable] = js.native
    
    /**
      * If `true`, the popup won't close when a value is selected.
      * @default false
      */
    var disableCloseOnSelect: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, the list box in the popup will not wrap focus.
      * @default false
      */
    var disableListWrap: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, the `Popper` content will be under the DOM hierarchy of the parent component.
      * @default false
      */
    var disablePortal: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, the component is disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, will allow focus on disabled items.
      * @default false
      */
    var disabledItemsFocusable: js.UndefOr[Boolean] = js.native
    
    var draggable: js.UndefOr[Booleanish] = js.native
    
    /**
      * A filter function that determines the options that are eligible.
      *
      * @param {T[]} options The options to render.
      * @param {object} state The state of the component.
      * @returns {T[]}
      */
    var filterOptions: js.UndefOr[
        js.Function2[/* options */ js.Array[T], /* state */ FilterOptionsState[T], js.Array[T]]
      ] = js.native
    
    /**
      * If `true`, hide the selected options from the list box.
      * @default false
      */
    var filterSelectedOptions: js.UndefOr[Boolean] = js.native
    
    /**
      * Force the visibility display of the popup icon.
      * @default 'auto'
      */
    var forcePopupIcon: js.UndefOr[`true` | `false` | auto] = js.native
    
    /**
      * If `true`, the Autocomplete is free solo, meaning that the user input is not bound to provided options.
      * @default false
      */
    var freeSolo: js.UndefOr[FreeSolo] = js.native
    
    /**
      * If `true`, the input will take up the full width of its container.
      * @default false
      */
    var fullWidth: js.UndefOr[Boolean] = js.native
    
    /**
      * The label to display when the tags are truncated (`limitTags`).
      *
      * @param {number} more The number of truncated tags.
      * @returns {ReactNode}
      * @default (more) => `+${more}`
      */
    var getLimitTagsText: js.UndefOr[js.Function1[/* more */ Double, Node]] = js.native
    
    /**
      * Used to determine the disabled state for a given option.
      *
      * @param {T} option The option to test.
      * @returns {boolean}
      */
    var getOptionDisabled: js.UndefOr[js.Function1[/* option */ T, Boolean]] = js.native
    
    /**
      * Used to determine the string value for a given option.
      * It's used to fill the input (and the list box options if `renderOption` is not provided).
      *
      * @param {T} option
      * @returns {string}
      * @default (option) => option.label ?? option
      */
    var getOptionLabel: js.UndefOr[js.Function1[/* option */ T, String]] = js.native
    
    /**
      * If provided, the options will be grouped under the returned string.
      * The groupBy value is also used as the text for group headings when `renderGroup` is not provided.
      *
      * @param {T} options The options to group.
      * @returns {string}
      */
    var groupBy: js.UndefOr[js.Function1[/* option */ T, String]] = js.native
    
    /**
      * If `true`, the component handles the "Home" and "End" keys when the popup is open.
      * It should move focus to the first option and last option, respectively.
      * @default !props.freeSolo
      */
    var handleHomeEndKeys: js.UndefOr[Boolean] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    /**
      * This prop is used to help implement the accessibility logic.
      * If you don't provide an id it will fall back to a randomly generated one.
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * If `true`, the highlight can move to the input.
      * @default false
      */
    var includeInputInList: js.UndefOr[Boolean] = js.native
    
    var inlist: js.UndefOr[Any] = js.native
    
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    
    /**
      * The input value.
      */
    var inputValue: js.UndefOr[String] = js.native
    
    var is: js.UndefOr[String] = js.native
    
    /**
      * Used to determine if the option represents the given value.
      * Uses strict equality by default.
      * ⚠️ Both arguments need to be handled, an option can only match with one value.
      *
      * @param {T} option The option to test.
      * @param {T} value The value to test against.
      * @returns {boolean}
      */
    var isOptionEqualToValue: js.UndefOr[js.Function2[/* option */ T, /* value */ T, Boolean]] = js.native
    
    var itemID: js.UndefOr[String] = js.native
    
    var itemProp: js.UndefOr[String] = js.native
    
    var itemRef: js.UndefOr[String] = js.native
    
    var itemScope: js.UndefOr[Boolean] = js.native
    
    var itemType: js.UndefOr[String] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    /**
      * The maximum number of tags that will be visible when not focused.
      * Set `-1` to disable the limit.
      * @default -1
      */
    var limitTags: js.UndefOr[Double] = js.native
    
    /**
      * If `true`, the component is in a loading state.
      * This shows the `loadingText` in place of suggestions (only if there are no suggestions to show, e.g. `options` are empty).
      * @default false
      */
    var loading: js.UndefOr[Boolean] = js.native
    
    /**
      * Text to display when in a loading state.
      *
      * For localization purposes, you can use the provided [translations](/guides/localization/).
      * @default 'Loading…'
      */
    var loadingText: js.UndefOr[Node] = js.native
    
    /**
      * If `true`, `value` must be an array and the menu will support multiple selections.
      * @default false
      */
    var multiple: js.UndefOr[Multiple] = js.native
    
    /**
      * Text to display when there are no options.
      *
      * For localization purposes, you can use the provided [translations](/guides/localization/).
      * @default 'No options'
      */
    var noOptionsText: js.UndefOr[Node] = js.native
    
    var onAbort: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
    
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
    
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    /**
      * Callback fired when the value changes.
      *
      * @param {React.SyntheticEvent} event The event source of the callback.
      * @param {T|T[]} value The new value of the component.
      * @param {string} reason One of "createOption", "selectOption", "removeOption", "blur" or "clear".
      * @param {string} [details]
      */
    var onChange: js.UndefOr[
        js.Function4[
          /* event */ ReactEventFrom[org.scalajs.dom.Element], 
          /* value */ AutocompleteValue[T, Multiple, DisableClearable, FreeSolo], 
          /* reason */ AutocompleteChangeReason, 
          /* details */ js.UndefOr[AutocompleteChangeDetails[T]], 
          Unit
        ]
      ] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    /**
      * Callback fired when the popup requests to be closed.
      * Use in controlled mode (see open).
      *
      * @param {React.SyntheticEvent} event The event source of the callback.
      * @param {string} reason Can be: `"toggleInput"`, `"escape"`, `"selectOption"`, `"removeOption"`, `"blur"`.
      */
    var onClose: js.UndefOr[
        js.Function2[
          /* event */ ReactEventFrom[org.scalajs.dom.Element], 
          /* reason */ AutocompleteCloseReason, 
          Unit
        ]
      ] = js.native
    
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onError: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
    
    /**
      * Callback fired when the highlight option changes.
      *
      * @param {React.SyntheticEvent} event The event source of the callback.
      * @param {T} option The highlighted option.
      * @param {string} reason Can be: `"keyboard"`, `"auto"`, `"mouse"`.
      */
    var onHighlightChange: js.UndefOr[
        js.Function3[
          /* event */ ReactEventFrom[org.scalajs.dom.Element], 
          /* option */ T | Null, 
          /* reason */ AutocompleteHighlightChangeReason, 
          Unit
        ]
      ] = js.native
    
    var onInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    /**
      * Callback fired when the input value changes.
      *
      * @param {React.SyntheticEvent} event The event source of the callback.
      * @param {string} value The new value of the text input.
      * @param {string} reason Can be: `"input"` (user input), `"reset"` (programmatic change), `"clear"`.
      */
    var onInputChange: js.UndefOr[
        js.Function3[
          /* event */ ReactEventFrom[org.scalajs.dom.Element], 
          /* value */ String, 
          /* reason */ AutocompleteInputChangeReason, 
          Unit
        ]
      ] = js.native
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var onLoad: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    /**
      * Callback fired when the popup requests to be opened.
      * Use in controlled mode (see open).
      *
      * @param {React.SyntheticEvent} event The event source of the callback.
      */
    var onOpen: js.UndefOr[js.Function1[/* event */ ReactEventFrom[org.scalajs.dom.Element], Unit]] = js.native
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onReset: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    var onScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.native
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onSelect: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
    
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLDivElement]] = js.native
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onWheel: js.UndefOr[WheelEventHandler[HTMLDivElement]] = js.native
    
    /**
      * If `true`, the component is shown.
      */
    var open: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, the popup will open on input focus.
      * @default false
      */
    var openOnFocus: js.UndefOr[Boolean] = js.native
    
    /**
      * Override the default text for the *open popup* icon button.
      *
      * For localization purposes, you can use the provided [translations](/guides/localization/).
      * @default 'Open'
      */
    var openText: js.UndefOr[String] = js.native
    
    /**
      * Array of options.
      */
    var options: js.Array[T] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    /**
      * The icon to display in place of the default popup icon.
      * @default <ArrowDropDownIcon />
      */
    var popupIcon: js.UndefOr[Node] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var property: js.UndefOr[String] = js.native
    
    var radioGroup: js.UndefOr[String] = js.native
    
    var ref: js.UndefOr[Ref[Any]] = js.native
    
    /**
      * Render the group.
      *
      * @param {AutocompleteRenderGroupParams} params The group to render.
      * @returns {ReactNode}
      */
    var renderGroup: js.UndefOr[js.Function1[/* params */ AutocompleteRenderGroupParams, Node]] = js.native
    
    /**
      * Render the input.
      *
      * @param {object} params
      * @returns {ReactNode}
      */
    def renderInput(params: AutocompleteRenderInputParams): Node = js.native
    
    /**
      * Render the option, use `getOptionLabel` by default.
      *
      * @param {object} props The props to apply on the li element.
      * @param {T} option The option to render.
      * @param {object} state The state of the component.
      * @returns {ReactNode}
      */
    var renderOption: js.UndefOr[
        js.Function3[
          /* props */ HTMLAttributes[HTMLLIElement], 
          /* option */ T, 
          /* state */ AutocompleteRenderOptionState, 
          Node
        ]
      ] = js.native
    
    /**
      * Render the selected value.
      *
      * @param {T[]} value The `value` provided to the component.
      * @param {function} getTagProps A tag props getter.
      * @returns {ReactNode}
      */
    var renderTags: js.UndefOr[
        js.Function2[/* value */ js.Array[T], /* getTagProps */ AutocompleteRenderGetTagProps, Node]
      ] = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var results: js.UndefOr[Double] = js.native
    
    var role: js.UndefOr[AriaRole] = js.native
    
    var security: js.UndefOr[String] = js.native
    
    /**
      * If `true`, the input's text is selected on focus.
      * It helps the user clear the selected value.
      * @default !props.freeSolo
      */
    var selectOnFocus: js.UndefOr[Boolean] = js.native
    
    /**
      * The size of the component.
      * @default 'medium'
      */
    var size: js.UndefOr[small | medium] = js.native
    
    var slot: js.UndefOr[String] = js.native
    
    var spellCheck: js.UndefOr[Booleanish] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
    
    /**
      * The system prop that allows defining system overrides as well as additional CSS styles.
      */
    var sx: js.UndefOr[SxProps[Theme]] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var translate: js.UndefOr[yes | no] = js.native
    
    var typeof: js.UndefOr[String] = js.native
    
    var unselectable: js.UndefOr[on | off] = js.native
    
    /**
      * The value of the autocomplete.
      *
      * The value must have reference equality with the option in order to be selected.
      * You can customize the equality behavior with the `isOptionEqualToValue` prop.
      */
    var value: js.UndefOr[AutocompleteValue[T, Multiple, DisableClearable, FreeSolo]] = js.native
    
    var vocab: js.UndefOr[String] = js.native
  }
  object AutocompleteProps {
    
    @scala.inline
    def apply[T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */, ChipComponent /* <: ElementType */](options: js.Array[T], renderInput: AutocompleteRenderInputParams => Node): AutocompleteProps[T, Multiple, DisableClearable, FreeSolo, ChipComponent] = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], renderInput = js.Any.fromFunction1(renderInput))
      __obj.asInstanceOf[AutocompleteProps[T, Multiple, DisableClearable, FreeSolo, ChipComponent]]
    }
    
    @scala.inline
    implicit class AutocompletePropsMutableBuilder[Self <: AutocompleteProps[_, _, _, _, _], T, Multiple /* <: js.UndefOr[Boolean] */, DisableClearable /* <: js.UndefOr[Boolean] */, FreeSolo /* <: js.UndefOr[Boolean] */, ChipComponent /* <: ElementType */] (val x: Self with (AutocompleteProps[T, Multiple, DisableClearable, FreeSolo, ChipComponent])) extends AnyVal {
      
      @scala.inline
      def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Booleanish): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-busy`(value: Booleanish): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(value: Booleanish): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(value: Booleanish): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(value: Booleanish): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(value: Booleanish): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(value: Booleanish): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(value: Booleanish): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(value: Booleanish): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Booleanish): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(value: Booleanish): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(value: Booleanish): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      @scala.inline
      def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      @scala.inline
      def setAutoComplete(value: Boolean): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      @scala.inline
      def setAutoHighlight(value: Boolean): Self = StObject.set(x, "autoHighlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHighlightUndefined: Self = StObject.set(x, "autoHighlight", js.undefined)
      
      @scala.inline
      def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      @scala.inline
      def setAutoSelect(value: Boolean): Self = StObject.set(x, "autoSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSelectUndefined: Self = StObject.set(x, "autoSelect", js.undefined)
      
      @scala.inline
      def setBlurOnSelect(value: touch | mouse | `true` | `false`): Self = StObject.set(x, "blurOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurOnSelectUndefined: Self = StObject.set(x, "blurOnSelect", js.undefined)
      
      @scala.inline
      def setChipProps(value: ChipProps[ChipComponent, js.Object]): Self = StObject.set(x, "ChipProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChipPropsUndefined: Self = StObject.set(x, "ChipProps", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClasses(value: PartialAutocompleteClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setClearIcon(value: VdomNode): Self = StObject.set(x, "clearIcon", value.rawNode.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIconNull: Self = StObject.set(x, "clearIcon", null)
      
      @scala.inline
      def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      @scala.inline
      def setClearIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "clearIcon", js.Array(value :_*))
      
      @scala.inline
      def setClearIconVdomElement(value: VdomElement): Self = StObject.set(x, "clearIcon", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearOnBlur(value: Boolean): Self = StObject.set(x, "clearOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearOnBlurUndefined: Self = StObject.set(x, "clearOnBlur", js.undefined)
      
      @scala.inline
      def setClearOnEscape(value: Boolean): Self = StObject.set(x, "clearOnEscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearOnEscapeUndefined: Self = StObject.set(x, "clearOnEscape", js.undefined)
      
      @scala.inline
      def setClearText(value: String): Self = StObject.set(x, "clearText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearTextUndefined: Self = StObject.set(x, "clearText", js.undefined)
      
      @scala.inline
      def setCloseText(value: String): Self = StObject.set(x, "closeText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseTextUndefined: Self = StObject.set(x, "closeText", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setComponentName(value: String): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
      
      @scala.inline
      def setComponentsProps(value: ClearIndicator): Self = StObject.set(x, "componentsProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsPropsUndefined: Self = StObject.set(x, "componentsProps", js.undefined)
      
      @scala.inline
      def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      @scala.inline
      def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      @scala.inline
      def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: AutocompleteValue[T, Multiple, DisableClearable, FreeSolo]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: (T | AutocompleteFreeSoloValueMapping[FreeSolo])*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDisableClearable(value: DisableClearable): Self = StObject.set(x, "disableClearable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableClearableUndefined: Self = StObject.set(x, "disableClearable", js.undefined)
      
      @scala.inline
      def setDisableCloseOnSelect(value: Boolean): Self = StObject.set(x, "disableCloseOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCloseOnSelectUndefined: Self = StObject.set(x, "disableCloseOnSelect", js.undefined)
      
      @scala.inline
      def setDisableListWrap(value: Boolean): Self = StObject.set(x, "disableListWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableListWrapUndefined: Self = StObject.set(x, "disableListWrap", js.undefined)
      
      @scala.inline
      def setDisablePortal(value: Boolean): Self = StObject.set(x, "disablePortal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisablePortalUndefined: Self = StObject.set(x, "disablePortal", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledItemsFocusable(value: Boolean): Self = StObject.set(x, "disabledItemsFocusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledItemsFocusableUndefined: Self = StObject.set(x, "disabledItemsFocusable", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setFilterOptions(value: (/* options */ js.Array[T], /* state */ FilterOptionsState[T]) => js.Array[T]): Self = StObject.set(x, "filterOptions", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterOptionsUndefined: Self = StObject.set(x, "filterOptions", js.undefined)
      
      @scala.inline
      def setFilterSelectedOptions(value: Boolean): Self = StObject.set(x, "filterSelectedOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterSelectedOptionsUndefined: Self = StObject.set(x, "filterSelectedOptions", js.undefined)
      
      @scala.inline
      def setForcePopupIcon(value: `true` | `false` | auto): Self = StObject.set(x, "forcePopupIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForcePopupIconUndefined: Self = StObject.set(x, "forcePopupIcon", js.undefined)
      
      @scala.inline
      def setFreeSolo(value: FreeSolo): Self = StObject.set(x, "freeSolo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreeSoloUndefined: Self = StObject.set(x, "freeSolo", js.undefined)
      
      @scala.inline
      def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
      
      @scala.inline
      def setGetLimitTagsText(value: /* more */ Double => Node): Self = StObject.set(x, "getLimitTagsText", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLimitTagsTextUndefined: Self = StObject.set(x, "getLimitTagsText", js.undefined)
      
      @scala.inline
      def setGetOptionDisabled(value: /* option */ T => Boolean): Self = StObject.set(x, "getOptionDisabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOptionDisabledUndefined: Self = StObject.set(x, "getOptionDisabled", js.undefined)
      
      @scala.inline
      def setGetOptionLabel(value: /* option */ T => String): Self = StObject.set(x, "getOptionLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOptionLabelUndefined: Self = StObject.set(x, "getOptionLabel", js.undefined)
      
      @scala.inline
      def setGroupBy(value: /* option */ T => String): Self = StObject.set(x, "groupBy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
      
      @scala.inline
      def setHandleHomeEndKeys(value: Boolean): Self = StObject.set(x, "handleHomeEndKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleHomeEndKeysUndefined: Self = StObject.set(x, "handleHomeEndKeys", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIncludeInputInList(value: Boolean): Self = StObject.set(x, "includeInputInList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeInputInListUndefined: Self = StObject.set(x, "includeInputInList", js.undefined)
      
      @scala.inline
      def setInlist(value: Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      @scala.inline
      def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      @scala.inline
      def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      @scala.inline
      def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOptionEqualToValue(value: (/* option */ T, /* value */ T) => Boolean): Self = StObject.set(x, "isOptionEqualToValue", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsOptionEqualToValueUndefined: Self = StObject.set(x, "isOptionEqualToValue", js.undefined)
      
      @scala.inline
      def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      @scala.inline
      def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      @scala.inline
      def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      @scala.inline
      def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      @scala.inline
      def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      @scala.inline
      def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setLimitTags(value: Double): Self = StObject.set(x, "limitTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitTagsUndefined: Self = StObject.set(x, "limitTags", js.undefined)
      
      @scala.inline
      def setListboxComponent(value: HTMLAttributes[HTMLElement] => japgolly.scalajs.react.facade.React.Element | Null): Self = StObject.set(x, "ListboxComponent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListboxComponentUndefined: Self = StObject.set(x, "ListboxComponent", js.undefined)
      
      @scala.inline
      def setListboxProps(
        value: ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<@mui/material.anon.FnCall>['getListboxProps'] */ js.Any
            ]
      ): Self = StObject.set(x, "ListboxProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListboxPropsUndefined: Self = StObject.set(x, "ListboxProps", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingText(value: VdomNode): Self = StObject.set(x, "loadingText", value.rawNode.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingTextNull: Self = StObject.set(x, "loadingText", null)
      
      @scala.inline
      def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
      
      @scala.inline
      def setLoadingTextVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "loadingText", js.Array(value :_*))
      
      @scala.inline
      def setLoadingTextVdomElement(value: VdomElement): Self = StObject.set(x, "loadingText", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setMultiple(value: Multiple): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setNoOptionsText(value: VdomNode): Self = StObject.set(x, "noOptionsText", value.rawNode.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoOptionsTextNull: Self = StObject.set(x, "noOptionsText", null)
      
      @scala.inline
      def setNoOptionsTextUndefined: Self = StObject.set(x, "noOptionsText", js.undefined)
      
      @scala.inline
      def setNoOptionsTextVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "noOptionsText", js.Array(value :_*))
      
      @scala.inline
      def setNoOptionsTextVdomElement(value: VdomElement): Self = StObject.set(x, "noOptionsText", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAbort(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAbort", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: ReactAnimationEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnAnimationIteration(value: ReactAnimationEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      @scala.inline
      def setOnAnimationStart(value: ReactAnimationEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1((t0: ReactAnimationEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      @scala.inline
      def setOnAuxClick(value: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      @scala.inline
      def setOnBeforeInput(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      @scala.inline
      def setOnBlur(value: ReactFocusEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCanPlay(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnCanPlayThrough(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* event */ ReactEventFrom[org.scalajs.dom.Element], /* value */ AutocompleteValue[T, Multiple, DisableClearable, FreeSolo], /* reason */ AutocompleteChangeReason, /* details */ js.UndefOr[AutocompleteChangeDetails[T]]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction4((t0: /* event */ ReactEventFrom[org.scalajs.dom.Element], t1: /* value */ AutocompleteValue[T, Multiple, DisableClearable, FreeSolo], t2: /* reason */ AutocompleteChangeReason, t3: /* details */ js.UndefOr[AutocompleteChangeDetails[T]]) => (value(t0, t1, t2, t3)).runNow()))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnClose(
        value: (/* event */ ReactEventFrom[org.scalajs.dom.Element], /* reason */ AutocompleteCloseReason) => Callback
      ): Self = StObject.set(x, "onClose", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[org.scalajs.dom.Element], t1: /* reason */ AutocompleteCloseReason) => (value(t0, t1)).runNow()))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnCompositionEnd(value: ReactCompositionEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      @scala.inline
      def setOnCompositionStart(value: ReactCompositionEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      @scala.inline
      def setOnCompositionUpdate(value: ReactCompositionEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1((t0: ReactCompositionEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnCopy(value: ReactClipboardEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCopy", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCut(value: ReactClipboardEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onCut", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDrag(value: ReactDragEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDrag", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnDragEnd(value: ReactDragEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: ReactDragEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragExit(value: ReactDragEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: ReactDragEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: ReactDragEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: ReactDragEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(value: ReactDragEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction1((t0: ReactDragEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnDurationChange(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      @scala.inline
      def setOnEmptied(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      @scala.inline
      def setOnEncrypted(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      @scala.inline
      def setOnEnded(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFocus(value: ReactFocusEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnHighlightChange(
        value: (/* event */ ReactEventFrom[org.scalajs.dom.Element], /* option */ T | Null, /* reason */ AutocompleteHighlightChangeReason) => Callback
      ): Self = StObject.set(x, "onHighlightChange", js.Any.fromFunction3((t0: /* event */ ReactEventFrom[org.scalajs.dom.Element], t1: /* option */ T | Null, t2: /* reason */ AutocompleteHighlightChangeReason) => (value(t0, t1, t2)).runNow()))
      
      @scala.inline
      def setOnHighlightChangeUndefined: Self = StObject.set(x, "onHighlightChange", js.undefined)
      
      @scala.inline
      def setOnInput(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInput", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnInputChange(
        value: (/* event */ ReactEventFrom[org.scalajs.dom.Element], /* value */ String, /* reason */ AutocompleteInputChangeReason) => Callback
      ): Self = StObject.set(x, "onInputChange", js.Any.fromFunction3((t0: /* event */ ReactEventFrom[org.scalajs.dom.Element], t1: /* value */ String, t2: /* reason */ AutocompleteInputChangeReason) => (value(t0, t1, t2)).runNow()))
      
      @scala.inline
      def setOnInputChangeUndefined: Self = StObject.set(x, "onInputChange", js.undefined)
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnInvalid(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: ReactKeyboardEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyPress(value: ReactKeyboardEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: ReactKeyboardEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnLoad(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnLoadStart(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoadedData(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(value: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnOpen(value: /* event */ ReactEventFrom[org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onOpen", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOnPaste(value: ReactClipboardEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnPause(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlaying(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnPointerCancel(value: ReactPointerEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      @scala.inline
      def setOnPointerDown(value: ReactPointerEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(value: ReactPointerEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPointerLeave(value: ReactPointerEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      @scala.inline
      def setOnPointerMove(value: ReactPointerEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(value: ReactPointerEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(value: ReactPointerEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(value: ReactPointerEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1((t0: ReactPointerEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnProgress(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onProgress", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRateChange(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onReset", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnScroll(value: ReactUIEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: ReactUIEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSeeked(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnSeeking(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      @scala.inline
      def setOnSelect(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnStalled(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onStalled", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnSuspend(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      @scala.inline
      def setOnTimeUpdate(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: ReactTouchEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: ReactTouchEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: ReactTouchEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: ReactTouchEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: ReactTouchEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: ReactTransitionEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1((t0: ReactTransitionEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnVolumeChange(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      @scala.inline
      def setOnWaiting(value: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: ReactEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      @scala.inline
      def setOnWheel(value: ReactWheelEventFrom[HTMLDivElement with org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onWheel", js.Any.fromFunction1((t0: ReactWheelEventFrom[HTMLDivElement with org.scalajs.dom.Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnFocus(value: Boolean): Self = StObject.set(x, "openOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenOnFocusUndefined: Self = StObject.set(x, "openOnFocus", js.undefined)
      
      @scala.inline
      def setOpenText(value: String): Self = StObject.set(x, "openText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenTextUndefined: Self = StObject.set(x, "openText", js.undefined)
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPaperComponent(value: HTMLAttributes[HTMLElement] => japgolly.scalajs.react.facade.React.Element | Null): Self = StObject.set(x, "PaperComponent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPaperComponentUndefined: Self = StObject.set(x, "PaperComponent", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPopperComponent(value: PopperProps => japgolly.scalajs.react.facade.React.Element | Null): Self = StObject.set(x, "PopperComponent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPopperComponentUndefined: Self = StObject.set(x, "PopperComponent", js.undefined)
      
      @scala.inline
      def setPopupIcon(value: VdomNode): Self = StObject.set(x, "popupIcon", value.rawNode.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupIconNull: Self = StObject.set(x, "popupIcon", null)
      
      @scala.inline
      def setPopupIconUndefined: Self = StObject.set(x, "popupIcon", js.undefined)
      
      @scala.inline
      def setPopupIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "popupIcon", js.Array(value :_*))
      
      @scala.inline
      def setPopupIconVdomElement(value: VdomElement): Self = StObject.set(x, "popupIcon", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setRenderGroup(value: /* params */ AutocompleteRenderGroupParams => Node): Self = StObject.set(x, "renderGroup", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderGroupUndefined: Self = StObject.set(x, "renderGroup", js.undefined)
      
      @scala.inline
      def setRenderInput(value: AutocompleteRenderInputParams => Node): Self = StObject.set(x, "renderInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderOption(
        value: (/* props */ HTMLAttributes[HTMLLIElement], /* option */ T, /* state */ AutocompleteRenderOptionState) => Node
      ): Self = StObject.set(x, "renderOption", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderOptionUndefined: Self = StObject.set(x, "renderOption", js.undefined)
      
      @scala.inline
      def setRenderTags(value: (/* value */ js.Array[T], /* getTagProps */ AutocompleteRenderGetTagProps) => Node): Self = StObject.set(x, "renderTags", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRenderTagsUndefined: Self = StObject.set(x, "renderTags", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSelectOnFocus(value: Boolean): Self = StObject.set(x, "selectOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectOnFocusUndefined: Self = StObject.set(x, "selectOnFocus", js.undefined)
      
      @scala.inline
      def setSize(value: small | medium): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      @scala.inline
      def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      @scala.inline
      def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      @scala.inline
      def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSxNull: Self = StObject.set(x, "sx", null)
      
      @scala.inline
      def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
      
      @scala.inline
      def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value :_*))
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      @scala.inline
      def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      @scala.inline
      def setValue(value: AutocompleteValue[T, Multiple, DisableClearable, FreeSolo]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: (T | AutocompleteFreeSoloValueMapping[FreeSolo])*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      @scala.inline
      def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
    }
  }
  
  @js.native
  trait AutocompletePropsSizeOverrides extends StObject
  
  type AutocompleteRenderGetTagProps = js.Function1[/* hasIndex */ Index, ClassName]
  
  @js.native
  trait AutocompleteRenderGroupParams extends StObject {
    
    var children: js.UndefOr[Node] = js.native
    
    var group: String = js.native
    
    var key: String = js.native
  }
  object AutocompleteRenderGroupParams {
    
    @scala.inline
    def apply(group: String, key: String): AutocompleteRenderGroupParams = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteRenderGroupParams]
    }
    
    @scala.inline
    implicit class AutocompleteRenderGroupParamsMutableBuilder[Self <: AutocompleteRenderGroupParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenNull: Self = StObject.set(x, "children", null)
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AutocompleteRenderInputParams extends StObject {
    
    var InputLabelProps: ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<@mui/material.anon.FnCall>['getInputLabelProps'] */ js.Any
      ] = js.native
    
    var InputProps: EndAdornment = js.native
    
    var disabled: Boolean = js.native
    
    var fullWidth: Boolean = js.native
    
    var id: String = js.native
    
    var inputProps: ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<@mui/material.anon.FnCall>['getInputProps'] */ js.Any
      ] = js.native
    
    var size: js.UndefOr[small] = js.native
  }
  object AutocompleteRenderInputParams {
    
    @scala.inline
    def apply(
      InputLabelProps: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<@mui/material.anon.FnCall>['getInputLabelProps'] */ js.Any
        ],
      InputProps: EndAdornment,
      disabled: Boolean,
      fullWidth: Boolean,
      id: String,
      inputProps: ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<@mui/material.anon.FnCall>['getInputProps'] */ js.Any
        ]
    ): AutocompleteRenderInputParams = {
      val __obj = js.Dynamic.literal(InputLabelProps = InputLabelProps.asInstanceOf[js.Any], InputProps = InputProps.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], fullWidth = fullWidth.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputProps = inputProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteRenderInputParams]
    }
    
    @scala.inline
    implicit class AutocompleteRenderInputParamsMutableBuilder[Self <: AutocompleteRenderInputParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputLabelProps(
        value: ReturnType[
              /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<@mui/material.anon.FnCall>['getInputLabelProps'] */ js.Any
            ]
      ): Self = StObject.set(x, "InputLabelProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputProps(value: EndAdornment): Self = StObject.set(x, "InputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait AutocompleteRenderOptionState extends StObject {
    
    var inputValue: String = js.native
    
    var selected: Boolean = js.native
  }
  object AutocompleteRenderOptionState {
    
    @scala.inline
    def apply(inputValue: String, selected: Boolean): AutocompleteRenderOptionState = {
      val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteRenderOptionState]
    }
    
    @scala.inline
    implicit class AutocompleteRenderOptionStateMutableBuilder[Self <: AutocompleteRenderOptionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
