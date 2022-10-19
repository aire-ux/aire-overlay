package io.sunshower.aire.ux.controls;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.spring.annotation.EnableVaadin;
import io.sunshower.aire.ux.controls.routes.OverlayRoute;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@PWA(name = "Overlay Demo", shortName = "Demo")
@ComponentScan(basePackageClasses = OverlayRoute.class)
@EnableVaadin({"io.sunshower.aire.ux.controls.routes"})
public class OverlayDemoApplication extends VerticalLayout implements AppShellConfigurator {

  public static void main(String[] args) {
    SpringApplication.run(OverlayDemoApplication.class, args);
  }
}
