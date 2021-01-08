window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Login = window.blockly.js.blockly.Login || {};

/**
 * Login
 */
window.blockly.js.blockly.Login.abrirModalCadastro = async function() {

  this.cronapi.screen.showIonicModal("modal-cadastro");
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Login.fecharModalCadastro = async function() {

  this.cronapi.screen.hideIonicModal("modal-cadastro");
}
