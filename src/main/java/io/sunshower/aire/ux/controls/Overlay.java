package io.sunshower.aire.ux.controls;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.HtmlContainer;

@Tag("aire-overlay")
@JsModule(Paths.Overlay_SOURCE)
@CssImport(Paths.Overlay_STYLES)
//@JsModule("@aire-ux/aire-overlay/aire-overlay")
//@CssImport("@aire-ux/aire-overlay/styles/aire-overlay.css")

/**
 * uncomment this if you have deployed this component into NPMJS
 */
//@NpmPackage(value = "@${organzation}/@aire-overlay", version = Versions.Overlay_VERSION)
public class Overlay extends HtmlContainer {

  public Overlay() {
    add(new Button("Hello from Overlay!"));
  }

}