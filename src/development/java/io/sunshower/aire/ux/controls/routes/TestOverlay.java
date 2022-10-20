package io.sunshower.aire.ux.controls.routes;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.VaadinIcon;
import io.sunshower.aire.ux.controls.Overlay;
import lombok.val;

public class TestOverlay extends Overlay {


  public TestOverlay() {
    addCloseButton();
    setSizeFull();
  }


}
