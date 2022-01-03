package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.muiMaterialStrings.down
import com.olvind.mui.muiMaterial.muiMaterialStrings.left
import com.olvind.mui.muiMaterial.muiMaterialStrings.right
import com.olvind.mui.muiMaterial.muiMaterialStrings.up
import com.olvind.mui.muiMaterial.transitionMod.TransitionProps
import com.olvind.mui.react.mod.Ref
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideSlideMod {
  
  @JSImport("@mui/material/Slide/Slide", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: SlideProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait SlideProps
    extends StObject
       with TransitionProps {
    
    /**
      * A single child content element.
      */
    @JSName("children")
    var children_SlideProps: japgolly.scalajs.react.facade.React.Element = js.native
    
    /**
      * An HTML element, or a function that returns one.
      * It's used to set the container the Slide is transitioning from.
      */
    var container: js.UndefOr[
        Null | org.scalajs.dom.Element | (js.Function1[/* element */ org.scalajs.dom.Element, org.scalajs.dom.Element])
      ] = js.native
    
    /**
      * Direction the child node will enter from.
      * @default 'down'
      */
    var direction: js.UndefOr[left | right | up | down] = js.native
    
    var ref: js.UndefOr[Ref[Any]] = js.native
  }
  object SlideProps {
    
    @scala.inline
    def apply(children: VdomElement): SlideProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlideProps]
    }
    
    @scala.inline
    implicit class SlidePropsMutableBuilder[Self <: SlideProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(
        value: org.scalajs.dom.Element | (js.Function1[/* element */ org.scalajs.dom.Element, org.scalajs.dom.Element])
      ): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerFunction1(value: /* element */ org.scalajs.dom.Element => org.scalajs.dom.Element): Self = StObject.set(x, "container", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContainerNull: Self = StObject.set(x, "container", null)
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setDirection(value: left | right | up | down): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
