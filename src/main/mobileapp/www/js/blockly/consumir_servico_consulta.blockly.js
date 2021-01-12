window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ConsumirServicoConsulta = window.blockly.js.blockly.ConsumirServicoConsulta || {};

/**
 * consumir_servico_consulta
 */
window.blockly.js.blockly.ConsumirServicoConsulta.consultar_processo = async function(numeroDoProcesso) {
 var item, assunto_from_json, i, numero_processo_from_json, obj_processo, resposta, resposta, url, x;
  url = String('https://app-30-189-17576.ide.cronapp.io/api/cronapi/rest/consultaProcesso:consulta_processo/') + String(numeroDoProcesso);
  this.cronapi.util.getURLFromOthers('GET', 'application/x-www-form-urlencoded', url, null, null, async function(sender_resposta) {
      resposta = sender_resposta;
    console.log(resposta);
    for (var i_index in resposta) {
      i = resposta[i_index];
      obj_processo = i;
    }
    numero_processo_from_json = this.cronapi.object.getProperty(obj_processo, 'numero_processo');
    assunto_from_json = this.cronapi.object.getProperty(obj_processo, 'assunto');
    this.cronapi.screen.changeView("#/app/public/detalhes_processo",[ { numero_processo_from_json : numero_processo_from_json } , { assunto_from_json : assunto_from_json } ]);
  }.bind(this), async function(sender_resposta) {
      resposta = sender_resposta;
    console.log('Erro na requisição.');
  }.bind(this));
}
