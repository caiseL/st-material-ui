package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filledInputClassesMod {
  
  @JSImport("@mui/material/FilledInput/filledInputClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/FilledInput/filledInputClasses", JSImport.Default)
  @js.native
  val default: FilledInputClasses = js.native
  
  @scala.inline
  def getFilledInputUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilledInputUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorSecondary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.underline
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.focused
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.adornedStart
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.adornedEnd
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.error
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sizeSmall
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.multiline
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.hiddenLabel
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.input
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.inputSizeSmall
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.inputHiddenLabel
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.inputMultiline
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.inputAdornedStart
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.inputAdornedEnd
  */
  trait FilledInputClassKey extends StObject
  
  @js.native
  trait FilledInputClasses extends StObject {
    
    /** Styles applied to the root element if `endAdornment` is provided. */
    var adornedEnd: String = js.native
    
    /** Styles applied to the root element if `startAdornment` is provided. */
    var adornedStart: String = js.native
    
    /** Styles applied to the root element if color secondary. */
    var colorSecondary: String = js.native
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String = js.native
    
    /** State class applied to the root element if `error={true}`. */
    var error: String = js.native
    
    /** State class applied to the root element if the component is focused. */
    var focused: String = js.native
    
    /** Styles applied to the root element if `hiddenLabel={true}`. */
    var hiddenLabel: String = js.native
    
    /** Styles applied to the input element. */
    var input: String = js.native
    
    /** Styles applied to the input element if `endAdornment` is provided. */
    var inputAdornedEnd: String = js.native
    
    /** Styles applied to the input element if `startAdornment` is provided. */
    var inputAdornedStart: String = js.native
    
    /** Styles applied to the `input` if in `<FormControl hiddenLabel />`. */
    var inputHiddenLabel: String = js.native
    
    /** Styles applied to the input element if `multiline={true}`. */
    var inputMultiline: String = js.native
    
    /** Styles applied to the input element if `size="small"`. */
    var inputSizeSmall: String = js.native
    
    /** Styles applied to the root element if `multiline={true}`. */
    var multiline: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the input element if `size="small"`. */
    var sizeSmall: String = js.native
    
    /** Styles applied to the root element unless `disableUnderline={true}`. */
    var underline: String = js.native
  }
  object FilledInputClasses {
    
    @scala.inline
    def apply(
      adornedEnd: String,
      adornedStart: String,
      colorSecondary: String,
      disabled: String,
      error: String,
      focused: String,
      hiddenLabel: String,
      input: String,
      inputAdornedEnd: String,
      inputAdornedStart: String,
      inputHiddenLabel: String,
      inputMultiline: String,
      inputSizeSmall: String,
      multiline: String,
      root: String,
      sizeSmall: String,
      underline: String
    ): FilledInputClasses = {
      val __obj = js.Dynamic.literal(adornedEnd = adornedEnd.asInstanceOf[js.Any], adornedStart = adornedStart.asInstanceOf[js.Any], colorSecondary = colorSecondary.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], hiddenLabel = hiddenLabel.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], inputAdornedEnd = inputAdornedEnd.asInstanceOf[js.Any], inputAdornedStart = inputAdornedStart.asInstanceOf[js.Any], inputHiddenLabel = inputHiddenLabel.asInstanceOf[js.Any], inputMultiline = inputMultiline.asInstanceOf[js.Any], inputSizeSmall = inputSizeSmall.asInstanceOf[js.Any], multiline = multiline.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeSmall = sizeSmall.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilledInputClasses]
    }
    
    @scala.inline
    implicit class FilledInputClassesMutableBuilder[Self <: FilledInputClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdornedEnd(value: String): Self = StObject.set(x, "adornedEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdornedStart(value: String): Self = StObject.set(x, "adornedStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocused(value: String): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenLabel(value: String): Self = StObject.set(x, "hiddenLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputAdornedEnd(value: String): Self = StObject.set(x, "inputAdornedEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputAdornedStart(value: String): Self = StObject.set(x, "inputAdornedStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputHiddenLabel(value: String): Self = StObject.set(x, "inputHiddenLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputMultiline(value: String): Self = StObject.set(x, "inputMultiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputSizeSmall(value: String): Self = StObject.set(x, "inputSizeSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiline(value: String): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderline(value: String): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    }
  }
}
