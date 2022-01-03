package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogClassesMod {
  
  @JSImport("@mui/material/Dialog/dialogClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Dialog/dialogClasses", JSImport.Default)
  @js.native
  val default: DialogClasses = js.native
  
  inline def getDialogUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDialogUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.scrollPaper
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.scrollBody
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.container
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.paper
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.paperScrollPaper
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.paperScrollBody
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.paperWidthFalse
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.paperWidthXs
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.paperWidthSm
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.paperWidthMd
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.paperWidthLg
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.paperWidthXl
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.paperFullWidth
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.paperFullScreen
  */
  trait DialogClassKey extends StObject
  
  trait DialogClasses extends StObject {
    
    /** Styles applied to the container element. */
    var container: String
    
    /** Styles applied to the Paper component. */
    var paper: String
    
    /** Styles applied to the Paper component if `fullScreen={true}`. */
    var paperFullScreen: String
    
    /** Styles applied to the Paper component if `fullWidth={true}`. */
    var paperFullWidth: String
    
    /** Styles applied to the Paper component if `scroll="body"`. */
    var paperScrollBody: String
    
    /** Styles applied to the Paper component if `scroll="paper"`. */
    var paperScrollPaper: String
    
    /** Styles applied to the Paper component if `maxWidth=false`. */
    var paperWidthFalse: String
    
    /** Styles applied to the Paper component if `maxWidth="lg"`. */
    var paperWidthLg: String
    
    /** Styles applied to the Paper component if `maxWidth="md"`. */
    var paperWidthMd: String
    
    /** Styles applied to the Paper component if `maxWidth="sm"`. */
    var paperWidthSm: String
    
    /** Styles applied to the Paper component if `maxWidth="xl"`. */
    var paperWidthXl: String
    
    /** Styles applied to the Paper component if `maxWidth="xs"`. */
    var paperWidthXs: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the container element if `scroll="body"`. */
    var scrollBody: String
    
    /** Styles applied to the container element if `scroll="paper"`. */
    var scrollPaper: String
  }
  object DialogClasses {
    
    inline def apply(
      container: String,
      paper: String,
      paperFullScreen: String,
      paperFullWidth: String,
      paperScrollBody: String,
      paperScrollPaper: String,
      paperWidthFalse: String,
      paperWidthLg: String,
      paperWidthMd: String,
      paperWidthSm: String,
      paperWidthXl: String,
      paperWidthXs: String,
      root: String,
      scrollBody: String,
      scrollPaper: String
    ): DialogClasses = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], paper = paper.asInstanceOf[js.Any], paperFullScreen = paperFullScreen.asInstanceOf[js.Any], paperFullWidth = paperFullWidth.asInstanceOf[js.Any], paperScrollBody = paperScrollBody.asInstanceOf[js.Any], paperScrollPaper = paperScrollPaper.asInstanceOf[js.Any], paperWidthFalse = paperWidthFalse.asInstanceOf[js.Any], paperWidthLg = paperWidthLg.asInstanceOf[js.Any], paperWidthMd = paperWidthMd.asInstanceOf[js.Any], paperWidthSm = paperWidthSm.asInstanceOf[js.Any], paperWidthXl = paperWidthXl.asInstanceOf[js.Any], paperWidthXs = paperWidthXs.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], scrollBody = scrollBody.asInstanceOf[js.Any], scrollPaper = scrollPaper.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogClasses]
    }
    
    extension [Self <: DialogClasses](x: Self) {
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setPaper(value: String): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
      
      inline def setPaperFullScreen(value: String): Self = StObject.set(x, "paperFullScreen", value.asInstanceOf[js.Any])
      
      inline def setPaperFullWidth(value: String): Self = StObject.set(x, "paperFullWidth", value.asInstanceOf[js.Any])
      
      inline def setPaperScrollBody(value: String): Self = StObject.set(x, "paperScrollBody", value.asInstanceOf[js.Any])
      
      inline def setPaperScrollPaper(value: String): Self = StObject.set(x, "paperScrollPaper", value.asInstanceOf[js.Any])
      
      inline def setPaperWidthFalse(value: String): Self = StObject.set(x, "paperWidthFalse", value.asInstanceOf[js.Any])
      
      inline def setPaperWidthLg(value: String): Self = StObject.set(x, "paperWidthLg", value.asInstanceOf[js.Any])
      
      inline def setPaperWidthMd(value: String): Self = StObject.set(x, "paperWidthMd", value.asInstanceOf[js.Any])
      
      inline def setPaperWidthSm(value: String): Self = StObject.set(x, "paperWidthSm", value.asInstanceOf[js.Any])
      
      inline def setPaperWidthXl(value: String): Self = StObject.set(x, "paperWidthXl", value.asInstanceOf[js.Any])
      
      inline def setPaperWidthXs(value: String): Self = StObject.set(x, "paperWidthXs", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setScrollBody(value: String): Self = StObject.set(x, "scrollBody", value.asInstanceOf[js.Any])
      
      inline def setScrollPaper(value: String): Self = StObject.set(x, "scrollPaper", value.asInstanceOf[js.Any])
    }
  }
}
