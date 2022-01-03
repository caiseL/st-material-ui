package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.componentsMod.Components
import com.olvind.mui.muiMaterial.createMixinsMod.MixinsOptions
import com.olvind.mui.muiMaterial.createPaletteMod.Palette
import com.olvind.mui.muiMaterial.createPaletteMod.PaletteOptions
import com.olvind.mui.muiMaterial.createTransitionsMod.TransitionsOptions
import com.olvind.mui.muiMaterial.createTypographyMod.TypographyOptions
import com.olvind.mui.muiMaterial.shadowsMod.Shadows
import com.olvind.mui.muiMaterial.zIndexMod.ZIndexOptions
import com.olvind.mui.muiSystem.anon.Mode
import com.olvind.mui.muiSystem.createBreakpointsMod.Breakpoints
import com.olvind.mui.muiSystem.createBreakpointsMod.BreakpointsOptions
import com.olvind.mui.muiSystem.createSpacingMod.Spacing
import com.olvind.mui.muiSystem.createSpacingMod.SpacingOptions
import com.olvind.mui.muiSystem.createThemeCreateThemeMod.Direction
import com.olvind.mui.muiSystem.shapeMod.Shape
import com.olvind.mui.muiSystem.shapeMod.ShapeOptions
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createThemeMod {
  
  @JSImport("@mui/material/styles/createTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(options: ThemeOptions, args: js.Object*): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[Theme]
  @scala.inline
  def default(options: Unit, args: js.Object*): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[Theme]
  
  @scala.inline
  def createMuiTheme(options: ThemeOptions, args: js.Object*): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createMuiTheme")(List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[Theme]
  @scala.inline
  def createMuiTheme(options: Unit, args: js.Object*): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createMuiTheme")(List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]]) :_*)).asInstanceOf[Theme]
  
  @js.native
  trait Theme
    extends StObject
       with com.olvind.mui.muiSystem.createThemeCreateThemeMod.Theme {
    
    var unstable_strictMode: js.UndefOr[Boolean] = js.native
  }
  object Theme {
    
    @scala.inline
    def apply(
      breakpoints: Breakpoints,
      direction: Direction,
      palette: (Record[String, Any]) with Mode,
      shape: Shape,
      spacing: Spacing
    ): Theme = {
      val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    @scala.inline
    implicit class ThemeMutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUnstable_strictMode(value: Boolean): Self = StObject.set(x, "unstable_strictMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnstable_strictModeUndefined: Self = StObject.set(x, "unstable_strictMode", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<@mui/system.@mui/system.ThemeOptions, 'zIndex'> */
  @js.native
  trait ThemeOptions extends StObject {
    
    var breakpoints: js.UndefOr[BreakpointsOptions] = js.native
    
    var components: js.UndefOr[Components] = js.native
    
    var direction: js.UndefOr[Direction] = js.native
    
    var mixins: js.UndefOr[MixinsOptions] = js.native
    
    var palette: js.UndefOr[PaletteOptions] = js.native
    
    var shadows: js.UndefOr[Shadows] = js.native
    
    var shape: js.UndefOr[ShapeOptions] = js.native
    
    var spacing: js.UndefOr[SpacingOptions] = js.native
    
    var transitions: js.UndefOr[TransitionsOptions] = js.native
    
    var typography: js.UndefOr[TypographyOptions | (js.Function1[/* palette */ Palette, TypographyOptions])] = js.native
    
    var unstable_strictMode: js.UndefOr[Boolean] = js.native
    
    var zIndex: js.UndefOr[ZIndexOptions] = js.native
  }
  object ThemeOptions {
    
    @scala.inline
    def apply(): ThemeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeOptions]
    }
    
    @scala.inline
    implicit class ThemeOptionsMutableBuilder[Self <: ThemeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakpoints(value: BreakpointsOptions): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      @scala.inline
      def setComponents(value: Components): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setMixins(value: MixinsOptions): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      @scala.inline
      def setPalette(value: PaletteOptions): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      @scala.inline
      def setShadows(value: Shadows): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
      
      @scala.inline
      def setShadowsVarargs(value: Any*): Self = StObject.set(x, "shadows", js.Array(value :_*))
      
      @scala.inline
      def setShape(value: ShapeOptions): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSpacing(value: SpacingOptions): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingFunction1(value: (/* abs */ Double) | String => Double | String): Self = StObject.set(x, "spacing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      @scala.inline
      def setSpacingVarargs(value: (String | Double)*): Self = StObject.set(x, "spacing", js.Array(value :_*))
      
      @scala.inline
      def setTransitions(value: TransitionsOptions): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
      
      @scala.inline
      def setTypography(value: TypographyOptions | (js.Function1[/* palette */ Palette, TypographyOptions])): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypographyFunction1(value: /* palette */ Palette => TypographyOptions): Self = StObject.set(x, "typography", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTypographyUndefined: Self = StObject.set(x, "typography", js.undefined)
      
      @scala.inline
      def setUnstable_strictMode(value: Boolean): Self = StObject.set(x, "unstable_strictMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnstable_strictModeUndefined: Self = StObject.set(x, "unstable_strictMode", js.undefined)
      
      @scala.inline
      def setZIndex(value: ZIndexOptions): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
