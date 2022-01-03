package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formGroupClassesMod {
  
  @JSImport("@mui/material/FormGroup/formGroupClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/FormGroup/formGroupClasses", JSImport.Default)
  @js.native
  val default: FormGroupClasses = js.native
  
  @scala.inline
  def getFormGroupUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormGroupUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.row
  */
  trait FormGroupClassKey extends StObject
  
  @js.native
  trait FormGroupClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element if `row={true}`. */
    var row: String = js.native
  }
  object FormGroupClasses {
    
    @scala.inline
    def apply(root: String, row: String): FormGroupClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormGroupClasses]
    }
    
    @scala.inline
    implicit class FormGroupClassesMutableBuilder[Self <: FormGroupClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
}
