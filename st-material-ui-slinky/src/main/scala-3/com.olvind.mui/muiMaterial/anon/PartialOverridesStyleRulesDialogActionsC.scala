package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<DialogActionsClassKey>> */
trait PartialOverridesStyleRulesDialogActionsC extends StObject {
  
  var root: js.UndefOr[CSSInterpolation] = js.undefined
  
  var spacing: js.UndefOr[CSSInterpolation] = js.undefined
}
object PartialOverridesStyleRulesDialogActionsC {
  
  inline def apply(): PartialOverridesStyleRulesDialogActionsC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesDialogActionsC]
  }
  
  extension [Self <: PartialOverridesStyleRulesDialogActionsC](x: Self) {
    
    inline def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSpacing(value: CSSInterpolation): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingNull: Self = StObject.set(x, "spacing", null)
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
