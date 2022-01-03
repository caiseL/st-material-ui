package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageListItemClassesMod {
  
  @JSImport("@mui/material/ImageListItem/imageListItemClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/ImageListItem/imageListItemClasses", JSImport.Default)
  @js.native
  val default: ImageListItemClasses = js.native
  
  @scala.inline
  def getImageListItemUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageListItemUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.img
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.standard
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.woven
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.masonry
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.quilted
  */
  trait ImageListItemClassKey extends StObject
  
  @js.native
  trait ImageListItemClasses extends StObject {
    
    /** Styles applied to an `img` element to ensure it covers the item. */
    var img: String = js.native
    
    /** Styles applied to the root element if `variant="masonry"`. */
    var masonry: String = js.native
    
    /** Styles applied to the root element if `variant="quilted"`. */
    var quilted: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element if `variant="standard"`. */
    var standard: String = js.native
    
    /** Styles applied to the root element if `variant="woven"`. */
    var woven: String = js.native
  }
  object ImageListItemClasses {
    
    @scala.inline
    def apply(img: String, masonry: String, quilted: String, root: String, standard: String, woven: String): ImageListItemClasses = {
      val __obj = js.Dynamic.literal(img = img.asInstanceOf[js.Any], masonry = masonry.asInstanceOf[js.Any], quilted = quilted.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any], woven = woven.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageListItemClasses]
    }
    
    @scala.inline
    implicit class ImageListItemClassesMutableBuilder[Self <: ImageListItemClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasonry(value: String): Self = StObject.set(x, "masonry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuilted(value: String): Self = StObject.set(x, "quilted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWoven(value: String): Self = StObject.set(x, "woven", value.asInstanceOf[js.Any])
    }
  }
}
