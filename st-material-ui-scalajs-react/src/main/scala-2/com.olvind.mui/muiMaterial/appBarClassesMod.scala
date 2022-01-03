package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appBarClassesMod {
  
  @JSImport("@mui/material/AppBar/appBarClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/AppBar/appBarClasses", JSImport.Default)
  @js.native
  val default: AppBarClasses = js.native
  
  @scala.inline
  def getAppBarUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppBarUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.positionFixed
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.positionAbsolute
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.positionSticky
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.positionStatic
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.positionRelative
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorDefault
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorPrimary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorSecondary
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorInherit
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.colorTransparent
  */
  trait AppBarClassKey extends StObject
  
  @js.native
  trait AppBarClasses extends StObject {
    
    /** Styles applied to the root element if `color="default"`. */
    var colorDefault: String = js.native
    
    /** Styles applied to the root element if `color="inherit"`. */
    var colorInherit: String = js.native
    
    /** Styles applied to the root element if `color="primary"`. */
    var colorPrimary: String = js.native
    
    /** Styles applied to the root element if `color="secondary"`. */
    var colorSecondary: String = js.native
    
    /** Styles applied to the root element if `color="transparent"`. */
    var colorTransparent: String = js.native
    
    /** Styles applied to the root element if `position="absolute"`. */
    var positionAbsolute: String = js.native
    
    /** Styles applied to the root element if `position="fixed"`. */
    var positionFixed: String = js.native
    
    /** Styles applied to the root element if `position="relative"`. */
    var positionRelative: String = js.native
    
    /** Styles applied to the root element if `position="static"`. */
    var positionStatic: String = js.native
    
    /** Styles applied to the root element if `position="sticky"`. */
    var positionSticky: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object AppBarClasses {
    
    @scala.inline
    def apply(
      colorDefault: String,
      colorInherit: String,
      colorPrimary: String,
      colorSecondary: String,
      colorTransparent: String,
      positionAbsolute: String,
      positionFixed: String,
      positionRelative: String,
      positionStatic: String,
      positionSticky: String,
      root: String
    ): AppBarClasses = {
      val __obj = js.Dynamic.literal(colorDefault = colorDefault.asInstanceOf[js.Any], colorInherit = colorInherit.asInstanceOf[js.Any], colorPrimary = colorPrimary.asInstanceOf[js.Any], colorSecondary = colorSecondary.asInstanceOf[js.Any], colorTransparent = colorTransparent.asInstanceOf[js.Any], positionAbsolute = positionAbsolute.asInstanceOf[js.Any], positionFixed = positionFixed.asInstanceOf[js.Any], positionRelative = positionRelative.asInstanceOf[js.Any], positionStatic = positionStatic.asInstanceOf[js.Any], positionSticky = positionSticky.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppBarClasses]
    }
    
    @scala.inline
    implicit class AppBarClassesMutableBuilder[Self <: AppBarClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorDefault(value: String): Self = StObject.set(x, "colorDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorInherit(value: String): Self = StObject.set(x, "colorInherit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPrimary(value: String): Self = StObject.set(x, "colorPrimary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorSecondary(value: String): Self = StObject.set(x, "colorSecondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorTransparent(value: String): Self = StObject.set(x, "colorTransparent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionAbsolute(value: String): Self = StObject.set(x, "positionAbsolute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionFixed(value: String): Self = StObject.set(x, "positionFixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionRelative(value: String): Self = StObject.set(x, "positionRelative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionStatic(value: String): Self = StObject.set(x, "positionStatic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionSticky(value: String): Self = StObject.set(x, "positionSticky", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
