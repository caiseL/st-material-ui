package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobileStepperClassesMod {
  
  @JSImport("@mui/material/MobileStepper/mobileStepperClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/MobileStepper/mobileStepperClasses", JSImport.Default)
  @js.native
  val default: MobileStepperClasses = js.native
  
  @scala.inline
  def getMobileStepperUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMobileStepperUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.positionBottom
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.positionTop
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.positionStatic
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.dots
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.dot
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.dotActive
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.progress
  */
  trait MobileStepperClassKey extends StObject
  
  @js.native
  trait MobileStepperClasses extends StObject {
    
    /** Styles applied to each dot if `variant="dots"`. */
    var dot: String = js.native
    
    /** Styles applied to a dot if `variant="dots"` and this is the active step. */
    var dotActive: String = js.native
    
    /** Styles applied to the dots container if `variant="dots"`. */
    var dots: String = js.native
    
    /** Styles applied to the root element if `position="bottom"`. */
    var positionBottom: String = js.native
    
    /** Styles applied to the root element if `position="static"`. */
    var positionStatic: String = js.native
    
    /** Styles applied to the root element if `position="top"`. */
    var positionTop: String = js.native
    
    /** Styles applied to the Linear Progress component if `variant="progress"`. */
    var progress: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
  }
  object MobileStepperClasses {
    
    @scala.inline
    def apply(
      dot: String,
      dotActive: String,
      dots: String,
      positionBottom: String,
      positionStatic: String,
      positionTop: String,
      progress: String,
      root: String
    ): MobileStepperClasses = {
      val __obj = js.Dynamic.literal(dot = dot.asInstanceOf[js.Any], dotActive = dotActive.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], positionBottom = positionBottom.asInstanceOf[js.Any], positionStatic = positionStatic.asInstanceOf[js.Any], positionTop = positionTop.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[MobileStepperClasses]
    }
    
    @scala.inline
    implicit class MobileStepperClassesMutableBuilder[Self <: MobileStepperClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDot(value: String): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotActive(value: String): Self = StObject.set(x, "dotActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDots(value: String): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionBottom(value: String): Self = StObject.set(x, "positionBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionStatic(value: String): Self = StObject.set(x, "positionStatic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionTop(value: String): Self = StObject.set(x, "positionTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: String): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
