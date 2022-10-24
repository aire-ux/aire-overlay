package io.sunshower.aire.ux.controls.routes;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.RouteScope;
import io.sunshower.aire.ux.controls.Overlays;
import lombok.val;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Route("overlays/fixed")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class FixedOverlayRoute extends VerticalLayout {

  public FixedOverlayRoute() {
    createFixedPanel();
  }

  private void createFixedPanel() {

    val panel = new Div();
    panel.getStyle().set("width", "450px");
    panel.getStyle().set("height", "450px");
    panel.getStyle().set("border", "1px solid red");
    Overlays.createHost(panel);
    add(panel);
    panel.addAttachListener(a -> {
      try {
        Thread.sleep(1000);
        Overlays.open(panel, TestOverlay.class);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }

    });

//    val p = panel.addClickListener(click -> {
//      Overlays.open(panel, TestOverlay.class);
//      p.remove();
//    });
  }
}
