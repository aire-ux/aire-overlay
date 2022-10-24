package io.sunshower.aire.ux.controls.routes;

import com.vaadin.flow.component.button.Button;
import io.sunshower.aire.ux.controls.Overlay;

public class TestOverlay extends Overlay {


  static int count;

  public TestOverlay() {
    addCloseButton();
    setSizeFull();
    getStyle().set("border", "1px solid blue");
//    add(new Button(count++ + ""));

    addContent(new Button("" + count++));

  }
}
