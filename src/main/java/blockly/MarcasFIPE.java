package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class MarcasFIPE {

public static final int TIMEOUT = 300;

/**
 *
 * @param param_exp
 * @return Var
 */
// MarcasFIPE
public static Var obter(Var param_exp) throws Exception {
 return new Callable<Var>() {

   // param
   private Var exp = param_exp;
   // end
   private Var Dados = Var.VAR_NULL;

   public Var call() throws Exception {

    try {

        Dados =
        cronapi.json.Operations.toJson(
        cronapi.util.Operations.getURLFromOthers(
        Var.valueOf("GET"),
        Var.valueOf("application/x-www-form-urlencoded"),
        Var.valueOf("https://parallelum.com.br/fipe/api/v1/carros/marcas"), Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL));
     } catch (Exception exp_exception) {
          exp = Var.valueOf(exp_exception);

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"),
        Var.valueOf("Não foi possível obter as marcas."));
     }
    return Dados;
   }
 }.call();
}

}

