import {
  css,
  html,
  LitElement
} from "lit";


import {
  customElement
} from "lit/decorators";


@customElement('aire-overlay')
export class Overlay extends LitElement {

  // language=CSS
  static styles = css`
    :host {
      position: absolute;
      background-color: white;
      z-index: 150;
      display: flex;
      flex-direction: column;
      top: unset;
      left: unset;
      
    }
    ::slotted(header) {
      height:48px;
      display: flex;
      flex-direction: row;
      padding: 0 8px;
    }
    
    ::slotted(article) {
      flex-grow: 1;
      display: flex;
      flex-direction: column;
      max-height: 100%;
      overflow-y: auto;
      height: 100%;
    }
    ::slotted(footer) {
      height:32px;
      display: flex;
      flex-direction: row;
    }
  
  `

  connectedCallback() {
    super.connectedCallback();
    window.addEventListener('resize', this.handleResize);
  }

  disconnectedCallback() {
    super.disconnectedCallback();
    window.removeEventListener('resize', this.handleResize);
  }


  handleResize = () => {
    const host = this.parentElement;
    if (host) {
      this.style.width = `${host.clientWidth}px`;
      this.style.height = `${host.clientHeight - 2}px`;
      this.style.left = 'unset';
      this.style.top = 'unset';
    }
  };

  render() {
    const host = this.parentElement;
    return html`
      <style>
        :host {
          top: 0px;
          left: 0px;
          width: ${host?.clientWidth}px;
          height: ${(host?.clientHeight || 0) - 2}px;
        }
      </style>
      <slot name="header" part="header"></slot>
      <slot name="content" part="content"></slot>
      <slot name="footer" part="footer"></slot>
    `
  }

}