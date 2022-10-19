package io.sunshower.aire.ux.controls;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.aire.ux.test.AireTest;
import com.aire.ux.test.Context;
import com.aire.ux.test.Navigate;
import com.aire.ux.test.RouteLocation;
import com.aire.ux.test.Select;
import com.aire.ux.test.TestContext;
import com.aire.ux.test.ViewTest;
import com.aire.ux.test.spring.EnableSpring;
import com.vaadin.flow.component.button.Button;
import io.sunshower.aire.ux.controls.OverlayDemoApplication;
import io.sunshower.aire.ux.controls.routes.OverlayRoute;
import lombok.val;
import org.springframework.boot.test.context.SpringBootTest;

@AireTest
@EnableSpring
@RouteLocation(scanPackage = "io.sunshower.aire.ux.controls.routes")
@SpringBootTest(classes = OverlayDemoApplication.class)
class OverlayTest {

  @ViewTest
  @Navigate("aire-overlay")
  void ensureOverlayHostIsInjectable(@Select OverlayRoute ex) {
    assertNotNull(ex);
  }

}
