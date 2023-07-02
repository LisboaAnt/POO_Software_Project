package SubmissaoDeArtigos.controller.Revista;

import SubmissaoDeArtigos.model.EdicaoModel;
import SubmissaoDeArtigos.model.Model;
import SubmissaoDeArtigos.view.Observer;
import SubmissaoDeArtigos.view.Revista.CriarEdicaoView;


/**
 *
 * @author mcair
 */
public class CriarEdicaoController {
    
    private CriarEdicaoView view;
    private EdicaoModel model;

    public CriarEdicaoController(CriarEdicaoView view, EdicaoModel model) {
        this.view = view;
        this.model = model;

        // Adicionar um ActionListener ao bot�o "Cancelar"
        this.view.addCancelarListener(new CancelarListener());

        // Adicionar um ActionListener ao bot�o "Criar Edi��o"
        this.view.addCriarEdicaoListener(new CriarEdicaoListener());
    }

    // ActionListener para o bot�o "Cancelar"
    class CancelarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Voltar para a p�gina inicial ou fazer outra a��o desejada
            // Exemplo: view.mostrarPaginaInicial();
        }
    }

    // ActionListener para o bot�o "Criar Edi��o"
    class CriarEdicaoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String numeroEdicao = view.getNumeroEdicao(); // Obter o n�mero da edi��o digitado na tela
            String nomeEdicao = view.getNomeEdicao(); // Obter o nome da edi��o digitado na tela

            // Validar os campos da edi��o, se necess�rio

            // Criar uma nova inst�ncia de EdicaoModel com os dados fornecidos
            EdicaoModel novaEdicao = new EdicaoModel(numeroEdicao, nomeEdicao);

            // Armazenar a nova edi��o em algum lugar (por exemplo, em uma lista ou banco de dados)
            model.adicionarEdicao(novaEdicao);

            // Realizar a��o adicional ap�s a cria��o da edi��o, se necess�rio

            // Limpar os campos da tela de cria��o de edi��o
            view.limparCampos();

            // Exibir uma mensagem de sucesso ou realizar outra a��o desejada
            // Exemplo: view.mostrarMensagem("Edi��o criada com sucesso!");
        }
    }
}
