import "./harness";

import {
  fixture,
  expect, nextFrame,
} from "@open-wc/testing";

import {
  beforeEach,
  describe,
  it,
  vi
} from "vitest";
import {
  Overlay
} from "@aire-ux/aire-overlay/aire-overlay"


import {html} from "lit";


describe('a aire-overlay', async () => {
  let element: Overlay;
  beforeEach(async () => {
    element = await fixture(html`
      <aire-overlay></aire-overlay>
    `);

    await nextFrame();
  });

  it('should mount the component', () => {
    let elements = document.querySelectorAll('aire-overlay');
    expect(elements.length).to.equal(1);
  });

});