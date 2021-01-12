window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ObterParametro = window.blockly.js.blockly.ObterParametro || {};

/**
 * obterParametro
 */
window.blockly.js.blockly.ObterParametro.construirTela = async function() {
 var item, assunto, numero_processo;
  numero_processo = this.cronapi.screen.getParam('numero_processo_from_json');
  assunto = this.cronapi.screen.getParam('assunto_from_json');
  this.cronapi.screen.changeValueOfField("p-numero-processo", numero_processo);
  this.cronapi.screen.changeContent("p-numero-processo", numero_processo, 'true');
  this.cronapi.screen.changeValueOfField("p-assunto", assunto);
  this.cronapi.screen.changeContent("p-assunto", assunto, 'true');
}
