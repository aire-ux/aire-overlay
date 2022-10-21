package io.sunshower.aire.ux.controls.routes;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.RouteScope;
import io.sunshower.aire.ux.controls.Overlays;

@RouteScope
@Route("aire-overlay")
public class OverlayRoute extends VerticalLayout {

  public OverlayRoute() {
    Overlays.createHost(this);
    setHeightFull();
    getStyle().set("border", "1px solid red");
    addClickListener(click -> Overlays.open(this, TestOverlay.class));
  }
}
