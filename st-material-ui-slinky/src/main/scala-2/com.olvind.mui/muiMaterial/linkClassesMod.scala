package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkClassesMod {
  
  @JSImport("@mui/material/Link/linkClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Link/linkClasses", JSImport.Default)
  @js.native
  val default: LinkClasses = js.native
  
  @scala.inline
  def getLinkUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLinkUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.underlineNone
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.underlineHover
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.underlineAlways
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.button
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.focusVisible
  */
  trait LinkClassKey extends StObject
  
  @js.native
  trait LinkClasses extends StObject {
    
    /** Styles applied to the root element if `component="button"`. */
    var button: String = js.native
    
    /** State class applied to the root element if the link is keyboard focused. */
    var focusVisible: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element if `underline="always"`. */
    var underlineAlways: String = js.native
    
    /** Styles applied to the root element if `underline="hover"`. */
    var underlineHover: String = js.native
    
    /** Styles applied to the root element if `underline="none"`. */
    var underlineNone: String = js.native
  }
  object LinkClasses {
    
    @scala.inline
    def apply(
      button: String,
      focusVisible: String,
      root: String,
      underlineAlways: String,
      underlineHover: String,
      underlineNone: String
    ): LinkClasses = {
      val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], underlineAlways = underlineAlways.asInstanceOf[js.Any], underlineHover = underlineHover.asInstanceOf[js.Any], underlineNone = underlineNone.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkClasses]
    }
    
    @scala.inline
    implicit class LinkClassesMutableBuilder[Self <: LinkClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineAlways(value: String): Self = StObject.set(x, "underlineAlways", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineHover(value: String): Self = StObject.set(x, "underlineHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineNone(value: String): Self = StObject.set(x, "underlineNone", value.asInstanceOf[js.Any])
    }
  }
}
