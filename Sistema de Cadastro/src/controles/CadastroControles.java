/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;
import entidades.Produto;
/**
 *
 * @author marva
 */
public class CadastroControles {
    public boolean cadastrarProduto(Produto p){
        boolean result = false;
        
        if(p != null && p.getNome().length()>0 && p.getPrecoCusto() != 0.0f && p.getPrecoVenda() !=0.0f &&
                        p.getEspecificacoes().length()>0){
        
            result = true;
        }
        return result;
    }
}
