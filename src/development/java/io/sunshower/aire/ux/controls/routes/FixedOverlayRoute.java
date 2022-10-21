package io.sunshower.aire.ux.controls.routes;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.RouteScope;
import io.sunshower.aire.ux.controls.Overlays;
import lombok.val;
import org.springframework.stereotype.Component;

@Component
@RouteScope
@Route("overlays/fixed")
public class FixedOverlayRoute extends VerticalLayout {

  public FixedOverlayRoute() {
    createFixedPanel();
  }

  private void createFixedPanel() {

    val panel = new Div();
    panel.getStyle().set("width", "250px");
    panel.getStyle().set("height", "250px");
    panel.getStyle().set("border", "1px solid red");
    Overlays.createHost(panel);
    panel.addClickListener(click -> Overlays.open(panel, TestOverlay.class));
    add(panel);
  }
}
