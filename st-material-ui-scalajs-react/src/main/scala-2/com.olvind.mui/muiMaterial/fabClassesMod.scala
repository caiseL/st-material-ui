package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fabClassesMod {
  
  @JSImport("@mui/material/Fab/fabClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Fab/fabClasses", JSImport.Default)
  @js.native
  val default: FabClasses = js.native
  
  @scala.inline
  def getFabUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFabUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.primary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.secondary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.extended
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.circular
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.focusVisible
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorInherit
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sizeSmall
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.sizeMedium
  */
  trait FabClassKey extends StObject
  
  @js.native
  trait FabClasses extends StObject {
    
    /** Styles applied to the root element if `variant="circular"`. */
    var circular: String = js.native
    
    /** Styles applied to the root element if `color="inherit"`. */
    var colorInherit: String = js.native
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String = js.native
    
    /** Styles applied to the root element if `variant="extended"`. */
    var extended: String = js.native
    
    /** State class applied to the ButtonBase root element if the button is keyboard focused. */
    var focusVisible: String = js.native
    
    /** Styles applied to the root element if `color="primary"`. */
    var primary: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element if `color="secondary"`. */
    var secondary: String = js.native
    
    /** Styles applied to the root element if `size="medium"``. */
    var sizeMedium: String = js.native
    
    /** Styles applied to the root element if `size="small"``. */
    var sizeSmall: String = js.native
  }
  object FabClasses {
    
    @scala.inline
    def apply(
      circular: String,
      colorInherit: String,
      disabled: String,
      extended: String,
      focusVisible: String,
      primary: String,
      root: String,
      secondary: String,
      sizeMedium: String,
      sizeSmall: String
    ): FabClasses = {
      val __obj = js.Dynamic.literal(circular = circular.asInstanceOf[js.Any], colorInherit = colorInherit.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], extended = extended.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any], sizeMedium = sizeMedium.asInstanceOf[js.Any], sizeSmall = sizeSmall.asInstanceOf[js.Any])
      __obj.asInstanceOf[FabClasses]
    }
    
    @scala.inline
    implicit class FabClassesMutableBuilder[Self <: FabClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircular(value: String): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInherit(value: String): Self = StObject.set(x, "colorInherit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtended(value: String): Self = StObject.set(x, "extended", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeMedium(value: String): Self = StObject.set(x, "sizeMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeSmall(value: String): Self = StObject.set(x, "sizeSmall", value.asInstanceOf[js.Any])
    }
  }
}
