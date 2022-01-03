package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlClassesMod {
  
  @JSImport("@mui/material/FormControl/formControlClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/FormControl/formControlClasses", JSImport.Default)
  @js.native
  val default: FormControlClasses = js.native
  
  @scala.inline
  def getFormControlUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormControlUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.marginNormal
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.marginDense
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.fullWidth
  */
  trait FormControlClassKey extends StObject
  
  @js.native
  trait FormControlClasses extends StObject {
    
    /** Styles applied to the root element if `fullWidth={true}`. */
    var fullWidth: String = js.native
    
    /** Styles applied to the root element if `margin="dense"`. */
    var marginDense: String = js.native
    
    /** Styles applied to the root element if `margin="normal"`. */
    var marginNormal: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object FormControlClasses {
    
    @scala.inline
    def apply(fullWidth: String, marginDense: String, marginNormal: String, root: String): FormControlClasses = {
      val __obj = js.Dynamic.literal(fullWidth = fullWidth.asInstanceOf[js.Any], marginDense = marginDense.asInstanceOf[js.Any], marginNormal = marginNormal.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormControlClasses]
    }
    
    @scala.inline
    implicit class FormControlClassesMutableBuilder[Self <: FormControlClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFullWidth(value: String): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginDense(value: String): Self = StObject.set(x, "marginDense", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginNormal(value: String): Self = StObject.set(x, "marginNormal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
