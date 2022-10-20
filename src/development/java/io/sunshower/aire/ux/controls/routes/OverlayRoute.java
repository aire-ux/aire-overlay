package io.sunshower.aire.ux.controls.routes;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.RouteScope;
import io.sunshower.aire.ux.controls.Overlay;
import io.sunshower.aire.ux.controls.Overlays;
import lombok.val;

@RouteScope
@Route("aire-overlay")
public class OverlayRoute extends VerticalLayout {


  public OverlayRoute() {
    Overlays.createHost(this);
    val overlay = new TestOverlay();
    setHeightFull();
    add(new TestOverlay());
  }
}
