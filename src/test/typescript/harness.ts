import {
  Overlay
} from "@aire-ux/aire-overlay/aire-overlay";

export default function setup() {


  window.customElements.define(
      'aire-overlay',
      Overlay
  );
  Object.defineProperty(window.location, 'href', {
    writable: true,
    value: 'https://localhost'
  });
  // (window as any).chai.use(chaiDomDiff);
}
setup();