package io.sunshower.aire.ux.controls;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.aire.ux.test.AireTest;
import com.aire.ux.test.Navigate;
import com.aire.ux.test.RouteLocation;
import com.aire.ux.test.Select;
import com.aire.ux.test.ViewTest;
import com.aire.ux.test.spring.EnableSpring;
import io.sunshower.aire.ux.controls.routes.OverlayRoute;
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
