package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.data.domain.*;
import org.springframework.validation.annotation.*;
import org.springframework.web.bind.annotation.*;


/** 
* 
* RestController @generated 
* 
*/ 

@RestController
@RequestMapping(value = "/api/rest/main/ConsultaProcesso")

@CronapiMetaData(type = "blockly")
@CronappSecurity(get = "Public", execute = "Public")
public class ConsultaProcesso {

public static final int TIMEOUT = 300;

/**
 *
 * @param numeroProcesso
 * @return Var
 */

@RequestMapping(method = RequestMethod.GET, value="/consulta_processo/{numeroProcesso}")
// consultaProcesso
public static Var consulta_processo(@PathVariable("numeroProcesso") Var numeroProcesso ) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.database.Operations.query(Var.valueOf("app.entity.Processo"),Var.valueOf("select p from Processo p where p.numero_processo = :numero_processo"),Var.valueOf("numero_processo",numeroProcesso));
   }
 }.call();
}

}

